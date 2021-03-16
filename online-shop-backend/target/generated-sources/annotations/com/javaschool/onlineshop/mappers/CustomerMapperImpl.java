package com.javaschool.onlineshop.mappers;

import com.javaschool.onlineshop.model.dto.CustomerDTO;
import com.javaschool.onlineshop.model.entity.Customer;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-03-16T15:11:36+0300",
    comments = "version: 1.3.1.Final, compiler: javac, environment: Java 13.0.3 (Azul Systems, Inc.)"
)
@Component
public class CustomerMapperImpl implements CustomerMapper {

    @Override
    public CustomerDTO customerToCustomerDTO(Customer customer) {
        if ( customer == null ) {
            return null;
        }

        CustomerDTO customerDTO = new CustomerDTO();

        customerDTO.setCustomerId( customer.getCustomerId() );
        customerDTO.setCustomerFirstName( customer.getCustomerFirstName() );
        customerDTO.setCustomerLastName( customer.getCustomerLastName() );
        customerDTO.setCustomerDateOfBirth( customer.getCustomerDateOfBirth() );
        customerDTO.setCustomerEmailAddress( customer.getCustomerEmailAddress() );
        customerDTO.setCustomerPassword( customer.getCustomerPassword() );
        customerDTO.setRole( customer.getRole() );
        customerDTO.setActive( customer.getActive() );
        customerDTO.setPhoneNumber( customer.getPhoneNumber() );
        customerDTO.setCountry( customer.getCountry() );
        customerDTO.setCity( customer.getCity() );
        customerDTO.setPostcode( customer.getPostcode() );
        customerDTO.setStreet( customer.getStreet() );
        customerDTO.setBuilding( customer.getBuilding() );
        customerDTO.setRoom( customer.getRoom() );

        return customerDTO;
    }

    @Override
    public Customer customerDTOToCustomer(CustomerDTO customerDTO) {
        if ( customerDTO == null ) {
            return null;
        }

        Customer customer = new Customer();

        customer.setCustomerId( customerDTO.getCustomerId() );
        customer.setCustomerFirstName( customerDTO.getCustomerFirstName() );
        customer.setCustomerLastName( customerDTO.getCustomerLastName() );
        customer.setCustomerDateOfBirth( customerDTO.getCustomerDateOfBirth() );
        customer.setCustomerEmailAddress( customerDTO.getCustomerEmailAddress() );
        customer.setCustomerPassword( customerDTO.getCustomerPassword() );
        customer.setRole( customerDTO.getRole() );
        customer.setActive( customerDTO.getActive() );
        customer.setPhoneNumber( customerDTO.getPhoneNumber() );
        customer.setCountry( customerDTO.getCountry() );
        customer.setCity( customerDTO.getCity() );
        customer.setPostcode( customerDTO.getPostcode() );
        customer.setStreet( customerDTO.getStreet() );
        customer.setBuilding( customerDTO.getBuilding() );
        customer.setRoom( customerDTO.getRoom() );

        return customer;
    }
}
