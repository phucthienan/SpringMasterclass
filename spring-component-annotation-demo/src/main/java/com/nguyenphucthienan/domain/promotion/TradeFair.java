package com.nguyenphucthienan.domain.promotion;

import com.nguyenphucthienan.domain.product.ConsumerProduct;
import com.nguyenphucthienan.domain.product.IndustrialProduct;
import org.springframework.beans.factory.annotation.Autowired;

public class TradeFair {
    // @Autowired
    private IndustrialProduct industrialProduct;

    // @Autowired
    private ConsumerProduct consumerProduct;

    public TradeFair() {
    }

    @Autowired
    public TradeFair(IndustrialProduct industrialProduct, ConsumerProduct consumerProduct) {
        this.industrialProduct = industrialProduct;
        this.consumerProduct = consumerProduct;
    }

    // @Autowired
    // public void setIndustrialProduct(IndustrialProduct industrialProduct) {
    //     this.industrialProduct = industrialProduct;
    // }
    //
    // @Autowired
    // public void setConsumerProduct(ConsumerProduct consumerProduct) {
    //     this.consumerProduct = consumerProduct;
    // }

    public int declareIndustrialProductPrice(IndustrialProduct industrialProduct) {
        return industrialProduct.calculatePrice();
    }

    public int declareConsumerProductPrice(ConsumerProduct consumerProduct) {
        return consumerProduct.calculatePrice();
    }

    public String specialPromotionPricing() {
        String priceInfo = "Industrial Product is priced at $" + declareIndustrialProductPrice(industrialProduct)
                + " and Consumer Product is priced at $" + declareConsumerProductPrice(consumerProduct);
        return priceInfo;
    }
}
