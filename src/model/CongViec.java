/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
import java.util.Date;

/**
 *
 * @author Acer
 */
public class CongViec {

    private int ID;
    private String TenCongViec;
    private Date NgayKhoiTao;
    private Date NgayHetHan;
    private String NgayHoanThanh;
    private String MoTaCongViec;
    private String TrangThai;

    public CongViec() {

    }

    public CongViec(String TenCongViec) {
        this.TenCongViec = TenCongViec;
    }

    public CongViec(int ID, String TenCongViec, Date NgayKhoiTao, Date NgayHetHan, String NgayHoanThanh, String MoTaCongViec, String TrangThai) {
        this.ID = ID;
        this.TenCongViec = TenCongViec;
        this.NgayKhoiTao = NgayKhoiTao;
        this.NgayHetHan = NgayHetHan;
        this.NgayHoanThanh = NgayHoanThanh;
        this.MoTaCongViec = MoTaCongViec;
        this.TrangThai = TrangThai;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getTenCongViec() {
        return TenCongViec;
    }
    
    public void setTenCongViec(String TenCongViec){
        this.TenCongViec = TenCongViec;
    }
    
    public Date getNgayKhoiTao(){
        return NgayKhoiTao;
    }
    
    public void setNgayKhoiTao(Date NgayKhoiTao){
        this.NgayKhoiTao = NgayKhoiTao;
    }
    
    public Date getNgayHetHan(){
        return NgayHetHan;
    }
    
    public void setNgayHetHan(Date NgayHetHan){
        this.NgayHetHan = NgayHetHan;
    }
    
    public String getNgayHoanThanh(){
        return NgayHoanThanh;
    }
    
    public void setNgayHoanThanh(String NgayHoanThanh){
        this.NgayHoanThanh = NgayHoanThanh;
    }   
    
    public String getMoTaCongViec(){
        return MoTaCongViec;
    }
    
    public void setMoTaCongViec(String MoTaCongViec){
        this.MoTaCongViec = MoTaCongViec;
    }
    
    public String getTrangThai(){
        return TrangThai;
    }
    
    public void setTrangThai(String TrangThai){
        this.TrangThai = TrangThai;
    }
    

}
