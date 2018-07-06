package com.nguyenphucthienan.domain.promotion;

import com.nguyenphucthienan.domain.product.ConsumerProduct;
import com.nguyenphucthienan.domain.product.IndustrialProduct;

public class TradeFair {
    private IndustrialProduct industrialProduct;
    private ConsumerProduct consumerProduct;

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
