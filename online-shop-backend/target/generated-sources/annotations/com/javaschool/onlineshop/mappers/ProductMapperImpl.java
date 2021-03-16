package com.javaschool.onlineshop.mappers;

import com.javaschool.onlineshop.model.dto.ProductDTO;
import com.javaschool.onlineshop.model.entity.Product;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-03-16T15:11:37+0300",
    comments = "version: 1.3.1.Final, compiler: javac, environment: Java 13.0.3 (Azul Systems, Inc.)"
)
@Component
public class ProductMapperImpl implements ProductMapper {

    @Override
    public ProductDTO productToProductDTO(Product product) {
        if ( product == null ) {
            return null;
        }

        ProductDTO productDTO = new ProductDTO();

        productDTO.setProductId( product.getProductId() );
        productDTO.setProductName( product.getProductName() );
        productDTO.setProductPrice( product.getProductPrice() );
        productDTO.setCategory( product.getCategory() );
        productDTO.setProductBrand( product.getProductBrand() );
        productDTO.setProductModel( product.getProductModel() );
        productDTO.setProductWeight( product.getProductWeight() );
        productDTO.setProductCapacity( product.getProductCapacity() );
        productDTO.setAmountInStock( product.getAmountInStock() );
        productDTO.setActive( product.getActive() );
        productDTO.setProductDescription( product.getProductDescription() );
        productDTO.setProductImage( product.getProductImage() );

        return productDTO;
    }

    @Override
    public Product productDTOToProduct(ProductDTO productDTO) {
        if ( productDTO == null ) {
            return null;
        }

        Product product = new Product();

        product.setProductId( productDTO.getProductId() );
        product.setProductName( productDTO.getProductName() );
        product.setProductPrice( productDTO.getProductPrice() );
        product.setCategory( productDTO.getCategory() );
        product.setProductBrand( productDTO.getProductBrand() );
        product.setProductModel( productDTO.getProductModel() );
        product.setProductWeight( productDTO.getProductWeight() );
        product.setProductCapacity( productDTO.getProductCapacity() );
        product.setAmountInStock( productDTO.getAmountInStock() );
        product.setActive( productDTO.getActive() );
        product.setProductDescription( productDTO.getProductDescription() );
        product.setProductImage( productDTO.getProductImage() );

        return product;
    }
}
