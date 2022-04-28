package asulca.edu.asulca.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table (name = "estudiante")
@PrimaryKeyJoinColumn(referencedColumnName="idpersona")
public class Estudiante extends Persona {

    @Column(name = "codigo", length = 10, nullable = false)
    private String codigo;

    @Column(name = "serie", length = 5, nullable = false)
    private String serie;

    public Estudiante() {
    }

    public Estudiante(String codigo, String serie) {
        this.codigo = codigo;
        this.serie = serie;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    @Override
    public String toString() {
        return "Estudiante{" +
                "codigo='" + codigo + '\'' +
                ", serie='" + serie + '\'' +
                '}';
    }
}
