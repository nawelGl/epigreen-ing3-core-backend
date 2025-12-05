package fr.upec.episen.epigreen.business_core_backend.models.store;

import lombok.Data;
import jakarta.persistence.*;

@Entity
@Data
@Table(name = "store")
public class Store{

    @Id
    @Column(name="store_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long storeId;

    @Column(name = "name")
    private String name;

    @Column(name = "address")
    private String address;
}