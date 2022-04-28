package asulca.edu.asulca.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "Profesor")
@PrimaryKeyJoinColumn(referencedColumnName="idpersona")
public class Profesor extends Persona  {

     @Column(name = "salario", length = 10, nullable = false)
    private Double salario;

    public Profesor(Double salario) {
        this.salario = salario;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }
}
