package org.example;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Personel teamLead = new Male("John", "Doe", LocalDate.of(1980, 1, 1));
        Department department = new Department(teamLead);

        Personel personel1 = new Male("Michael", "Smith", LocalDate.of(1990, 2, 1));
        Personel personel2 = new Female("Emma", "Johnson", LocalDate.of(1985, 3, 1));

        department.addPersonnel(personel1);
        department.addPersonnel(personel2);

        department.addTask("Task 1");
        department.addTask("Task 2");

        department.markTaskAsCompleted("Task 1");

        System.out.println("Team Lead: " + department.getTeamLead().getName() + " " + department.getTeamLead().getSurname());
    }
}
