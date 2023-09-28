package com.ibrahim.Project001.ui.Components003.js;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.templatemodel.TemplateModel;

@Tag("main-page")
@JsModule("/src/main-page.js")
@Route("content")
public class MainPage extends PolymerTemplate<TemplateModel> {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id("content")
    private Div content;
	
//	@Id("conte")
//	private int x;

    public void setContent(Component content) {
        this.content.removeAll();
        this.content.add(content);
    }
}