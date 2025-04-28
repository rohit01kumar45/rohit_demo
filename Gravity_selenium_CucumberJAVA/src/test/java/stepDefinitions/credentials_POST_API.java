package stepDefinitions;

import io.cucumber.java.en.Given;
import io.restasured.RestAssured.*;
public class credentials_POST_API {
	
	@Given("User requests Gravity web login flow's credentials_POST_API")
	public void createResource() {
       // String requestBody = "{\"redirect\":\"false"\, \"email\":\"rohit01kumar45@gmail.com\", \"password\":\"R@hitk#09\", \"csrfToken\":\"5cdd265c15bc03caae29c12e9c9a6666de47a7a7bd83db741556e7bef1fe562b\", \"json\":\"true\"}";

        RestAssured.baseURI = "https://talent.gravityer.com";
        
        RequestSpecification request_post = RestAssured.given();
      
        JSONObject parameters = new JSONObject();
        parameters.put ("redirect","false");
        parameters.put ("email","rohit01kumar45@gmail.com");
        parameters.put ("password","R@hitk#09");
        parameters.put ("csrfToken","5cdd265c15bc03caae29c12e9c9a6666de47a7a7bd83db741556e7bef1fe562b");
        parameters.put ("json","true");

        
        request_post.header("Content-Type", "application/json");
        request.body(parameters.toJSONString());
        
        
        Response response = request_post.post("/api/auth/callback/credentials"); 
        System.out.println("The status received: " + response.statusLine());
        
    }
}
