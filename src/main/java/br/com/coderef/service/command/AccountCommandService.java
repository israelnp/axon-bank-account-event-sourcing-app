package br.com.coderef.service.command;

import br.com.coderef.dto.command.AccountCreateDTO;
import br.com.coderef.dto.command.MoneyCreditDTO;
import br.com.coderef.dto.command.MoneyDebitDTO;

import java.util.concurrent.CompletableFuture;

public interface AccountCommandService {

    public CompletableFuture<String> createAccount(AccountCreateDTO accountCreateDTO);
    public CompletableFuture<String> creditMoneyToAccount(String accountNumber, MoneyCreditDTO moneyCreditDTO);
    public CompletableFuture<String> debitMoneyFromAccount(String accountNumber, MoneyDebitDTO moneyDebitDTO);
}