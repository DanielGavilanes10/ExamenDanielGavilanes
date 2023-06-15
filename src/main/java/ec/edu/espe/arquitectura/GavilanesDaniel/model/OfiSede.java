package ec.edu.espe.arquitectura.GavilanesDaniel.model;

import java.time.LocalDate;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name = "OFI_SEDE")
public class OfiSede {
    @Id
    @Column(name = "COD_SEDE", length = 8, nullable = false)
    private Long codSede;

    @Column(name = "COD_INSTITUCION", nullable = false)
    private Integer codInstitucion;

    @Column(name = "NOMBRE", length = 100, nullable = false)
    private String nombre;

    @Column(name = "DIRECCION", length = 200, nullable = false)
    private String direccion;

    @Column(name = "ES_PRINCIPAL", nullable = false)
    private Boolean esPrincipal;

    @Column(name = "FECHA_CREACION", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date fechaCreacion;

    @Column(name = "VERSION")
    private Long version;

    @ManyToOne
    @JoinColumn(name = "COD_INSTITUCION", referencedColumnName = "COD_INSTITUCION", insertable = false, updatable = false, nullable = false)
    private OfiInstitucion ofiInstitucion;
    
    public OfiSede() {
        
    }
    public OfiSede(Long codSede) {
        this.codSede = codSede;
    }

    public Long getCodSede() {
        return codSede;
    }

    public void setCodSede(Long codSede) {
        this.codSede = codSede;
    }

    public Integer getCodInstitucion() {
        return codInstitucion;
    }

    public void setCodInstitucion(Integer codInstitucion) {
        this.codInstitucion = codInstitucion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Boolean getEsPrincipal() {
        return esPrincipal;
    }

    public void setEsPrincipal(Boolean esPrincipal) {
        this.esPrincipal = esPrincipal;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public Long getVersion() {
        return version;
    }

    public void setVersion(Long version) {
        this.version = version;
    }

    public OfiInstitucion getOfiInstitucion() {
        return ofiInstitucion;
    }

    public void setOfiInstitucion(OfiInstitucion ofiInstitucion) {
        this.ofiInstitucion = ofiInstitucion;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
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
        OfiSede other = (OfiSede) obj;
        if (codSede == null) {
            if (other.codSede != null)
                return false;
        } else if (!codSede.equals(other.codSede))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "OfiSede [codSede=" + codSede + ", codInstitucion=" + codInstitucion + ", nombre=" + nombre
                + ", direccion=" + direccion + ", esPrincipal=" + esPrincipal + ", fechaCreacion=" + fechaCreacion
                + ", version=" + version + ", ofiInstitucion=" + ofiInstitucion + "]";
    }
    
}
