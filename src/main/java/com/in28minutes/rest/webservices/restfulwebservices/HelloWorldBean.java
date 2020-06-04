package com.in28minutes.rest.webservices.restfulwebservices;

public class HelloWorldBean {

	private String message;
	private String ip;

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public HelloWorldBean(String message,String ip) {
		this.message = message;
		this.ip=ip;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return String.format("HelloWorldBean [message=%s]", message);
	}

}
