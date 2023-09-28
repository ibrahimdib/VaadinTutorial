package com.ibrahim.Project001.ui.Components004.dataBinding;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;


@Route("mainn")
public class TestView extends VerticalLayout{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public TestView() {
		PolymerTwoWayBindingTemplate p = new PolymerTwoWayBindingTemplate();
		
		add(p);
	}

}
