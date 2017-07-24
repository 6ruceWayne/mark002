package ua.java.repository;

import java.sql.Timestamp;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import ua.java.models.Result;
import ua.java.models.Test;
import ua.java.models.User;
@Repository
public interface ResultRepository extends JpaRepository<Result, Long> {

	@Query("SELECT r FROM Result r WHERE r.rTest = ?1")
	List<Result> findAllByTestId(@Param("tResult") Test qTest);

	@Query("SELECT r FROM Result r WHERE r.rUser = ?1")
	List<Result> findAllByUserId(@Param("uResult") User user);

	Result findBycreatedOn(Timestamp createdOn);
}
