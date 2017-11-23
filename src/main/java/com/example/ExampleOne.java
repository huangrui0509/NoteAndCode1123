package com.example;

import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class ExampleOne implements Serializable{

	
	private static final long serialVersionUID = 1L;
	
	private Properties adminEmails;
	private List someList;
	private Map someMap;
	private Set someSet;
	public Properties getAdminEmails() {
		return adminEmails;
	}
	public void setAdminEmails(Properties adminEmails) {
		this.adminEmails = adminEmails;
	}
	public List getSomeList() {
		return someList;
	}
	public void setSomeList(List someList) {
		this.someList = someList;
	}
	public Map getSomeMap() {
		return someMap;
	}
	public void setSomeMap(Map someMap) {
		this.someMap = someMap;
	}
	public Set getSomeSet() {
		return someSet;
	}
	public void setSomeSet(Set someSet) {
		this.someSet = someSet;
	}
	@Override
	public String toString() {
		return "ExampleOne [adminEmails=" + adminEmails + ", someList=" + someList + ", someMap=" + someMap
				+ ", someSet=" + someSet + "]";
	}
	
	
	
	
}
