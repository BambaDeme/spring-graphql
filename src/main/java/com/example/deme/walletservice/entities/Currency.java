package com.example.deme.walletservice.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Currency {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String code;

    private String name;
    private String symbol;
    private Double salePrice;
    private Double purchasePrice;

    @OneToMany
    private List<Wallet> walletList;
}
