package com.leader.demo.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "basic_professional_information")
public class Information {
    @Id
    String Professional_name;
    String Number_of_professionals;
    public String getNumber_of_professionals() {
        return Number_of_professionals;
    }

    public void setNumber_of_professionals(String number_of_professionals) {
        Number_of_professionals = number_of_professionals;
    }

    public String getProfessional_name() {
        return Professional_name;
    }

    public void setProfessional_name(String professional_name) {
        Professional_name = professional_name;
    }
}
