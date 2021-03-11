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

    String magia, madd;
    int sotien;
    String denngay, tungay;

    public GiaDTO() {
    }

    public GiaDTO(String magia, String madd, int sotien, String denngay, String tungay) {
        this.magia = magia;
        this.madd = madd;
        this.sotien = sotien;
        this.denngay = denngay;
        this.tungay = tungay;
    }

    public String getMagia() {
        return magia;
    }

    public String getMadd() {
        return madd;
    }

    public int getSotien() {
        return sotien;
    }

    public String getDenngay() {
        return denngay;
    }

    public void setDenngay(String denngay) {
        this.denngay = denngay;
    }

    public String getTungay() {
        return tungay;
    }

    public void setTungay(String tungay) {
        this.tungay = tungay;
    }

    public void setMagia(String magia) {
        this.magia = magia;
    }

    public void setMadd(String magia) {
        this.madd = madd;
    }

    public void setSotien(int sotien) {
        this.sotien = sotien;
    }

}
