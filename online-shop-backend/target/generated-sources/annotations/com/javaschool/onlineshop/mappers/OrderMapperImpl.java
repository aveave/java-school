package com.javaschool.onlineshop.mappers;

import com.javaschool.onlineshop.model.dto.OrderDTO;
import com.javaschool.onlineshop.model.dto.OrderElementDTO;
import com.javaschool.onlineshop.model.entity.Order;
import com.javaschool.onlineshop.model.entity.OrderElement;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-03-16T15:11:37+0300",
    comments = "version: 1.3.1.Final, compiler: javac, environment: Java 13.0.3 (Azul Systems, Inc.)"
)
@Component
public class OrderMapperImpl implements OrderMapper {

    @Autowired
    private OrderElementMapper orderElementMapper;

    @Override
    public OrderDTO orderToOrderDTO(Order order) {
        if ( order == null ) {
            return null;
        }

        OrderDTO orderDTO = new OrderDTO();

        orderDTO.setOrderId( order.getOrderId() );
        orderDTO.setTotal( order.getTotal() );
        orderDTO.setCountry( order.getCountry() );
        orderDTO.setCity( order.getCity() );
        orderDTO.setPostcode( order.getPostcode() );
        orderDTO.setStreet( order.getStreet() );
        orderDTO.setBuilding( order.getBuilding() );
        orderDTO.setRoom( order.getRoom() );
        orderDTO.setCustomerEmailAddress( order.getCustomerEmailAddress() );
        orderDTO.setPaymentMethod( order.getPaymentMethod() );
        orderDTO.setShippingType( order.getShippingType() );
        orderDTO.setStatus( order.getStatus() );
        orderDTO.setOrderElementList( orderElementListToOrderElementDTOList( order.getOrderElementList() ) );
        orderDTO.setDate( order.getDate() );
        orderDTO.setCustomerFirstName( order.getCustomerFirstName() );
        orderDTO.setCustomerLastName( order.getCustomerLastName() );

        return orderDTO;
    }

    @Override
    public Order orderDTOToOrder(OrderDTO orderInfoDTO) {
        if ( orderInfoDTO == null ) {
            return null;
        }

        Order order = new Order();

        order.setOrderId( orderInfoDTO.getOrderId() );
        order.setTotal( orderInfoDTO.getTotal() );
        order.setCountry( orderInfoDTO.getCountry() );
        order.setCity( orderInfoDTO.getCity() );
        order.setPostcode( orderInfoDTO.getPostcode() );
        order.setStreet( orderInfoDTO.getStreet() );
        order.setBuilding( orderInfoDTO.getBuilding() );
        order.setRoom( orderInfoDTO.getRoom() );
        order.setCustomerEmailAddress( orderInfoDTO.getCustomerEmailAddress() );
        order.setPaymentMethod( orderInfoDTO.getPaymentMethod() );
        order.setShippingType( orderInfoDTO.getShippingType() );
        order.setStatus( orderInfoDTO.getStatus() );
        order.setOrderElementList( orderElementDTOListToOrderElementList( orderInfoDTO.getOrderElementList() ) );
        order.setDate( orderInfoDTO.getDate() );
        order.setCustomerFirstName( orderInfoDTO.getCustomerFirstName() );
        order.setCustomerLastName( orderInfoDTO.getCustomerLastName() );

        return order;
    }

    protected List<OrderElementDTO> orderElementListToOrderElementDTOList(List<OrderElement> list) {
        if ( list == null ) {
            return null;
        }

        List<OrderElementDTO> list1 = new ArrayList<OrderElementDTO>( list.size() );
        for ( OrderElement orderElement : list ) {
            list1.add( orderElementMapper.mapOrderElementToDTO( orderElement ) );
        }

        return list1;
    }

    protected List<OrderElement> orderElementDTOListToOrderElementList(List<OrderElementDTO> list) {
        if ( list == null ) {
            return null;
        }

        List<OrderElement> list1 = new ArrayList<OrderElement>( list.size() );
        for ( OrderElementDTO orderElementDTO : list ) {
            list1.add( orderElementMapper.mapOrderElementToOrderDTO( orderElementDTO ) );
        }

        return list1;
    }
}
