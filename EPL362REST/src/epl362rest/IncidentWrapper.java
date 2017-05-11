package epl362rest;

import java.util.ArrayList;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
//JAX-RS supports an automatic mapping from JAXB annotated class to XML and
//JSON
//Isn't that cool?
public class IncidentWrapper {

	
	private ArrayList<Incident> iList;

	public ArrayList<Incident> getiList() {
		return iList;
	}

	public void setiList(ArrayList<Incident> iList) {
		this.iList = iList;
	}
	
	
}
