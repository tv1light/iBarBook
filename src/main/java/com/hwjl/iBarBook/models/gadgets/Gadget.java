package com.hwjl.iBarBook.models.gadgets;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "gadgets")
public class Gadget {
    @Id
    @Column(name = "id")
    private Long id;

    @Column(name = "gadget_name", nullable = false, columnDefinition = "text")
    private String name;

    @Column(name = "description", nullable = false, columnDefinition = "text")
    private String description;

    public Gadget() {
    }

    public Gadget(Long gadget_id, String gadget_name, String description) {
        this.id = gadget_id;
        this.name = gadget_name;
        this.description = description;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "(" +
                "gadget_id = " + id + ", " +
                "gadget_name = " + name + ", " +
                "description = " + description + ")";
    }

    public Long getGadget_id() {
        return id;
    }

    public String getGadget_name() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public void setGadget_id(Long gadget_id) {
        this.id = gadget_id;
    }

    public void setGadget_name(String gadget_name) {
        this.name = gadget_name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}
