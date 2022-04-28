package asulca.edu.asulca.entity;

import javax.persistence.*;

@Entity
@Table (name = "Direccion")

public class Direccion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idDireccion;

    @Column(name = "calle", length = 50, nullable = false)
    public String calle;

    @Column(name = "ciudad", length = 50, nullable = false)
    public String ciudad;

    @Column(name = "estado", length = 50, nullable = false)
    public String estado;

    @Column(name = "codigoPostal", length = 10, nullable = false)
    public String codigoPostal;

    @Column(name = "pais", length = 50, nullable = false)
    public  String pais;

    public Direccion() {
    }

    public Direccion(String calle, String ciudad, String estado, String codigoPostal, String pais) {
        this.calle = calle;
        this.ciudad = ciudad;
        this.estado = estado;
        this.codigoPostal = codigoPostal;
        this.pais = pais;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(String codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    @Override
    public String toString() {
        return "Direccion{" +
                "idDireccion=" + idDireccion +
                ", calle='" + calle + '\'' +
                ", ciudad='" + ciudad + '\'' +
                ", estado='" + estado + '\'' +
                ", codigoPostal='" + codigoPostal + '\'' +
                ", pais='" + pais + '\'' +
                '}';
    }
}
