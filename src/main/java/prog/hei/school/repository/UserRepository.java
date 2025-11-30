package prog.hei.school.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import prog.hei.school.model.User;

public interface UserRepository extends JpaRepository<User, String> {
}
