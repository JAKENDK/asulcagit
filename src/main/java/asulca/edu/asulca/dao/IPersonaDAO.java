package asulca.edu.asulca.dao;


import asulca.edu.asulca.entity.Persona;
import org.springframework.data.jpa.repository.JpaRepository;


public interface IPersonaDAO extends JpaRepository<Persona,Long> {




// @Query("SELECT p FROM Persona p WHERE p.nombre = ?1 AND p.apellido = ?2")
  //  Persona findByNombreAndApellido(String nombre, String apellido);

    //@Query("SELECT p FROM Persona p WHERE p.nombre = :nombre AND p.apellido = :apellido")
    //Persona findByNombreAndApellidoByParam(@Param("nombre") String nombre, @Param("apellido") String apellido);

}
