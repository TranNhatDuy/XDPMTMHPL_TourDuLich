/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

import java.sql.Date;

/**
 *
 * @author Vo Duy Kiet
 */
public class TourDTO {

    private String matour, tentour;
    private Date ngaybd, ngaykt;
    private float gia;
    private int soluong;
    private String phuongtien;
    private String khachsan;

    public TourDTO() {
    }

    public TourDTO(String matour, String tentour, Date ngaybd, Date ngaykt, float gia, int soluong, String phuongtien, String khachsan) {
        this.matour = matour;
        this.tentour = tentour;
        this.ngaybd = ngaybd;
        this.ngaykt = ngaykt;
        this.gia = gia;
        this.soluong = soluong;
        this.phuongtien = phuongtien;
        this.khachsan = khachsan;
    }

    public String getMatour() {
        return matour;
    }

    public void setMatour(String matour) {
        this.matour = matour;
    }

    public String getTentour() {
        return tentour;
    }

    public void setTentour(String tentour) {
        this.tentour = tentour;
    }

    public Date getNgaybd() {
        return ngaybd;
    }

    public void setNgaybd(Date ngaybd) {
        this.ngaybd = ngaybd;
    }

    public Date getNgaykt() {
        return ngaykt;
    }

    public void setNgaykt(Date ngaykt) {
        this.ngaykt = ngaykt;
    }

    public float getGia() {
        return gia;
    }

    public void setGia(float gia) {
        this.gia = gia;
    }

    public int getSoluong() {
        return soluong;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }

    public String getPhuongtien() {
        return phuongtien;
    }

    public void setPhuongtien(String phuongtien) {
        this.phuongtien = phuongtien;
    }

    public String getKhachsan() {
        return khachsan;
    }

    public void setKhachsan(String khachsan) {
        this.khachsan = khachsan;
    }

    

}
