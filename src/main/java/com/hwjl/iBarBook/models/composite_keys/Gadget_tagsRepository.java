package com.hwjl.iBarBook.models.composite_keys;

import com.hwjl.iBarBook.models.composite_keys.CK_id.Gadget_tagsId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Gadget_tagsRepository extends JpaRepository<Gadget_tags, Gadget_tagsId> {
}