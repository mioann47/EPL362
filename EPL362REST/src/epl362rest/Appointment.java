package epl362rest;


import javax.xml.bind.annotation.XmlRootElement;

/**
 * Class for Appointment
 *
 */
@XmlRootElement
//JAX-RS supports an automatic mapping from JAXB annotated class to XML and
//JSON
//Isn't that cool?
public class Appointment {

	/**
	 * 
	 */
	private int id;
	/**
	 * 
	 */
	private int patient_id;
	/**
	 * 
	 */
	private int clinic_id;
	/**
	 * 
	 */
	private String date;
	/**
	 * 
	 */
	private String doctor;
	/**
	 * 
	 */
	private String status;
	/**
	 * @return
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return
	 */
	public int getPatient_id() {
		return patient_id;
	}
	/**
	 * @param patient_id
	 */
	public void setPatient_id(int patient_id) {
		this.patient_id = patient_id;
	}
	/**
	 * @return
	 */
	public int getClinic_id() {
		return clinic_id;
	}
	/**
	 * @param clinic_id
	 */
	public void setClinic_id(int clinic_id) {
		this.clinic_id = clinic_id;
	}
	/**
	 * @return
	 */
	public String getDate() {
		return date;
	}
	/**
	 * @param date
	 */
	public void setDate(String date) {
		this.date = date;
	}
	/**
	 * @return
	 */
	public String getDoctor() {
		return doctor;
	}
	/**
	 * @param doctor
	 */
	public void setDoctor(String doctor) {
		this.doctor = doctor;
	}
	/**
	 * @return
	 */
	public String getStatus() {
		return status;
	}
	/**
	 * @param status
	 */
	public void setStatus(String status) {
		this.status = status;
	}
}
