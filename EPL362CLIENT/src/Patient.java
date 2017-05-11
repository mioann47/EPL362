
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
//JAX-RS supports an automatic mapping from JAXB annotated class to XML and
//JSON
//Isn't that cool?
public class Patient {
	
	private int id;
	private String name;
	private String address;
	private char selfharm;
	private String problem;
	private String prev_cons;
	private char isalive;
	private String comments;
	private char dangerous;


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public char getSelfharm() {
		return selfharm;
	}

	public void setSelfharm(char selfharm) {
		this.selfharm = selfharm;
	}

	public String getProblem() {
		return problem;
	}

	public void setProblem(String problem) {
		this.problem = problem;
	}

	public String getPrev_cons() {
		return prev_cons;
	}

	public void setPrev_cons(String prev_cons) {
		this.prev_cons = prev_cons;
	}

	public char getIsalive() {
		return isalive;
	}

	public void setIsalive(char isalive) {
		this.isalive = isalive;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public char getDangerous() {
		return dangerous;
	}

	public void setDangerous(char dangerous) {
		this.dangerous = dangerous;
	}
	
}
