/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package business;

import java.io.Serializable;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "Address")

public class Address implements Serializable{
    private IntegerProperty AddressId;
    private StringProperty Barangay;
    private StringProperty City;
    private StringProperty Province;
    
public Address(){
    this.AddressId = new SimpleIntegerProperty();
    this.Barangay = new SimpleStringProperty();
    this.City = new SimpleStringProperty();
    this.Province = new SimpleStringProperty();
    }
public Address(String Barangay, String City, String Province){
    this();
    this.Barangay.set(Barangay);
    this.City.set(City);
    this.Province.set(Province);
    }

@Id
@Column (name = "Address")
@GeneratedValue (strategy = GenerationType.IDENTITY)
    public Integer getAddressId(){
        return AddressId.get();
    }
    public void setAddressId(Integer Address){
        this.AddressId.set(Address);
    }
@Column (name = "Barangay")
    public String getBarangay(){
        return Barangay.get();
    }
    public void setBarangay(String Barangay){
        this.Barangay.set(Barangay);
    }
@Column (name = "City")
    public String getCity(){
        return City.get();
    }
    public void setCity(String City){
        this.City.set(City);
    }
@Column (name = "Province")
    public String getProvince(){
        return Province.get();
    }
    public void setProvince(String Province){
        this.Province.set(Province);
    }

}
