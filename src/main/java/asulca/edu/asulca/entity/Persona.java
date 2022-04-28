package asulca.edu.asulca.entity;

import javax.persistence.*;

@Entity
@Table (name = "persona")
@Inheritance (strategy =  InheritanceType.JOINED)

public class Persona {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idpersona")
    private Long idpersona;

    @Column(name = "nombre", length = 50, nullable = false)
    private  String nombre;

    @Column(name = "telefono", length = 10, nullable = false)
    private  String telefono;

    @Column(name = "email", length = 50, nullable = false)
    private  String email;

    @JoinColumn(name = "fk_Direccion", nullable = false)
    @ManyToOne(optional = false, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Direccion direccion;

    public Persona() {
    }

    public Persona(String nombre, String telefono, String email) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.email = email;
    }

    public Persona(Long idpersona) {
        this.idpersona = idpersona;
    }

    public Long getIdpersona() {
        return idpersona;
    }

    public void setIdpersona(Long idpersona) {
        this.idpersona = idpersona;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "idpersona=" + idpersona +
                ", nombre='" + nombre + '\'' +
                ", telefono='" + telefono + '\'' +
                ", email='" + email + '\'' +
                ", direccion=" + direccion ;
    }
}
