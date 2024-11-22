package APiJava;

import java.net.URLConnection;
import java.net.URL;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URISyntaxException;

public class GET {
	
	public static void main(String[] args) throws Exception {
		//open url
		URL url  =new URL("https://dummyapi.online/api/movies");
		HttpURLConnection conecction=(HttpURLConnection) url.openConnection();
		conecction.setRequestMethod("GET");
		conecction.connect();
		
		//Get status code
		int Status=conecction.getResponseCode();
		System.out.println(Status);
		
		//get status msg
		String MSG=conecction.getResponseMessage();
		System.out.println(MSG);
		
		InputStream inputStream = conecction.getInputStream();
		 InputStreamReader reader=new InputStreamReader(inputStream);
		 BufferedReader buffer=new BufferedReader(reader);
		
		String data=buffer.readLine();
		System.out.println(data);
		
		
		
		 
		    /*
			 * String line; StringBuffer buf =new StringBuffer(); while
			 * ((line=buffer.readLine()) !=null) { buf.append(line); }
			 * System.out.println(line);
			 */
		
	
		
		
		
		
	}

}
