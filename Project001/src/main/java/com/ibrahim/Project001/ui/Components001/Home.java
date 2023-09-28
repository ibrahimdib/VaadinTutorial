package com.ibrahim.Project001.ui.Components001;

import java.io.InputStream;
import java.math.BigDecimal;
import java.time.Duration;
import java.time.LocalTime;


import com.vaadin.flow.component.Html;
import com.vaadin.flow.component.Text;
import com.vaadin.flow.component.accordion.Accordion;
//import com.vaadin.flow.component.avatar.Avatar;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.button.ButtonVariant;
import com.vaadin.flow.component.checkbox.Checkbox;
import com.vaadin.flow.component.checkbox.CheckboxGroup;
import com.vaadin.flow.component.checkbox.CheckboxGroupVariant;
import com.vaadin.flow.component.datepicker.DatePicker;
import com.vaadin.flow.component.datetimepicker.DateTimePicker;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.Footer;
import com.vaadin.flow.component.html.Hr;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.icon.VaadinIcon;
//import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.FlexLayout;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.radiobutton.RadioButtonGroup;
import com.vaadin.flow.component.select.Select;
import com.vaadin.flow.component.textfield.BigDecimalField;
import com.vaadin.flow.component.textfield.EmailField;
import com.vaadin.flow.component.textfield.IntegerField;
import com.vaadin.flow.component.textfield.NumberField;
import com.vaadin.flow.component.textfield.PasswordField;
import com.vaadin.flow.component.textfield.TextArea;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.component.timepicker.TimePicker;
import com.vaadin.flow.component.upload.Upload;
import com.vaadin.flow.component.upload.receivers.MultiFileMemoryBuffer;
import com.vaadin.flow.router.Route;




@SuppressWarnings("serial")
@Route("")

public class Home extends VerticalLayout {
	
	 private Icon checkIcon;
	  private Span passwordStrengthText;

