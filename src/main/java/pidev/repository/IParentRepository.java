package pidev.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pidev.entities.Parent;
@Repository
public interface IParentRepository extends JpaRepository<Parent,Integer> {

}
