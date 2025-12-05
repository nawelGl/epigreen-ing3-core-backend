package fr.upec.episen.epigreen.business_core_backend.services.purchase;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import fr.upec.episen.epigreen.business_core_backend.models.purchase.Purchase;
import fr.upec.episen.epigreen.business_core_backend.repositories.purchase.PurchaseRepository;

@Service
public class PurchaseService {
    
    @Autowired
    private PurchaseRepository purchaseRepository;

    public List<Purchase> findAllPurchase(){
        return purchaseRepository.findAll();
    }
}
