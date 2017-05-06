package epl362rest;

import java.util.ArrayList;

import javax.xml.bind.annotation.XmlRootElement;
@XmlRootElement
//JAX-RS supports an automatic mapping from JAXB annotated class to XML and
//JSON
//Isn't that cool?
public class OverruledWarningWrapper {

		private ArrayList<OverruledWarning> oList;

		public ArrayList<OverruledWarning> getoList() {
			return oList;
		}

		public void setoList(ArrayList<OverruledWarning> oList) {
			this.oList = oList;
		}
		
}
