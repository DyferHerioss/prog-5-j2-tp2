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
public class Asset{
    private String id;
    private String name;
    private Double price;
    private AssetType type;
    private User owner;
    private Instant creationDate;
    private Instant updateDate;
}
