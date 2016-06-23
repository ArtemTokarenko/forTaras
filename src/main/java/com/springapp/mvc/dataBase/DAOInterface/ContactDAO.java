package com.springapp.mvc.dataBase.DAOInterface;

import com.springapp.mvc.dataBase.table.Contact;

import java.util.List;

/**
 * Created by Ультрамар on 21.06.2016.
 */
public interface ContactDAO {

    public void addContact(Contact contact);

    public List<Contact> listContact();

    public void removeContact(Integer id);



}
