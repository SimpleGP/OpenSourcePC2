package com.campuslab.platform.pc27747u20221e121.reservations.domain.model.valueobjects;

public record ReservationCode(String code) {

        public String getCode(){
            return "%s %s".formatted(code);
        }
        public ReservationCode{
            if(code == null || code.isBlank()){
                throw new IllegalArgumentException("Code must not be null or blank");

            }
        }
}
