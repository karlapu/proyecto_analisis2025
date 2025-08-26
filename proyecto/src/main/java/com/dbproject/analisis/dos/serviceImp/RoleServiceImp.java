package com.dbproject.analisis.dos.serviceImp;
import java.util.List;
import org.springframework.stereotype.Service;

import com.dbproject.analisis.dos.model.entity.Role;
import com.dbproject.analisis.dos.model.repository.RoleRepository;
import com.dbproject.analisis.dos.service.RoleService;



@Service
public class RoleServiceImp implements RoleService {

    private final RoleRepository repository;

    public RoleServiceImp(RoleRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<Role> findAll() {
        return repository.findAll();
    }

    @Override
    public Role findById(Integer id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public Role create(Role r) {
        return repository.save(r);
    }

    @Override
    public Role update(Integer id, Role r) {
        Role roleDb = repository.findById(id).orElse(null);
        if (roleDb != null) {
            roleDb.setNombre(r.getNombre());
            return repository.save(roleDb);
        }
        return null;
    }

    @Override
    public void delete(Integer id) {
        repository.deleteById(id);
    }
}
