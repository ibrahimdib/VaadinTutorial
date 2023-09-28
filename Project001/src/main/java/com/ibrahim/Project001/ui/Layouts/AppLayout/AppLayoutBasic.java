package com.ibrahim.Project001.ui.Layouts.AppLayout;



import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.Text;

import com.vaadin.flow.component.contextmenu.MenuItem;
import com.vaadin.flow.component.contextmenu.SubMenu;
import com.vaadin.flow.component.html.Div;

import com.vaadin.flow.component.menubar.MenuBar;
import com.vaadin.flow.component.orderedlayout.FlexLayout;
//import com.vaadin.flow.component.orderedlayout.FlexLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import com.vaadin.flow.router.Route;


@Route("AppLayout")
// tag::snippet[]
public class AppLayoutBasic extends VerticalLayout {

  /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

public AppLayoutBasic() {
	
	FlexLayout flexLayout =  new FlexLayout();
	flexLayout.getStyle()
     .set("width", "100%"); // Make the container take up 100% width
	
	flexLayout.setJustifyContentMode(FlexLayout.JustifyContentMode.BETWEEN); // Align MenuBar to the left
	Div divMenu =  new Div();
	divMenu.addClassName("Menu");
	
	
    MenuBar menuBar = new MenuBar();
    Text selected = new Text("");
    ComponentEventListener<ClickEvent<MenuItem>> listener = e -> selected
            .setText(e.getSource().getText());
 

    menuBar.addItem("View", listener);
    menuBar.addItem("Edit", listener);

    MenuItem share = menuBar.addItem("Share");
    
    SubMenu shareSubMenu = share.getSubMenu();
    MenuItem onSocialMedia = shareSubMenu.addItem("On social media");
    SubMenu socialMediaSubMenu = onSocialMedia.getSubMenu();
    socialMediaSubMenu.addItem("Facebook", listener);
    socialMediaSubMenu.addItem("Twitter", listener);
    socialMediaSubMenu.addItem("Instagram", listener);
    shareSubMenu.addItem("By email", listener);
    shareSubMenu.addItem("Get Link", listener);

    MenuItem move = menuBar.addItem("Move");
    SubMenu moveSubMenu = move.getSubMenu();
    moveSubMenu.addItem("To folder", listener);
    moveSubMenu.addItem("To trash", listener);

    menuBar.addItem("Duplicate", listener);
    
    
    divMenu.add(menuBar);
    
    flexLayout.add(divMenu);
    add(flexLayout);
	
   
  }
  // tag::snippet[]
}
// end::snippet[]
