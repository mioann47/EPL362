package epl362rest;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
//JAX-RS supports an automatic mapping from JAXB annotated class to XML and
//JSON
//Isn't that cool?
public class Drug {

	private int id;
	private String name;
	private String side_effects;
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
	public String getSide_effects() {
		return side_effects;
	}
	public void setSide_effects(String side_effects) {
		this.side_effects = side_effects;
	}
	
	
}
