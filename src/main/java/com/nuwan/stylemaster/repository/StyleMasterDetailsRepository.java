package com.nuwan.stylemaster.repository;

import com.nuwan.stylemaster.model.StyleMasterDetails;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StyleMasterDetailsRepository extends JpaRepository<StyleMasterDetails, Long> {

    List<StyleMasterDetails> findStyleMasterDetailsByStyleMaster_Id(Long id);
    List<StyleMasterDetails> findStyleMasterDetailsByItemCategory_Id(Long id);
}
