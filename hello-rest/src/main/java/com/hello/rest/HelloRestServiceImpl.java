package com.hello.rest;

import com.hello.service.impl.HelloService;

public class HelloRestServiceImpl implements HelloRestService {

	private HelloService helloService;

	public String handleGet(String name) {

		return helloService.sayHello(name);

	}

	public HelloRestServiceImpl() {
	}


	public HelloService getHelloService() {
		return helloService;
	}

	public void setHelloService(HelloService helloService) {
		this.helloService = helloService;
	}


}
