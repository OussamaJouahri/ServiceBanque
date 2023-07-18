package org.Ouss.bankaccountservice.service;

import org.Ouss.bankaccountservice.dto.BankAccountRequestDTO;
import org.Ouss.bankaccountservice.dto.BankAccountResponseDTO;

public interface AccountService {
     BankAccountResponseDTO addAccount(BankAccountRequestDTO bankAccountDTO) ;



}
