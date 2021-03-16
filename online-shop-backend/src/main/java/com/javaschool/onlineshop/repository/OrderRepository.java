package com.javaschool.onlineshop.repository;

import com.javaschool.onlineshop.model.dto.StatisticsDTO;
import com.javaschool.onlineshop.model.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {

    List<Order> findOrdersByCustomerEmailAddress(String customerEmail);

    @Query(value = "select new com.javaschool.onlineshop.model.dto.StatisticsDTO (p.category,  SUM(oel.elementPrice)) " +
            "from Order o JOIN" +
            " o.orderElementList oel JOIN" +
            " oel.product p " +
            " WHERE o.date >= :date " +
            " group by p.category")
    List<StatisticsDTO> findSalesSumInEachCategory(@Param("date") LocalDate date);
}
