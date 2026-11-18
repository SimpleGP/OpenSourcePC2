package com.campuslab.platform.pc27747u20221e121.reservations.domain.model.valueobjects;

public class ReservationPeriod {

    String startDate;
    String endDate;


    public ReservationPeriod(String endDate,String startDate){
        if(endDate==null || endDate.isBlank()) {
            throw new IllegalArgumentException("Operation status cannot be null or blank.");
        }
    }
}
