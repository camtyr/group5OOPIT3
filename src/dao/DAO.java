/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import model.TaiKhoan;
import model.CongViec;
/**
 *
 * @author Acer
 */
public class DAO {

    private Connection conn;

    public DAO() {

        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            conn = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databasename=QLCV;username=sa;password=adung2106;integratedSecurity=false;encrypt=true;trustServerCertificate=true;");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public boolean ThemTaiKhoan(TaiKhoan taikhoan) {
        String sql = "INSERT INTO Account(TaiKhoan, MatKhau, Email) VALUES(?, ?, ?)";

        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, taikhoan.getTaiKhoan());
            ps.setString(2, taikhoan.getMatKhau());
            ps.setString(3, taikhoan.getEmail());

            return ps.executeUpdate() > 0;

        } catch (Exception e) {
            e.printStackTrace();
        }

        return false;
    }

    public TaiKhoan CheckTaiKhoan(TaiKhoan taikhoan) {
        TaiKhoan taikhoan1 = new TaiKhoan();
        String sql = "SELECT * FROM Account WHERE TaiKhoan = ?"; 

        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, taikhoan.getTaiKhoan());
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                taikhoan1.setTaiKhoan(rs.getString("TaiKhoan"));
                taikhoan1.setMatKhau(rs.getString("MatKhau"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return taikhoan1;
    }

    public boolean DoiMatKhau(TaiKhoan taikhoan) {
        String sql = "UPDATE Account SET MatKhau = ? WHERE TaiKhoan = ?";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, taikhoan.getMatKhau());
            ps.setString(2, taikhoan.getTaiKhoan());

            return ps.executeUpdate() > 0;

        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean ThemCongViec(CongViec congviec) {
        String sql = "INSERT INTO CongViec(ID, TenCongViec, NgayKhoiTao, NgayHetHan, NgayHoanThanh, MoTaCongViec, TrangThai) VALUES(?, ?, ?, ?, ?, ?, ?)";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, congviec.getID());
            ps.setString(2, congviec.getTenCongViec());
            ps.setDate(3, new java.sql.Date(congviec.getNgayKhoiTao().getTime()));
            ps.setDate(4, new java.sql.Date(congviec.getNgayHetHan().getTime()));
            ps.setString(5, congviec.getNgayHoanThanh());
            ps.setString(6, congviec.getMoTaCongViec());
            ps.setString(7, congviec.getTrangThai());
            return ps.executeUpdate() > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public ArrayList<CongViec> getlistCongViec() {
        ArrayList<CongViec> list = new ArrayList<>();
        String sql = "SELECT * FROM CongViec";

        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                CongViec congviec = new CongViec();
                congviec.setID(rs.getInt("ID"));
                congviec.setTenCongViec(rs.getString("TenCongViec"));
                congviec.setNgayKhoiTao(rs.getDate("NgayKhoiTao"));
                congviec.setNgayHetHan(rs.getDate("NgayHetHan"));
                congviec.setNgayHoanThanh(rs.getString("NgayHoanThanh"));
                congviec.setMoTaCongViec(rs.getString("MoTaCongViec"));
                congviec.setTrangThai(rs.getString("TrangThai"));
                list.add(congviec);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return list;
    }
    public boolean SuaCongViec(CongViec congviec) {
        String sql = "UPDATE CongViec SET TenCongViec = ?, NgayKhoiTao = ?, NgayHetHan = ?, NgayHoanThanh = ?, MoTaCongViec = ?, TrangThai = ? WHERE ID = ?";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, congviec.getTenCongViec());
            ps.setDate(2, new java.sql.Date(congviec.getNgayKhoiTao().getTime()));
            ps.setDate(3, new java.sql.Date(congviec.getNgayHetHan().getTime()));
            ps.setString(4, congviec.getNgayHoanThanh());
            ps.setString(5, congviec.getMoTaCongViec());
            ps.setString(6, congviec.getTrangThai());
            ps.setInt(7, congviec.getID());
            return ps.executeUpdate() > 0;
            
        } catch (Exception e){
            e.printStackTrace();
        }
        return false;
    }
    
    public boolean XoaCongViec(CongViec congviec) {
        String sql = "DELETE FROM CongViec WHERE ID = ?";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, congviec.getID());
            
            return ps.executeUpdate() > 0;
            
        } catch (Exception e){
            e.printStackTrace();
        }
        return false;
    }
    public ArrayList<CongViec> getSelectedCongViec(CongViec congviec){
        ArrayList<CongViec> list = new ArrayList<>();
        String sql = "SELECT * FROM CongViec where TenCongViec = ?";
        
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, congviec.getTenCongViec());
            ResultSet rs = ps.executeQuery();
            while (rs.next()){
                SimpleDateFormat formatDate = new SimpleDateFormat("dd-MM-yyyy");
                CongViec congviec1 = new CongViec();
                congviec1.setID(rs.getInt("ID"));
                congviec1.setTenCongViec(rs.getString("TenCongViec"));
                congviec1.setNgayKhoiTao(rs.getDate("NgayKhoiTao"));
                congviec1.setNgayHetHan(rs.getDate("NgayHetHan"));
                congviec1.setNgayHoanThanh(rs.getString("NgayHoanThanh"));
                congviec1.setMoTaCongViec(rs.getString("MoTaCongViec"));
                congviec1.setTrangThai(rs.getString("TrangThai"));
                list.add(congviec1);
            }
        } catch(Exception e) {
            e.printStackTrace();
        }
        
        return list;
    }
    //List<CongViec> lcv = new ArrayList<>();
    
