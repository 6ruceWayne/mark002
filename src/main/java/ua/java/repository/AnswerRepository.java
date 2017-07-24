package ua.java.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import ua.java.models.Answer;
import ua.java.models.Question;

@Repository
public interface AnswerRepository extends JpaRepository<Answer, Long> {

	List<Answer> findAllById(long id);

	@Query("SELECT a FROM Answer a WHERE a.aQuestion = ?1")
	List<Answer> findByQuestion(@Param("aQuestion") Question aQuestion);
}
