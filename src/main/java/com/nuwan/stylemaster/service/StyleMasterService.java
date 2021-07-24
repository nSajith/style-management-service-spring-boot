package com.nuwan.stylemaster.service;

import com.nuwan.stylemaster.model.StyleMaster;

public interface StyleMasterService {
    StyleMaster create(StyleMaster styleMaster);
    StyleMaster get(Long id);
}
