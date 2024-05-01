package ru.edu.datajpa.projection;


import java.util.List;

public interface EmployeeEquipment {

    String getName();
    Integer getAge();
    List<Equipment> getEquipments();

    interface Equipment {
        //String getNumber();
        Long getId();
    }
}
