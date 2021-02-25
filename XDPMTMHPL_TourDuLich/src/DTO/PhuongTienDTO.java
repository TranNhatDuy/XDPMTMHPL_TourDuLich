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
public class PhuongTienDTO {

    private String mapt, tenpt;
    private float gia;

    public PhuongTienDTO() {
    }

    public PhuongTienDTO(String mapt, String tenpt, float gia) {
        this.mapt = mapt;
        this.tenpt = tenpt;
        this.gia = gia;
    }
    
    public PhuongTienDTO(String mapt, String tenpt) {
        this.mapt = mapt;
        this.tenpt = tenpt;
    }

    public String getMapt() {
        return mapt;
    }

    public void setMapt(String mapt) {
        this.mapt = mapt;
    }

    public String getTenpt() {
        return tenpt;
    }

    public void setTenpt(String tenpt) {
        this.tenpt = tenpt;
    }

    public float getGia() {
        return gia;
    }

    public void setGia(float gia) {
        this.gia = gia;
    }

}
