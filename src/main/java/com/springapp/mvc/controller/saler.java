package com.springapp.mvc.controller;

import com.springapp.mvc.service.salerService;
import com.springapp.mvc.sites.ResponceContainer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Ультрамар on 22.06.2016.
 */
public class saler {

    @Autowired
    private salerService salertService;

    @RequestMapping(value = "/deleteSaler", method = RequestMethod.POST)
    @ResponseBody
    public  ResponceContainer deleteSaler(@RequestParam(value = "id", required = true) Integer id) {
       return  salertService.deleteSaler(id);
    }

    @RequestMapping(value = "/findSaler", method = RequestMethod.GET)
    @ResponseBody
    public ResponceContainer findSaler(@RequestParam(value = "pageNumber", required = true) Integer pageNumber,
                                                       @RequestParam(value = "pageSize", required = true) Integer pageSize,
                                                       @RequestParam(value = "pageSize", required = true) Integer idSaler) {
        return salertService.findSaler(pageNumber, pageSize,idSaler);
    }
}
