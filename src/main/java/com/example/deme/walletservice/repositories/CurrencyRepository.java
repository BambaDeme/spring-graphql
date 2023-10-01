package com.example.deme.walletservice.repositories;

import com.example.deme.walletservice.entities.Currency;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CurrencyRepository extends JpaRepository<Currency,String>{
}
