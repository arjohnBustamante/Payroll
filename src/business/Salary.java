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

@Entity
@Table (name = "Salary")

public class Salary implements Serializable{
    private IntegerProperty SalaryId;
    private IntegerProperty SalaryAmount;
    private ListProperty<Deduction> deduction;
 
public Salary(){
    this.SalaryId = new SimpleIntegerProperty();
    this.SalaryAmount = new SimpleIntegerProperty();
}
public Salary(Integer SalaryAmount){
    this();
    this.SalaryAmount.set(SalaryAmount);
}
@Id
@Column (name = "SalaryId")
@GeneratedValue (strategy = GenerationType.IDENTITY)
    public Integer getSalaryId(){
        return SalaryId.get();
    }
    public void setSalaryId(Integer SalaryId){
        this.SalaryId.set(SalaryId);
    }
@Column (name = "SalaryAmount")
    public Integer getSalaryAmount(){
        return SalaryAmount.get();
    }
    public void setSalaryAmount(Integer SalaryAmount){
        this.SalaryAmount.set(SalaryAmount);
    }
@OneToMany (mappedBy = "deduction")
    public List<Deduction> getSalary(){
        return this.deduction.get();
    }
    public void setSalary(List<Salary> salary){
        ObservableList<Deduction> deductions = FXCollections.observableArrayList(deduction);
        this.deduction.set(deductions);
    }
}
