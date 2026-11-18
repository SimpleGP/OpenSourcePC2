package com.campuslab.platform.pc27747u20221e121.reservations.domain.model;

import com.campuslab.platform.pc27747u20221e121.reservations.domain.model.valueobjects.*;
import lombok.Getter;

import java.util.Objects;

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

    public EquipmentReservation(Long id,LaboratoryId laboratoryId,ReservationCode reservationCode,EquipmentReservation equipmentReservation, Integer accessLevel, ReservationStatus status, String reservationNotes){
        this.id=id;
        this.reservationCode= Objects.requireNonNull(reservationCode,"code must not be null");
        this.laboratoryId=Objects.requireNonNull(laboratoryId,"laboratoryid must not be null");
        this.equipmentBatch= Objects.requireNonNull(equipmentBatch,"equipment must not be null");
        this.accessLevel=Objects.requireNonNull(accessLevel,"acces level must not be null");
        this.status=Objects.requireNonNull(status,"status must not be null");
        this.reservationNotes=Objects.requireNonNull(reservationNotes,"requirenonnull must not be null");

    }
}