package com.jlfitness.jlfitness_server.dto;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDate;

@Data
@NoArgsConstructor
public class MembersDto {

    @NotBlank(message = "Phone number is required")
    @Size(min = 10, max = 15, message = "Phone number should be between 10 and 15 characters")
    private String phoneNumber;

    @NotBlank(message = "Bill number is required")
    private String billNumber;

    @NotBlank(message = "First name is required")
    private String firstName;

    @NotBlank(message = "Last name is required")
    private String lastName;

    @NotBlank(message = "Package type is required")
    private String packageType;

    @NotBlank(message = "Package name is required")
    private String packageName;

    @NotNull(message = "Amount paid is required")
    @DecimalMin(value = "0.0", inclusive = false, message = "Amount paid must be greater than 0")
    private BigDecimal amountPaid;

    @NotNull(message = "Balance amount is required")
    @DecimalMin(value = "0.0", message = "Balance amount cannot be negative")
    private BigDecimal balanceAmount;

    @NotBlank(message = "Payment type is required")
    private String paymentType;

    @NotNull(message = "Bill date is required")
    private LocalDate billDate;

    @NotNull(message = "Start date is required")
    private LocalDate startDate;

    @NotNull(message = "End date is required")
    private LocalDate endDate;

    @NotNull(message = "Membership status is required")
    private Boolean isMembershipActive;

    private LocalDate remBalDueDate;

    private String remarks;
}


