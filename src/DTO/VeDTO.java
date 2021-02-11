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
public class VeDTO {

    private String mave;
    private TourDTO tour;
    private KhachHangDTO khachhang;
    private Date thoigiandat;
    private String trangthai;
    private Float gia;

    public VeDTO() {
    }

    public VeDTO(String mave, TourDTO tour, KhachHangDTO khachhang, Date thoigiandat, String trangthai, Float gia) {
        this.mave = mave;
        this.tour = tour;
        this.khachhang = khachhang;
        this.thoigiandat = thoigiandat;
        this.trangthai = trangthai;
        this.gia = gia;
    }

    public String getMave() {
        return mave;
    }

    public void setMave(String mave) {
        this.mave = mave;
    }

    public TourDTO getTour() {
        return tour;
    }

    public void setTour(TourDTO tour) {
        this.tour = tour;
    }

    public KhachHangDTO getKhachhang() {
        return khachhang;
    }

    public void setKhachhang(KhachHangDTO khachhang) {
        this.khachhang = khachhang;
    }

    public Date getThoigiandat() {
        return thoigiandat;
    }

    public void setThoigiandat(Date thoigiandat) {
        this.thoigiandat = thoigiandat;
    }

    public String getTrangthai() {
        return trangthai;
    }

    public void setTrangthai(String trangthai) {
        this.trangthai = trangthai;
    }

    public Float getGia() {
        return gia;
    }

    public void setGia(Float gia) {
        this.gia = gia;
    }

}
