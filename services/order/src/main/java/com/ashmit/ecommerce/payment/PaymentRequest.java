package com.ashmit.ecommerce.payment;

import com.ashmit.ecommerce.customer.CustomerResponse;
import com.ashmit.ecommerce.order.PaymentMethod;

public record PaymentRequest(
        String amount,
        PaymentMethod paymentMethod,
        Integer orderId,
        String orderReference,
        CustomerResponse customerResponse,
        String description,
        String currency
) {
}
