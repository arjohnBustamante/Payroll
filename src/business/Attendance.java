/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package business;

import java.io.Serializable;
import java.sql.Time;
import java.util.Date;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleObjectProperty;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "Attendance")

public class Attendance implements Serializable{
    private IntegerProperty AttendanceId;
    private ObjectProperty<Time> TimeIn;
    private ObjectProperty<Time> TimeOut;
    private ObjectProperty<Time> OverTime;
    private ObjectProperty<Date> date;
    private ObjectProperty<Time> TotalNumHours;

public Attendance(){
    this.AttendanceId = new SimpleIntegerProperty();
    this.TimeIn = new SimpleObjectProperty<>();
    this.TimeOut = new SimpleObjectProperty<>();
    this.OverTime = new SimpleObjectProperty<>();
    this.date = new SimpleObjectProperty<>();
    this.TotalNumHours = new SimpleObjectProperty<>();
    
}
public Attendance(Time TimeIn, Time TimeOut, Time OverTime, Date date, Time TotalNumHours){
    this();
    this.TimeIn.set(TimeIn);
    this.TimeOut.set(TimeOut);
    this.OverTime.set(OverTime);
    this.date.set(date);
    this.TotalNumHours.set(TotalNumHours);
    
}
@Id
@Column (name = "Address")
@GeneratedValue (strategy = GenerationType.IDENTITY)
    public Integer getAttendanceId(){
        return AttendanceId.get();
    }
    public void setAttendanceId(Integer AttendanceId){
        this.AttendanceId.set(AttendanceId);
    }
@Column (name = "TimeIn")
    public Time getTimeIn(){
        return TimeIn.get();
    }
    public void setTimeIn(Time TimeIn){
        this.TimeIn.set(TimeIn);
    }
@Column (name = "TimeOut")
    public Time getTimeOut(){
        return TimeOut.get();
    }
    public void setTimeOut(Time TimeOut){
        this.TimeOut.set(TimeOut);
    }
@Column (name = "OverTime")
    public Time getOverTime(){
        return OverTime.get();
    }
    public void setOverTime(Time OverTime){
        this.OverTime.set(OverTime);
    }
@Column (name = "Date")
    public Date getdate(){
        return date.get();
    }
    public void setdate(Date date){
        this.date.set(date);
    }
@Column (name = "TotalNumHours")
    public Time getTotalNumHours(){
        return TotalNumHours.get();
    }
    public void setTotalNumHours(Time TotalNumHours){
        this.TotalNumHours.set(TotalNumHours);
    }

}
