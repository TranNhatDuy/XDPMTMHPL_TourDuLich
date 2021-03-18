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

    String magia;
    int sotien;
    String denngay, tungay;
    TourDTO tour;

    public GiaDTO() {
    }

    public GiaDTO(String magia, TourDTO tour, int sotien, String tungay, String denngay) {
        this.magia = magia;
        this.tour = tour;
        this.sotien = sotien;
        this.tungay = tungay;
        this.denngay = denngay;
    }

    public String getMagia() {
        return magia;
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

    public TourDTO getTour() {
        return tour;
    }

    public void setTour(TourDTO tour) {
        this.tour = tour;
    }



    public void setSotien(int sotien) {
        this.sotien = sotien;
    }

}
