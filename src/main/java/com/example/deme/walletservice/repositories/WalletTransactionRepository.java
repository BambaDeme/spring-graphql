package com.example.deme.walletservice.repositories;

import com.example.deme.walletservice.entities.Wallet;
import com.example.deme.walletservice.entities.WalletTransaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WalletTransactionRepository extends JpaRepository<WalletTransaction,Long>{
}
