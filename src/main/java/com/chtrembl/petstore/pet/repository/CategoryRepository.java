package com.chtrembl.petstore.pet.repository;

import com.chtrembl.petstore.pet.model.Category;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends CrudRepository<Category, Long> {
}
