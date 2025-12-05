package fr.upec.episen.epigreen.business_core_backend.services.store;

import fr.upec.episen.epigreen.business_core_backend.models.store.Store;
import fr.upec.episen.epigreen.business_core_backend.repositories.store.StoreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StoreService{

    @Autowired
    private StoreRepository storeRepository;

    public Store findByIdStore(Long storeId) {
        Optional<Store> optionalStore = storeRepository.findById(storeId);
        return optionalStore.orElse(null);
    }

    public List<Store> findAllStore(){
        return storeRepository.findAll();
    }
}