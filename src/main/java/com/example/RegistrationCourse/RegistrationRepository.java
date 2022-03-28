package com.example.RegistrationCourse;

import org.springframework.data.jpa.repository.JpaRepository;

public interface RegistrationRepository extends JpaRepository<RegistrationUser, Integer> {
	RegistrationUser findByEmailAndPassword(String username, String password);

}
