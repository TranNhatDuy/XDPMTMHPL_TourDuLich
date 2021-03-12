/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import DAL.DoanDAL;
import DTO.DoanDTO;
import java.util.ArrayList;

/**
 *
 * @author HUYNHVIETBINH
 */
public class DoanBLL {
    public static ArrayList<DoanDTO> loadDataDoan() {
        DoanDAL nv = new DoanDAL();
        return nv.loadDataDoan();
    }
}
