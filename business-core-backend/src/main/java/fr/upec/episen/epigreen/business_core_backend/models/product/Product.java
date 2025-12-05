package fr.upec.episen.epigreen.business_core_backend.models.product;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Entity
@Data
@Table(name="product")
public class Product {
    @Getter
    @Id
    @Column(name="product_id")
    private Long idProduct;

    @Getter
    @Setter
    @Column(name="reference")
    private Integer reference;

    @Getter
    @Setter
    @Column(name="section")
    private String section;

    @Getter
    @Setter
    @Column(name="category")
    private String category;

    @Getter
    @Setter
    @Column(name="size")
    private String size;

    @Getter
    @Setter
    @Column(name="color")
    private String color;

    @Getter
    @Setter
    @Column(name="material")
    private String material;


    @Getter
    @Column(name="price")
    private int price;

    @Getter
    @Setter
    @Column(name="carbon_transport")
    private double ecTransport;

    @Getter
    @Setter
    @Column(name="carbonfootprint")
    private Double carbonfootprint;
    @Getter
    @Setter
    @Column(name="carbon_process")
    private Double ecProcess;
    @Getter
    @Setter
    @Column(name="waterfootprint")
    private Double waterfootprint;

    @Getter
    @Setter
    @Column(name="weight")
    private Double weight;

    @Getter
    @Setter
    @Column(name="carbon_score")
    private Character carbonScore;

    @Getter
    @Setter
    @Column(name="waterfoot_score")
    private Character waterfootScore;





    //methode pour imprimer
    @Override
    public String toString() {
        return "Product{" +
                "idProduct=" + idProduct +
                ", reference=" + reference +
                ", section='" + section + '\'' +
                ", category='" + category + '\'' +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                ", material='" + material + '\'' +
                ", price=" + price +
                ", weight=" +weight +
                ", carbonfootprint=" + carbonfootprint +
                ", carbon_process=" + ecProcess +
                ", waterfootprint=" + waterfootprint +
                ", carbon_transport  =" + ecTransport +
                ", carbon_score  =" +carbonScore +
                ", waterfoot_score  =" + waterfootScore +
                '}';
    }
}