package com.campuslab.platform.pc27747u20221e121.reservations.domain.model.valueobjects;

import jakarta.persistence.Embeddable;

import java.util.UUID;

@Embeddable
public class LaboratoryId {

    private String value;
    protected LaboratoryId(){

    }

    public LaboratoryId(String value){
        if (value == null || value.isBlank()) {
            throw new IllegalArgumentException("Equipment unit identifier cannot be null or blank.");
        }
        this.value = UUID.fromString(value).toString();
    }

    public String getValue(){
        return value;
    }
}
