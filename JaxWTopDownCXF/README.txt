WS URL : http://localhost:8080/JaxWsBottomUp/EmployeeService?wsdl


https://examples.javacodegeeks.com/enterprise-java/jws/jax-ws-tutorial-beginners/


java.lang.ClassNotFoundException:  com.sun.xml.ws.transport.http.servlet.WSServletContextListener
--> Because Tomcat doesn't include JAXWS libraries

	Solution
		 1) https://memorynotfound.com/deploy-jaxws-application-tomcat-example/
		 
		 Download jaxws-ri-2.3.0.zip
		 https://javaee.github.io/metro-jax-ws/
		 
		 Copy jar bellow to WEB-INF/lib folder
		    jaxb-impl.jar
		    jaxws-api.jar
		    jaxws-rt.jar
		    gmbal-api-only.jar
		    management-api.jar
		    stax-ex.jar
		    streambuffer.jar
		    policy.jar
		 
		2 )The JAX-WS dependency library “jaxws-rt.jar” is missing.
		    Go here http://jax-ws.java.net/.
		    Download JAX-WS RI distribution.
		    Unzip it and copy “jaxws-rt.jar” to Tomcat library folder “{$TOMCAT}/lib“.
		    Restart Tomcat.
		 