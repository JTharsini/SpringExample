package com.jeya.spring;

public class Age {
	private int age;
	private String ageGroup;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAgeGroup() {
		return ageGroup;
	}

	public void setAgeGroup(String ageGroup) {
		this.ageGroup = ageGroup;
	}

	public void print() {
		System.out.println("Age: " + age + ", Age group : " + ageGroup);
	}
}