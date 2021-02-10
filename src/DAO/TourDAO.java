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

    Boolean addTour(TourDTO kh);

    Boolean editTour(TourDTO kh);

    Boolean removeTour(TourDTO kh);

    ArrayList<TourDTO> searchTourMaTour(String data);

    ArrayList<TourDTO> searchTourTenTour(String data);

    ArrayList<TourDTO> searchTourNgayBD(String data);

    ArrayList<TourDTO> searchTourNgayKT(String data);

    ArrayList<TourDTO> searchTourGia(String data);
}
