package com.zey.sm.model;

import javax.persistence.Column;
import javax.persistence.Table;

@Table(name = "PRODUCT_CLASSIFICATION")
public class Product {

    @Column(name = "productClassificationName")
    private String productClassificationName;

    @Column(name = "productId")
    private String productId;


    public String getProductClassificationName() {
        return productClassificationName;
    }

    public void setProductClassificationName(String productClassificationName) {
        this.productClassificationName = productClassificationName;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }
}
