package ong.divulgamarilia.apiservice.database.user.repository;

import ong.divulgamarilia.apiservice.database.user.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {

    @Override
    Optional<User> findById(Long aLong);

}
