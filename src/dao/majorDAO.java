/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import dbUtills.MyConnection;
import dto.MajorDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author ngoba
 */
public class majorDAO {

    public static ArrayList<MajorDTO> getAllMajor() throws SQLException {
        ArrayList<MajorDTO> list = new ArrayList<>();
        Connection cn = MyConnection.makeConnection();
        try {
            if (cn != null) {
                String sql = "SELECT *FROM dbo.Major WHERE status=1";
                PreparedStatement pst = cn.prepareStatement(sql);
                ResultSet rs = pst.executeQuery();
                while (rs.next()) {
                    String majorCode = rs.getString("majorID");
                    String majorName = rs.getString("majorName");
                    String status = rs.getString("status");
                    MajorDTO dto = new MajorDTO(majorCode, majorName, status);
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

    public static ArrayList<MajorDTO> getAllMajor111() throws SQLException {
        ArrayList<MajorDTO> list = new ArrayList<>();
        Connection cn = MyConnection.makeConnection();
        try {
            if (cn != null) {
                String sql
                        = "SELECT*FROM dbo.Major";
                PreparedStatement pst = cn.prepareStatement(sql);
                ResultSet rs = pst.executeQuery();
                while (rs.next()) {
                    String majorCode = rs.getString("majorID");
                    String majorName = rs.getString("majorName");
                    String status = rs.getString("status");
                    MajorDTO dto = new MajorDTO(majorCode, majorName, status);
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

    public static ArrayList<MajorDTO> getAllMajor222() throws SQLException {
        ArrayList<MajorDTO> list = new ArrayList<>();
        Connection cn = MyConnection.makeConnection();
        try {
            if (cn != null) {
                String sql
                        = "SELECT*FROM dbo.Major where status=0";
                PreparedStatement pst = cn.prepareStatement(sql);
                ResultSet rs = pst.executeQuery();
                while (rs.next()) {
                    String majorCode = rs.getString("majorID");
                    String majorName = rs.getString("majorName");
                    String status = rs.getString("status");
                    MajorDTO dto = new MajorDTO(majorCode, majorName, status);
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

    public static int InsertMajor(String majorCode, String majorName, String status) throws SQLException {
        int result = 0;
        Connection cn = MyConnection.makeConnection();
        if (cn != null) {
            String sql = "INSERT dbo.Major\n"
                    + " VALUES (?,?,?)\n";
            PreparedStatement pst = cn.prepareStatement(sql);
            pst.setString(1, majorCode);
            pst.setString(2, majorName);
            pst.setString(3, status);
            result = pst.executeUpdate();
            cn.close();
        }
        return result;

    }

    public static int DeleteMajor(String majorCode) throws SQLException {
        Connection cn = MyConnection.makeConnection();
        int result = 0;
        if (cn != null) {
            String sql = "UPDATE dbo.Student SET Stutus=0 WHERE majorID=? "
                    + "UPDATE dbo.Major SET status=0 WHERE majorID=? ";
            PreparedStatement pst = cn.prepareStatement(sql);
            pst.setString(1, majorCode);
            pst.setString(2, majorCode);
            result = pst.executeUpdate();
            cn.close();
        }
        return result;
    }

    public static int Pre_DELETEMajor(String majorID) throws SQLException {
        Connection cn = MyConnection.makeConnection();
        int result = 0;
        if (cn != null) {
            String sql = "UPDATE dbo.Student SET Stutus=1 WHERE majorID=? "
                    + "UPDATE dbo.Major SET status=1 WHERE majorID=? ";
            PreparedStatement pst = cn.prepareStatement(sql);
            pst.setString(1, majorID);
            pst.setString(2, majorID);
            result = pst.executeUpdate();
            cn.close();
        }
        return result;
    }

    public static int DeleteMajorThat(String majorCode) throws SQLException {
        Connection cn = MyConnection.makeConnection();
        int result = 0;
        if (cn != null) {
            String sql = "DELETE dbo.Student WHERE majorID=?\n"
                    + "DELETE dbo.Major WHERE majorID=?";
            PreparedStatement pst = cn.prepareStatement(sql);
            pst.setString(1, majorCode);
            pst.setString(2, majorCode);
            result = pst.executeUpdate();
            cn.close();
        }
        return result;
    }

    public static int UpdateMajor(String majorname, String marjorcode) throws SQLException {
        Connection cn = MyConnection.makeConnection();
        int result = 0;
        if (cn != null) {
            String sql = "UPDATE dbo.Major SET majorName=?\n"
                    + "WHERE majorID=?";
            PreparedStatement pst = cn.prepareStatement(sql);
            pst.setString(1, majorname);
            pst.setString(2, marjorcode);
            result = pst.executeUpdate();
            cn.close();
        }
        return result;
    }

}
