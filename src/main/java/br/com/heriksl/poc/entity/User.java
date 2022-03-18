package br.com.heriksl.poc.entity;

public class User {
	private final String name;
	private final Long age;

	public User( String name, Long age ) {
		this.name = name;
		this.age = age;
	}

	public String talk(boolean isHappy) {
		if (isHappy)
			return "I have a nice day!";
		return "I have a bad day :/";
	}
}
