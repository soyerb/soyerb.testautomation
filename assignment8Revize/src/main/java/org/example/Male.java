package org.example;

import java.time.LocalDate;

public class Male extends Personel {
    public Male(String name, String surname, LocalDate dateOfBirth) {
        super(name, surname, dateOfBirth);
    }

    @Override
    public LocalDate getRetirementDate() {
        return getDateOfBirth().plusYears(65);
    }
}
