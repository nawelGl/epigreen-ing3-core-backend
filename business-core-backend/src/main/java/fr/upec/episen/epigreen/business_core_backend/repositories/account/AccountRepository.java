package fr.upec.episen.epigreen.business_core_backend.repositories.account;

import fr.upec.episen.epigreen.business_core_backend.models.account.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepository  extends JpaRepository<Account, Long> {
}
