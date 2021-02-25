/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

/**
 *
 * @author Win 10
 */
public class NhanVienDTO {
    private String MaNV, TenNV, SDT, DiaChi, NhiemVu;
    public NhanVienDTO(){
        
    }

    public NhanVienDTO(String MaNV, String TenNV, String SDT, String DiaChi, String NhiemVu) {
        this.MaNV = MaNV;
        this.TenNV = TenNV;
        this.SDT = SDT;
        this.DiaChi = DiaChi;
        this.NhiemVu = NhiemVu;
    }

    public String getMaNV() {
        return MaNV;
    }

    public String getTenNV() {
        return TenNV;
    }

    public String getSDT() {
        return SDT;
    }

    public String getDiaChi() {
        return DiaChi;
    }

    public String getNhiemVu() {
        return NhiemVu;
    }

    public void setMaNV(String MaNV) {
        this.MaNV = MaNV;
    }

    public void setTenNV(String TenNV) {
        this.TenNV = TenNV;
    }

    public void setSDT(String SDT) {
        this.SDT = SDT;
    }

    public void setDiaChi(String DiaChi) {
        this.DiaChi = DiaChi;
    }

    public void setNhiemVu(String NhiemVu) {
        this.NhiemVu = NhiemVu;
    }
}