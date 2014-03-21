package com.danco.prime.controller;

import javax.faces.bean.ManagedBean;

import org.primefaces.model.chart.CartesianChartModel;
import org.primefaces.model.chart.LineChartSeries;

/**
 * 
 * @author siarhei_yakimchyk
 *
 */
@ManagedBean(name="orgChartController")
public class OrgChartController {
	
	/** The Constant activeIndex. */
	private int activeIndex = 1;

	private CartesianChartModel linearModel;  
	  
    public OrgChartController() {  
        createLinearModel();  
    }  
  
    public CartesianChartModel getLinearModel() {  
        return linearModel;  
    }  
  
    private void createLinearModel() {  
        linearModel = new CartesianChartModel();  
  
        LineChartSeries series1 = new LineChartSeries();  
        series1.setLabel("Series 1");  
  
        series1.set(1, 2);  
        series1.set(2, 1);  
        series1.set(3, 3);  
        series1.set(4, 6);  
        series1.set(5, 8);  
  
        LineChartSeries series2 = new LineChartSeries();  
        series2.setLabel("Series 2");  
        series2.setMarkerStyle("diamond");  
  
        series2.set(1, 6);  
        series2.set(2, 3);  
        series2.set(3, 2);  
        series2.set(4, 7);  
        series2.set(5, 9);  
  
        linearModel.addSeries(series1);  
        linearModel.addSeries(series2);  
    }  
	/**
	 * Gets the active index.
	 *
	 * @return the active index
	 */
	public int getActiveIndex() {
		return activeIndex;
	}
	
}
