package com.imooc.product.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.imooc.product.dataobject.ProductInfo;
import lombok.Data;

import java.util.List;

@Data
public class ProductVo {

    @JsonProperty("name")
    private String categoryName;

    @JsonProperty("type")
    private Integer categoryType;

    @JsonProperty("foods")
    List<ProductInfo> productInfoList;
}
