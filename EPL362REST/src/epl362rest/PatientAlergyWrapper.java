package epl362rest;

import java.util.ArrayList;

import javax.xml.bind.annotation.XmlRootElement;
@XmlRootElement
//JAX-RS supports an automatic mapping from JAXB annotated class to XML and
//JSON
//Isn't that cool?
public class PatientAlergyWrapper {

		private ArrayList<PatientAllergy> pList;

		public ArrayList<PatientAllergy> getpList() {
			return pList;
		}

		public void setpList(ArrayList<PatientAllergy> pList) {
			this.pList = pList;
		}
		
}
