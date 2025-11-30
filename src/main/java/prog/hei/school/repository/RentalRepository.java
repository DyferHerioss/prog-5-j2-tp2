package prog.hei.school.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import prog.hei.school.model.Rental;

@Repository
public interface RentalRepository extends JpaRepository<Rental, String> {
}
