package com.chtrembl.petstore.pet.repository;

import com.chtrembl.petstore.pet.model.Tag;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TagRepository extends CrudRepository<Tag, Long> {
}
