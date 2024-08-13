package com.Assignment2.Housing.Repository;

import com.Assignment2.Housing.Model.House;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.swing.plaf.PanelUI;
import java.math.BigDecimal;
import java.util.List;

@Repository
public interface HouseRepository extends JpaRepository<House,Integer> {

    @Query(value = "SELECT avg(sale_price) FROM house",nativeQuery = true)
    public double getAverage();

    @Query(value = "SELECT location, avg(sale_price) FROM house group by location",nativeQuery = true)
    public List<Object[]> getAveLocation();

    @Query(value = "SELECT max(sale_price) FROM house",nativeQuery = true)
    public long MAX();

    @Query(value = "SELECT min(sale_price) FROM house",nativeQuery = true)
    public long MIN();

    @Query(value = "SELECT avg(sale_price) FROM house  WHERE location = ?",nativeQuery = true)
    public double getAveLocation2(String loc);
}
