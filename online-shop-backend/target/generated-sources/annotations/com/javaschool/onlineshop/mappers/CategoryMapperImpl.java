package com.javaschool.onlineshop.mappers;

import com.javaschool.onlineshop.model.dto.CategoryDTO;
import com.javaschool.onlineshop.model.entity.Category;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-03-16T15:11:36+0300",
    comments = "version: 1.3.1.Final, compiler: javac, environment: Java 13.0.3 (Azul Systems, Inc.)"
)
@Component
public class CategoryMapperImpl implements CategoryMapper {

    @Override
    public CategoryDTO categoryToCategoryDTO(Category category) {
        if ( category == null ) {
            return null;
        }

        CategoryDTO categoryDTO = new CategoryDTO();

        categoryDTO.setCategoryId( category.getCategoryId() );
        categoryDTO.setCategoryName( category.getCategoryName() );

        return categoryDTO;
    }

    @Override
    public Category categoryDTOToCategory(CategoryDTO categoryDTO) {
        if ( categoryDTO == null ) {
            return null;
        }

        Category category = new Category();

        category.setCategoryId( categoryDTO.getCategoryId() );
        category.setCategoryName( categoryDTO.getCategoryName() );

        return category;
    }
}
