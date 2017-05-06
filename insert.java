package com.dendro.recommender.client;

import org.glassfish.jersey.client.ClientConfig;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriBuilder;
import java.net.URI;


public class insert {


    private static URI getBaseURI() {
        return UriBuilder.fromUri("http://localhost:8090/rest").build();
    }


    private static void signup(String username, String password, String name, String role) {
        ClientConfig config = new ClientConfig();

        Client client = ClientBuilder.newClient(config);

        WebTarget target;
        target = client.target(getBaseURI());

        String response = target.path("insert").
                path("signup").queryParam("username", username).queryParam("password", password).queryParam("name", name).queryParam("role", role)
                .
                        request().
                        accept(MediaType.TEXT_PLAIN).
                        get(Response.class)
                .toString();


    }

    private static void insertpatient(String name, String address, String selfharm, String problem) {

        ClientConfig config = new ClientConfig();
        Client client = ClientBuilder.newClient(config);

        WebTarget target;
        target = client.target(getBaseURI());

        String response = target.path("insert").
                path("insertpatient").queryParam("name", name).queryParam("address", address).queryParam("selfharm", selfharm).queryParam("problem", problem)
                .
                        request().
                        accept(MediaType.TEXT_PLAIN).
                        get(Response.class)
                .toString();


    }

    private static void insertclinic(String name, String address, String sdi, String spa) {

        ClientConfig config = new ClientConfig();
        Client client = ClientBuilder.newClient(config);

        WebTarget target;
        target = client.target(getBaseURI());

        String response = target.path("insert").
                path("insertclinic").queryParam("name", name).queryParam("address", address).queryParam("sdi", sdi).queryParam("spa", spa)
                .
                        request().
                        accept(MediaType.TEXT_PLAIN).
                        get(Response.class)
                .toString();


    }

    private static void insertincident(int id, String details, String date) {

        ClientConfig config = new ClientConfig();
        Client client = ClientBuilder.newClient(config);

        WebTarget target;
        target = client.target(getBaseURI());

        String response = target.path("insert").
                path("insertpatient").queryParam("id", id).queryParam("details", details).queryParam("date", date)
                .
                        request().
                        accept(MediaType.TEXT_PLAIN).
                        get(Response.class)
                .toString();


    }

    private static void inserttreatment(int id, String details, String date) {

        ClientConfig config = new ClientConfig();
        Client client = ClientBuilder.newClient(config);

        WebTarget target;
        target = client.target(getBaseURI());

        String response = target.path("insert").
                path("inserttreatment").queryParam("id", id).queryParam("details", details).queryParam("date", date)
                .
                        request().
                        accept(MediaType.TEXT_PLAIN).
                        get(Response.class)
                .toString();


    }

    private static void insertallergy(String name) {

        ClientConfig config = new ClientConfig();
        Client client = ClientBuilder.newClient(config);

        WebTarget target;
        target = client.target(getBaseURI());

        String response = target.path("insert").
                path("insertallergy").queryParam("name", name)
                .
                        request().
                        accept(MediaType.TEXT_PLAIN).
                        get(Response.class)
                .toString();


    }

    private static void insertpatientallergy(int id, String details, String date) {

        ClientConfig config = new ClientConfig();
        Client client = ClientBuilder.newClient(config);

        WebTarget target;
        target = client.target(getBaseURI());

        String response = target.path("insert").
                path("insertpatientallergy").queryParam("id", id).queryParam("details", details).queryParam("date", date)
                .
                        request().
                        accept(MediaType.TEXT_PLAIN).
                        get(Response.class)
                .toString();


    }

    private static void insertoverrulewarning(int id, int clinic_id  ) {

        ClientConfig config = new ClientConfig();
        Client client = ClientBuilder.newClient(config);

        WebTarget target;
        target = client.target(getBaseURI());

        String response = target.path("insert").
                path("insertpatientallergy").queryParam("id", id).queryParam("clinic_id", clinic_id)
                .
                        request().
                        accept(MediaType.TEXT_PLAIN).
                        get(Response.class)
                .toString();


    }


    private static void insertappointment(int id, int clinic_id , String  date , String doctor) {

        ClientConfig config = new ClientConfig();
        Client client = ClientBuilder.newClient(config);

        WebTarget target;
        target = client.target(getBaseURI());

        String response = target.path("insert").
                path("insertpatientallergy").queryParam("id", id).queryParam("clinic_id", clinic_id)
                .
                        request().
                        accept(MediaType.TEXT_PLAIN).
                        get(Response.class)
                .toString();

    }

    private static void insertdrug(String name, String effects) {

        ClientConfig config = new ClientConfig();
        Client client = ClientBuilder.newClient(config);

        WebTarget target;
        target = client.target(getBaseURI());

        String response = target.path("insert").
                path("insertdrug").queryParam("name", name).queryParam("effects", effects)
                .
                        request().
                        accept(MediaType.TEXT_PLAIN).
                        get(Response.class)
                .toString();


    }

    private static void insertrequest(int id, String name, String address) {

        ClientConfig config = new ClientConfig();
        Client client = ClientBuilder.newClient(config);

        WebTarget target;
        target = client.target(getBaseURI());

        String response = target.path("insert").
                path("insertrequest").queryParam("id", id).queryParam("name", name).queryParam("address", address)
                .
                        request().
                        accept(MediaType.TEXT_PLAIN).
                        get(Response.class)
                .toString();


    }



}