package com.hwjl.iBarBook.models.gadgets;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity(name = "Gadget")
@Table(name = "Gadgets")
public class Gadget {
    @Id
    @Column(name = "gadget_id")
    private Long gadget_id;

    @Column(name = "gadget_name", nullable = false, unique = true)
    private String gadget_name;

    @Column(name = "description", nullable = false, unique = true)
    private String description;

    public Gadget() {
    }

    public Gadget(Long gadget_id, String gadget_name, String description) {
        this.gadget_id = gadget_id;
        this.gadget_name = gadget_name;
        this.description = description;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "(" +
                "gadget_id = " + gadget_id + ", " +
                "gadget_name = " + gadget_name + ", " +
                "description = " + description + ")";
    }

    public Long getGadget_id() {
        return gadget_id;
    }

    public String getGadget_name() {
        return gadget_name;
    }

    public String getDescription() {
        return description;
    }

    public void setGadget_id(Long gadget_id) {
        this.gadget_id = gadget_id;
    }

    public void setGadget_name(String gadget_name) {
        this.gadget_name = gadget_name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}
