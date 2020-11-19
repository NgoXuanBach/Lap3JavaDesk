/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import dbUtills.MyConnection;
import dto.StudentDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author ngoba
 */
public class StudentDAO {

    public static ArrayList<StudentDTO> getAllStudent() throws SQLException {
        ArrayList<StudentDTO> list = new ArrayList<>();
        Connection cn = MyConnection.makeConnection();
        try {
            if (cn != null) {
                String sql = "SELECT *FROM dbo.Student WHERE Stutus=1";
                PreparedStatement pst = cn.prepareStatement(sql);
                ResultSet rs = pst.executeQuery();
                while (rs.next()) {
                    String StudentID = rs.getString("studentID");
                    String fullName = rs.getString("studentName");
                    String phone = rs.getString("Phone");
                    String Email = rs.getString("Email");
                    String address = rs.getString("Address");
                    String DayOfBirth = rs.getString("Dayofbirth");
                    String majorCode = rs.getString("majorID");
                    String Status = rs.getString("Stutus");
                    StudentDTO dto = new StudentDTO(StudentID, fullName, phone, Email, address, DayOfBirth, majorCode, Status);
                    list.add(dto);
                }
            }
        } catch (Exception e) {
            e.getMessage();
        } finally {
            if (cn != null) {
                cn.close();
            }
        }
        return list;

    }

    public static ArrayList<StudentDTO> getAllStudent111() throws SQLException {
        ArrayList<StudentDTO> list = new ArrayList<>();
        Connection cn = MyConnection.makeConnection();
        try {
            if (cn != null) {
                String sql
                        = "SELECT *FROM dbo.Student WHERE Stutus=0";
                PreparedStatement pst = cn.prepareStatement(sql);
                ResultSet rs = pst.executeQuery();
                while (rs.next()) {
                    String StudentID = rs.getString("studentID");
                    String fullName = rs.getString("studentName");
                    String phone = rs.getString("Phone");
                    String Email = rs.getString("Email");
                    String address = rs.getString("Address");
                    String DayOfBirth = rs.getString("Dayofbirth");
                    String majorCode = rs.getString("majorID");
                    String status = rs.getString("Stutus");
                    StudentDTO dto = new StudentDTO(StudentID, fullName, phone, Email, address, DayOfBirth, majorCode, status);
                    list.add(dto);
                }
            }
        } catch (Exception e) {
            e.getMessage();
        } finally {
            if (cn != null) {
                cn.close();
            }
        }
        return list;

    }

    public static int InsertStudent(String StudentID, String StudentName, String Phone, String Email, String DayOfBirth, String majorID, String address, String status) throws SQLException {

        Connection cn = MyConnection.makeConnection();
        int result = 0;
        if (cn != null) {
            String sql = "INSERT INTO dbo.Student\n"
                    + "VALUES(?,?,?,?,?,?,?,?)";
            PreparedStatement pst = cn.prepareStatement(sql);
            pst.setString(1, StudentID);
            pst.setString(2, StudentName);
            pst.setString(3, Phone);
            pst.setString(4, Email);
            pst.setString(5, address);
            pst.setString(6, DayOfBirth);
            pst.setString(7, majorID);
            pst.setString(8, status);
            result = pst.executeUpdate();
            cn.close();
        }
        return result;

    }

    public static int UpdateStudent(String StudentName, String phone, String email, String dayofbirth, String address, String majorCode, String studentID) throws SQLException {
        Connection cn = MyConnection.makeConnection();
        int result = 0;
        if (cn != null) {
            String sql = "UPDATE dbo.Student SET\n"
                    + " studentName=?,Phone=?,Email=?,Dayofbirth=?,Address=?,majorID=?\n"
                    + " WHERE studentID=?\n";
            PreparedStatement pst = cn.prepareStatement(sql);
            pst.setString(1, StudentName);
            pst.setString(2, phone);
            pst.setString(3, email);
            pst.setString(4, dayofbirth);
            pst.setString(5, address);
            pst.setString(6, majorCode);
            pst.setString(7, studentID);
            result = pst.executeUpdate();
            cn.close();
        }
        return result;
    }

    public static int DeleteStudent(String StudentID) throws SQLException {
        Connection cn = MyConnection.makeConnection();
        int result = 0;
        if (cn != null) {
            String sql = "UPDATE dbo.Student SET Stutus=0 WHERE studentID=? ";
            PreparedStatement pst = cn.prepareStatement(sql);
            pst.setString(1, StudentID);
            result = pst.executeUpdate();
            cn.close();
        }
        return result;
    }

    public static int Pre_DeleteStudent(String StudentID,String majorID) throws SQLException {
        Connection cn = MyConnection.makeConnection();
        int result = 0;
        if (cn != null) {
            String sql = "UPDATE dbo.Student SET Stutus=1 WHERE studentID=? "
                    + "UPDATE dbo.Major SET status=1 WHERE majorID=?";
            PreparedStatement pst = cn.prepareStatement(sql);
            pst.setString(1, StudentID);
            pst.setString(2, majorID);
            result = pst.executeUpdate();
            cn.close();
        }
        return result;
    }

    public static int DeleteStudentTHAT(String StudentID) throws SQLException {
        Connection cn = MyConnection.makeConnection();
        int result = 0;
        if (cn != null) {
            String sql = "DELETE dbo.Student WHERE studentID=?";
            PreparedStatement pst = cn.prepareStatement(sql);
            pst.setString(1, StudentID);
            result = pst.executeUpdate();
            cn.close();
        }
        return result;
    }

}
