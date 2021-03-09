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

    String matour, tentour, mota, maloai, magia;

    public TourDTO(String matour, String tentour, String mota, String maloai, String magia) {
        this.matour = matour;
        this.tentour = tentour;
        this.mota = mota;
        this.maloai = maloai;
        this.magia = magia;
    }

    public String getMatour() {
        return matour;
    }

    public String getTentour() {
        return tentour;
    }

    public String getMota() {
        return mota;
    }

    public String getMaloai() {
        return maloai;
    }

    public String getMagia() {
        return magia;
    }

    public void setMatour(String matour) {
        this.matour = matour;
    }

    public void setTentour(String tentour) {
        this.tentour = tentour;
    }

    public void setMota(String mota) {
        this.mota = mota;
    }

    public void setMaloai(String maloai) {
        this.maloai = maloai;
    }

    public void setMagia(String magia) {
        this.magia = magia;
    }
   


   
    

}
