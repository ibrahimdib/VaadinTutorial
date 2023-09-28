package com.ibrahim.Project001.ui.Components001;

import com.vaadin.flow.component.Html;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.button.ButtonVariant;
import com.vaadin.flow.component.html.Footer;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.Route;


@Route("login")
public class Login extends VerticalLayout {


	private static final long serialVersionUID = 1L;
	
	public Login() {
		
		
		Html ul = Home.getNav();
		
		Label username =  new Label("Username :");
		TextField usernameField =  new TextField();
		
		
		Label password =  new Label("Password :");
		TextField passwordField =  new TextField();
		
		HorizontalLayout usernameInputs =  new HorizontalLayout();
		usernameInputs.add(username, usernameField);
		
		
		HorizontalLayout PasswordInputs =  new HorizontalLayout();
		PasswordInputs.add(password, passwordField); 
		 
	       Button primaryButton = new Button("Submit");
	        primaryButton.addThemeVariants(ButtonVariant.LUMO_PRIMARY);
		
	   	 Footer footer =  Home.getFooter();
		 add(footer);
	        
		add(ul,usernameInputs, PasswordInputs ,primaryButton, footer);
		
	}

	
}
