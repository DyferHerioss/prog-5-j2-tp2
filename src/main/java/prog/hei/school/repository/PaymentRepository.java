package prog.hei.school.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import prog.hei.school.model.Payment;

@Repository
public interface PaymentRepository extends JpaRepository<Payment, String> {
}
