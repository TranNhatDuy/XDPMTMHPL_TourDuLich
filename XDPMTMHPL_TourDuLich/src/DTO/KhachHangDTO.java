/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

/**
 *
 * @author Vo Duy Kiet
 */
public class KhachHangDTO {

    String makh, tenkh, sdt, ngaysinh, email;

    public KhachHangDTO(String makh, String tenkh, String sdt, String ngaysinh, String email) {
        this.makh = makh;
        this.tenkh = tenkh;
        this.sdt = sdt;
        this.ngaysinh = ngaysinh;
        this.email = email;
    }

    public String getMakh() {
        return makh;
    }

    public String getTenkh() {
        return tenkh;
    }

    public String getSdt() {
        return sdt;
    }

    public String getNgaysinh() {
        return ngaysinh;
    }

    public void setMakh(String makh) {
        this.makh = makh;
    }

    public void setTenkh(String tenkh) {
        this.tenkh = tenkh;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public void setNgaysinh(String ngaysinh) {
        this.ngaysinh = ngaysinh;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }
    
}  