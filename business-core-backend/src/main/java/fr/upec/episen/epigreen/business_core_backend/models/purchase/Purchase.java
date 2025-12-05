package fr.upec.episen.epigreen.business_core_backend.models.purchase;

import lombok.Data;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Data
@Table(name = "purchase")
public class Purchase {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "purchase_id")
    private Long idPurchase;

    @Column(name= "customer_id")
    private Long idCustomer;

    @Column(name = "total")
    private int priceTotal;

    @Column(name = "address_delivery")
    private String addrDelivery;

    @Column(name = "purchase_date")
    private Date datePurchase;

    @Column(name = "products_id")
    private String productsIdRaw; // ID list as comma-separated string\

    @Override
    public String toString() {
        return "Purchase{" +
                "idPurchase=" + idPurchase +
                ", total=" + priceTotal +
                ", address_delivery='" + addrDelivery + '\'' +
                ", purchase_date=" + datePurchase +
                ", products=" + productsIdRaw +
                '}';
    }
}
