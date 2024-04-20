package com.hwjl.iBarBook.controllers;

import com.hwjl.iBarBook.models.gadgets.Gadget;
import com.hwjl.iBarBook.services.GadgetService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@SuppressWarnings("unused")
@RestController
@RequestMapping("/gadgets")
@AllArgsConstructor
public class GadgetsController {
    private final GadgetService gadgetService;

    @GetMapping("")
    public List<Gadget> gadgets(){
        return gadgetService.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Gadget> gadget(@PathVariable Long id){
        return gadgetService.findById(id);
    }

    @PostMapping("/add")
    public Gadget addGadget(@RequestBody Gadget gadget){
        return gadgetService.save(gadget);
    }

    @PutMapping("/{id}/edit")
    public Gadget editGadget(@PathVariable Long id, @RequestBody Gadget updatedGadget){
        return gadgetService.updateGadget(id, updatedGadget);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteGadget(@PathVariable Long id){
        return gadgetService.deleteGadget(id);
    }
}

