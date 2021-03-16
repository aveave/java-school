package com.javaschool.onlineshop.mappers;

import com.javaschool.onlineshop.model.dto.OrderElementDTO;
import com.javaschool.onlineshop.model.entity.OrderElement;
import javax.annotation.Generated;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-03-16T15:11:36+0300",
    comments = "version: 1.3.1.Final, compiler: javac, environment: Java 13.0.3 (Azul Systems, Inc.)"
)
@Component
public class OrderElementMapperImpl implements OrderElementMapper {

    @Autowired
    private ProductMapper productMapper;

    @Override
    public OrderElementDTO mapOrderElementToDTO(OrderElement orderElement) {
        if ( orderElement == null ) {
            return null;
        }

        OrderElementDTO orderElementDTO = new OrderElementDTO();

        orderElementDTO.setOrderItemId( orderElement.getOrderItemId() );
        orderElementDTO.setProduct( productMapper.productToProductDTO( orderElement.getProduct() ) );
        orderElementDTO.setQuantityInOrder( orderElement.getQuantityInOrder() );
        orderElementDTO.setElementPrice( orderElement.getElementPrice() );

        return orderElementDTO;
    }

    @Override
    public OrderElement mapOrderElementToOrderDTO(OrderElementDTO orderElementDTO) {
        if ( orderElementDTO == null ) {
            return null;
        }

        OrderElement orderElement = new OrderElement();

        orderElement.setOrderItemId( orderElementDTO.getOrderItemId() );
        orderElement.setProduct( productMapper.productDTOToProduct( orderElementDTO.getProduct() ) );
        orderElement.setQuantityInOrder( orderElementDTO.getQuantityInOrder() );
        orderElement.setElementPrice( orderElementDTO.getElementPrice() );

        return orderElement;
    }
}
