package com.twilio;

public class Agent {
	private int id;
	private String name;
	private String extension;
	
	private boolean isIdle;
	/**
	 * @param id
	 * @param name
	 * @param extension
	 */
	public Agent(int id, String name, String extension, boolean b) {
		this.id = id;
		this.name = name;
		this.extension = extension;
		this.isIdle = b;
	}
	
	/**
	 * @return the isActive
	 */
	public boolean isIdle() {
		return isIdle;
	}

	/**
	 * @param isActive the isActive to set
	 */
	public void setIdle(boolean isActive) {
		this.isIdle = isActive;
	}


	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the extension
	 */
	public String getExtension() {
		return extension;
	}

	/**
	 * @param extension
	 *            the extension to set
	 */
	public void setExtension(String extension) {
		this.extension = extension;
	}

}
