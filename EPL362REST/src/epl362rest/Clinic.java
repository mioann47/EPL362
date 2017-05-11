package epl362rest;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * Class for Clinic
 *
 */
@XmlRootElement
//JAX-RS supports an automatic mapping from JAXB annotated class to XML and
//JSON
//Isn't that cool?
public class Clinic {

	
	/**
	 * 
	 */
	private int id;
	/**
	 * 
	 */
	private String name;
	/**
	 * 
	 */
	private String address;
	/**
	 * 
	 */
	private char supports_drop_in;
	/**
	 * 
	 */
	private char supports_pre_arranged;
	/**
	 * @return
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return
	 */
	public String getAddress() {
		return address;
	}
	/**
	 * @param address
	 */
	public void setAddress(String address) {
		this.address = address;
	}
	/**
	 * @return
	 */
	public char getSupports_drop_in() {
		return supports_drop_in;
	}
	/**
	 * @param supports_drop_in
	 */
	public void setSupports_drop_in(char supports_drop_in) {
		this.supports_drop_in = supports_drop_in;
	}
	/**
	 * @return
	 */
	public char getSupports_pre_arranged() {
		return supports_pre_arranged;
	}
	/**
	 * @param supports_pre_arranged
	 */
	public void setSupports_pre_arranged(char supports_pre_arranged) {
		this.supports_pre_arranged = supports_pre_arranged;
	}
	
	
}
