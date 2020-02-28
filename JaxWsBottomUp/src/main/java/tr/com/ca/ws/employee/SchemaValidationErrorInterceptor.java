package tr.com.ca.ws.employee;

import org.apache.cxf.interceptor.Fault;
import org.apache.cxf.message.Message;
import org.apache.cxf.phase.AbstractPhaseInterceptor;
import org.apache.cxf.phase.Phase;
import org.xml.sax.SAXParseException;

public class SchemaValidationErrorInterceptor extends AbstractPhaseInterceptor<Message> {
	
	public SchemaValidationErrorInterceptor() {
		super(Phase.MARSHAL);
	}

	@Override
	public void handleMessage(Message message) throws Fault {
		Fault fault = (Fault) message.getContent(Exception.class);
		Throwable cause = fault.getCause();
		while (cause != null) {
			if (cause instanceof SAXParseException) {
				fault.setMessage("Invalid XML: " + fault.getLocalizedMessage());
				break;
			}

			cause = cause.getCause();
		}
	}
}