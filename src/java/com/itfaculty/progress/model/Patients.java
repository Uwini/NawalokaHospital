package com.itfaculty.progress.model;
// Generated Feb 3, 2017 11:29:05 PM by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;

/**
 * Patients generated by hbm2java
 */
@Entity
@Table(name="patients"
    ,catalog="nawalokahospital"
    , uniqueConstraints = @UniqueConstraint(columnNames="patient_telno") 
)
public class Patients  implements java.io.Serializable {


     private Integer patientId;
     private String patientFirstname;
     private String patientLastname;
     private String patientGender;
     private int patientAge;
     private String patientTelno;
     private String patientAddress;
     private Date patientCreatedDate;
     private Set<Records> recordses = new HashSet<Records>(0);

    public Patients() {
    }

	
    public Patients(String patientFirstname, String patientLastname, String patientGender, int patientAge, String patientTelno, String patientAddress, Date patientCreatedDate) {
        this.patientFirstname = patientFirstname;
        this.patientLastname = patientLastname;
        this.patientGender = patientGender;
        this.patientAge = patientAge;
        this.patientTelno = patientTelno;
        this.patientAddress = patientAddress;
        this.patientCreatedDate = patientCreatedDate;
    }
    public Patients(String patientFirstname, String patientLastname, String patientGender, int patientAge, String patientTelno, String patientAddress, Date patientCreatedDate, Set<Records> recordses) {
       this.patientFirstname = patientFirstname;
       this.patientLastname = patientLastname;
       this.patientGender = patientGender;
       this.patientAge = patientAge;
       this.patientTelno = patientTelno;
       this.patientAddress = patientAddress;
       this.patientCreatedDate = patientCreatedDate;
       this.recordses = recordses;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="patient_id", unique=true, nullable=false)
    public Integer getPatientId() {
        return this.patientId;
    }
    
    public void setPatientId(Integer patientId) {
        this.patientId = patientId;
    }

    
    @Column(name="patient_firstname", nullable=false, length=100)
    public String getPatientFirstname() {
        return this.patientFirstname;
    }
    
    public void setPatientFirstname(String patientFirstname) {
        this.patientFirstname = patientFirstname;
    }

    
    @Column(name="patient_lastname", nullable=false, length=100)
    public String getPatientLastname() {
        return this.patientLastname;
    }
    
    public void setPatientLastname(String patientLastname) {
        this.patientLastname = patientLastname;
    }

    
    @Column(name="patient_gender", nullable=false, length=10)
    public String getPatientGender() {
        return this.patientGender;
    }
    
    public void setPatientGender(String patientGender) {
        this.patientGender = patientGender;
    }

    
    @Column(name="patient_age", nullable=false)
    public int getPatientAge() {
        return this.patientAge;
    }
    
    public void setPatientAge(int patientAge) {
        this.patientAge = patientAge;
    }

    
    @Column(name="patient_telno", unique=true, nullable=false, length=100)
    public String getPatientTelno() {
        return this.patientTelno;
    }
    
    public void setPatientTelno(String patientTelno) {
        this.patientTelno = patientTelno;
    }

    
    @Column(name="patient_address", nullable=false)
    public String getPatientAddress() {
        return this.patientAddress;
    }
    
    public void setPatientAddress(String patientAddress) {
        this.patientAddress = patientAddress;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="patient_created_date", nullable=false, length=19)
    public Date getPatientCreatedDate() {
        return this.patientCreatedDate;
    }
    
    public void setPatientCreatedDate(Date patientCreatedDate) {
        this.patientCreatedDate = patientCreatedDate;
    }

//@OneToMany(fetch=FetchType.LAZY, mappedBy="patients")
//    public Set<Records> getRecordses() {
//        return this.recordses;
//    }
//    
//    public void setRecordses(Set<Records> recordses) {
//        this.recordses = recordses;
//    }




}


