package asulca.edu.asulca.service.impl;

import asulca.edu.asulca.dao.IPersonaDAO;
import asulca.edu.asulca.entity.Persona;
import asulca.edu.asulca.service.IPersonaServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service

public class PersonaServicesImpl implements IPersonaServices {

    @Autowired
    private IPersonaDAO personaDao;

    @Override
    public List<Persona> listaPersona() {
        List <Persona> personas = this.personaDao.findAll();
        for (Persona persona:personas){
                    System.out.println(persona.toString());
        }

        return this.personaDao.findAll();

    }
}
