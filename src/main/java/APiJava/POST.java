package APiJava;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class POST {
	
	public static void main (String[] args) throws Exception {
		
		URL url=new URL("https://api.restful-api.dev/objects");
	HttpURLConnection connection=(HttpURLConnection)	url.openConnection();
	
	connection.setRequestMethod("POST");
	connection.setRequestProperty("Content-Type", "application/json");
	connection.setDoOutput(true);
	
	
	String jsonBody="{\"name\": \"Apple iPhone 14 plus\", \"data\": { \"Generation\": \"14th\", \"Price\": \"60000\", \"Capacity\": \"128 GB\" }}";
	
	byte[] data=jsonBody.getBytes();
	
	OutputStream outputStream = connection.getOutputStream();
	
outputStream.write(data);

System.out.println(connection.getResponseCode());
	
InputStream inputStream = connection.getInputStream();

InputStreamReader reader=new InputStreamReader(inputStream);

BufferedReader buffer = new BufferedReader(reader);

System.out.println(buffer.readLine());

	                                                                                                                                                                                                                                                                    
	}
}


