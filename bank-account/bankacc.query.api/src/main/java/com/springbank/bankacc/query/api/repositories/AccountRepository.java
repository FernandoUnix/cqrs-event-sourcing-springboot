package com.springbank.bankacc.query.api.repositories;

import com.springbank.bankacc.core.models.BankAccount;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface AccountRepository extends CrudRepository<BankAccount, String> {
    Optional<BankAccount> findByAccountHolderId(String accountHolderId);

    List<BankAccount> findByBalanceGreaterThan(double balance);

    List<BankAccount> findByBalanceLessThan(double balance);
}
