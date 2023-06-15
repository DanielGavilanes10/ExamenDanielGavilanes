package ec.edu.espe.arquitectura.GavilanesDaniel.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "OFI_INSTITUCION")
public class OfiInstitucion {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "COD_INSTITUCION", precision = 3, scale = 0, nullable = false)
    private Integer codInstitucion;

    @Column(name = "RUC", length = 13, nullable = false)
    private String ruc;

    @Column(name = "RAZON_SOCIAL", length = 250, nullable = false)
    private String razonSocial;

    @Column(name = "VERSION", nullable = false)
    private Integer version;

    public Integer getCodInstitucion() {
        return codInstitucion;
    }

    public void setCodInstitucion() {
    
    }
    
    public void setCodInstitucion(Integer codInstitucion) {
        this.codInstitucion = codInstitucion;
    }

    public String getRuc() {
        return ruc;
    }

    public void setRuc(String ruc) {
        this.ruc = ruc;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((codInstitucion == null) ? 0 : codInstitucion.hashCode());
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
        OfiInstitucion other = (OfiInstitucion) obj;
        if (codInstitucion == null) {
            if (other.codInstitucion != null)
                return false;
        } else if (!codInstitucion.equals(other.codInstitucion))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "OfiInstitucion [codInstitucion=" + codInstitucion + ", ruc=" + ruc + ", razonSocial=" + razonSocial
                + ", version=" + version + "]";
    }
}
