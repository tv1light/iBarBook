package com.hwjl.iBarBook.services;

import com.hwjl.iBarBook.models.gadgets.Gadget;
import com.hwjl.iBarBook.models.gadgets.GadgetRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
@SuppressWarnings("unused")
public class GadgetService {
    private final GadgetRepository gadgetRepository;

    public Optional<Gadget> findById(Long id){
        return gadgetRepository.findById(id);
    }

    public List<Gadget> findAll() {
        return gadgetRepository.findAll();
    }

    public Gadget save(Gadget gadget) {
        return gadgetRepository.save(gadget);
    }

    public Gadget updateGadget(Long id, Gadget updatedGadget) {
        Gadget exGadget = gadgetRepository.findById(id)
                .orElseThrow(()-> new RuntimeException("Gadget not found"));
        exGadget.setName(updatedGadget.getName());
        exGadget.setDescription(updatedGadget.getDescription());
        return gadgetRepository.save(exGadget);
    }

    @Transactional
    public String deleteGadget(Long id) {
        gadgetRepository.deleteById(id);
        return "Gadget has been deleted";
    }
}
