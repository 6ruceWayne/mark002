package ua.java.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ua.java.models.Role;
@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
}
