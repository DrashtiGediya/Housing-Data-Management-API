package com.Assignment2.Housing.Controller;

import com.Assignment2.Housing.Model.House;
import com.Assignment2.Housing.Model.ResponseDTO;
import com.Assignment2.Housing.Service.HouseServiceUsingHttpResponse;
import com.Assignment2.Housing.Service.HouseServiceUsingJavaCode;
import com.Assignment2.Housing.Service.HouseServiceUsingSqlQueries;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;

@RestController
@RequestMapping("house")
public class HouseController {

    @Autowired
    private HouseServiceUsingSqlQueries houseServiceUsingSqlQueries;

    @Autowired
    private HouseServiceUsingHttpResponse houseServiceUsingHttpResponse;

    @Autowired
    private HouseServiceUsingJavaCode houseServiceUsingJavaCode;


    @PostMapping("save")
    public void save(@RequestBody List<House> house){
        houseServiceUsingSqlQueries.saveHouseDetails(house);
    }
    @GetMapping("getAll")
    public List<House> getAll(){
        return houseServiceUsingSqlQueries.getAll();
    }
    @GetMapping("avg2")
    public double getAvg2(@RequestParam String loc){
        return houseServiceUsingSqlQueries.getAvgLocation2(loc);
    }
    @GetMapping("getAverage")
    public double getAverage(){
        return houseServiceUsingSqlQueries.getAverage();
    }

    @GetMapping("avgLocation")
    public HashMap<String,Double>  getAvgLocation(){

        return houseServiceUsingSqlQueries.getAvgLoc();
    }

    @GetMapping("maxPrice")
    public long getMax(){
        return houseServiceUsingSqlQueries.GetMax();
    }
    @GetMapping("minPrice")
    public long getMin(){
        return houseServiceUsingSqlQueries.GetMin();
    }
    @GetMapping("avgLocation2")
    public double getAvgLocation(@RequestParam String loc){
        return houseServiceUsingSqlQueries.getAvgLocation2(loc);
    }


     // using http response

//    @GetMapping("maxPrice")
//    public ResponseEntity<?> getMax(){
//        return new ResponseEntity<>(houseServiceUsingHttpResponse.GetMax(), HttpStatus.FOUND);
//    }
//
//    @GetMapping("avg")
//    public ResponseEntity<?> getAvg(){
//        return new ResponseEntity<>(houseServiceUsingHttpResponse.GetAvg(),HttpStatus.FOUND);
//    }
//    @GetMapping("avgLoc")
//    public ResponseEntity<?> getAvgLoc(){
//        return new ResponseEntity<>(houseServiceUsingHttpResponse.GetAvgLoc(),HttpStatus.FOUND);
//    }
//    @GetMapping("avgLoc2")
//    public ResponseEntity<?> getAvgLoc2(@RequestParam String loc){
//        return new ResponseEntity<>(houseServiceUsingHttpResponse.GetAvgLoc2(loc),HttpStatus.FOUND);
//    }



    // using java code

//    @GetMapping("getAverage")
//    public double getAverage(){
//        return houseServiceUsingJavaCode.getAverage();
//    }
//    @GetMapping("avg")
//    public double getAvg(@RequestParam String loc){
//        return houseServiceUsingJavaCode.getAvg2(loc);
//    }
//    @GetMapping("maxPrice")
//    public String  getMax(){
//        return houseServiceUsingJavaCode.getMaxAndMin();
//    }
//

    // ResponseDTO

//    @GetMapping("getAll")
//    public ResponseDTO getAll(){
//        ResponseDTO responseDTO = new ResponseDTO();
//        try {
//            List<House> res = houseService.getAll();
//
//            responseDTO.setBody(res);
//            responseDTO.setMessage("successfully");
//            responseDTO.setStatus(HttpStatus.OK);
//        }catch (Exception e){
//        responseDTO.setBody(null);
//        responseDTO.setErrorMessage("failed"+e.getMessage());
//        responseDTO.setStatus(HttpStatus.INTERNAL_SERVER_ERROR);
//    }
//        return responseDTO;
//    }
//
//    @GetMapping("getAvg")
//    public ResponseDTO getAvg(){
//        ResponseDTO responseDTO = new ResponseDTO();
//        try {
//            double avg = houseService.getAverage();  //type chane in ResponseDTO
//            responseDTO.setBody(avg);
//            responseDTO.setMessage("successfully");
//            responseDTO.setStatus(HttpStatus.OK);
//        }catch (Exception e){
//            responseDTO.setBody(null);
//            responseDTO.setErrorMessage("failed"+e.getMessage());
//            responseDTO.setStatus(HttpStatus.INTERNAL_SERVER_ERROR);
//        }
//        return responseDTO;
//    }

}
