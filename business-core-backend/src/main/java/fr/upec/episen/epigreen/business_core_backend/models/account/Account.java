package fr.upec.episen.epigreen.business_core_backend.models.account;

import fr.upec.episen.epigreen.business_core_backend.models.customer.Customer;
import lombok.Data;
import jakarta.persistence.*;

@Entity
@Data
@Table(name = "account")
public class Account {

    @Id
    @Column(name = "account_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long accountId;

    @Column(name = "mail")
    private String mail;

    @Column(name = "password")
    private String password;

    @ManyToOne
    @JoinColumn(name = "customer_id", referencedColumnName = "customer_id", nullable = false)
    private Customer customer;

    @Column(name = "ecology_points")
    private Integer ecologyPoints;
}