	public Home() {
	
		
	Html ul = getNav();
		
	Div imageDiv =  new Div();
	Image image =  new Image("https://m.media-amazon.com/images/I/8147V7z1HLL._SL1500_.jpg" , "Alternative Text");
	image.setMaxWidth("400px");
	image.setMaxHeight("600px");
	
	image.setMinWidth("200px");
	image.setMinHeight("400px");
	image.getStyle().set("margin-top", "30px");
	imageDiv.add(image);
	
	
	Div desc =  new Div();
	desc.setText("The image depicts a "
			+ "hardcover book resting on "
			+ "a wooden table. The book's"
			+ " cover is a deep shade of burgundy, "
			+ "with an intricate golden design embossed "
			+ "on it. The title of the book, \"Mysteries "
			+ "of the Universe,\" is elegantly written in "
			+ "bold, gold letters across the center of the cover.");

	VerticalLayout descImage =  new VerticalLayout();
	descImage.add(imageDiv, desc);

	
	
	

		
		Button btn = new Button("Hello");
		Checkbox checker =  new Checkbox();
		checker.setLabel("check me!");
		
		 CheckboxGroup<String> checkerG = new CheckboxGroup<>();
		 checkerG.setLabel("what is your gender");
		 checkerG.setItems("Male", "Female");
		 checkerG.select("Male");
		 checkerG.addThemeVariants(CheckboxGroupVariant.LUMO_VERTICAL);
		  checkerG.setEnabled(true);
		  
		  
		  checkerG.getStyle().set("--vaadin-input-field-border-width", "1px");
		  
		  
		  EmailField emailField = new EmailField();
		  emailField.setLabel("Email address");
		 
		  
		  Select<String> select = new Select<>();
		  select.setLabel("Sort by");
		  select.setItems("Most recent first", "Rating: high to low",
		          "Rating: low to high", "Price: high to low",
		          "Price: low to high");
		  select.setValue("Most recent first");

		 
		  TextField textField1 = new TextField();
		  textField1.getElement().setAttribute("aria-label", "search");
		  textField1.setPlaceholder("Search");
		  textField1.setClearButtonVisible(true);
		  textField1.setPrefixComponent(VaadinIcon.SEARCH.create());
		  
		  
		  
		    TextField textField = new TextField();
		    textField.setLabel("Phone number");
		    textField.setHelperText("Include country and area prefixes");

		    PasswordField passwordField = new PasswordField();
		    passwordField.setLabel("Password");
		    passwordField.setRevealButtonVisible(true);

		    checkIcon = VaadinIcon.CHECK.create();
		    checkIcon.setVisible(false);
		    passwordField.setSuffixComponent(checkIcon);

		    Div passwordStrength = new Div();
		    passwordStrengthText = new Span();
		    passwordStrength.add(new Text("Password strength: "), passwordStrengthText);
		    passwordField.setHelperComponent(passwordStrength);
		   
	
		    
		    TextField textField3 = new TextField();;
		    textField3.setLabel("Name1");
		    textField3.setRequiredIndicatorVisible(true);
		    textField3.setErrorMessage("This field is required");

		    
		    DatePicker datePicker = new DatePicker();
		    datePicker.setLabel("Date of birth");

		    
		    
		    TextArea textArea = new TextArea();
		    textArea.setWidthFull();
		    textArea.setMinHeight("100px");
		    textArea.setMaxHeight("150px");
		    textArea.setLabel("Description");
		    textArea.setLabel("Description");
		    textArea.setValue("loremIpsum");
		
		    
		    NumberField dollarField = new NumberField();
		    dollarField.setLabel("Balance");
		    dollarField.setValue(200.0);
		    Div dollarPrefix = new Div();
		    dollarPrefix.setText("$");
		    dollarField.setPrefixComponent(dollarPrefix);

		    NumberField euroField = new NumberField();
		    euroField.setLabel("Balance");
		    euroField.setValue(200.0);
		    euroField.setStep(0.5);
		    euroField.setHasControls(true);
		    
		    Div euroSuffix = new Div();
		    euroSuffix.setText("€");
		    euroField.setSuffixComponent(euroSuffix);
		    
		    IntegerField adultsField = new IntegerField();
		    adultsField.setValue(2);
		
		    adultsField.setHasControls(true);
		    adultsField.setMin(0);
		    adultsField.setMax(9);
		    
		    
		    BigDecimalField bigDecimalField = new BigDecimalField();
		    bigDecimalField.setLabel("Result");
		    bigDecimalField.setWidth("240px");
		    bigDecimalField.setValue(new BigDecimal("948205817.472950487"));
		    
		    
		    
		    TimePicker timePicker = new TimePicker();
		    timePicker.setLabel("Appointment time");
		    timePicker.setHelperText("Open 8:00-16:00");
		    timePicker.setStep(Duration.ofMinutes(30));
		    timePicker.setValue(LocalTime.of(8, 30));
		    timePicker.setMinTime(LocalTime.of(8, 0));
		    timePicker.setMaxTime(LocalTime.of(16, 0));
		    
		    
		    RadioButtonGroup<String> radioGroup = new RadioButtonGroup<>();
		    radioGroup.setLabel("Status");
		    radioGroup.setItems("Pending", "Submitted", "Confirmed");
		    radioGroup.setValue("Pending");
		    
		    
		    
		    DateTimePicker dateTimePicker = new DateTimePicker();
		    dateTimePicker.setLabel("Meeting date and time");
		    

	        MultiFileMemoryBuffer buffer = new MultiFileMemoryBuffer();
	        Upload upload = new Upload(buffer);

	        upload.addSucceededListener(event -> {
	            String fileName = event.getFileName();
	            InputStream inputStream = buffer.getInputStream(fileName);
	            System.out.println(inputStream );
	            // Do something with the file data
	            // processFile(inputStream, fileName);
	        });

	        Accordion accordion = new Accordion();

	        Span name = new Span("Sophia Williams");
	        Span email = new Span("sophia.williams@company.com");
	        Span phone = new Span("(501) 555-9128");

	        VerticalLayout personalInformationLayout = new VerticalLayout(name, email, phone);
	        personalInformationLayout.setSpacing(false);
	        personalInformationLayout.setPadding(false);

	        
	        
	        accordion.add("Personal information", personalInformationLayout);
	        
	        
//	        Avatar avatarBasic = new Avatar();
//
//	        Avatar avatarName = new Avatar("ibrahim");
//
//	        Avatar avatarImage = new Avatar("Nazih");
//	        avatarImage.setImage("C://Users//USER//Desktop//ethswitch.png");

//	        flexLayout.add(avatarBasic, avatarName, avatarImage);
	        
	        Button primaryButton = new Button("Primary");
	        primaryButton.addThemeVariants(ButtonVariant.LUMO_PRIMARY);

	        
	        Image image1 =  new Image("https://m.media-amazon.com/images/I/71S1N7OGXUL._SL1294_.jpg", "Web Image");
	        primaryButton.addClickListener(e -> {
	        	
	        	String s = textField3.getValue();
	        	System.out.println("CLICKED");
	        	System.out.println(s);

	        	if(s.equals("book1")) {
	        		
	        		
	        		imageDiv.remove(image);
	        		imageDiv.add(image1);
	        		image1.setMaxWidth("400px");
	        		image.setMaxHeight("600px");
	        		
	        		image1.setMinWidth("200px");
	        		image1.setMinHeight("400px");
	        		image1.getStyle().set("margin-top", "30px");
	        		
	        		desc.setText("\r\n" + 
	        				"In the dimly lit corner of an old bookstore, nestled "
	        				+ "among a myriad of forgotten tomes, I stumbled upon a"
	        				+ " book that seemed to beckon with an air of mystery."
	        				+ " Its weathered leather cover bore the weight of ages, "
	        				+ "adorned with intricate, faded engravings"
	        				+ " that hinted at secrets locked within its pages");
	        	
	        	}else {
	        		imageDiv.remove(image1);
	        		imageDiv.add(image);
	        		image.setMaxWidth("400px");
	        		image.setMaxHeight("600px");
	        		
	        		image.setMinWidth("200px");
	        		image.setMinHeight("400px");
	        		image.getStyle().set("margin-top", "30px");
	        		desc.setText("The image depicts a "
	        				+ "hardcover book resting on "
	        				+ "a wooden table. The book's"
	        				+ " cover is a deep shade of burgundy, "
	        				+ "with an intricate golden design embossed "
	        				+ "on it. The title of the book, \"Mysteries "
	        				+ "of the Universe,\" is elegantly written in "
	        				+ "bold, gold letters across the center of the cover.");
	        	}
	        	
	        });
	        	
	        
	        
	        Button secondaryButton = new Button("Secondary");

	        Button tertiaryButton = new Button("Tertiary");
	        tertiaryButton.addThemeVariants(ButtonVariant.LUMO_TERTIARY);

	       
	        
	        Span pending = new Span("Pending");
	        pending.getElement().getThemeList().add("badge");

	        Span confirmed = new Span("Confirmed");
	        confirmed.getElement().getThemeList().add("badge success");

	        Span denied = new Span("Denied");
	        denied.getElement().getThemeList().add("badge error");

	        Span onHold = new Span("On hold");
	        onHold.getElement().getThemeList().add("badge contrast");

//	        flexLayout.add(pending, confirmed, denied, onHold);
	        
	 
	
	        add(ul);
	
	
	
	
	        VerticalLayout column2VzLayout =  new VerticalLayout();
	        FlexLayout fl =  new FlexLayout();
	    	fl.getStyle().set("flexDirection", "column"); // Vertical layout
	    	
	        fl.add(select);
	        fl.add(emailField);
	        fl.add(textField1);
	        fl.add(textField);
	        fl.add(passwordField);
	        fl.add(textField3, datePicker);
	        fl.add(textArea);
	      
	        column2VzLayout.add(fl);
	        
	        
	        VerticalLayout column1VzLayout =  new VerticalLayout();
	    	FlexLayout flexLayout = new FlexLayout();
	    	flexLayout.getStyle().set("flexDirection", "column"); // Vertical layout
	    
	    	
	    	
		      flexLayout.add(dateTimePicker);
			  flexLayout.add(radioGroup);
			  flexLayout.add(timePicker);
			  flexLayout.add(bigDecimalField);
			  flexLayout.add(dollarField, euroField);
			  flexLayout.add(adultsField);
			  flexLayout.add(btn);
			  flexLayout.add(checker);
			  flexLayout.add(checkerG);
			  flexLayout.add(upload);
			 HorizontalLayout horizontalLayout = new HorizontalLayout(primaryButton, secondaryButton, tertiaryButton);
		      flexLayout.add(horizontalLayout);
		      
		      column1VzLayout.add(flexLayout);
	        
	        HorizontalLayout hz =  new HorizontalLayout();
	        hz.add(column1VzLayout, column2VzLayout , descImage);
	        
//	        flexLayout.add(accordion);
	    
	      
	        
	        
	

	        
	        
		 add(hz);
		 
		 Footer footer =  getFooter();
		 add(footer);
		 

		 

	}

	
	public static Html getNav() {
		Html ul = new Html("<ul style='margin: 0; padding: 8px 15px; list-style: none; display: flex; box-shadow: 0 1px 8px rgba(0,0,0,0.3); width: 100%; height: 50px; '>"
                + "<a href=''  > <li style='background: #0B84ED; color: #fff; width: 400px;height: 40px;display: flex;justify-content: center;align-items: center;font-size: 2rem;margin: 10px 20px 10px 0; '> Welcome to Our Site </li></a>"
				

                + "</li>"
                + "<li style=' padding: 3px; margin: 10px 20px 10px 0;'>"
                + "<a href='contact-us' style='display: inline-block; text-decoration: none;  height: 40px;\r\n" + 
                "                width: var(--btn-width-100);\r\n" + 
                "                font-size: 1.5rem;\r\n" + 
                "                display: flex;\r\n" + 
                "                justify-content: center;\r\n" + 
                "                align-items: center;\r\n" + 
                "                color: rgb(158, 158, 158);\r\n" + 
                "                transition: .5s;'>Contact Us</a>"
                + "</li>"
                + "<li style='  padding: 3px;margin: 10px 20px 10px 0;'>"
                + "<a href='login' style='display: inline-block; text-decoration: none;   height: 40px;\r\n" + 
                "                width: var(--btn-width-100);\r\n" + 
                "                font-size: 1.5rem;\r\n" + 
                "                display: flex;\r\n" + 
                "                justify-content: center;\r\n" + 
                "                align-items: center;\r\n" + 
                "                color: rgb(158, 158, 158);\r\n" + 
                "                transition: .5s;'>Login</a>"
                + "</li>"
               
                + "</ul>");

		return ul;
		
	}
	
	public static Footer getFooter() {
		
        Footer footer = new Footer();

        // Create a horizontal layout to organize footer content
        HorizontalLayout footerContent = new HorizontalLayout();

        // Add components to the footer content
        Span copyrightSpan = new Span("© 2023 Your Company");
        Span separatorSpan = new Span("|");
        Span privacySpan = new Span("Privacy Policy");
        Span termsSpan = new Span("Terms of Service");
        

        footerContent.add(copyrightSpan, separatorSpan, privacySpan, separatorSpan, termsSpan);

        // Add the footer content to the footer element
        footer.add(footerContent);

        // Style the footer
        footer.getStyle().set("background-color", "#333").set("color", "#fff").set("padding", "10px 0");
        footerContent.setSpacing(true);
        footerContent.setWidth("20000px");
        separatorSpan.getStyle().set("margin", "0 10px");

        // Create a horizontal line as a separator
        Hr separator = new Hr();
        separator.getStyle().set("border-color", "#555");

        // Add the separator and footer to the main content
       
        
        return footer;
        
      
	}
}








