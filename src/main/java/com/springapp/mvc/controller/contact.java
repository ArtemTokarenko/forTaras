package com.springapp.mvc.controller;

import com.springapp.mvc.beans.contactBean;
import com.springapp.mvc.service.contactService;
import com.springapp.mvc.sites.ResponceContainer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by Ультрамар on 22.06.2016.
 */
@Controller
@RequestMapping("/contact")
public class contact {

    @Autowired
    private contactService contactService;



    @RequestMapping(value = "/addContact", method = RequestMethod.POST)
    @ResponseBody
        public ResponceContainer addContact
        (@RequestParam(value = "name", required = false) String name,
                @RequestParam(value = "secondName", required = false) String secondName,
                @RequestParam(value = "email", required = false) String email,
                @RequestParam(value = "phoneNumber", required = false) String phoneNumber){

            return contactService.addContact(name, secondName, email, phoneNumber);
        }

    @RequestMapping(value = "/deleteContact", method = RequestMethod.POST)
    @ResponseBody
    public ResponceContainer deleteContact(@RequestParam(value = "id", required = true) Integer id) {
        return contactService.deleteContact(id);
    }

    @RequestMapping(value = "/allContact", method = RequestMethod.GET)
    @ResponseBody
    public ResponceContainer<List<contactBean>> videos(@RequestParam(value = "pageNumber", required = true) Integer pageNumber,
                                                     @RequestParam(value = "pageSize", required = true) Integer pageSize){
        return contactService.findAllContact(pageNumber, pageSize);
    }


    @RequestMapping(value = "/findContactBySomeCredits", method = RequestMethod.GET)
    @ResponseBody
    public ResponceContainer<List<contactBean>> findContactBySomeCredits
            (@RequestParam(value = "name", required = false) String name,
            @RequestParam(value = "secondName", required = false) String secondName,
            @RequestParam(value = "email", required = false) String email,
            @RequestParam(value = "phoneNumber", required = false) String phoneNumber){
        return contactService.getContactBySomeCredits(name,secondName,email,phoneNumber);

    }

}
