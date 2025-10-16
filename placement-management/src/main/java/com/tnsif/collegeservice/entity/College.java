package com.tnsif.collegeservice.entity;

import jakarta.persistence.*;

@Entity
public class College {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String collegeName;
    private String location;
    private String email;
    private String phone;
    private String affiliation;    // new field
    private int establishedYear;   // new field

    // Constructors
    public College() {}

    public College(Long id, String collegeName, String location, String email, String phone, String affiliation, int establishedYear) {
        this.id = id;
        this.collegeName = collegeName;
        this.location = location;
        this.email = email;
        this.phone = phone;
        this.affiliation = affiliation;
        this.establishedYear = establishedYear;
    }

    // Getters and Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getCollegeName() { return collegeName; }
    public void setCollegeName(String collegeName) { this.collegeName = collegeName; }

    public String getLocation() { return location; }
    public void setLocation(String location) { this.location = location; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getPhone() { return phone; }
    public void setPhone(String phone) { this.phone = phone; }

    public String getAffiliation() { return affiliation; }
    public void setAffiliation(String affiliation) { this.affiliation = affiliation; }

    public int getEstablishedYear() { return establishedYear; }
    public void setEstablishedYear(int establishedYear) { this.establishedYear = establishedYear; }
}

