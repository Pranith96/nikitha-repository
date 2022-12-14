package com.student.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.student.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {

	//List<Student> findByName(String name);
	/*
	@Query("select s from Student s where s.name=:name")
	List<Student> getByName(String name);
	*/
	
	/*
	@Query("select s from Student s where s.name=?1")
	List<Student> getByName(String name);
	 */
	
	@Query(value = "select * from student_table where student_name=:name", nativeQuery = true)
	List<Student> getByName(String name);

	//Optional<Student> findByLoginAndPassword(String loginId, String password);

	/*
	@Query("select s from Student s where s.login=:loginId and s.password=:password")
	Optional<Student> getByLoginAndPassword(String loginId, String password);
*/
	
	@Query("select s from Student s where s.login=?1 and s.password=?2")
	Optional<Student> getByLoginAndPassword(String loginId, String password);

	@Modifying
	@Query("update Student s set s.name=:name where s.studentId=:studentId")
	void updateNameById(String name, Integer studentId);

}
