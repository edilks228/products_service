package edil.secure.product_service.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Table(name = "unit_of_measurement")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UnitOfMeasurement {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "unit_id")
    private Integer id;

    @Column(nullable = false)
    private String name;

    @OneToMany(mappedBy = "unitOfMeasurement", cascade = CascadeType.ALL, orphanRemoval = true)
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private List<Product> products;
}