package com.hello.rest;

import net.lr.tutorial.karaf.db.examplejpa.Person;
import net.lr.tutorial.karaf.db.examplejpa.PersonService;

import com.hello.service.impl.HelloService;

public class HelloRestServiceImpl implements HelloRestService {

	private HelloService helloService;

	private PersonService personService;

	public String handleGet(String name) {

		Person person = new Person("x", "@x");
		personService.add(person);

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

	public void setPersonService(PersonService personService) {
		this.personService = personService;
	}

	public PersonService getPersonService() {
		return personService;
	}

}
