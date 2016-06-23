package com.springapp.mvc.dataBase.DAOInterface;

import com.springapp.mvc.dataBase.table.Contact;

import java.util.List;

/**
 * Created by Ультрамар on 21.06.2016.
 */
public interface SalerDAO {

    public List<Contact> showSales();

    public void addSaler();

    public void removeSaler();
}
