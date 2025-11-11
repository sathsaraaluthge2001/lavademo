package com.lava.lava.entity;

import com.lava.lava.enums.PaidStatus;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "bank_payments")
public class BankPayment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "payroll_id")
    private Payroll payroll;

    private String bankFilePath; // generated file path

    @Enumerated(EnumType.STRING)
    private PaidStatus paidStatus; // PAID, UNPAID

    private LocalDate paidDate;
    private LocalDateTime createdAt;
}
