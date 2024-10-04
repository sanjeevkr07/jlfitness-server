package com.jlfitness.jlfitness_server.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Data
@NoArgsConstructor
public class Members {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true, nullable = false)
    private String phoneNumber;  // Unique key

    private String billNumber;
    private String firstName;
    private String lastName;

    private String packageType;
    private String packageName;

    @Column(precision = 10, scale = 2)
    private BigDecimal amountPaid;

    @Column(precision = 10, scale = 2)
    private BigDecimal balanceAmount;

    private String paymentType;

    private LocalDate billDate;
    private LocalDate startDate;
    private LocalDate endDate;

    private boolean isMembershipActive;
    private LocalDate remBalDueDate;
    private String remarks;
}
