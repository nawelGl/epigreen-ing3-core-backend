package fr.upec.episen.epigreen.business_core_backend.repositories.store;

import fr.upec.episen.epigreen.business_core_backend.models.store.Store;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StoreRepository extends JpaRepository<Store, Long> {

}