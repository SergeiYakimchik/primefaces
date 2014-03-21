package com.danco.prime.controller;

import javax.faces.bean.ManagedBean;

/**
 * The Class VacationController.
 *
 * @author siarhei_yakimchyk
 */
@ManagedBean(name="vacationController")
public class VacationController {
	
	/** The Constant activeIndex. */
	private Integer activeIndex = 0;

	/**
	 * Gets the active index.
	 *
	 * @return the active index
	 */
	public Integer getActiveIndex() {
		return activeIndex;
	}

}
