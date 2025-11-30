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
public class Payment {
    private String id;
    private Rental rental;
    private Double paidAmount;
    private Instant creationDate;
    private Instant updateDate;
}
