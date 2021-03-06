package epl362rest;


import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;

// Plain old Java Object it does not extend as class or implements
// an interface

// The class registers its methods for the HTTP GET request using the @GET annotation.
// Using the @Produces annotation, it defines that it can deliver several MIME types,
// text, XML and HTML.

// The browser requests per default the HTML MIME type.

//Sets the path to base URL + /hello

// This method is called if TEXT_PLAIN is request
/**
 * Delete from database Resources
 *
 */
@Path("/deletes")
public class deletes {


    
    /**
     * 
     */
    SQLConnection sqlc = new SQLConnection();
    /**
     * 
     */
    Connection conn = sqlc.getDBConnection();

    /**
     * Deletes allergy from id
     * @param id
     */
    @GET
    @Path("/deleteallergy")

    public void DeleteAllergy (@QueryParam("id")int id) {
        try {
            String query = new String("{call DELETE_ALLERGY(?)}");
            CallableStatement cstmt = conn.prepareCall(query);
            cstmt.setInt(1, id);
            cstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    /**
     * Deletes appointment by id
     * @param id
     */
    @GET
    @Path("/deleteappointment")

    public void DeleteAppointment (@QueryParam("id")int id) {
        try {
            String query = new String("{call DELETE_APPOINTMENT(?)}");
            CallableStatement cstmt = conn.prepareCall(query);
            cstmt.setInt(1, id);
            cstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    /**
     * Deletes clinic by id
     * @param id
     */
    @GET
    @Path("/deleteclinic")

    public void DeleteClinic(@QueryParam("id")int id) {
        try {
            String query = new String("{call DELETE_CLINIC(?)}");
            CallableStatement cstmt = conn.prepareCall(query);
            cstmt.setInt(1, id);
            cstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    /**
     * Deletes drug by id
     * @param id
     */
    @GET
    @Path("/deletedrug")

    public void DeleteDrug (@QueryParam("id")int id) {
        try {
            String query = new String("{call DELETE_DRUG(?)}");
            CallableStatement cstmt = conn.prepareCall(query);
            cstmt.setInt(1, id);
            cstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    /**
     * Delete incidents by id
     * @param id
     */
    @GET
    @Path("/deleteincidents")

    public void DeleteIncidents (@QueryParam("id")int id) {
        try {
            String query = new String("{call DELETE_INCIDENT(?)}");
            CallableStatement cstmt = conn.prepareCall(query);
            cstmt.setInt(1, id);
            cstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    /**
     * @param id
     */
    @GET
    @Path("/deleteoverruled")

    public void DeleteOverruled (@QueryParam("id")int id) {
        try {
            String query = new String("{call DELETE_OVERRULED_WARNING(?)}");
            CallableStatement cstmt = conn.prepareCall(query);
            cstmt.setInt(1, id);
            cstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }


    /**
     * @param id
     */
    @GET
    @Path("/deletepatient")
    public void DeletePatient (@QueryParam("id")int id) {
        try {
            String query = new String("{call DELETE_PATIENT(?)}");
            CallableStatement cstmt = conn.prepareCall(query);
            cstmt.setInt(1, id);
            cstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
    
    
    
    
    /**
     * @param id
     */
    @GET
    @Path("/deletepatientfromupdate")
    public void DeletePatientUpd (@QueryParam("id")int id) {
        try {
            String query = new String("{call DELETE_PATIENTS_UPDATE_LATER(?)}");
            CallableStatement cstmt = conn.prepareCall(query);
            cstmt.setInt(1, id);
            cstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
    
    
    
    /**
     * @param id
     */
    @GET
    @Path("/deletepatientallergy")
    public void DeletePatientAllergy (@QueryParam("id")int id) {
        try {
            String query = new String("{call DELETE_PATIENT_ALLERGY(?)}");
            CallableStatement cstmt = conn.prepareCall(query);
            cstmt.setInt(1, id);
            cstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    /**
     * @param id
     */
    @GET
    @Path("/deleterequest")
    public void DeleteRequest(@QueryParam("id")int id) {
        try {
            String query = new String("{call DELETE_REQUEST(?)}");
            CallableStatement cstmt = conn.prepareCall(query);
            cstmt.setInt(1, id);
            cstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    /**
     * @param id
     */
    @GET
    @Path("/deletetreatment")
    public void DeleteTreatment(@QueryParam("id")int id) {
        try {
            String query = new String("{call DELETE_TREATMENT(?)}");
            CallableStatement cstmt = conn.prepareCall(query);
            cstmt.setInt(1, id);
            cstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    /**
     * @param id
     */
    @GET
    @Path("/deleteuser")
    public void DeleteUser(@QueryParam("id")int id) {
        try {
            String query = new String("{call DELETE_USER(?)}");
            CallableStatement cstmt = conn.prepareCall(query);
            cstmt.setInt(1, id);
            cstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }



}

