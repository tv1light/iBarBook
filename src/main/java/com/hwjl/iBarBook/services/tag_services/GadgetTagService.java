package com.hwjl.iBarBook.services.tag_services;

import com.hwjl.iBarBook.models.tags.Gadget_tag;
import com.hwjl.iBarBook.models.tags.Gadget_tagRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@Service
public class GadgetTagService {
    Gadget_tagRepository gtRepository;

    public List<Gadget_tag> findAllTags() {
        return gtRepository.findAll();
    }

    public Optional<Gadget_tag> findById(Long id) {
        return gtRepository.findById(id);
    }

//    public List<Gadget_tag> findTagsByItemId(Long id) {
//        return gtRepository.findTagsByCocktailId(id);
//    }

    public Gadget_tag save(Gadget_tag gadgetTag) {
        return gtRepository.save(gadgetTag);
    }

    public Gadget_tag updateTag(Long id, Gadget_tag updGadgetTag) {
        Gadget_tag exGadgetTag = gtRepository.findById(id)
                .orElseThrow(()-> new RuntimeException("Ingredient tag not found"));
        exGadgetTag.setName(updGadgetTag.getName());
        return gtRepository.save(exGadgetTag);
    }

    @Transactional
    public String deleteTag(Long id) {
        gtRepository.deleteById(id);
        return "Tag has been deleted";
    }
}
