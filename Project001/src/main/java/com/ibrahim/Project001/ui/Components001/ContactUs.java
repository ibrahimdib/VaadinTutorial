package com.ibrahim.Project001.ui.Components001;

import com.vaadin.flow.component.Html;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.button.ButtonVariant;
import com.vaadin.flow.component.html.Footer;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextArea;
import com.vaadin.flow.router.Route;

@Route("contact-us")
public class ContactUs extends VerticalLayout {

	private static final long serialVersionUID = 1L;

	
	public ContactUs() {
		
		Html ul = Home.getNav();
		
		Label message =  new Label("Message : ");
		TextArea taMessage =  new TextArea();
		
		HorizontalLayout h =  new HorizontalLayout();
		h.add(message, taMessage);
		
		HorizontalLayout hzForButtons =  new HorizontalLayout();
        Button primaryButton = new Button("Submit");
        primaryButton.addThemeVariants(ButtonVariant.LUMO_PRIMARY);
        
        Button DangerousButton = new Button("Reset");
        DangerousButton.addThemeVariants(ButtonVariant.LUMO_ERROR);
        
        hzForButtons.add(primaryButton, DangerousButton);
        
		 Footer footer =  Home.getFooter();
		 add(footer);
		
		add(ul, h, hzForButtons, footer);
		
	}
}


