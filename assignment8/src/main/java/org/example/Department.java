package org.example;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Department {
    private String teamLead;
    private List<String> personnelList;
    private List<String> assignmentList;

    public Department(String teamLead) {
        this.teamLead = teamLead;
        this.personnelList = new ArrayList<>();
        this.assignmentList = new ArrayList<>();
    }

    public void changeTeamLead(String newTeamLead) {
        this.teamLead = newTeamLead;
    }

    public void addPersonnel(String personnel) {
        this.personnelList.add(personnel);
    }

    public void removePersonnel(String personnel) {
        this.personnelList.remove(personnel);
    }

    public void changePersonnel(String oldPersonnel, String newPersonnel) {
        int index = this.personnelList.indexOf(oldPersonnel);
        if (index != -1) {
            this.personnelList.set(index, newPersonnel);
        }
    }

    public void addTask(String task) {
        this.assignmentList.add(task);
    }

    public void markTaskAsCompleted(String task) {
        this.assignmentList.remove(task);
    }

    public class Male extends Department {
        private String firstName;
        private String surname;
        private Date dateOfBirth;

        public Male(String firstName, String surname, Date dateOfBirth, String teamLead) {
            super(teamLead);
            this.firstName = firstName;
            this.surname = surname;
            this.dateOfBirth = dateOfBirth;
        }

        public int calculateRetirementAge() {
            return 65;
        }
    }

    public class Female extends Department {
        private String firstName;
        private String surname;
        private Date dateOfBirth;

        public Female(String firstName, String surname, Date dateOfBirth, String teamLead) {
            super(teamLead);
            this.firstName = firstName;
            this.surname = surname;
            this.dateOfBirth = dateOfBirth;
        }

        public int calculateRetirementAge() {
            return 60;
        }
    }
}
