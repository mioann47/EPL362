

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
//JAX-RS supports an automatic mapping from JAXB annotated class to XML and
//JSON
//Isn't that cool?
public class OverruledWarning {

		private int id;
		private int id_patients_allergys;
		private int userid;
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public int getId_patients_allergys() {
			return id_patients_allergys;
		}
		public void setId_patients_allergys(int id_patients_allergys) {
			this.id_patients_allergys = id_patients_allergys;
		}
		public int getUserid() {
			return userid;
		}
		public void setUserid(int userid) {
			this.userid = userid;
		}
		
}
