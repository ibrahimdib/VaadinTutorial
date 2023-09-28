package com.ibrahim.Project001.ui.Components003.js;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.EventHandler;
import com.vaadin.flow.component.polymertemplate.ModelItem;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.templatemodel.TemplateModel;

@Tag("contact-handler")
@JsModule("/src/contact-handler.js")
@Route("user")
public class User extends PolymerTemplate<TemplateModel> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	

	public User() {

		setId("template");

	}

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@EventHandler
	public void onClick(@ModelItem("event.detail.userInfo") User user) {
		System.err.println("contact : name = " + user.getName());
	}
	public static void main(String []args) {
		

		User user = new User();
		
		 user.setName("Ibrahim");
		User UserHandler =  new User();
		UserHandler.onClick(user);
		
	}
}
