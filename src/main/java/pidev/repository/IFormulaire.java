package pidev.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import pidev.entities.Formulaire;

public interface IFormulaire extends JpaRepository<Formulaire, Integer> {

}
