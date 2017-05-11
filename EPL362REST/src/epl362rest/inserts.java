package epl362rest;



import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Types;

/**
 * Created by AndreasC on 06-May-17.
 */
@Path("/insert")
public class inserts {

    // Connection conn = null;
    SQLConnection sqlc = new SQLConnection();
    Connection conn = sqlc.getDBConnection();



    /**
     * @param username
     * @param password
     * @param name
     * @param role
     */
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


    /**
     * @param name
     * @param address
     * @param selfharm
     * @param problem
     */
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



    /**
     * @param name
     * @param address
     * @param sdi
     * @param spa
     */
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

    /**
     * @param id
     * @param details
     * @param date
     */
    @GET
    @Path("/insertincident")
    public void InsertIncident (@QueryParam("id") int id, @QueryParam("details")String details,@QueryParam("date")String date) {
        try {

            String query = new String("{call INSERT_INCIDENTS(?,?,?)}");

            CallableStatement cstmt = conn.prepareCall(query);
            cstmt.setInt(1, id);
            cstmt.setString(2, details);
            cstmt.setString(3, date);
            cstmt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    /**
     * @param id
     * @param details
     * @param date
     */
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


    /**
     * @param name
     */
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


    /**
     * @param pid
     * @param aid
     */
    @GET
    @Path("/insertpatientallergy")
    public void InsertPatientAllergy (@QueryParam("pid") int pid, @QueryParam("aid")int aid) {
        try {

            String query = new String("{call INSERT_PATIENT_ALLERGY(?,?)}");

            CallableStatement cstmt = conn.prepareCall(query);
            cstmt.setInt(1, pid);
            cstmt.setInt(2,aid);
            cstmt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    /**
     * @param id
     * @param userid
     */
    @GET
    @Path("/insertoverruledwarning")
    public void InsertOverruleWarning(@QueryParam("paid") int id, @QueryParam("userid")int userid) {
        try {
            String query = new String("{call INSERT_OVERRULED_WARNING(?,?)}");
            CallableStatement cstmt = conn.prepareCall(query);
            cstmt.setInt(1, id);
            cstmt.setInt(2, userid);
            cstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    /**
     * @param id
     * @param clinic_id
     * @param date
     * @param doctor
     */
    @GET
    @Path("/insertappointment")
    public void InsertAppointment (@QueryParam("id") int id, @QueryParam("clinic_id")int clinic_id,@QueryParam("date")String date,@QueryParam("doctor")String doctor) {
        try {

            String query = new String("{call INSERT_APPOINTMENT(?,?,?,?)}");
            CallableStatement cstmt = conn.prepareCall(query);
            cstmt.setInt(1, id);
            cstmt.setInt(2, clinic_id);
            cstmt.setString(3, date);
            cstmt.setString(4, doctor);
            cstmt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    /**
     * @param name
     * @param effects
     */
    @GET
    @Path("/insertdrug")
    public void InsertDrug (@QueryParam("name")String name,@QueryParam("effects")String effects) {
        try {

            String query = new String("{call INSERT_DRUG(?,?)}");

            CallableStatement cstmt = conn.prepareCall(query);
            cstmt.setString(1, name);
            cstmt.setString(2, effects);
            cstmt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    /**
     * @param id
     * @param name
     * @param address
     */
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


    @GET
    @Path("/insertpatientupdatelater")
    public void InsertPatientUpdateLater(@QueryParam("id")int id,@QueryParam("name")String name,@QueryParam("address")String address,
    		@QueryParam("selfharm")String selfharm,@QueryParam("problem")String problem,@QueryParam("prev")String prev,
    		@QueryParam ("isalive")String isalive
    		,@QueryParam("com")String com,@QueryParam("dang")String dang) {
        try {

            String query = new String("{call INSERT_PATIENTS_UPDATE_LATER(?,?,?,?,?,?,?,?,?)}");

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
	
    

}
