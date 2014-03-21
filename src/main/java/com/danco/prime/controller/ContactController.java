package com.danco.prime.controller;

import java.util.List;

import javax.faces.bean.ManagedBean;

import com.danco.prime.data.ContactStore;
import com.danco.prime.entity.Contact;

/**
 * The Class ContactController.
 */
@ManagedBean
public class ContactController {
	
	/** The store. */
	private ContactStore store = new ContactStore();
	
	/**
	 * Gets the contacts.
	 *
	 * @return the contacts
	 */
	public List<Contact> getContacts () {
		return store.getContacts();
	}
	
}
