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
public class User  {
    private String username;
    private String email;
    private UserType userType;
    private String address;
    private String fieldWork;
    private Instant creationDate;
    private Instant updateDate;
}
