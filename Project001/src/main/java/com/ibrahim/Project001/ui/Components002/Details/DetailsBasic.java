package com.ibrahim.Project001.ui.Components002.Details;

import com.vaadin.flow.component.details.Details;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

@Route("Details")
public class DetailsBasic extends Div {

  /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

public DetailsBasic() {
    Span name = new Span("Sophia Williams");
    Span email = new Span("sophia.williams@company.com");
    Span phone = new Span("(501) 555-9128");
    
    VerticalLayout content = new VerticalLayout(name, email, phone);
    content.setSpacing(false);
    content.setPadding(false);

    Details details = new Details("Contact information", content);
    details.setOpened(true);

    add(details);
  }

}
