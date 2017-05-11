package epl362rest;

import java.util.ArrayList;

import javax.xml.bind.annotation.XmlRootElement;
/**
 * Wrapper for Clinic
 *
 */
@XmlRootElement
//JAX-RS supports an automatic mapping from JAXB annotated class to XML and
//JSON
//Isn't that cool?
public class ClinicWrapper {

	
	/**
	 * 
	 */
	private ArrayList<Clinic> cList;

	/**
	 * @return
	 */
	public ArrayList<Clinic> getcList() {
		return cList;
	}

	/**
	 * @param cList
	 */
	public void setcList(ArrayList<Clinic> cList) {
		this.cList = cList;
	}
	
	
}
