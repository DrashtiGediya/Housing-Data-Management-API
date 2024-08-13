package com.Assignment2.Housing.Service;
import com.Assignment2.Housing.Model.House;
import com.Assignment2.Housing.Repository.HouseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Service
public class HouseServiceUsingSqlQueries {
    @Autowired
    private HouseRepository houseRepository;

    public void saveHouseDetails(List<House> house) {
        houseRepository.saveAll(house);
    }

    public List<House> getAll() {
        return houseRepository.findAll();
    }

//
    public double getAverage(){
        return houseRepository.getAverage();
    }

    public HashMap<String,Double> getAvgLoc(){

        List<Object[]> list = houseRepository.getAveLocation();
        HashMap<String,Double> map = new HashMap<>();
        for(Object[] o:list){
            String location = (String) o[0];
            BigDecimal avg = (BigDecimal) o[1];
            map.put(location,Double.parseDouble(String.valueOf(avg)));
        }

        return map;
    }

    public long GetMax(){
        return houseRepository.MAX();
    }

    public long GetMin(){

        return houseRepository.MIN();
    }

    public double getAvgLocation2(String loc) {

        return houseRepository.getAveLocation2(loc);
    }



    // ResponseDTO

    // public List<House> getAll(){
    // int r = 10/0;
    //        return houseRepository.findAll();
    //    }
}
