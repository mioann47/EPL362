package epl362rest;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
//JAX-RS supports an automatic mapping from JAXB annotated class to XML and
//JSON
//Isn't that cool?
public class PatientAllergy {

	private int id;
	private int patient_id;
	private int allergy_id;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getPatient_id() {
		return patient_id;
	}
	public void setPatient_id(int patient_id) {
		this.patient_id = patient_id;
	}
	public int getAllergy_id() {
		return allergy_id;
	}
	public void setAllergy_id(int allergy_id) {
		this.allergy_id = allergy_id;
	}
	
}
