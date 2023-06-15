package ec.edu.espe.arquitectura.GavilanesDaniel.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ec.edu.espe.arquitectura.GavilanesDaniel.model.OfiSede;
import ec.edu.espe.arquitectura.GavilanesDaniel.service.OfiSedeService;

@RestController
@RequestMapping("/api/v1/ofisede")
public class OfiSedeController {
    private final OfiSedeService ofiSedeService;

    public OfiSedeController(OfiSedeService ofiSedeService) {
        this.ofiSedeService = ofiSedeService;
    }

    
    @GetMapping("/{code}")
    public ResponseEntity<OfiSede> obtainByCodeInstitucion(@PathVariable(name = "code") Integer code) {
        List<OfiSede> ofiSede = this.ofiSedeService.obtenerPorCodigo(code);
        if (!ofiSede.isEmpty()) {
            return ResponseEntity.ok(ofiSede.get(0));
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping
    public ResponseEntity<OfiSede> create(@RequestBody OfiSede ofiSede) {
        try {
            OfiSede ofiSedeRS = this.ofiSedeService.create(ofiSede);
            return ResponseEntity.ok(ofiSedeRS);
        } catch (RuntimeException rte) {
            return ResponseEntity.badRequest().build();
        }
    }
    
}
