package com.apparel.apparel.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.apparel.apparel.model.Apparel;
import com.apparel.apparel.service.ApparelService;

@RestController
@RequestMapping("/api/apparels")
public class ApparelController {

    @Autowired
    private ApparelService apparelService;

    // Get all apparels
    @GetMapping
    public List<Apparel> getAllApparels() {
        return apparelService.getAllApparels();
    }

    // Get an apparel by ID
    @GetMapping("/{id}")
    public Apparel getApparelById(@PathVariable String id) {
        return apparelService.getApparelById(id);
    }

    // Submit new apparel (with contact details and address)
    @PostMapping
    public Apparel submitApparel(@RequestBody Apparel apparel) {
        return apparelService.saveApparel(apparel);
    }

    // Update an apparel by ID (including contact and address)
    @PutMapping("/{id}")
    public Apparel updateApparel(@PathVariable String id, @RequestBody Apparel apparel) {
        return apparelService.updateApparel(id, apparel);
    }

    // Delete an apparel by ID
    @DeleteMapping("/{id}")
    public void deleteApparel(@PathVariable String id) {
        apparelService.deleteApparel(id);
    }
}