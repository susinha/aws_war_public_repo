package com.in28minutes.rest.webservices.restfulwebservices;

import java.net.InetAddress;
import java.net.UnknownHostException;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

	@GetMapping(path = "/hello-world")
	public String helloWorld() {
		return "Hello World";
	}

	@GetMapping(path = "/hello-world-bean1")
	public HelloWorldBean helloWorldBean1() throws UnknownHostException {
		InetAddress ip=InetAddress.getLocalHost();
		System.out.println(String.format("IP is %s", ip));
		String ipAddr=String.format("IP is %s", ip);
		return new HelloWorldBean("Hello World - Bean11",ipAddr);
	}
	@GetMapping(path = "/hello-world-bean2")
	public HelloWorldBean helloWorldBean2() throws UnknownHostException {
		InetAddress ip=InetAddress.getLocalHost();
		System.out.println(String.format("IP is %s", ip));
		String ipAddr=String.format("IP is %s", ip);
		return new HelloWorldBean("Hello World - Bean22",ipAddr);
	}
	@GetMapping(path = "/hello-world-bean3")
	public HelloWorldBean helloWorldBean3() throws UnknownHostException {
		InetAddress ip=InetAddress.getLocalHost();
		System.out.println(String.format("IP is %s", ip));
		String ipAddr=String.format("IP is %s", ip);
		return new HelloWorldBean("Hello World - Bean33",ipAddr);
	}
	@GetMapping(path = "/hello-world-bean4")
	public HelloWorldBean helloWorldBean4() throws UnknownHostException {
		InetAddress ip=InetAddress.getLocalHost();
		System.out.println(String.format("IP is %s", ip));
		String ipAddr=String.format("IP is %s", ip);
		return new HelloWorldBean("Hello World - Bean44",ipAddr);
	}	
}