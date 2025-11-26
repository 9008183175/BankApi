package com.Bunty.banking_app.Service.impl;

import com.Bunty.banking_app.Dto.AccountDto;
import com.Bunty.banking_app.Entity.Account;
import com.Bunty.banking_app.Repository.AccountRepository;
import com.Bunty.banking_app.Service.AccountService;
import com.Bunty.banking_app.mapper.AccountMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public  class AccountServiceimpl implements AccountService {

    private AccountRepository accountRepository;


    public AccountServiceimpl(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
// adfsfs
        //ffdfghh

    }

    @Override
    public AccountDto createAccount(AccountDto accountDto) {
     Account account = AccountMapper.mapToAccount(accountDto);
     Account savedAccount = accountRepository.save(account);
     return AccountMapper.mapToAccountDto(savedAccount);


    }
}
