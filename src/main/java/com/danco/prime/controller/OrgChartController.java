package com.danco.prime.controller;

import javax.faces.bean.ManagedBean;

/**
 * 
 * @author siarhei_yakimchyk
 *
 */
@ManagedBean
public class OrgChartController {
	
	/** The Constant activeIndex. */
	private int activeIndex = 1;

	/**
	 * Gets the active index.
	 *
	 * @return the active index
	 */
	public int getActiveIndex() {
		System.out.println(activeIndex);
		return activeIndex;
	}
	
}