//hiển thị công việc đã hoàn thành    
    public List<CongViec> CongViecDaHoanThanh(String TrangThai){
        String sql = "SELECT * FROM CongViec WHERE TrangThai=N'"+TrangThai+"'";
        List<CongViec> lcv = new ArrayList<>();
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()){
                CongViec congviec = new CongViec();
                congviec.setID(rs.getInt("ID"));
                congviec.setTenCongViec(rs.getString("TenCongViec"));
                congviec.setNgayKhoiTao(rs.getDate("NgayKhoiTao"));
                congviec.setNgayHetHan(rs.getDate("NgayHetHan"));
                congviec.setNgayHoanThanh(rs.getString("NgayHoanThanh"));
                congviec.setMoTaCongViec(rs.getString("MoTaCongViec"));                
                congviec.setTrangThai(rs.getString("TrangThai"));
                lcv.add(congviec);
            }
        } catch(Exception e) {
            e.printStackTrace();
        }
        return lcv;
    }
//tìm công việc qua trạng thái đã hoàn thành   
    public List<CongViec> TimCongViecQuaTrangThai(String TrangThai, String NgayBatDau, String NgayKetThuc){
        String sql = "SELECT * FROM CongViec WHERE TrangThai=N'"+TrangThai+"' and NgayHoanThanh>='"+NgayBatDau+"' and NgayHoanThanh<='"+NgayKetThuc+"'";
        List<CongViec> lcv = new ArrayList<>();
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()){
                CongViec congviec = new CongViec();
                congviec.setID(rs.getInt("ID"));
                congviec.setTenCongViec(rs.getString("TenCongViec"));
                congviec.setNgayKhoiTao(rs.getDate("NgayKhoiTao"));
                congviec.setNgayHetHan(rs.getDate("NgayHetHan"));
                congviec.setNgayHoanThanh(rs.getString("NgayHoanThanh"));
                congviec.setMoTaCongViec(rs.getString("MoTaCongViec"));
                congviec.setTrangThai(rs.getString("TrangThai"));
                lcv.add(congviec);
            }
        } catch(Exception e) {
            e.printStackTrace();
        }
        return lcv;
    }
    // tìm công việc qua trạng thái cho quá hạn
    public List<CongViec> TimCongViecQuaTrangThai2(String TrangThai, String NgayBatDau, String NgayKetThuc){
        String sql = "SELECT * FROM CongViec WHERE TrangThai=N'"+TrangThai+"' and NgayHetHan>='"+NgayBatDau+"' and NgayHetHan<='"+NgayKetThuc+"'";
        List<CongViec> lcv = new ArrayList<>();
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()){
                CongViec congviec = new CongViec();
                congviec.setID(rs.getInt("ID"));
                congviec.setTenCongViec(rs.getString("TenCongViec"));
                congviec.setNgayKhoiTao(rs.getDate("NgayKhoiTao"));
                congviec.setNgayHetHan(rs.getDate("NgayHetHan"));
                congviec.setNgayHoanThanh(rs.getString("NgayHoanThanh"));
                congviec.setMoTaCongViec(rs.getString("MoTaCongViec"));
                congviec.setTrangThai(rs.getString("TrangThai"));
                lcv.add(congviec);
            }
        } catch(Exception e) {
            e.printStackTrace();
        }
        return lcv;
    }

    

}
