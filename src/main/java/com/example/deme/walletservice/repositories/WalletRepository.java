package com.example.deme.walletservice.repositories;

import com.example.deme.walletservice.entities.Wallet;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WalletRepository extends JpaRepository<Wallet,String>{
}
