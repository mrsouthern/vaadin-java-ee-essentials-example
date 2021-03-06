package org.example;

import org.example.backend.PhoneBookEntry;

import com.vaadin.ui.Component;
import com.vaadin.ui.DateField;
import com.vaadin.ui.PopupDateField;
import com.vaadin.ui.TextField;
import org.vaadin.viritin.fields.MTextField;
import org.vaadin.viritin.form.AbstractForm;
import org.vaadin.viritin.layouts.MFormLayout;
import org.vaadin.viritin.layouts.MMarginInfo;
import org.vaadin.viritin.layouts.MVerticalLayout;

/**
 * This class introduces a Form to edit PhoneBookEntry pojos. It is a good habit
 * to separate logical pieces of your UI code to classes. This will improve
 * re-usability, readability, maintainability, testability.
 *
 * @author Matti Tahvonen <matti@vaadin.com>
 */
public class PhoneBookEntryForm extends AbstractForm<PhoneBookEntry> {

    TextField name = new MTextField("Name");
    TextField number = new MTextField("Number");
    TextField email = new MTextField("Email");
    DateField birthDate = new PopupDateField("Birth date");

    public PhoneBookEntryForm() {
        setEagerValidation(true);
    }

    @Override
    protected Component createContent() {
        return new MVerticalLayout(
                new MFormLayout(
                        name,
                        number,
                        email,
                        birthDate
                ).withMargin(false),
                getToolbar()
        ).withMargin(new MMarginInfo(false, true));
    }

}
