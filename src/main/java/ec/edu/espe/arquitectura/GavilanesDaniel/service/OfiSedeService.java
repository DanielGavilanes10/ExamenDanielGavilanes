package ec.edu.espe.arquitectura.GavilanesDaniel.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import ec.edu.espe.arquitectura.GavilanesDaniel.dao.OfiSedeRepository;
import ec.edu.espe.arquitectura.GavilanesDaniel.model.OfiSede;
import jakarta.transaction.Transactional;

@Service
public class OfiSedeService {
    private final OfiSedeRepository ofiSedeRepository;

    public OfiSedeService(OfiSedeRepository ofiSedeRepository) {
        this.ofiSedeRepository = ofiSedeRepository;
    }

    public List<OfiSede> obtenerPorCodigo(Integer codigo) {
        Optional<OfiSede> ofiSedeOpt = this.ofiSedeRepository.findBycodInstitucionOpt(codigo);

        if(ofiSedeOpt.isPresent()){
            return this.ofiSedeRepository.findBycodInstitucion(codigo);
        }else{
            throw new NullPointerException("No existe instituciones");
        }
    }

    @Transactional
    public OfiSede create(OfiSede ofiSede) {
        if (!"1".equals(String.valueOf(ofiSede.getEsPrincipal()))) {
            return this.ofiSedeRepository.save(ofiSede);
        } else {
            throw new RuntimeException("OfiSede no se puede crear porque ya existe una principal");
        }
    }

}
