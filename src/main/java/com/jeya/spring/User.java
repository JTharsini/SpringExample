package com.jeya.spring;

public class User {
	private Login login;
	private Age age;
	private Address address;

	public Login getLogin() {
		return login;
	}

	public void setLogin(Login login) {
		this.login = login;
	}

	public Age getAge() {
		return age;
	}

	public void setAge(Age age) {
		this.age = age;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public void print() {
		login.print();
		age.print();
		address.print();
	}
}