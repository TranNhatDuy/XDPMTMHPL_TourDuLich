/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import DTO.TourDTO;
import java.util.ArrayList;

/**
 *
 * @author Vo Duy Kiet
 */
public interface TourDAO {

    ArrayList<TourDTO> loadDataTour();

    Boolean addTour(TourDTO tour);

    Boolean editTour(TourDTO tour,String data);

    Boolean removeTour(String data);

}
