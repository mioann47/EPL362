package epl362rest;



import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


/**
 * Hello service
 *
 */
@Path("/hello")
public class Hello {
	
	

		/**
		 * @return
		 */
		@GET
		public String getPatients(){
		
		return "HELLO THERE";
	}
	
	
	
}