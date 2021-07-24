package com.nuwan.stylemaster.service;

import com.nuwan.stylemaster.model.ItemCategory;
import com.nuwan.stylemaster.model.StyleMaster;
import com.nuwan.stylemaster.model.StyleMasterDetails;
import com.nuwan.stylemaster.repository.CategoryRepository;
import com.nuwan.stylemaster.repository.StyleMasterDetailsRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StyleMasterDetailServiceImpl implements StyleMasterDetailService{

    private StyleMasterDetailsRepository styleMasterDetailRepository;
    private CategoryRepository categoryRepository;

    public StyleMasterDetailServiceImpl(StyleMasterDetailsRepository styleMasterDetailRepository, CategoryRepository categoryRepository) {
        this.styleMasterDetailRepository = styleMasterDetailRepository;
        this.categoryRepository = categoryRepository;
    }

    @Override
    public void delete(Long id) {
        styleMasterDetailRepository.deleteById(id);
    }

    @Override
    public List<StyleMasterDetails> create(Long id, List<StyleMasterDetails> styleMasterDetails) {
        return styleMasterDetailRepository.saveAll(bindStyleToStyleDetail(id, styleMasterDetails));
    }

    @Override
    public ItemCategory createCategory(ItemCategory itemCategory) {
        return categoryRepository.save(itemCategory);
    }

    @Override
    public List<ItemCategory> getAllCategory() {
        return categoryRepository.findAll();
    }

    @Override
    public List<StyleMasterDetails> getByStyleId(Long id) {
        return styleMasterDetailRepository.findStyleMasterDetailsByStyleMaster_Id(id);
    }

    @Override
    public List<StyleMasterDetails> getByCategoryId(Long id) {
        return styleMasterDetailRepository.findStyleMasterDetailsByItemCategory_Id(id);
    }

    private List<StyleMasterDetails> bindStyleToStyleDetail(Long id, List<StyleMasterDetails> styleMasterDetails){
        StyleMaster styleMaster = new StyleMaster();
        styleMaster.setId(id);
        for (int i=0; i<styleMasterDetails.size();i++){
            styleMasterDetails.get(i).setStyleMaster(styleMaster);
        }
        return styleMasterDetails;
    }
}
