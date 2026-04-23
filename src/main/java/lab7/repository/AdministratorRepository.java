package lab7.repository;

import lab7.Administrator;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface AdministratorRepository extends JpaRepository<Administrator, Long> { }
