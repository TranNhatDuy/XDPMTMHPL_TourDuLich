/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import DAO.TourDAOImp;
import DTO.TourDTO;
import java.util.ArrayList;

/**
 *
 * @author Vo Duy Kiet
 */
public class TourBLL {
    private TourDAOImp tourimp=new TourDAOImp();
    ArrayList<TourDTO> loadDataTour(){
        return tourimp.loadDataTour();
    }
    Boolean addTour(TourDTO tour){
        return tourimp.addTour(tour);
    }
    Boolean editTour(TourDTO tour,String data){
        return tourimp.editTour(tour,data);
    }
    Boolean removeTour(String data){
        return tourimp.removeTour(data);
    }
}
