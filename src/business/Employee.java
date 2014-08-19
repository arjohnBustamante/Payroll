/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package business;

import java.io.Serializable;
import java.util.List;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.ListProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleListProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author Almiradz
 */

@Entity
@Table (name ="Employee")

public class Employee implements Serializable{
    private IntegerProperty EmpId;
    private StringProperty FName;
    private StringProperty LName;
    private StringProperty MName;
    private IntegerProperty Age;
    private StringProperty Gender;
    private StringProperty CivilStatus;
    private ListProperty<Address> address;
    private ListProperty<Deduction> deduction;
    private ListProperty<Attendance> attendance;
    private ListProperty<Salary> salary;
      
public Employee(){
    this.EmpId = new SimpleIntegerProperty();
    this.FName = new SimpleStringProperty();
    this.LName = new SimpleStringProperty();
    this.MName = new SimpleStringProperty();
    this.Age = new SimpleIntegerProperty();
    this.Gender = new SimpleStringProperty();
    this.CivilStatus = new SimpleStringProperty();
    this.address = new SimpleListProperty();
    
    }

public Employee(String FName, String LName, String MName, Integer Age, String Gender, String CivilStatus){
    this();
    this.FName.set(FName);
    this.LName.set(LName);
    this.MName.set(MName);
    this.Age.set(Age);
    this.Gender.set(Gender);
    this.CivilStatus.set(CivilStatus);
    
    }

@Id
@Column (name = "EmpID")
@GeneratedValue (strategy = GenerationType.IDENTITY)
    public Integer getEmpId() {
        return EmpId.get();
    }

    public void setEmpId(Integer Empid) {
        this.EmpId.set(Empid);
    }
 @Column (name = "FName")
    public String getFName(){
        return FName.get();
    }
    public void setFName(String FName){
        this.FName.set(FName);
    }
@Column (name = "LName")
    public String getLName(){
        return LName.get();
    }
    public void setLName(String LName){
        this.LName.set(LName);
    }
@Column (name = "MName")
    public String getMName(){
        return LName.get();
    }
    public void setMName(String MName){
        this.MName.set(MName);
    }
@Column (name = "Age")
    public Integer getAge(){
        return Age.get();
    }
    public void setAge(Integer Age){
        this.Age.set(Age);
    }
@Column (name = "Gender")
    public String getGender(){
        return Gender.get();
    }
    public void setGender(String Gender){
        this.Gender.set(Gender);
    }
@Column (name = "CivilStatus")
    public String getCivilStatus(){
        return CivilStatus.get();
    }
    public void setCivilStatus(String CivilStatus){
        this.CivilStatus.set(CivilStatus);
    }
@OneToMany(mappedBy = "employee")
    public List<Address> getAddress(){
        return this.address.get();
    }
        public void setStudent(List<Address> address){
        ObservableList<Address> addresses = FXCollections.observableArrayList(address);
        this.address.set(addresses);
    }
@OneToMany(mappedBy = "deduction")
    public List<Deduction> getdeduction(){
        return this.deduction.get();
    }
    public void setdeduction(List<Deduction> deduction){
        ObservableList<Deduction> deductions = FXCollections.observableArrayList(deduction);
        this.deduction.set(deductions);
    }
@OneToMany(mappedBy = "attendance")
    public List<Attendance> getattendance(){
        return this.attendance.get();
    }
    public void setattendance(List<Attendance> attendance){
        ObservableList<Attendance> attendances = FXCollections.observableArrayList(attendance);
        this.attendance.set(attendances);
    }
@OneToMany(mappedBy = "salary")
    public List<Salary> getsalary(){
        return this.salary.get();
    }
    public void setsalary(List<Salary> salary){
        ObservableList<Salary> salaries = FXCollections.observableArrayList(salary);
        this.salary.set(salaries);
    }
}
