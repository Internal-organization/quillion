package com.fr.quillion.resources.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Les Choupinets on 01/12/2016.
 */
@RestController
public class ResourceController {

    @GetMapping("/admin/resources")
    public String toResources(){ return "resources"; }
}
