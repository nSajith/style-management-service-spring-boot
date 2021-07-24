package com.nuwan.stylemaster.repository;

import com.nuwan.stylemaster.model.ItemCategory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<ItemCategory, Long> {
}
