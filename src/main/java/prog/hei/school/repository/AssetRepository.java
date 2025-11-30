package prog.hei.school.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import prog.hei.school.model.Asset;

public interface AssetRepository extends JpaRepository<Asset, String> {
}
