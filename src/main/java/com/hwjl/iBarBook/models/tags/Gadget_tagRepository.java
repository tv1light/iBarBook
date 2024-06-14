package com.hwjl.iBarBook.models.tags;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface Gadget_tagRepository extends JpaRepository<Gadget_tag, Long> {
    @Query(value = "SELECT gt.id, gt.name FROM gadget_tag gt JOIN gadget_tags gts ON gt.id = gts.tag_id WHERE gts.gadget_id = ?1",
    nativeQuery = true)
    List<Gadget_tag> findTagsByGadgetId(Long id);
}