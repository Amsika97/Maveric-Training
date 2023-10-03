package com.training.org;

public class Greeting {
private int id;
private String name;
public Greeting(int i, String string) {
	// TODO Auto-generated constructor stub
	System.out.println("Parameterised greeting is called");
	this.id=id;
	this.name=name;
}
public Greeting() {
	System.out.println("Default greeting is called");
	// TODO Auto-generated constructor stub
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}

}
