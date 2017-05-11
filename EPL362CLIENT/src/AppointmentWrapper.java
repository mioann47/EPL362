

import java.util.ArrayList;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
//JAX-RS supports an automatic mapping from JAXB annotated class to XML and
//JSON
//Isn't that cool?
public class AppointmentWrapper {

private ArrayList<Appointment> aList;

public ArrayList<Appointment> getaList() {
	return aList;
}

public void setaList(ArrayList<Appointment> aList) {
	this.aList = aList;
}

	
}
