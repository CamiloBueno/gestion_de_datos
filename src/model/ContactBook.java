package model;

import java.util.ArrayList;
import java.util.List;

public class ContactBook {
	
	private List<Contact> contacts;


	public ContactBook() {
		contacts = new ArrayList<Contact>();
		
	}
	public List<Contact> getContacts(){
		
		return contacts;
	}
	
	public boolean add(String name, String email, String phone) {
		boolean flag = false;
		if(flag == false) {
			contacts.add(new Contact(name, email, phone));
			flag = true;
		}
		return flag;
	}
	/**
	 * 
	 * @param email 
	 * @return 
	 */
	public Contact search(String email) {
		boolean flag = false;
		Contact c=null;
		for(int i=0;i<contacts.size() && !flag; i++) {
			if(email.equals(contacts.get(i).getEmail())){
				c=contacts.get(i);
				flag=true;
			}
		
		}
		return c;
	}
	
	public Contact remove(String email) {
		boolean flag = false;
		Contact c=null;
		for(int i=0;i<contacts.size() && !flag; i++) {
			if(email.equals(contacts.get(i).getEmail())){
				c=contacts.get(i);
				contacts.remove(i);
				flag=true;
			}
		
		}
		return c;
	}
	
}
