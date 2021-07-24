package com.nuwan.stylemaster.controller;

import com.nuwan.stylemaster.model.ItemCategory;
import com.nuwan.stylemaster.model.StyleMasterDetails;
import com.nuwan.stylemaster.service.StyleMasterDetailService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping(path = "/style-detail")
public class StyleMasterDetailsController {

    private StyleMasterDetailService styleMasterDetailService;

    public StyleMasterDetailsController(StyleMasterDetailService styleMasterDetailService) {
        this.styleMasterDetailService = styleMasterDetailService;
    }

    @PostMapping(path = "/create/{id}")
    public List<StyleMasterDetails> create(@PathVariable Long id, @RequestBody List<StyleMasterDetails> styleMasterDetails){
        return styleMasterDetailService.create(id, styleMasterDetails);
    }

    @GetMapping(path = "/delete/{id}")
    public void delete(@PathVariable Long id){
        styleMasterDetailService.delete(id);
    }

    @GetMapping(path = "/get-by-style-id/{id}")
    public List<StyleMasterDetails> getByStyleId(@PathVariable Long id){
        return styleMasterDetailService.getByStyleId(id);
    }

    @GetMapping(path = "/get-by-category-id/{id}")
    public List<StyleMasterDetails> getByCategoryId(@PathVariable Long id){
        return styleMasterDetailService.getByCategoryId(id);
    }

    @GetMapping(path = "/category/get")
    public List<ItemCategory> getByCategory(){
        return styleMasterDetailService.getAllCategory();
    }

    @PostMapping(path = "/create/category")
    public ItemCategory create(@RequestBody ItemCategory itemCategory){
        return styleMasterDetailService.createCategory(itemCategory);
    }
}
