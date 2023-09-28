package com.ibrahim.Project001.ui.Components003.js;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.dependency.NpmPackage;
import com.vaadin.flow.component.polymertemplate.EventHandler;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.router.Route;

@Tag("hello-world")
@NpmPackage(value = "@polymer/paper-input", version = "3.0.2")
@JsModule("/src/hello-world.js")
@Route("hello")
public class HelloWorld extends PolymerTemplate<HelloWorldModel> {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static final String EMPTY_NAME_GREETING = "Please enter your name";

    /**
     * Creates the hello world template.
     */
    public HelloWorld() {
        setId("template");
        getModel().setGreeting(EMPTY_NAME_GREETING);
        

     
    }

    @EventHandler
    private void sayHello() {
        // Called from the template click handler
        String userInput = getModel().getUserInput();
        if (userInput == null || userInput.isEmpty()) {
            getModel().setGreeting(EMPTY_NAME_GREETING);
        } else {
            getModel().setGreeting(String.format("Hello %s!", userInput));
        }
    }
}

