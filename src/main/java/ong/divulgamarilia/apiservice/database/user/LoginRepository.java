package ong.divulgamarilia.apiservice.database.user;

import org.springframework.data.jpa.repository.JpaRepository;

public interface LoginRepository extends JpaRepository<Login, Long> {

    Login findLoginByEmail(String email);
}
