/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dto;

import java.util.Date;

/**
 *
 * @author ngoba
 */
public class StudentDTO {

    private String StudentID;
    private String FullName;
    private String Phone;
    private String Email;
    private String Address;
    private String DayOfBirth;
    private String MajorCode;
    private String Status;
  

    public StudentDTO() {
    }

    public StudentDTO(String StudentID, String FullName, String Phone, String Email, String Address, String DayOfBirth, String MajorCode, String Status) {
        this.StudentID = StudentID;
        this.FullName = FullName;
        this.Phone = Phone;
        this.Email = Email;
        this.Address = Address;
        this.DayOfBirth = DayOfBirth;
        this.MajorCode = MajorCode;
        this.Status = Status;
    }

   

    public String getStudentID() {
        return StudentID;
    }

    public void setStudentID(String StudentID) {
        this.StudentID = StudentID;
    }

    public String getFullName() {
        return FullName;
    }

    public void setFullName(String FullName) {
        this.FullName = FullName;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String Phone) {
        this.Phone = Phone;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public String getDayOfBirth() {
        return DayOfBirth;
    }

    public void setDayOfBirth(String DayOfBirth) {
        this.DayOfBirth = DayOfBirth;
    }

    public String getMajorCode() {
        return MajorCode;
    }

    public void setMajorCode(String MajorCode) {
        this.MajorCode = MajorCode;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String Status) {
        this.Status = Status;
    }

}
