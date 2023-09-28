package com.ibrahim.Project001.ui.Components001;

import java.io.InputStream;
import java.math.BigDecimal;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.HashSet;
import java.util.Set;

import org.vaadin.textfieldformatter.CreditCardFieldFormatter;
import org.vaadin.textfieldformatter.CustomStringBlockFormatter;
import org.vaadin.textfieldformatter.CustomStringBlockFormatter.Builder;
import org.vaadin.textfieldformatter.CustomStringBlockFormatter.ForceCase;
import org.vaadin.textfieldformatter.CustomStringBlockFormatter.Options;
import org.vaadin.textfieldformatter.DateFieldFormatter;
import org.vaadin.textfieldformatter.IBANFormatter;
import org.vaadin.textfieldformatter.phone.PhoneI18nFieldFormatter;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.Html;
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
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.component.icon.VaadinIcon;
import com.vaadin.flow.component.notification.Notification;
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


@Route("BasicCreditCardFieldFormatter")
public class TextFieldFormatterUsageUI extends AbstractTest {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    VerticalLayout main =  new VerticalLayout();
   

    Set<Component> displayComponentSet =  new HashSet<>();
    @Override
    public Set<Component> getTestComponent(UITestConfiguration configuration) {


    	 Set<Component> componentSet =  new HashSet<>();
    		
    		

    		
			
		
    	 
    		Html ul = Home.getNav();
    		  main.add(ul) ; 
    	 
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
    			  textField1.setPlaceholder("Search1");
    			  textField1.setClearButtonVisible(true);
    			  textField1.setPrefixComponent(VaadinIcon.SEARCH.create());
    			  

    			  
    			  
    			    TextField textField = new TextField();
    			    textField.setLabel("Phone number");
    			    textField.setHelperText("Include country and area prefixes");

    			    PasswordField passwordField = new PasswordField();
    			    passwordField.setLabel("Password");
    			    passwordField.setRevealButtonVisible(true);


    			   
    		
    			    
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
    		        
    		        
//    		        Avatar avatarBasic = new Avatar();
//
//    		        Avatar avatarName = new Avatar("ibrahim");
//
//    		        Avatar avatarImage = new Avatar("Nazih");
//    		        avatarImage.setImage("C://Users//USER//Desktop//ethswitch.png");

//    		        flexLayout.add(avatarBasic, avatarName, avatarImage);
    		        
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

//    		        flexLayout.add(pending, confirmed, denied, onHold);
    		        
    		 
    		
    		   
    		
    		
    		
    		
    		        VerticalLayout column2VzLayout =  new VerticalLayout();
    		        FlexLayout fl =  new FlexLayout();
    		    	fl.getStyle().set("flexDirection", "column"); // Vertical layout
    		    	

    		        
    		        
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
    		        
//    		        flexLayout.add(accordion);
    		    
    		      
    		        TextField textField44 = new TextField();
        			  textField44.setPlaceholder("Insert credit card number");
        			  textField44.setLabel("Card");
        	    		CreditCardFieldFormatter formatter = new CreditCardFieldFormatter();
        	   			  
            			  textField44.setPlaceholder("Enter the credit card number");
            			  textField44.setClearButtonVisible(true);
            			  
        	    		textField44.setLabel("Credit Card");
        	    	
        	    		formatter.extend(textField44);
        	    		formatter.addCreditCardChangedListener(g -> 
        	    		
        	    		{
        	    			System.out.println(g.getCreditCardType());
        	    	
        	    			
        	    		}
        	    				);
    		        
        	    		
        				TextField tf1 = new TextField();
        				tf1.setLabel("Iban");
        				IBANFormatter.fromIBANLength(18).extend(tf1);
        				tf1.addValueChangeListener(l -> 
        				{
        				System.out.println(l.getValue());
        			
        				}
        				);
    		
        				
        				TextField tfp = new TextField();
        				tfp.setLabel("Add Phone Number");
        				new PhoneI18nFieldFormatter(PhoneI18nFieldFormatter.REGION_DE).extend(tfp);
        				tfp.addValueChangeListener(l -> {
        					System.out.println(l.getValue());
        				
        				}
        				);

    		        
        				
        				TextField tf = new TextField();
        				tf.setLabel("Delimiter");
        				new CustomStringBlockFormatter.Builder().blocks(1, 2, 3).delimiters("-", "*").build()
        						.extend(tf);
        				tf.addValueChangeListener(l -> {
        					System.out.println(l.getValue());
        				
        				}
        				);
        				
        				TextField tf7 = new TextField();
        				tf7.setLabel("Prefix Number");
        				Options fmtOptions = new Options();
        				fmtOptions.setNumericOnly(true);
        				fmtOptions.setPrefix("PREFIX:");
        				CustomStringBlockFormatter formatter5 = new CustomStringBlockFormatter(fmtOptions);
        				formatter5.extend(tf7);
        				
        				tf7.addValueChangeListener(l -> {
        					System.out.println(l.getValue());
        				
        				}
        				);
        				
        				
        				TextField tf9 = new TextField();
        				tf9.setLabel("Prefix Number with Bloks UI");
        				Options fmtOptions1 = new Options();
        				fmtOptions1.setBlocks(7, 1, 2, 3);
        				fmtOptions1.setDelimiters(" ", "-", "-");
        				fmtOptions1.setForceCase(ForceCase.NONE);
        				fmtOptions1.setNumericOnly(true);
        				fmtOptions1.setPrefix("PREFIX:");
        				CustomStringBlockFormatter formatter4 = new CustomStringBlockFormatter(fmtOptions1);
        				formatter4.extend(tf9);
        				
        				
        				
        				TextField tf11 = new TextField();
        				tf11.setLabel("Prefix with Builder UI");
        				Builder builder = new CustomStringBlockFormatter.Builder();
        				builder.blocks(1, 2, 3).delimiters("-", "-").numeric().prefix("PREFIX:", " ");
        				CustomStringBlockFormatter formatter77 = builder.build();
        				formatter77.extend(tf11);
        				
        				TextField field = new TextField("Date before Feb 3, 2019");
        				field.setLabel("Date Formatter");
        				new DateFieldFormatter.Builder().dateMax(LocalDate.of(2019, 2, 3)).build().extend(field);
    		  
        				tf11.addValueChangeListener(l -> {
        					System.out.println(l.getValue());
        				
        				}
        				);
        				
    			 main.add(hz);
    			 Footer footer =  Home.getFooter();
    			 main.add(footer, textField44, tf1, tfp, tf, tf7, tf9, tf11, field);
    		
  componentSet.add(main);
    		
    	

    	
        return componentSet;
    }
    
    
}

