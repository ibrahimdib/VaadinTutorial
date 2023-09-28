package com.ibrahim.Project001.ui.Components003.js;

import java.util.Locale;

import com.vaadin.flow.component.EventData;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.EventHandler;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.templatemodel.TemplateModel;

@Tag("event-handler")
@JsModule("/src/event-handler-demo.js")
public class EventHandlerPolymerTemplate extends PolymerTemplate<TemplateModel> {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public EventHandlerPolymerTemplate() {
	setId("template");
	}
	@EventHandler
    private void handleClick(@EventData("event.altKey") boolean altPressed,
            @EventData("event.srcElement.tagName") String tag,
            @EventData("event.offsetX") int offsetX,
            @EventData("event.offsetY") int offsetY) {
		
		
	        System.out.println("Event alt pressed: " + altPressed);
	        System.out.println("Event tag: " + tag.toLowerCase(Locale.ENGLISH));
	        System.out.println("Click position on element: [" + offsetX + ", "+ offsetY +"]");
    }
}
