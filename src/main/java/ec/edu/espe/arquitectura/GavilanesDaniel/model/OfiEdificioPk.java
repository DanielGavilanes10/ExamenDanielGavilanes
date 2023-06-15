package ec.edu.espe.arquitectura.GavilanesDaniel.model;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

@Embeddable
public class OfiEdificioPk implements Serializable {
    @Column(name = "COD_EDIFICIO", length = 8, nullable = false)
    private String codEdificio;

    @Column(name = "COD_SEDE", length = 8, nullable = false)
    private String codSede;

    public OfiEdificioPk() {

    }

    public OfiEdificioPk(String codEdificio, String codSede) {
        this.codEdificio = codEdificio;
        this.codSede = codSede;
    }

    public String getCodEdificio() {
        return codEdificio;
    }

    public void setCodEdificio(String codEdificio) {
        this.codEdificio = codEdificio;
    }

    public String getCodSede() {
        return codSede;
    }

    public void setCodSede(String codSede) {
        this.codSede = codSede;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((codEdificio == null) ? 0 : codEdificio.hashCode());
        result = prime * result + ((codSede == null) ? 0 : codSede.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        OfiEdificioPk other = (OfiEdificioPk) obj;
        if (codEdificio == null) {
            if (other.codEdificio != null)
                return false;
        } else if (!codEdificio.equals(other.codEdificio))
            return false;
        if (codSede == null) {
            if (other.codSede != null)
                return false;
        } else if (!codSede.equals(other.codSede))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "OfiEdificioPk [codEdificio=" + codEdificio + ", codSede=" + codSede + "]";
    }
}
