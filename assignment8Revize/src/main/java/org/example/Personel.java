package org.example;

import java.time.LocalDate;

public abstract class Personel {
    protected String name;
    protected String surname;
    protected LocalDate dateOfBirth;

    public Personel(String name, String surname, LocalDate dateOfBirth) {
        this.name = name;
        this.surname = surname;
        this.dateOfBirth = dateOfBirth;
    }

    public abstract LocalDate getRetirementDate();

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }
}

