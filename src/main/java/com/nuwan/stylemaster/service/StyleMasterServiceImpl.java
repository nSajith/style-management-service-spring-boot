package com.nuwan.stylemaster.service;

import com.nuwan.stylemaster.model.StyleMaster;
import com.nuwan.stylemaster.repository.StyleMasterRepository;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;

@Service
public class StyleMasterServiceImpl implements StyleMasterService{

    private StyleMasterRepository styleMasterRepository;

    public StyleMasterServiceImpl(StyleMasterRepository styleMasterRepository) {
        this.styleMasterRepository = styleMasterRepository;
    }

    @Override
    public StyleMaster create(StyleMaster styleMaster) {
        return styleMasterRepository.save(styleMaster);
    }

    @Override
    public StyleMaster get(Long id) {
        return styleMasterRepository.findById(id).orElseThrow(() -> new EntityNotFoundException(id + " StyleMaster Not Found"));
    }

//    @Override
//    public StyleMaster update(StyleMaster styleMaster) {
//        StyleMaster styleMaster1 = get(styleMaster.getId());
//
//        styleMaster1.setStyleName(styleMaster.getStyleName());
//        styleMaster1.setStyleCode(styleMaster.getStyleCode());
//        styleMaster1.setStyleType(styleMaster.getStyleType());
//        styleMaster1.setStyleQuantity(styleMaster.getStyleQuantity());
//        styleMaster1.setStatus(styleMaster.getStatus());
//
//        return create(styleMaster1);
//    }
}
