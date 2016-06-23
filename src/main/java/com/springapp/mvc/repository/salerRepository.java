package com.springapp.mvc.repository;

import com.springapp.mvc.dataBase.table.Saler;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Ультрамар on 23.06.2016.
 */
public interface salerRepository extends JpaRepository<Saler, Integer> {

    public Saler findByNameAndEmail(String name, String email);
}
