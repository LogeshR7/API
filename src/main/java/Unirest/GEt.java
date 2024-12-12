package Unirest;

import kong.unirest.HttpResponse;
import kong.unirest.JsonNode;
import kong.unirest.Unirest;

public class GEt {
	
	public static void main(String[] args) {
		
		HttpResponse<JsonNode> GET = Unirest.get("https://dummyapi.online/api/movies").asJson();
		
		System.out.println("Statuscode  "+GET.getStatus());

	    System.out.println("Responce message  "+GET.getStatusText());	
	    
	 System.out.println( GET.getBody());  
		
		
		
		
	}

}
