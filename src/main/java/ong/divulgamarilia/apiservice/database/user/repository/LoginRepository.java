package ong.divulgamarilia.apiservice.database.user.repository;

import ong.divulgamarilia.apiservice.database.user.model.Login;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LoginRepository extends JpaRepository<Login, Long> {

    Login findLoginByEmail(String email);
}
