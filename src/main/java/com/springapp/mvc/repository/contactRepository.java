package com.springapp.mvc.repository;

import com.springapp.mvc.dataBase.table.Contact;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Ультрамар on 23.06.2016.
 */
public interface contactRepository extends JpaRepository<Contact, Integer> {



}
