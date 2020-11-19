/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dto;

/**
 *
 * @author ngoba
 */
public class MajorDTO {
    private String MajorCode;
    private String MajorName;
   private String status;

    public MajorDTO() {
    }

    public MajorDTO(String MajorCode, String MajorName, String status) {
        this.MajorCode = MajorCode;
        this.MajorName = MajorName;
        this.status = status;
    }

    public String getMajorCode() {
        return MajorCode;
    }

    public void setMajorCode(String MajorCode) {
        this.MajorCode = MajorCode;
    }

    public String getMajorName() {
        return MajorName;
    }

    public void setMajorName(String MajorName) {
        this.MajorName = MajorName;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

   
}
