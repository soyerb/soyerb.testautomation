package org.example;

import java.time.LocalDate;

public class Female extends Personel {
    public Female(String name, String surname, LocalDate dateOfBirth) {
        super(name, surname, dateOfBirth);
    }

    @Override
    public LocalDate getRetirementDate() {
        return getDateOfBirth().plusYears(60);
    }
}
