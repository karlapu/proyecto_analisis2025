package com.dbproject.analisis.dos.serviceImp;

import java.util.List;
import org.springframework.stereotype.Service;

import com.dbproject.analisis.dos.model.entity.Usuario;
import com.dbproject.analisis.dos.model.repository.UsuarioRepository;
import com.dbproject.analisis.dos.service.UsuarioService;



@Service
public class UsuarioServiceImp implements UsuarioService {

    private final UsuarioRepository repository;

    public UsuarioServiceImp(UsuarioRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<Usuario> findAll() {
        return repository.findAll();
    }

    @Override
    public Usuario findById(String idUsuario) {
        return repository.findById(idUsuario).orElse(null);
    }

    @Override
    public Usuario create(Usuario u) {
        return repository.save(u);
    }

    @Override
    public Usuario update(String idUsuario, Usuario u) {
        Usuario usuarioDb = repository.findById(idUsuario).orElse(null);
        if (usuarioDb != null) {
            usuarioDb.setNombre(u.getNombre());
            usuarioDb.setApellido(u.getApellido());
            usuarioDb.setFechaNacimiento(u.getFechaNacimiento());
            usuarioDb.setStatusUsuario(u.getStatusUsuario());
            usuarioDb.setPassword(u.getPassword());
            usuarioDb.setGenero(u.getGenero());
            usuarioDb.setUltimaFechaIngreso(u.getUltimaFechaIngreso());
            usuarioDb.setIntentosDeAcceso(u.getIntentosDeAcceso());
            usuarioDb.setSesionActual(u.getSesionActual());
            usuarioDb.setUltimaFechaCambioPassword(u.getUltimaFechaCambioPassword());
            usuarioDb.setCorreoElectronico(u.getCorreoElectronico());
            usuarioDb.setRequiereCambiarPassword(u.getRequiereCambiarPassword());
            usuarioDb.setFotografia(u.getFotografia());
            usuarioDb.setTelefonoMovil(u.getTelefonoMovil());
            usuarioDb.setSucursal(u.getSucursal());
            usuarioDb.setPregunta(u.getPregunta());
            usuarioDb.setRespuesta(u.getRespuesta());
            usuarioDb.setRole(u.getRole());
            usuarioDb.setFechaModificacion(u.getFechaModificacion());
            usuarioDb.setUsuarioModificacion(u.getUsuarioModificacion());

            return repository.save(usuarioDb);
        }
        return null;
    }

    @Override
    public void delete(String idUsuario) {
        repository.deleteById(idUsuario);
    }
}