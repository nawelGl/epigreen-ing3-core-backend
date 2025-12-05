package fr.upec.episen.epigreen.business_core_backend.controllers.purchase;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import fr.upec.episen.epigreen.business_core_backend.models.purchase.Purchase;
import fr.upec.episen.epigreen.business_core_backend.services.purchase.PurchaseService;

@RestController
@RequestMapping("purchase")
public class PurchaseController {
    @Autowired
    private PurchaseService purchaseService;

    @GetMapping("all")
    public ResponseEntity<List<Purchase>> findAllPurchases(){
        return new ResponseEntity<>(purchaseService.findAllPurchase(), HttpStatus.OK);
    }
}
