package com.ashmit.ecommerce.payment;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@Entity
@EntityListeners(AuditingEntityListener.class)
@Table(name = "payment")
public class Payment {
    @Id
    @GeneratedValue
    private Integer id;
    private String amount;
    @Enumerated(EnumType.STRING)
    private PaymentMethod paymentMethod;
    private Integer orderId;
    private String description;
    private String currency;
    @CreatedDate
    @Column(updatable = false, nullable = false)
    private LocalDateTime createdDate;
//    @LastModifiedDate
//    @Column(insertable = false)
//    private LocalDateTime lastModifiedDate;
}
