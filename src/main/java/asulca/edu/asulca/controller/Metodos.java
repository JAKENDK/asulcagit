package asulca.edu.asulca.controller;

import asulca.edu.asulca.entity.Estudiante;
import asulca.edu.asulca.entity.Persona;
import asulca.edu.asulca.service.IEstudidanteServices;
import asulca.edu.asulca.service.IPersonaServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping ("index")
public class Metodos {

    @Autowired
    private IPersonaServices personaServices;

    @Autowired
    private IEstudidanteServices iEstudidanteServices;

    @GetMapping ("/listaPersonas")
    public List<Persona> listaPersona(){
        return  this.personaServices.listaPersona();
    }

    @GetMapping ("/buscarEstudiante")
    public Estudiante buscarEstudiante(@RequestParam ("codigo")String codigo){
        return  this.iEstudidanteServices.obtenerEstudianteByCodigo(codigo);
    }

}
