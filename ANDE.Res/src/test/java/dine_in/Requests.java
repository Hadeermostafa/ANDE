package dine_in;

import java.io.BufferedInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import org.apache.commons.io.IOUtils;
import org.json.JSONObject;
import org.testng.annotations.Test;

public class Requests {
	
	//   *********** API requests ***********

	
	public static String Request(String query_url , String json ) throws Exception {

		   String result = "";
			try {


				URL url = new URL(query_url);
				HttpURLConnection conn = (HttpURLConnection) url.openConnection();
				conn.setConnectTimeout(5000);
				conn.setRequestProperty("Content-Type", "application/json; charset=UTF-8");
				conn.setRequestProperty("Accept", "application/json");
				conn.setRequestProperty("Content-Language", "en");
				conn.setRequestProperty("X-Request-With", "XMLHttpRequest");
				conn.setRequestProperty("ANDE-Token", "eyJhbGciOiJSUzI1NiIsImtpZCI6IjQ4OTQ5ZDdkNDA3ZmVjOWIyYWM4ZDYzNWVjYmEwYjdhOTE0ZWQ4ZmIiLCJ0eXAiOiJKV1QifQ.eyJpc3MiOiJodHRwczovL3NlY3VyZXRva2VuLmdvb2dsZS5jb20vYW5kZS1lY2YwOCIsImF1ZCI6ImFuZGUtZWNmMDgiLCJhdXRoX3RpbWUiOjE2MTU0NTAxNjMsInVzZXJfaWQiOiJTZEhGYVRUaW5WZGdzV01ya01sVm1DRmsweUwyIiwic3ViIjoiU2RIRmFUVGluVmRnc1dNcmtNbFZtQ0ZrMHlMMiIsImlhdCI6MTYxNTQ1MDE2MywiZXhwIjoxNjE1NDUzNzYzLCJmaXJlYmFzZSI6eyJpZGVudGl0aWVzIjp7fSwic2lnbl9pbl9wcm92aWRlciI6ImN1c3RvbSJ9fQ.PAvcSntfjgxpGCwcx-_w53tMgOR8s36ppYipX4ajhw_2MW5oUxWye1UPPiY8amri8ODfsOMLtmvlk5chA31K2aLM91aXG0Sr3N7I9UhydXyFolrPHlUSpgv3mTZS3qNftVde-rMhB5gMgjPgCbZQvrJzdcNHZqxNh167VQA-Mc3ED9p0Y8ZexfavSCHs4wQZefBzmJfXm-CQfzVaHPS4xhjSY8rL8NoI0-G9TMS4ccxLUVQsOB6yoVhhN2dVABHqwC8Be8lFdJz8SnYhHNzbOBaJ4-Fj-Tn_RmcRgZ7ivEik23tPivysoPaxi4crxuY7zfW0BUhc4SrPJc2qqAspAg");
				conn.setRequestProperty("authorization", "Bearer eyJhbGciOiJSUzI1NiIsImtpZCI6IjQ4OTQ5ZDdkNDA3ZmVjOWIyYWM4ZDYzNWVjYmEwYjdhOTE0ZWQ4ZmIiLCJ0eXAiOiJKV1QifQ.eyJpc3MiOiJodHRwczovL3NlY3VyZXRva2VuLmdvb2dsZS5jb20vYW5kZS1lY2YwOCIsImF1ZCI6ImFuZGUtZWNmMDgiLCJhdXRoX3RpbWUiOjE2MTU0NTAxNjMsInVzZXJfaWQiOiJTZEhGYVRUaW5WZGdzV01ya01sVm1DRmsweUwyIiwic3ViIjoiU2RIRmFUVGluVmRnc1dNcmtNbFZtQ0ZrMHlMMiIsImlhdCI6MTYxNTQ1MDE2MywiZXhwIjoxNjE1NDUzNzYzLCJmaXJlYmFzZSI6eyJpZGVudGl0aWVzIjp7fSwic2lnbl9pbl9wcm92aWRlciI6ImN1c3RvbSJ9fQ.PAvcSntfjgxpGCwcx-_w53tMgOR8s36ppYipX4ajhw_2MW5oUxWye1UPPiY8amri8ODfsOMLtmvlk5chA31K2aLM91aXG0Sr3N7I9UhydXyFolrPHlUSpgv3mTZS3qNftVde-rMhB5gMgjPgCbZQvrJzdcNHZqxNh167VQA-Mc3ED9p0Y8ZexfavSCHs4wQZefBzmJfXm-CQfzVaHPS4xhjSY8rL8NoI0-G9TMS4ccxLUVQsOB6yoVhhN2dVABHqwC8Be8lFdJz8SnYhHNzbOBaJ4-Fj-Tn_RmcRgZ7ivEik23tPivysoPaxi4crxuY7zfW0BUhc4SrPJc2qqAspAg");
				conn.setRequestProperty("User-Agent","Mozilla/5.0 ( compatible ) ");
				conn.setRequestProperty("Accept","*/*");
				
				conn.setDoOutput(true);
				conn.setDoInput(true);
				conn.setRequestMethod("POST");

				OutputStream os = conn.getOutputStream();
				os.write(json.getBytes("UTF-8"));
				os.close();
				
				InputStream in = new BufferedInputStream(conn.getInputStream());
				result = IOUtils.toString(in, "UTF-8");
									

				System.out.println(result);
				
				in.close();
				conn.disconnect();	

			} catch (Exception e) {

				System.out.println(e);

			}
 
			return result ;

		}
	
