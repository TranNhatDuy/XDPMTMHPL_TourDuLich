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
public class KhachSanDTO {

    private String maks, tenks;
    private float gia;

    public KhachSanDTO() {
    }

    public KhachSanDTO(String maks, String tenks, float gia) {
        this.maks = maks;
        this.tenks = tenks;
        this.gia = gia;
    }

    public KhachSanDTO(String maks, String tenks) {
        this.maks = maks;
        this.tenks = tenks;
    }
    
    public String getMaks() {
        return maks;
    }

    public void setMaks(String maks) {
        this.maks = maks;
    }

    public String getTenks() {
        return tenks;
    }

    public void setTenks(String tenks) {
        this.tenks = tenks;
    }

    public float getGia() {
        return gia;
    }

    public void setGia(float gia) {
        this.gia = gia;
    }

}
