package prog.hei.school.repository.entity;

import jakarta.persistence.*;
import lombok.*;
import prog.hei.school.model.AssetType;

import java.time.Instant;
import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "asset")
@Getter @Setter
@NoArgsConstructor @AllArgsConstructor
public class AssetEntity {

    @Id
    @Column(columnDefinition = "UUID")
    private UUID id;

    private String name;
    private Double price;

    @Enumerated(EnumType.STRING)
    @Column(columnDefinition = "asset_type")
    private AssetType type;

    @ManyToOne
    @JoinColumn(name = "owner_id", nullable = false)
    private UserEntity owner;

    private Instant creationDate;
    private Instant updateDate;

    @OneToMany(mappedBy = "asset", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<RentalEntity> rentals;
}
