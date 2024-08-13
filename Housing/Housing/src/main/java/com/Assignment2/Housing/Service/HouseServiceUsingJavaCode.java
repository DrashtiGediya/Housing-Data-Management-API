package com.Assignment2.Housing.Service;

import com.Assignment2.Housing.Model.House;
import com.Assignment2.Housing.Repository.HouseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class HouseServiceUsingJavaCode {

    @Autowired
    private HouseRepository houseRepository;

    public double getAverage() {
        List<House> list = houseRepository.findAll();

        int n = list.size();
        double sum = 0;
        for (House house : list) {
            sum += house.getSalePrice();
        }
        return sum / n;
    }

    public List<Object[]> getAvgLoc() {
        List<House> list = houseRepository.findAll();
        String locationA = "A";
        double sumA = 0;
        int A = 0;
        String locationB = "B";
        double sumB = 0;
        int B = 0;
        String locationC = "C";
        double sumC = 0;
        int C = 0;
        for (House house : list) {
            if (house.getLocation().equals(locationA)) {
                sumA += house.getSalePrice();
                A++;
            } else if (house.getLocation().equals(locationB)) {
                sumB += house.getSalePrice();
                B++;
            } else {
                sumC += house.getSalePrice();
                C++;
            }
        }
        List<Object[]> ansList = new ArrayList<>();
        ansList.add(new Object[]{locationA, sumA / A});
        ansList.add(new Object[]{locationB, sumB / B});
        ansList.add(new Object[]{locationC, sumC / C});

        return ansList;
    }

    public String getMaxAndMin() {
        long max = Long.MIN_VALUE;
        long min = Long.MAX_VALUE;

        List<House> list = houseRepository.findAll();
        for (House house : list) {
            if (house.getSalePrice() > max) {
                max = house.getSalePrice();
            }

            if (house.getSalePrice() < min) {
                min = house.getSalePrice();
            }
        }
        return "MaxSalePrice = " + max + "    " + "MinSalePrice = " + min;
    }

    public double getAvg2(String loc) {
        List<House> list = houseRepository.findAll();
        double sum = 0;
        int c = 0;

        for (House house : list) {
            if (house.getLocation().equals(loc)) {
                sum += house.getSalePrice();
                c++;
            }
        }
        return sum / c;
    }
}
