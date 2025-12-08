package com.synerge.order101.product.model.dto;

import com.synerge.order101.product.model.entity.ProductCategory;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ProductListRes {
    private Long productId;
    private String productCode;
    private String productName;
    private BigDecimal price;
    private Boolean status;

    private Long categoryId;
    private String categoryName;
    private String categoryLevel;
}
