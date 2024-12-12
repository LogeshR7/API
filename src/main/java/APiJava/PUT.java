package APiJava;

import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class PUT {

	public static void main (String[] args) throws Exception{

		URL url=new URL("https://api.restful-api.dev/objects/7");
		HttpURLConnection connection=(HttpURLConnection)url.openConnection();
		connection.setRequestMethod("PUT");
		connection.setRequestProperty("Content-Type", "application/json");
		connection.setDoOutput(true);
		
		String jsonbody ="{\"name\": \"Apple iPhone 14 plus\", \"data\": { \"Generation\": \"14th\", \"Price\": \"60000\", \"Capacity\": \"128 GB\" }}";


byte[] bytes = jsonbody.getBytes();

OutputStream outputStream = connection.getOutputStream();

outputStream.write(bytes);

int responseCode = connection.getResponseCode();
System.out.println(responseCode);
















	}

}
