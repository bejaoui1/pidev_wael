package pidev.repository;

import org.hibernate.annotations.Polymorphism;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pidev.entities.Admin;

@Repository
public interface IAdminRepository extends JpaRepository<Admin, Integer>{

}
