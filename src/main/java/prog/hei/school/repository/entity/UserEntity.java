package prog.hei.school.repository.entity;

import jakarta.persistence.*;
import lombok.*;
import prog.hei.school.model.UserType;

import java.time.Instant;
import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "\"user\"")
@Getter @Setter
@NoArgsConstructor @AllArgsConstructor
public class UserEntity {

    @Id
    @Column(columnDefinition = "UUID")
    private UUID id;

    private String name;
    private String email;

    @Column(name = "work_field")
    private String fieldWork;

    private String address;

    @Enumerated(EnumType.STRING)
    @Column(columnDefinition = "user_type")
    private UserType userType;

    private Instant creationDate;
    private Instant updateDate;

    @OneToMany(mappedBy = "owner", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<AssetEntity> assets;

    @OneToMany(mappedBy = "renter", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<RentalEntity> rentals;
}
