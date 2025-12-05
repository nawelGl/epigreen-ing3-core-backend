package fr.upec.episen.epigreen.business_core_backend.repositories.product;

import fr.upec.episen.epigreen.business_core_backend.models.product.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.Optional;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

    @Query("SELECT p FROM Product p WHERE p.id = :id")
    Product findProductById(@Param("id") Long id);

    @Query(value = "SELECT * FROM Product p " +
            "WHERE (:section IS NULL OR :section = '' OR p.section = :section) " +
            "AND (:category IS NULL OR :category = '' OR p.category = :category) " +
            "AND (:color IS NULL OR :color = '' OR p.color = :color) " +
            "AND (:size IS NULL OR :size = '' OR p.size = :size) " +
            "AND (:price IS NULL OR p.price = :price)",
            nativeQuery = true)
    List<Product> findProductsByFilters(
            @Param("section") String section,
            @Param("category") String category,
            @Param("color") String color,
            @Param("size") String size,
            @Param("price") Optional<Integer> price
    );

    @Query("SELECT p.ecProcess FROM Product p WHERE p.id = :id")
    Double findECprocessProduct(@Param("id") Long id);

    @Query("SELECT p.ecTransport FROM Product p WHERE p.id = :id")
    Double findECtransportProduct(@Param("id") Long id);

    List<Product> findByIdProductBetween(Long startId, Long endId);

    @Query("SELECT p.carbonfootprint FROM Product p WHERE p.carbonfootprint IS NOT NULL")
    List<Double> findAllCarbonFootprints();

    @Query("SELECT p.waterfootprint FROM Product p WHERE p.waterfootprint IS NOT NULL")
    List<Double> findAllWaterFootprints();
}
