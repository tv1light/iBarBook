package com.hwjl.iBarBook.models.tags;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface Gadget_tagRepository extends JpaRepository<Gadget_tag, Long> {
    //List<Gadget_tag> findTagsByCocktailId(Long id);
}