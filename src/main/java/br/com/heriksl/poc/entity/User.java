package br.com.heriksl.poc.entity;

public class User {
	private String name;
	private Long age;

	public User( String name, Long age ) {
		this.name = name;
		this.age = age;
	}

	public void talk(boolean isHappy) {
		if (isHappy)
			System.out.println("I have a nice day!");
		else
			System.out.println("I have a bad day :/");
	}
}
