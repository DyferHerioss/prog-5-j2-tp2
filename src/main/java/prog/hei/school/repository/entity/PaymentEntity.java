package prog.hei.school.repository.entity;

import jakarta.persistence.*;
import lombok.*;
import prog.hei.school.model.Rental;

import java.time.Instant;
import java.util.UUID;

@Entity
@Table(name = "payment")
@Getter @Setter
@NoArgsConstructor @AllArgsConstructor
public class PaymentEntity {

    @Id
    @Column(columnDefinition = "UUID")
    private UUID id;

    @ManyToOne
    @JoinColumn(name = "rental_id")
    private Rental rental;

    private Double paidAmount;

    private Instant creationDate;
    private Instant updateDate;
}
