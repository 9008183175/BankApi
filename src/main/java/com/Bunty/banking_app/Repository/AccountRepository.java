package com.Bunty.banking_app.Repository;

import com.Bunty.banking_app.Entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account, Long> {
}
