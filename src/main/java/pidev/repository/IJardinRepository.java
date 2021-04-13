package pidev.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pidev.entities.Jardin_enfant;
@Repository
public interface IJardinRepository extends JpaRepository<Jardin_enfant, Integer> {

}
