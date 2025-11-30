package prog.hei.school.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.Instant;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
@EqualsAndHashCode
public class Rental{
    private String id;
    private Asset asset;
    private User renter;
    private RentalStatus status;
    private Instant creationDate;
    private Instant updateDate;
}