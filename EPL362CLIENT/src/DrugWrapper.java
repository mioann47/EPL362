

import java.util.ArrayList;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
//JAX-RS supports an automatic mapping from JAXB annotated class to XML and
//JSON
//Isn't that cool?
public class DrugWrapper {

	private ArrayList<Drug> dList;

	public ArrayList<Drug> getdList() {
		return dList;
	}

	public void setdList(ArrayList<Drug> dList) {
		this.dList = dList;
	}
	
	
	
}
