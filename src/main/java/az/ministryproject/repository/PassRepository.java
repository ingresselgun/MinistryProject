package az.ministryproject.repository;

import az.ministryproject.entity.Pass;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PassRepository extends JpaRepository<Pass,Long> {
}
