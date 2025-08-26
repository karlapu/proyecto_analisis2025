package com.dbproject.analisis.dos.serviceImp;

import java.util.List;
import org.springframework.stereotype.Service;

import com.dbproject.analisis.dos.model.entity.Sucursal;
import com.dbproject.analisis.dos.model.repository.SucursalRepository;
import com.dbproject.analisis.dos.service.SucursalService;



@Service
public class SucursalServiceImp implements SucursalService {

    private final SucursalRepository repository;

    public SucursalServiceImp(SucursalRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<Sucursal> findAll() {
        return repository.findAll();
    }

    @Override
    public Sucursal findById(Integer id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public Sucursal create(Sucursal s) {
        return repository.save(s);
    }

    @Override
    public Sucursal update(Integer id, Sucursal s) {
        Sucursal sucursalDb = repository.findById(id).orElse(null);
        if (sucursalDb != null) {
            sucursalDb.setNombre(s.getNombre());
            sucursalDb.setDireccion(s.getDireccion());
            return repository.save(sucursalDb);
        }
        return null;
    }

    @Override
    public void delete(Integer id) {
        repository.deleteById(id);
    }
}