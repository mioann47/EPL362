package epl362rest;

import java.util.ArrayList;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
//JAX-RS supports an automatic mapping from JAXB annotated class to XML and
//JSON
//Isn't that cool?
public class AlergyWrapper {

	private ArrayList<Alergy> aList;

	public ArrayList<Alergy> getaList() {
		return aList;
	}

	public void setaList(ArrayList<Alergy> aList) {
		this.aList = aList;
	}
	
	
}
