package pidev.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pidev.entities.Claim;
@Repository
public interface IClaimRepository extends JpaRepository<Claim, Integer> {

}
