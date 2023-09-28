package com.ibrahim.Project001.ui.Components003.js;


import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

@Route("test")
public class TestJs extends VerticalLayout {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
	public TestJs() {
		
		MainPage page =  new MainPage();
		page.setContent(new Label("Hello"));
		
		EventHandlerPolymerTemplate t  =  new EventHandlerPolymerTemplate();
		
		ModelItemHandlerPolymerTemplate.Message message =  new ModelItemHandlerPolymerTemplate.Message();
		message.setText("My name is Ibrahim ");
		
		ModelItemHandlerPolymerTemplate handler =  new ModelItemHandlerPolymerTemplate();
		
		
		
		handler.handleClick(message);
		
		
	
		
	
		
		add(page,t);
	}

}
