package com.campuslab.platform.pc27747u20221e121.reservations.domain.model;

import com.campuslab.platform.pc27747u20221e121.reservations.domain.model.valueobjects.*;
import lombok.Getter;

public class EquipmentReservation {

    @Getter
    private Long id;
    //reservationCode (ReservationCode)
    //laboratoryId (LaboratoryId)
    //reservationPeriod (ReservationPeriod)
    //equipmentBatch (EquipmentBatch)
    //accessLevel (Integer)
    //status (ReservationStatus)
    //reservationNotes (String)
    @Getter
    private ReservationCode reservationCode;
    private LaboratoryId laboratoryId;
    private ReservationPeriod reservationPeriod;
    private EquipmentBatch equipmentBatch;
    private Integer accessLevel;
    private ReservationStatus status;
    private String reservationNotes;

    public EquipmentReservation(Long id,)
}