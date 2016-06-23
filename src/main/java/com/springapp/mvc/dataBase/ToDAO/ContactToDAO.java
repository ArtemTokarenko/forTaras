package com.springapp.mvc.dataBase.ToDAO;

import com.springapp.mvc.dataBase.table.Contact;
import com.springapp.mvc.dataBase.DAOInterface.ContactDAO;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Ультрамар on 21.06.2016.
 */
@Repository
public class ContactToDAO implements ContactDAO {

    @Autowired
    private SessionFactory sessionFactory;

    public void addContact(Contact contact) {
        sessionFactory.getCurrentSession().save(contact);
    }

    @SuppressWarnings("unchecked")
    public List<Contact> listContact() {

        return sessionFactory.getCurrentSession().createQuery("from Contact")
                .list();
    }

    public void removeContact(Integer id) {
        Contact contact = (Contact) sessionFactory.getCurrentSession().load(
                Contact.class, id);
        if (null != contact) {
            sessionFactory.getCurrentSession().delete(contact);
        }

    }


}
