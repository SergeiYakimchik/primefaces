package com.danco.prime.controller;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

import org.primefaces.event.ItemSelectEvent;
import org.primefaces.model.chart.CartesianChartModel;
import org.primefaces.model.chart.ChartSeries;
import org.primefaces.model.chart.LineChartSeries;
import org.primefaces.model.chart.PieChartModel;

/**
 * 
 * @author siarhei_yakimchyk
 *
 */
@ManagedBean(name="orgChartController")
public class OrgChartController {

	/** The Constant activeIndex. */
	private int activeIndex = 1;

	private CartesianChartModel categoryModel;  

	private CartesianChartModel linearModel;  

	private PieChartModel pieModel;  

	public OrgChartController() {  
		createLinearModel();  
		createCategoryModel();  
		createPieModel();  
	}  

	public void itemSelect(ItemSelectEvent event) {  
		FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_INFO, "Item selected",  
				"Item Index: " + event.getItemIndex() + ", Series Index:" + event.getSeriesIndex());  

		FacesContext.getCurrentInstance().addMessage(null, msg);  
	}  

	public CartesianChartModel getCategoryModel() {  
		return categoryModel;  
	}  

	public PieChartModel getPieModel() {  
		return pieModel;  
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

	private void createCategoryModel() {  
		categoryModel = new CartesianChartModel();  

		ChartSeries boys = new ChartSeries();  
		boys.setLabel("Boys");  

		boys.set("2004", 120);  
		boys.set("2005", 100);  
		boys.set("2006", 44);  
		boys.set("2007", 150);  
		boys.set("2008", 25);  

		ChartSeries girls = new ChartSeries();  
		girls.setLabel("Girls");  

		girls.set("2004", 52);  
		girls.set("2005", 60);  
		girls.set("2006", 110);  
		girls.set("2007", 135);  
		girls.set("2008", 120);  

		categoryModel.addSeries(boys);  
		categoryModel.addSeries(girls);  
	}  

	private void createPieModel() {  
		pieModel = new PieChartModel();  

		pieModel.set("Brand 1", 540);  
		pieModel.set("Brand 2", 325);  
		pieModel.set("Brand 3", 702);  
		pieModel.set("Brand 4", 421);  
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