	//   *********** Making order ***********

	
	@Test(priority = 1)
	public static void Create_Order() throws Exception {
		Request("http://andedev-env.eba-je3ap3sa.me-south-1.elasticbeanstalk.com/api/v1/dinein/orders?menu_language=en","{\"restaurant_id\" : 13,\"table_code\" : 200000,\"items\" : [{\"quantity\" : 1 ,\"notes\" : \"spicy\",\"item_size\" : 345 ,\" menu_language\": \"en\"} , {\"quantity\" : 1 ,\"notes\" : \"cheese\",\"item_size\" : 345 ,\" menu_language\": \"en\"}]}");
        System.out.println("order created sucessfully");

		}
	
	//   *********** calling waiter request ***********
	
	@Test(priority = 2)
	public static void Call_waiter() throws Exception {
		Request("http://andedev-env.eba-je3ap3sa.me-south-1.elasticbeanstalk.com/api/v1/dinein/requests/waiter","{\"table_id\": 9}");
        System.out.println("call waiter done sucessfully");

		}
	
	
	@Test(priority = 3)
	public static void payment_request() throws Exception {
		Request("http://andedev-env.eba-je3ap3sa.me-south-1.elasticbeanstalk.com/api/v1/dinein/orders/123","{\"payment_request\" : \"true\"}");
        System.out.println("payment request done sucessfully");

		}
	
	
	@Test(priority = 4)
	public static void Register_Delivery() throws Exception {
		String jsonString = Request("http://andedev-env.eba-je3ap3sa.me-south-1.elasticbeanstalk.com/api/v1/customers/registerOrLogin","{\"name\" : \"hadeer\" , \"email\" : \"Nour@test.com\" , \"email\" : 01111111111 }");
		
        JSONObject jsonObject = new JSONObject(jsonString);    
        JSONObject newJSON = jsonObject.getJSONObject("data");
        jsonObject = new JSONObject(newJSON.toString());
        System.out.println(jsonObject.get("id"));
        int customer_id = (int) jsonObject.get("id");
        String url = "http://andedev-env.eba-je3ap3sa.me-south-1.elasticbeanstalk.com/api/v1/customers/"+customer_id+"/addresses";
        Request(url,"{\"country_id\" : 1 , \"region_id\" : 3 , \"area_id\" : 5 }");
        String order_body =  "{\"customer_id\" : " + customer_id + " , \"restaurant_id\" : 13 , \"address_id\" : 1 , \"callback_name\" : \"Hadeer\" , \"callback_phone\" : \" 01111111111 \" ,\"promocode\" : \"TestCode\" , \"order_notes\" : \"thank you\" , \"additional_directions\" : \"Next to market\" , \"items\" : [{\"quantity\" : 1 ,\"notes\" : \"spicy\",\"item_size\" : 345 } , {\"quantity\" : 1 ,\"notes\" : \"cheese\",\"item_size\" : 345 }]}" ;
        System.out.println(order_body);
        Request("http://andedev-env.eba-je3ap3sa.me-south-1.elasticbeanstalk.com/api/v1/delivery/orders",order_body );

           
        
	    System.out.println("register done sucessfully");

	    
		}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
