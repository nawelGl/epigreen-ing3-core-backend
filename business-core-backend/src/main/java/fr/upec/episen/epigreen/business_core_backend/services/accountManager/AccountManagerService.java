package fr.upec.episen.epigreen.business_core_backend.services.accountManager;

import fr.upec.episen.epigreen.business_core_backend.models.account.Account;
import fr.upec.episen.epigreen.business_core_backend.repositories.account.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountManagerService {

    @Autowired
    AccountRepository accountRepository;

    /**
     * Add points to the delivery's related account depending on the delivery's score. This function adds 50 points to the account for an A delivery, 40 points for a B delivery, 20 points for a C delivery, and 5 points for a D delivery (no points added for an E delivery).
     * 
     * @param score
     * @param account
     */
    public void addEcologyPointsDelivery(char score, Account account){
        int accountPoints = 0;
        Object points = account.getEcologyPoints();
        if(points != null){
            String  stringValueOfPoints = String.valueOf(points);
            accountPoints = Integer.valueOf(stringValueOfPoints);
        }
        switch (score){
            case 'A' : accountPoints += 50;
                break;
            case 'B' : accountPoints += 40;
                break;
            case 'C' : accountPoints += 20;
                break;
            case 'D' : accountPoints += 5;
                break;
            default:
                break;
        }
        account.setEcologyPoints(accountPoints);
        accountRepository.save(account);
    }
}