package asulca.edu.asulca.service.impl;

import asulca.edu.asulca.dao.IEstudianteDAO;
import asulca.edu.asulca.entity.Estudiante;
import asulca.edu.asulca.service.IEstudidanteServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EstudianteServicesImpl implements IEstudidanteServices {
    @Autowired
    private IEstudianteDAO estudianteDAO;

    @Override
    public Estudiante obtenerEstudianteByCodigo(String Codigo) {
        return this.estudianteDAO.buscarEstudiante(Codigo);
    }
}
