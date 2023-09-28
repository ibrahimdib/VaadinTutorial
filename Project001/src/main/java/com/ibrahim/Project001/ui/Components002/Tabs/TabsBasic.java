package com.ibrahim.Project001.ui.Components002.Tabs;


import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.tabs.Tab;
import com.vaadin.flow.component.tabs.Tabs;
import com.vaadin.flow.router.Route;

@Route("tabs-basic")
public class TabsBasic extends Div {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public TabsBasic() {
		// tag::snippet[]
		Tab details = new Tab("Details");
		Tab payment = new Tab("Payment");
		Tab shipping = new Tab("Shipping");

		Tabs tabs = new Tabs(details, payment, shipping);
		// end::snippet[]
		add(tabs);
	}

}

