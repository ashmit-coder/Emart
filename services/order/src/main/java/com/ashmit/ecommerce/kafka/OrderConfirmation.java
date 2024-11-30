package com.ashmit.ecommerce.kafka;

import com.ashmit.ecommerce.customer.CustomerResponse;
import com.ashmit.ecommerce.order.PaymentMethod;
import com.ashmit.ecommerce.product.PurchaseResponse;

import java.math.BigDecimal;
import java.util.List;

public record OrderConfirmation(
        String orderReference,
        BigDecimal totalAmount,
        PaymentMethod paymentMethod,
        CustomerResponse customer,
        List<PurchaseResponse> products
) {
}
