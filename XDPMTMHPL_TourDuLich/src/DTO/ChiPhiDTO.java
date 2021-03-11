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
public class ChiPhiDTO {
    String macp, madoan;
    int tongcp;
    String chitiet;

    public ChiPhiDTO(String macp, String madoan, int tongcp, String chitiet) {
        this.macp = macp;
        this.madoan = madoan;
        this.tongcp = tongcp;
        this.chitiet = chitiet;
    }

    public String getMacp() {
        return macp;
    }

    public String getMadoan() {
        return madoan;
    }

    public int getTongcp() {
        return tongcp;
    }

    public String getChitiet() {
        return chitiet;
    }

    public void setMacp(String macp) {
        this.macp = macp;
    }

    public void setMadoan(String madoan) {
        this.madoan = madoan;
    }

    public void setTongcp(int tongcp) {
        this.tongcp = tongcp;
    }

    public void setChitiet(String chitiet) {
        this.chitiet = chitiet;
    }
    
}
