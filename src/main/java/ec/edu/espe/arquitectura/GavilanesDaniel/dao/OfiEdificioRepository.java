package ec.edu.espe.arquitectura.GavilanesDaniel.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import ec.edu.espe.arquitectura.GavilanesDaniel.model.OfiEdificio;
import ec.edu.espe.arquitectura.GavilanesDaniel.model.OfiEdificioPk;

public interface OfiEdificioRepository extends JpaRepository<OfiEdificio, OfiEdificioPk>{
    
    
}
