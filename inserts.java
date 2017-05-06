package com.dendro.recommender.server;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;

/**
 * Created by AndreasC on 06-May-17.
 */
public class inserts {

    // Connection conn = null;
    SQLConnection sqlc = new SQLConnection();
    Connection conn = sqlc.getDBConnection();



    @GET
    @Path("/signup")
    public void InsertUser(@QueryParam("username") String username, @QueryParam("password")String password, @QueryParam("name")String name, @QueryParam("role")String role) {
        try {

            String query = new String("{call INSERT_USER(?,?,?,?)}");

            CallableStatement cstmt = conn.prepareCall(query);
            cstmt.setString(1, username);
            cstmt.setString(2, password);
            cstmt.setString(3, name);
            cstmt.setString(4, role);


            cstmt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    @GET
    @Path("/insertpatient")
    public void InsertPatient(@QueryParam("name") String name, @QueryParam("address")String address,  @QueryParam("selfharm")String selfharm, @QueryParam("problem")String problem) {
        try {

            String query = new String("{call INSERT_PATIENT(?,?,?,?)}");

            CallableStatement cstmt = conn.prepareCall(query);
            cstmt.setString(1, name);
            cstmt.setString(2, address);
            cstmt.setString(3, selfharm);
            cstmt.setString(4, problem);
            cstmt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }



    @GET
    @Path("/insertclinic")
    public void InsertClinic(@QueryParam("name") String name, @QueryParam("address")String address,@QueryParam("sdi")String sdi,  @QueryParam("spa")String spa) {
        try {

            String query = new String("{call INSERT_CLINIC(?,?,?,?)}");

            CallableStatement cstmt = conn.prepareCall(query);
            cstmt.setString(1, name);
            cstmt.setString(2, address);
            cstmt.setString(3, sdi);
            cstmt.setString(4, spa);
            cstmt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @GET
    @Path("/insertincident")
    public void InsertIncident (@QueryParam("id") int id, @QueryParam("details")String details,@QueryParam("date")String date) {
        try {

            String query = new String("{call INSERT_INCIDENT(?,?,?)}");

            CallableStatement cstmt = conn.prepareCall(query);
            cstmt.setInt(1, id);
            cstmt.setString(2, details);
            cstmt.setString(3, date);
            cstmt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @GET
    @Path("/inserttreatment")
    public void InsertTreatment (@QueryParam("id") int id, @QueryParam("details")String details,@QueryParam("date")String date) {
        try {

            String query = new String("{call INSERT_TREATMENT(?,?,?)}");

            CallableStatement cstmt = conn.prepareCall(query);
            cstmt.setInt(1, id);
            cstmt.setString(2, details);
            cstmt.setString(3, date);
            cstmt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    @GET
    @Path("/insertallergy")
    public void InsertAllergy (@QueryParam("name")String name) {
        try {

            String query = new String("{call INSERT_ALLERGY(?)}");

            CallableStatement cstmt = conn.prepareCall(query);
            cstmt.setString(1, name);
            cstmt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    @GET
    @Path("/insertpatientallergy")
    public void InsertPatientAllergy (@QueryParam("id") int id, @QueryParam("details")String details,@QueryParam("date")String date) {
        try {

            String query = new String("{call INSERT_PATIENT_ALLERGY(?,?,?)}");

            CallableStatement cstmt = conn.prepareCall(query);
            cstmt.setInt(1, id);
            cstmt.setString(2, details);
            cstmt.setString(3, date);
            cstmt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @GET
    @Path("/insertoverrulewarning")
    public void InsertOverruleWarning(@QueryParam("id") int id, @QueryParam("clinic_id")int clinic_id) {
        try {
            String query = new String("{call INSERT_OVERRULE_WARNING(?,?)}");
            CallableStatement cstmt = conn.prepareCall(query);
            cstmt.setInt(1, id);
            cstmt.setInt(2, clinic_id);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    @GET
    @Path("/insertappointment")
    public void InsertAppointment (@QueryParam("id") int id, @QueryParam("clinic_id")int clinic_id,@QueryParam("date")String date,@QueryParam("doctor")String doctor) {
        try {

            String query = new String("{call INSERT_APPOINTMENT(?,?,?,?)}");
            CallableStatement cstmt = conn.prepareCall(query);
            cstmt.setInt(1, id);
            cstmt.setInt(2, clinic_id);
            cstmt.setString(3, date);
            cstmt.setString(3, doctor);
            cstmt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @GET
    @Path("/insertdrug")
    public void InsertDrug (@QueryParam("name")String name,@QueryParam("date")String effects) {
        try {

            String query = new String("{call INSERT_DRUG(?,?)}");

            CallableStatement cstmt = conn.prepareCall(query);
            cstmt.setString(2, name);
            cstmt.setString(3, effects);
            cstmt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @GET
    @Path("/insertrequest")
    public void InsertRequest (@QueryParam("id")int id,@QueryParam("name")String name,@QueryParam("address")String address) {
        try {

            String query = new String("{call INSERT_REQUEST(?,?,?)}");
            CallableStatement cstmt = conn.prepareCall(query);
            cstmt.setInt(1, id);
            cstmt.setString(2, name);
            cstmt.setString(3, address);
            cstmt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }



}
