package com.nuwan.stylemaster.service;

import com.nuwan.stylemaster.model.ItemCategory;
import com.nuwan.stylemaster.model.StyleMasterDetails;

import java.util.List;

public interface StyleMasterDetailService {
    void delete(Long id);

    List<StyleMasterDetails> getByStyleId(Long id);

    List<StyleMasterDetails> getByCategoryId(Long id);

    List<StyleMasterDetails> create(Long id, List<StyleMasterDetails> styleMasterDetails);

    ItemCategory createCategory(ItemCategory itemCategory);

    List<ItemCategory> getAllCategory();
}
