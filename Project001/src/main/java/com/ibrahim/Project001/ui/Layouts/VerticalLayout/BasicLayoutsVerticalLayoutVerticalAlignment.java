package com.ibrahim.Project001.ui.Layouts.VerticalLayout;



import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.orderedlayout.FlexComponent;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.radiobutton.RadioButtonGroup;
import com.vaadin.flow.router.Route;

import java.util.Arrays;
import java.util.List;

@Route("basic-layouts/vertical-layout-vertical-alignment")
public class BasicLayoutsVerticalLayoutVerticalAlignment extends Div {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private static class JustifyContentModeOption {
        private final String label;
        private final FlexComponent.JustifyContentMode mode;

        public JustifyContentModeOption(String label,
                FlexComponent.JustifyContentMode mode) {
            this.label = label;
            this.mode = mode;
        }

        public FlexComponent.JustifyContentMode getMode() {
            return mode;
        }

        @Override
        public String toString() {
            return label;
        }
    }

    public BasicLayoutsVerticalLayoutVerticalAlignment() {
        // tag::layout[]
        VerticalLayout layout = new VerticalLayout();
        // Spacing can interfere with the alignment modes
        layout.setSpacing(false);
        layout.add(new LayoutItem("Item 1"));
        layout.add(new LayoutItem("Item 2"));
        layout.add(new LayoutItem("Item 3"));
        // end::layout[]

        List<JustifyContentModeOption> options = Arrays
                .asList(new JustifyContentModeOption("Start (default)",
                                FlexComponent.JustifyContentMode.START),
                        new JustifyContentModeOption("Center",
                                FlexComponent.JustifyContentMode.CENTER),
                        new JustifyContentModeOption("End",
                                FlexComponent.JustifyContentMode.END),
                        new JustifyContentModeOption("Between",
                                FlexComponent.JustifyContentMode.BETWEEN),
                        new JustifyContentModeOption("Around",
                                FlexComponent.JustifyContentMode.AROUND),
                        new JustifyContentModeOption("Evenly",
                                FlexComponent.JustifyContentMode.EVENLY));

        RadioButtonGroup<JustifyContentModeOption> radioGroup = new RadioButtonGroup<>();
        radioGroup.setLabel("Vertical alignment");
        radioGroup.setItems(options);
        radioGroup.setValue(options.get(0));
        radioGroup.addValueChangeListener(e -> {
            FlexComponent.JustifyContentMode mode = e.getValue().getMode();
            layout.setJustifyContentMode(mode);
        });

        this.setClassName("basic-layouts-example");
        layout.setClassName("height-5xl");

        this.add(layout, radioGroup);
    }

}


