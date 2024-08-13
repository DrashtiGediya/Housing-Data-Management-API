package com.Assignment2.Housing.Service;

import com.Assignment2.Housing.Repository.HouseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class HouseServiceUsingHttpResponse {

    @Autowired
    private HouseRepository houseRepository;

        public ResponseEntity<?> GetMax(){
        return new ResponseEntity<>(houseRepository.MAX(), HttpStatus.FOUND);
    }


    public ResponseEntity<?> GetAvg(){
        return new ResponseEntity<>(houseRepository.getAverage(),HttpStatus.FOUND);
    }

    public ResponseEntity<?> GetAvgLoc(){
        return new ResponseEntity<>(houseRepository.getAveLocation(), HttpStatus.FOUND);
    }

    public ResponseEntity<?> GetAvgLoc2(String loc){
        return new ResponseEntity<>(houseRepository.getAveLocation2(loc),HttpStatus.FOUND);
    }
}
