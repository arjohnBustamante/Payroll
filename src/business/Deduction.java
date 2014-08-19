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
@Table (name = "Deduction")



public class Deduction implements Serializable{
    
    public IntegerProperty DeductId;
    public StringProperty DeductionName;
    public IntegerProperty DeductionAmount;
    public IntegerProperty CashAdvance;
    
    public Deduction(){
        this.DeductId = new SimpleIntegerProperty();
        this.DeductionName = new SimpleStringProperty();
        this.DeductionAmount = new SimpleIntegerProperty();
        this.CashAdvance = new SimpleIntegerProperty();
        
    }
    
     public Deduction(String DeductionName, int DeductionAmount, int CashAdvance ){
         this();
         this.DeductionName.set(DeductionName);
         this.DeductionAmount.set(DeductionAmount);
         this.CashAdvance.set(CashAdvance);
     }
     @Id
     @Column (name = "Deduction")
     @GeneratedValue (strategy = GenerationType.IDENTITY)
     
     public Integer getDeductId(){
         return DeductId.get();   
     }
      public void setDeductionID(Integer DeductId){
          this.DeductId.set(DeductId);
      }
      
      @Column (name = "DeductionName")
      public String getDeductionName(){
          return DeductionName.get();
      }
      public void setDeductionName(String DeductionName){
          this.DeductionName.set(DeductionName);  
      } 
      @Column (name = "DeductionAmount")
      public Integer getDeductionAmount(){
          return DeductionAmount.get();
      }
      public void setDeductionAmount(Integer DeductionAmount){
          this.DeductionAmount.set(DeductionAmount);
      }
      @Column (name = "CashAdvance")
      public Integer getCashAdvance(){
          return CashAdvance.get();
      }
      public void setCashAdvance(Integer CashAdvance){
          this.CashAdvance.set(CashAdvance);
      }


}
