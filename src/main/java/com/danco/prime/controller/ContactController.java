package com.danco.prime.controller;

import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;

import com.danco.prime.data.ContactStore;
import com.danco.prime.entity.Contact;

/**
 * The Class ContactController.
 */
@ManagedBean
public class ContactController {
	
	/** The store. */
	private ContactStore store;
	
	/** The contact. */
	private Contact contact;
	
	/**
	 * Instantiates a new contact controller.
	 */
	public ContactController() {
		store = new ContactStore();
		contact = new Contact();
	}

	/**
	 * Gets the contacts.
	 *
	 * @return the contacts
	 */
	public List<Contact> getContacts () {
		return store.getContacts();
	}

	/**
	 * Gets the contact.
	 *
	 * @return the contact
	 */
	public Contact getContact() {
		return contact;
	}
	
	/**
	 * Save.
	 *
	 * @param actionEvent the action event
	 */
	public void save(ActionEvent actionEvent) {
		if (store.add(contact)){
			FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Successful", contact.getName()));  
		} else {
			 FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Error", contact.getName()));
		}
	}
	
}
