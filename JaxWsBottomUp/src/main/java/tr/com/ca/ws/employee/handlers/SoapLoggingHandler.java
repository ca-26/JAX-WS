package tr.com.ca.ws.employee.handlers;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

import javax.xml.namespace.QName;
import javax.xml.soap.SOAPException;
import javax.xml.soap.SOAPMessage;
import javax.xml.ws.handler.MessageContext;
import javax.xml.ws.handler.soap.SOAPHandler;
import javax.xml.ws.handler.soap.SOAPMessageContext;

public class SoapLoggingHandler implements SOAPHandler<SOAPMessageContext> {

	@Override
	public Set<QName> getHeaders() {
		return new HashSet<QName>();
	}
	
	@Override
	public void close(MessageContext context) {
		//System.out.println(this.getClass().getName() + " : Do some cleanup handling .. ");
	}

	@Override
	public boolean handleFault(SOAPMessageContext context) {
		logToSystemOut(context);
		return true;
	}

	@Override
	public boolean handleMessage(SOAPMessageContext context) {
		logToSystemOut(context);
		return true;
	}

	private void logToSystemOut(SOAPMessageContext smc) {
		// TO Avoid warning below :
		// WARNING: Using deprecated META-INF/services mechanism with non-standard property: javax.xml.soap.MetaFactory. Property javax.xml.soap.SAAJMetaFactory should be used instead.
		System.setProperty("javax.xml.soap.SAAJMetaFactory", "com.sun.xml.messaging.saaj.soap.SAAJMetaFactoryImpl");
		
		Boolean isOutBound = (Boolean) smc.get(MessageContext.MESSAGE_OUTBOUND_PROPERTY);
		try {
			if (isOutBound){
				System.out.println("Intercepting outbound message:"); }
			else {
				System.out.println("Intercepting inbound message:"); }

			SOAPMessage message = smc.getMessage();
			ByteArrayOutputStream stream = new ByteArrayOutputStream();
			message.writeTo(stream);
			System.out.println(stream.toString());
			System.out.println("====================================="); 
			
//			context.getMessage().writeTo(System.out);
//			System.out.println();
		} catch (SOAPException e) {
			System.out.println("Exception in handler: " + e);
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("Exception in handler: " + e);
			e.printStackTrace();
		}
	}
}