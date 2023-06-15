package ec.edu.espe.arquitectura.GavilanesDaniel.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import ec.edu.espe.arquitectura.GavilanesDaniel.model.OfiSede;

public interface OfiSedeRepository extends JpaRepository<OfiSede, String>{
    List<OfiSede> findBycodInstitucion (Integer codInstitucionPattern);
    Optional<OfiSede> findBycodInstitucionOpt (Integer codInstitucionPattern);
    
}
