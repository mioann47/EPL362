package epl362rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.Date;
import java.sql.SQLException;
import java.sql.Types;


@Path("/updates")
public class updates {

    
    SQLConnection sqlc = new SQLConnection();
    Connection conn = sqlc.getDBConnection();




    /**
     * @param id
     * @param name
     * @param address
     * @param sdi
     * @param spa
     */
    @GET
    @Path("/updateclinic")
    public void UpdateClinic (@QueryParam("id")int id, @QueryParam("name")String name, @QueryParam("address")String address, @QueryParam("sdi")String sdi, @QueryParam("spa")String spa) {
        try {

            String query = new String("{call UPDATE_CLINIC(?,?,?,?,?)}");
            CallableStatement cstmt = conn.prepareCall(query);
            cstmt.setInt(1, id);
            cstmt.setString(2, name);
            cstmt.setString(3, address);
            cstmt.setString(4, sdi);
            cstmt.setString(5, spa);
            cstmt.executeUpdate();




        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    /**
     * @param id
     * @param name
     * @param address
     * @param selfharm
     * @param problem
     */
    @GET
    @Path("/updatepatient")
    public void UpdatePatient (@QueryParam("id")int id,@QueryParam("name")String name,@QueryParam("address")String address,
    		@QueryParam("selfharm")String selfharm,@QueryParam("problem")String problem,@QueryParam("prev")String prev,@QueryParam ("isalive")String isalive
    		,@QueryParam("com")String com,@QueryParam("dang")String dang) {
        try {

            String query = new String("{call UPDATE_PATIENT(?,?,?,?,?,?,?,?,?)}");
            CallableStatement cstmt = conn.prepareCall(query);
            cstmt.setInt(1, id);
            cstmt.setString(2, name);
            cstmt.setString(3, address);
            cstmt.setString(4, selfharm);
            cstmt.setString(5, problem);
           
            if (prev.equals("n/a")) cstmt.setNull(6, Types.DATE);
            else{
            cstmt.setString(6, prev);}
            
            cstmt.setString(7, isalive);
            cstmt.setString(8, com);
            cstmt.setString(9, dang);
            
            cstmt.executeUpdate();


        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    /**
     * @param id
     * @param username
     * @param password
     * @param name
     * @param role
     */
    @GET
    @Path("/updateuser")
    public void UpdateUser (@QueryParam("id")int id,@QueryParam("username")String username,@QueryParam("password")String password,@QueryParam("name")String name,@QueryParam("role")String role) {
        try {

            String query = new String("{call UPDATE_USER(?,?,?,?,?)}");
            CallableStatement cstmt = conn.prepareCall(query);
            cstmt.setInt(1, id);
            cstmt.setString(2, username);
            cstmt.setString(3, password);
            cstmt.setString(4, name);
            cstmt.setString(5, role);
            cstmt.executeUpdate();


        } catch (SQLException e) {
            e.printStackTrace();
        }

    }


    /**
     * @param id
     * @param name
     */
    @GET
    @Path("/updateallergy")
    public void UpdateAllergy(@QueryParam("id")int id,@QueryParam("name")String name) {
        try {
            String query = new String("{call UPDATE_ALLERGY(?,?)}");
            CallableStatement cstmt = conn.prepareCall(query);
            cstmt.setInt(1, id);
            cstmt.setString(2, name);
            cstmt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    /**
     * @param id
     * @param patient_id
     * @param clinic_id
     * @param date
     * @param doctor
     */
    @GET
    @Path("/updateappointment")
    public void UpdateAppointment (@QueryParam("id")int id,@QueryParam("patient_id")int patient_id,
    		@QueryParam("clinic_id")int clinic_id,@QueryParam("date")String date,
    		@QueryParam("doctor")String doctor,@QueryParam("status")String status) {
        try {

            String query = new String("{call UPDATE_APPOINTMENT(?,?,?,?,?,?)}");
            CallableStatement cstmt = conn.prepareCall(query);
            cstmt.setInt(1, id);
            cstmt.setInt(2, patient_id);
            cstmt.setInt(3,clinic_id);
            cstmt.setString(4, date);
            cstmt.setString(5, doctor);
            cstmt.setString(6, status);
            cstmt.executeUpdate();


        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    /**
     * @param id
     * @param name
     * @param effects
     */
    @GET
    @Path("/updatedrug")

    public void UpdateDrug (@QueryParam("id")int id,@QueryParam("name")String name,@QueryParam("effects")String effects) {
        try {

            String query = new String("{call UPDATE_DRUG(?,?,?)}");
            CallableStatement cstmt = conn.prepareCall(query);
            cstmt.setInt(1, id);
            cstmt.setString(2, name);
            cstmt.setString(3, effects);
            cstmt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    /**
     * @param id
     * @param patient_id
     * @param details
     * @param date
     */
    @GET
    @Path("/updateincidents")

    public void UpdateIncidents (@QueryParam("id")int id,@QueryParam("patient_id")int patient_id,@QueryParam("details")String details,@QueryParam("date")String date) {
        try {

            String query = new String("{call UPDATE_INCIDENTS(?,?,?,?)}");
            CallableStatement cstmt = conn.prepareCall(query);
            cstmt.setInt(1, id);
            cstmt.setInt(1, patient_id);
            cstmt.setString(3, details);
            cstmt.setString(4, date);
            cstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    /**
     * @param id
     * @param patientid
     * @param userid
     */
    @GET
    @Path("/updateoverruled")
    public void UpdateOverruled (@QueryParam("id")int id,@QueryParam("patientid")int patientid,@QueryParam("userid")int userid) {
        try {

            String query = new String("{call UPDATE_OVERRULED_WARNING(?,?,?)}");
            CallableStatement cstmt = conn.prepareCall(query);
            cstmt.setInt(1, id);
            cstmt.setInt(2, patientid);
            cstmt.setInt(3, userid);
            cstmt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    /**
     * @param id
     * @param patientid
     * @param allergyid
     */
    @GET
    @Path("/updatepatientallergy")
    public void UpdatePatientAllergy (@QueryParam("id")int id,@QueryParam("patientid")int patientid,@QueryParam("allergyid")int allergyid) {
        try {

            String query = new String("{call UPDATE_PATIENT_ALLERGY(?,?,?)}");
            CallableStatement cstmt = conn.prepareCall(query);
            cstmt.setInt(1, id);
            cstmt.setInt(2, patientid);
            cstmt.setInt(3, allergyid);
            cstmt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    /**
     * @param id
     * @param patient_id
     * @param details
     * @param date
     */
    @GET
    @Path("/updatetreatment")
    public void UpdateTreatment (@QueryParam("id")int id,@QueryParam("patient_id")int patient_id,@QueryParam("details")String details,@QueryParam("date")String date) {
        try {

            String query = new String("{call UPDATE_TREATMENT(?,?,?,?)}");
            CallableStatement cstmt = conn.prepareCall(query);
            cstmt.setInt(1, id);
            cstmt.setInt(2, patient_id);
            cstmt.setString(3, details);
            cstmt.setString(4, date);
            cstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }



}
