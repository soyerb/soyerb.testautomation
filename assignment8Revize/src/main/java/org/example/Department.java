package org.example;

import java.util.ArrayList;
import java.util.List;

public class Department {
    private Personel teamLead;
    private List<Personel> personnelList;
    private List<String> assignmentList;

    public Department(Personel teamLead) {
        this.teamLead = teamLead;
        this.personnelList = new ArrayList<>();
        this.assignmentList = new ArrayList<>();
    }

    public void changeTeamLead(Personel newTeamLead) {
        this.teamLead = newTeamLead;
    }

    public void addPersonnel(Personel personnel) {
        this.personnelList.add(personnel);
    }

    public void removePersonnel(Personel personnel) {
        this.personnelList.remove(personnel);
    }

    public void changeStaff(Personel oldPersonnel, Personel newPersonnel) {
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

    public Personel getTeamLead() {
        return teamLead;
    }

    public List<Personel> getPersonnelList() {
        return personnelList;
    }

    public List<String> getAssignmentList() {
        return assignmentList;
    }
}
