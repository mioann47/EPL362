package epl362rest;

import java.util.ArrayList;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
//JAX-RS supports an automatic mapping from JAXB annotated class to XML and
//JSON
//Isn't that cool?
/**
 * Wrapper for Alergy
 *
 *
 */
public class AlergyWrapper {

	private ArrayList<Alergy> aList;

	/**
	 * @return
	 */
	public ArrayList<Alergy> getaList() {
		return aList;
	}

	/**
	 * @param aList
	 */
	public void setaList(ArrayList<Alergy> aList) {
		this.aList = aList;
	}
	
	
}
