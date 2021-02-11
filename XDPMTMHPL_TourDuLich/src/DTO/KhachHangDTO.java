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

    private String makh, tenkh, sdt, diachi;

    public KhachHangDTO() {
    }

    public KhachHangDTO(String makh, String tenkh, String sdt, String diachi) {
        this.makh = makh;
        this.tenkh = tenkh;
        this.sdt = sdt;
        this.diachi = diachi;
    }

    public String getMakh() {
        return makh;
    }

    public void setMakh(String makh) {
        this.makh = makh;
    }

    public String getTenkh() {
        return tenkh;
    }

    public void setTenkh(String tenkh) {
        this.tenkh = tenkh;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

}
