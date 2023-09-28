package com.ibrahim.Project001.ui.Components004.importJsHtml;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.HasText;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.UI;
import com.vaadin.flow.component.dependency.HtmlImport;
import com.vaadin.flow.component.dependency.NpmPackage;
//import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.router.Route;

@Tag("div")
@Route("importjs")
@HtmlImport("frontend://html/indexx.html")
public class CustomComponent extends Component
        implements HasText {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
  // implementation omitted
	  private void addDependencies() {
		    UI.getCurrent().getPage()
		            .addJavaScript("./js/module.js");

		  }
	  
	  public CustomComponent () {
		  
		  addDependencies();
		  
	  }
	
}