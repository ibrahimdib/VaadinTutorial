package com.ibrahim.Project001.ui.Components002.ContextMenu;


import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.grid.contextmenu.GridContextMenu;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.Hr;
import com.vaadin.flow.router.Route;

import java.util.List;

@Route("context-menu")
public class ContextMenuDividers extends Div {

  /**
	 * 
	 */
private static final long serialVersionUID = 1L;
private List<Person> people = DataService.getPeople(5);

  public ContextMenuDividers() {
    Grid<Person> grid = new Grid<Person>();
    grid.setVisible(true);
    grid.setItems(people);

    grid.addColumn(person -> person.getFirstName())
        .setHeader("First name");
    grid.addColumn(person -> person.getLastName())
        .setHeader("Last name");
    grid.addColumn(person -> person.getEmail())
        .setHeader("Email");    grid.addColumn(person -> person.getAddresss())
        .setHeader("Address");

    GridContextMenu<Person> menu = grid.addContextMenu();
    menu.addItem("View", event -> {});
    menu.add(new Hr());
    menu.addItem("Edit", event -> {});
    menu.addItem("Delete", event -> {});
    menu.add(new Hr());
    menu.addItem("Email", event -> {});
    menu.addItem("Call", event -> {});

    add(grid);
  }
}