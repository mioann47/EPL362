



import org.glassfish.jersey.client.ClientConfig;

import javax.ws.rs.QueryParam;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriBuilder;
import java.net.URI;


public class UpdatesClient {

       


        private static URI getBaseURI() {
                return UriBuilder.fromUri("http://localhost:8080/EPL362REST/rest").build();
        }


        public static void updateClinic (int id,String name,String address,String sdi,String spa){
                ClientConfig config = new ClientConfig();

                Client client = ClientBuilder.newClient(config);

                WebTarget target;
                target = client.target(getBaseURI());

                String response = target.path("updates").
                        path("updateclinic").queryParam("id", id).
                        queryParam("name", name).
                        queryParam("address", address).queryParam("sdi", sdi).
                        queryParam("spa",spa).
                                request().
                                accept(MediaType.TEXT_PLAIN).
                                get(Response.class)
                        .toString();
                System.out.println(response);

        }

        public static void updatePatient (int id,String name,String address,String selfharm,String problem,String prev,String isalive
        		,String com,String dang){
            ClientConfig config = new ClientConfig();

            Client client = ClientBuilder.newClient(config);

            WebTarget target;
            target = client.target(getBaseURI());

            String response = target.path("updates").
                    path("updatepatient").queryParam("id", id).
                    queryParam("name", name).
                    queryParam("address", address).queryParam("selfharm", selfharm).
                    queryParam("problem",problem).queryParam("prev",prev).queryParam("isalive",isalive).queryParam("com",com).queryParam("dang",dang).
                            request().
                            accept(MediaType.TEXT_PLAIN).
                            get(Response.class)
                    .toString();
            System.out.println(response);

    }
        
        
        public static void updateUser (int id,String username,String password,String name,String role){
            ClientConfig config = new ClientConfig();

            Client client = ClientBuilder.newClient(config);

            WebTarget target;
            target = client.target(getBaseURI());

            String response = target.path("updates").
                    path("updateuser").queryParam("id", id).
                    queryParam("username", username).
                    queryParam("password", password).queryParam("name", name).
                    queryParam("role",role).
                            request().
                            accept(MediaType.TEXT_PLAIN).
                            get(Response.class)
                    .toString();
            System.out.println(response);

    }
        
        public static void updateallergy (int id,String name){
            ClientConfig config = new ClientConfig();

            Client client = ClientBuilder.newClient(config);

            WebTarget target;
            target = client.target(getBaseURI());

            String response = target.path("updates").
                    path("updateallergy").queryParam("id", id).queryParam("name", name).
                            request().
                            accept(MediaType.TEXT_PLAIN).
                            get(Response.class)
                    .toString();
            System.out.println(response);

    }
        
        
        public static void updateappointment (int id,int patient_id,int clinic_id,String date,String doctor,String status){
            ClientConfig config = new ClientConfig();

            Client client = ClientBuilder.newClient(config);

            WebTarget target;
            target = client.target(getBaseURI());

            String response = target.path("updates").
                    path("updateappointment").queryParam("id", id).queryParam("patient_id", patient_id).
                    queryParam("clinic_id", clinic_id).queryParam("date", date).queryParam("doctor", doctor).queryParam("status", status).
                            request().
                            accept(MediaType.TEXT_PLAIN).
                            get(Response.class)
                    .toString();
            System.out.println(response);

    }
        
        
        public static void updatedrug (int id,String name,String effects){
            ClientConfig config = new ClientConfig();

            Client client = ClientBuilder.newClient(config);

            WebTarget target;
            target = client.target(getBaseURI());

            String response = target.path("updates").
                    path("updatedrug").queryParam("id", id).queryParam("name", name).
                    queryParam("effects", effects).
                            request().
                            accept(MediaType.TEXT_PLAIN).
                            get(Response.class)
                    .toString();
            System.out.println(response);

    }
        
        
        public static void updateincidents (int id,int patient_id,String details,String date){
            ClientConfig config = new ClientConfig();

            Client client = ClientBuilder.newClient(config);

            WebTarget target;
            target = client.target(getBaseURI());

            String response = target.path("updates").
                    path("updateincidents").queryParam("id", id).queryParam("patient_id", patient_id).
                    queryParam("details", details).queryParam("date", date).
                            request().
                            accept(MediaType.TEXT_PLAIN).
                            get(Response.class)
                    .toString();
            System.out.println(response);

    }
        
        public static void updateoverruled (int id,int patientid,int userid){
            ClientConfig config = new ClientConfig();

            Client client = ClientBuilder.newClient(config);

            WebTarget target;
            target = client.target(getBaseURI());

            String response = target.path("updates").
                    path("updateoverruled").queryParam("id", id).queryParam("patientid", patientid).
                    queryParam("userid", userid).
                            request().
                            accept(MediaType.TEXT_PLAIN).
                            get(Response.class)
                    .toString();
            System.out.println(response);

    }
        
        public static void updatepatientallergy (int id,int patientid,int allergyid){
            ClientConfig config = new ClientConfig();

            Client client = ClientBuilder.newClient(config);

            WebTarget target;
            target = client.target(getBaseURI());

            String response = target.path("updates").
                    path("updatepatientallergy").queryParam("id", id).queryParam("patientid", patientid).
                    queryParam("allergyid", allergyid).
                            request().
                            accept(MediaType.TEXT_PLAIN).
                            get(Response.class)
                    .toString();
            System.out.println(response);

    }
        
        
        public static void updatetreatment (int id,int patient_id,String details,String date){
            ClientConfig config = new ClientConfig();

            Client client = ClientBuilder.newClient(config);

            WebTarget target;
            target = client.target(getBaseURI());

            String response = target.path("updates").
                    path("updatetreatment").queryParam("id", id).queryParam("patient_id", patient_id).
                    queryParam("details", details).queryParam("date", date).
                            request().
                            accept(MediaType.TEXT_PLAIN).
                            get(Response.class)
                    .toString();
            System.out.println(response);

    }
        
        
 public static void main(String[] args) {
	// updateappointment (2,1,1,"1993-12-13","my doctor","ok");
        	//updateClinic(1,"kliniki","diethinsi","0","0");
        	//updatePatient (2,"onoma","kok","0","koko", "1955-5-5", "1", "koko", "1");
        	/*updateUser (1,"a","123450000","a a","a");
        	updateallergy (1,"TASIS AFTOKTONIAS");
        	
        	updatedrug (1,"narkotika","THANATOS!");
        	updateincidents (1,1,"DADWADA","1993-12-13");
        	updateoverruled (1,2,2);
        	updatepatientallergy (1,1,1);
        	updatetreatment (1,1,"DETAILSSSS","1993-12-13");*/
        }

}