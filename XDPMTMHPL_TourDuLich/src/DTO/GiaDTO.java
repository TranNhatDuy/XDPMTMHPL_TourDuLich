/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

/**
 *
 * @author Admin
 */
public class GiaDTO {
    String magia, matour;
    int sotien;
    String ngayden, ngaydi;

    public GiaDTO(String magia, String matour, int sotien, String ngayden, String ngaydi) {
        this.magia = magia;
        this.matour = matour;
        this.sotien = sotien;
        this.ngayden = ngayden;
        this.ngaydi = ngaydi;
    }

    public String getMagia() {
        return magia;
    }

    public String getMatour() {
        return matour;
    }

    public int getSotien() {
        return sotien;
    }

    public String getNgayden() {
        return ngayden;
    }

    public String getNgaydi() {
        return ngaydi;
    }

    public void setMagia(String magia) {
        this.magia = magia;
    }

    public void setMatour(String matour) {
        this.matour = matour;
    }

    public void setSotien(int sotien) {
        this.sotien = sotien;
    }

    public void setNgayden(String ngayden) {
        this.ngayden = ngayden;
    }

    public void setNgaydi(String ngaydi) {
        this.ngaydi = ngaydi;
    }

    
    
    
    
}
