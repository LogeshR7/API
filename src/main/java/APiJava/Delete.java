package APiJava;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

public class Delete {
	

	public static void main(String[] args) throws Exception {
		URL conecction= new URL("https://api.restful-api.dev/objects/6");
		HttpURLConnection con=  (HttpURLConnection) conecction.openConnection();
		
	con.setRequestMethod("DELETE");
	//con.setRequestProperty("Content-Type", "application/json");
		con.setDoOutput(true);
		
	System.out.println(con.getResponseCode());	
		
		
	}

}
