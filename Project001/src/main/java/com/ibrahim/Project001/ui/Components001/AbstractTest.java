package com.ibrahim.Project001.ui.Components001;

import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.vaadin.flow.component.AttachEvent;
import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.HasSize;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.BeforeEvent;
import com.vaadin.flow.router.HasUrlParameter;
import com.vaadin.flow.router.OptionalParameter;
import com.vaadin.flow.router.Route;

@Route(layout = MainView.class)
public abstract class AbstractTest extends VerticalLayout implements HasUrlParameter<String> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Logger logger = LoggerFactory.getLogger(getClass());

	public AbstractTest() {
	}

	@Override
	protected void onAttach(AttachEvent attachEvent) {
		super.onAttach(attachEvent);

	}

	@Override
	public void setParameter(BeforeEvent event, @OptionalParameter String parameter) {
		if (parameter != null) {
			final String className = getClass().getCanonicalName() + "$" + parameter;
			try {
				Class<?> configurationClass = Class.forName(className);
				if (!UITestConfiguration.class.isAssignableFrom(configurationClass)) {
					logger.error("Test configuration not a sub class of " + UITestConfiguration.class.getSimpleName());
				}
				try {
					UITestConfiguration testConfiguration = (UITestConfiguration) configurationClass.newInstance();
					setupWith(getTestComponent(testConfiguration));
				} catch (InstantiationException | IllegalAccessException e) {
					logger.error("Can't instantiate UITestConfiguration : " + configurationClass.getCanonicalName());
				}

			} catch (ClassNotFoundException e) {
				logger.error("Class not found: " + className);
			}
		} else {
			setupWith(getTestComponent(null));
		}
	}

	protected void setupWith(Set<Component> component) {
		removeAll();
		setContentSize(this);
	    add(component.toArray(new Component[0]));
        setFlexGrow(1, component.toArray(new Component[0]));
	}

	/**
	 * Sets the size of the content. Override to change from
	 * {@link HasSize#setSizeFull()}
	 * 
	 * @param content the content component
	 */
	public void setContentSize(HasSize content) {
		content.setSizeFull();
	}

	public abstract Set<Component> getTestComponent(UITestConfiguration configuration);
}
