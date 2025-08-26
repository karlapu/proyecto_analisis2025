package com.dbproject.analisis.dos.serviceImp;

import java.util.List;
import org.springframework.stereotype.Service;

import com.dbproject.analisis.dos.model.entity.Empresa;
import com.dbproject.analisis.dos.model.repository.EmpresaRepository;
import com.dbproject.analisis.dos.service.EmpresaService;


//LISTOOO
@Service
public class EmpresaServiceImp implements EmpresaService {

    private final EmpresaRepository repository;

    public EmpresaServiceImp(EmpresaRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<Empresa> findAll() {
        return repository.findAll();
    }

    @Override
    public Empresa findById(Integer id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public Empresa create(Empresa e) {
        return repository.save(e);
    }

    @Override
    public Empresa update(Integer id, Empresa e) {
        Empresa empresaDb = repository.findById(id).orElse(null);
        if (empresaDb != null) {
            empresaDb.setNombre(e.getNombre());
            empresaDb.setDireccion(e.getDireccion());
            empresaDb.setNit(e.getNit());
            empresaDb.setFechaModificacion(e.getFechaModificacion());
            empresaDb.setUsuarioModificacion(e.getUsuarioModificacion());
            return repository.save(empresaDb);
        }
        return null;
    }

    @Override
    public void delete(Integer id) {
        repository.deleteById(id);
    }
}
