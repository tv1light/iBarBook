package com.hwjl.iBarBook.services;

import com.hwjl.iBarBook.models.gadgets.Gadget;
import com.hwjl.iBarBook.models.gadgets.GadgetRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@SuppressWarnings("unused")
public class GadgetService {
    private final GadgetRepository gadgetRepository;

    public GadgetService(GadgetRepository gadgetRepository) {
        this.gadgetRepository = gadgetRepository;
    }

    public Optional<Gadget> finById(Long id){
        return gadgetRepository.findById(id);
    }

    public List<Gadget> finById(){
        return gadgetRepository.findAll();
    }
}
