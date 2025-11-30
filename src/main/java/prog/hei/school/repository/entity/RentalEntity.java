package prog.hei.school.repository.entity;

import jakarta.persistence.*;
import lombok.*;
import prog.hei.school.model.RentalStatus;

import java.time.Instant;
import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "rental")
@Getter @Setter
@NoArgsConstructor @AllArgsConstructor
public class RentalEntity {

    @Id
    @Column(columnDefinition = "UUID")
    private UUID id;

    @ManyToOne
    @JoinColumn(name = "asset_id", nullable = false)
    private AssetEntity asset;

    @ManyToOne
    @JoinColumn(name = "renter_id", nullable = false)
    private UserEntity renter;

    @Enumerated(EnumType.STRING)
    @Column(columnDefinition = "rental_status")
    private RentalStatus status;

    private Instant creationDate;
    private Instant updateDate;

    @OneToMany(mappedBy = "rental", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<PaymentEntity> payments;
}
