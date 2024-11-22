package APiJava;

import java.net.HttpURLConnection;
import java.net.URL;

public class PUT {
	
	public static void main (String[] args) throws Exception{
		
		URL url=new URL("https://api.restful-api.dev/objects/7");
		
	HttpURLConnection connection=(HttpURLConnection)url.openConnection();
	
	connection.setRequestMethod("PUT");
	
	connection.setDoOutput(true);
	
	
	
	
	
	
	
	
	
		
		
		
		
		
		
		
	}

}
