package asulca.edu.asulca.dao;

import asulca.edu.asulca.entity.Estudiante;
import asulca.edu.asulca.entity.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface IEstudianteDAO extends JpaRepository <Estudiante,String> {

    @Query("SELECT e FROM Estudiante e WHERE e.codigo = ?1")
    Estudiante buscarEstudiante(String codigo);

    Estudiante findByCodigo(String codigo);


}
