package com.ibrahim.Project001.ui.Components003.js;

import java.util.List;


import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.EventHandler;
import com.vaadin.flow.component.polymertemplate.ModelItem;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.templatemodel.TemplateModel;

@Tag("model-item-handler")
@JsModule("./src/model-item-handler.js")
public class ModelItemHandlerPolymerTemplate
            extends PolymerTemplate<TemplateModel> {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ModelItemHandlerPolymerTemplate() {
		setId("template");
	}
	
	public static class Message {
        private String text;

        public Message() {
        }

        public Message(String text) {
            this.text = text;
        }

        public String getText() {
            return text;
        }

        public void setText(String text) {
            this.text = text;
        }
    }



    @EventHandler
    public void handleClick(@ModelItem Message message) {
        System.out.println("Received a message: " + message.getText());
    }
}