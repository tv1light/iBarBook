package com.hwjl.iBarBook.services;

import com.hwjl.iBarBook.models.gadgets.GadgetRepository;
import org.springframework.stereotype.Service;

@Service
@SuppressWarnings("unused")
public class GadgetService {
    private final GadgetRepository gadgetRepository;

    public GadgetService(GadgetRepository gadgetRepository) {
        this.gadgetRepository = gadgetRepository;
    }
}
