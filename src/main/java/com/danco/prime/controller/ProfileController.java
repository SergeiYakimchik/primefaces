package com.danco.prime.controller;

import javax.faces.bean.ManagedBean;

/**
 * 
 * @author siarhei_yakimchyk
 *
 */
@ManagedBean(name="profileController")
public class ProfileController {
	
	/** The Constant activeIndex. */
	private int activeIndex = 3;

	/**
	 * Gets the active index.
	 *
	 * @return the active index
	 */
	public int getActiveIndex() {
		return activeIndex;
	}
}
