package fr.upec.episen.epigreen.business_core_backend.services.account;

import fr.upec.episen.epigreen.business_core_backend.models.account.Account;
import fr.upec.episen.epigreen.business_core_backend.repositories.account.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AccountService {

    @Autowired
    private AccountRepository accountRepository;

    public Account findByIdAccount(Long idAccount) {
        Optional<Account> optionalAccount = accountRepository.findById(idAccount);
        return optionalAccount.orElse(null);
    }

    public List<Account> findAllAccount(){
        return accountRepository.findAll();
    }

}
