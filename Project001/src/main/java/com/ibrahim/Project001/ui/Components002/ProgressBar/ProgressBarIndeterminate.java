package com.ibrahim.Project001.ui.Components002.ProgressBar;


import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.progressbar.ProgressBar;
import com.vaadin.flow.router.Route;

@Route("Progress-Bar")
public class ProgressBarIndeterminate extends Div {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ProgressBarIndeterminate() {
        getStyle().set("font-family", "var(--lumo-font-family)").set("color", "var(--lumo-secondary-text-color)");

        // tag::snippet[]
        ProgressBar progressBar = new ProgressBar();
        progressBar.setIndeterminate(true);

        Div progressBarLabel = new Div();
        progressBarLabel.setText("Generating report...");

        add(progressBarLabel, progressBar);
        // end::snippet[]
    }

}
