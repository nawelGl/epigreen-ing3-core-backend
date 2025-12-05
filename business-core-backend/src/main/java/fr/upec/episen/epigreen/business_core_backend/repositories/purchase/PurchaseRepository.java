package fr.upec.episen.epigreen.business_core_backend.repositories.purchase;

import fr.upec.episen.epigreen.business_core_backend.models.purchase.Purchase;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PurchaseRepository extends JpaRepository<Purchase, Long> {

}