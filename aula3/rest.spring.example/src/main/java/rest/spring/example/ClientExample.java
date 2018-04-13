package rest.spring.example;

import org.springframework.web.client.RestTemplate;

public class ClientExample {

	public static void main(String[] args) {
		RestTemplate restTemplate = new RestTemplate();
		for (int i = 0; true; i++) {
			String url = "http://localhost:8088/echo/opa?message="+i;
			Message response = 
					restTemplate.getForObject(url, Message.class);
			System.out.println(response);	
		}
	}
	
}
