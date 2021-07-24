package com.nuwan.stylemaster.controller;

import com.nuwan.stylemaster.model.StyleMaster;
import com.nuwan.stylemaster.service.StyleMasterService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/style")
public class StyleController {

    private StyleMasterService styleMasterService;

    public StyleController(StyleMasterService styleMasterService) {
        this.styleMasterService = styleMasterService;
    }

    @PostMapping(path = "/create")
    public StyleMaster create(@RequestBody StyleMaster styleMaster){
        return styleMasterService.create(styleMaster);
    }

    @GetMapping(path = "/get/{id}")
    public StyleMaster get(@PathVariable Long id){
        return styleMasterService.get(id);
    }
}
