package epl362rest;
import java.util.ArrayList;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
//JAX-RS supports an automatic mapping from JAXB annotated class to XML and
//JSON
//Isn't that cool?
public class PatientListWrapper {

	private ArrayList<Patient> pList;

	public ArrayList<Patient> getpList() {
		return pList;
	}

	public void setpList(ArrayList<Patient> pList) {
		this.pList = pList;
	}
	
	
	
}
