package com.danco.prime.data;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

import com.danco.prime.entity.Contact;

/**
 * The Class ContactStore.
 */
@Repository
@Scope("singleton")
public class ContactStore {
	
	/** The contacts. */
	private static List<Contact> contacts;

	/**
	 * Instantiates a new contact store.
	 */
	public ContactStore() {
		init(25L);
	}
	
	/**
	 * Inits the.
	 *
	 * @param count the count
	 */
	private void init (Long count) {
		contacts = new ArrayList<Contact>();
		
		for (int i = 0; i < count; i++) {
			Contact contact = new Contact();
			
			contact.setId((long) i);
			contact.setName("Name "+i);
			contact.setPhone("555-00-"+i);
			contact.setAddress("Address "+i);
			contact.setPrice(0L);
			
			contacts.add(contact);
		}
		
	}

	/**
	 * Gets the contacts.
	 *
	 * @return the contacts
	 */
	public List<Contact> getContacts() {
		return contacts;
	}
	
	public boolean add(Contact entity) {
		return contacts.add(entity);
	}


}
