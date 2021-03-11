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

    String matour, tentour, madd, mota;

    public TourDTO() {
        
    }
    
    public TourDTO(String matour, String tentour, String madd, String mota) {
        this.matour = matour;
        this.tentour = tentour;
        this.madd = madd;
        this.mota = mota;
    }

    public String getMatour() {
        return matour;
    }

    public String getTentour() {
        return tentour;
    }

    public String getMadd() {
        return madd;
    }

    public String getMota() {
        return mota;
    }

    public void setMatour(String matour) {
        this.matour = matour;
    }

    public void setTentour(String tentour) {
        this.tentour = tentour;
    }

    public void setMadd(String madd) {
        this.madd = madd;
    }

    public void setMota(String mota) {
        this.mota = mota;
    }

    


   
    

}
