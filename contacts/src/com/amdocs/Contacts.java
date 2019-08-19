package com.amdocs;
import java.util.HashMap;

public class Contacts {
	private HashMap<String, String> contacts;
	
	public Contacts() {
		this.contacts= new HashMap<String, String> () ;
	}
	public void addContact (String mobileNo , String name) {
		contacts.put( mobileNo, name);
	}
	public String findContactNameByMobileNo(String mobileNo) {
		String name= contacts.get(mobileNo);
		if (name==null) {
			return mobileNo;
		}
		else {
			return name;
		}
	}
	public static void main(String[] args) {
		Contacts contact=new Contacts();
		contact.addContact( "1234", "rishi");
		contact.addContact( "986", "abc");
		contact.addContact( "2345", "xyz");
		
		String name = contact.findContactNameByMobileNo("1234");
		System.out.println("name is " + name);
		
	}
}
