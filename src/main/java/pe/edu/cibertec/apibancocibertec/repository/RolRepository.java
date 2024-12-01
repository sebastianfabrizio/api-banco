package pe.edu.cibertec.apibancocibertec.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.cibertec.apibancocibertec.model.Rol;



@Repository
public interface RolRepository extends JpaRepository<Rol, Integer> {

    Rol findByRol(String rol);
}
