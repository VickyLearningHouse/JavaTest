package EmbeddedTomcat;

import java.io.File;

import javax.servlet.ServletException;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;

import org.apache.catalina.LifecycleException;
import org.apache.catalina.startup.Tomcat;

public class WebServer {
	private Tomcat tomcat;
	private WebTarget webTarget;
	private final String CONTEXT_PATH = "/";
	private final String BASE_DIR = "embedded_tomcat";
	private final int PORT = 8899;
//	private final String serviceRoute = "http://localhost";
	
	public void startTomcat() throws ServletException{
		
		String pathToWebXML = new File("src/main/webapp/").getAbsolutePath();
		
		tomcat = new Tomcat();
		tomcat.setBaseDir(BASE_DIR);
		tomcat.setPort(PORT);
		tomcat.addWebapp(CONTEXT_PATH, pathToWebXML);
		try {
			tomcat.start();
		} catch (LifecycleException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void createWebTarget(){
		Client client = ClientBuilder.newClient();
		String url = "http://localhost:"+tomcat.getConnector().getPort()+CONTEXT_PATH;
		this.webTarget = client.target(url);
	}

}
