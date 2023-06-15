package ec.edu.espe.arquitectura.GavilanesDaniel.model;

import java.io.Serializable;
import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;


public class OfiEdificio implements Serializable{
    
    @EmbeddedId
    private OfiEdificioPk pk;

    @Column(name = "NOMBRE", length = 128, nullable = false)
    private String nombre;

    @Column(name = "PISOS", nullable = false)
    private Integer pisos;

    @Column(name = "SUPERFICIE", precision = 7, scale = 2, nullable = false)
    private BigDecimal superficie;

    @Column(name = "VERSION", nullable = false)
    private Long version;

    @ManyToOne
    @JoinColumn(name = "COD_SEDE", referencedColumnName = "COD_SEDE", insertable = false, updatable = false)
    private OfiSede ofiSede;
    public OfiEdificio( ) {
    }

    public OfiEdificio(OfiEdificioPk pk) {
        this.pk = pk;
    }

    public OfiEdificioPk getPk() {
        return pk;
    }

    public void setPk(OfiEdificioPk pk) {
        this.pk = pk;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getPisos() {
        return pisos;
    }

    public void setPisos(Integer pisos) {
        this.pisos = pisos;
    }

    public BigDecimal getSuperficie() {
        return superficie;
    }

    public void setSuperficie(BigDecimal superficie) {
        this.superficie = superficie;
    }

    public Long getVersion() {
        return version;
    }

    public void setVersion(Long version) {
        this.version = version;
    }

    public OfiSede getOfiSede() {
        return ofiSede;
    }

    public void setOfiSede(OfiSede ofiSede) {
        this.ofiSede = ofiSede;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((pk == null) ? 0 : pk.hashCode());
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
        OfiEdificio other = (OfiEdificio) obj;
        if (pk == null) {
            if (other.pk != null)
                return false;
        } else if (!pk.equals(other.pk))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "OfiEdificio [pk=" + pk + ", nombre=" + nombre + ", pisos=" + pisos + ", superficie=" + superficie
                + ", version=" + version + ", ofiSede=" + ofiSede + "]";
    }
    
    
}
