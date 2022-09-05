package net.mofed.reportracking.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import net.mofed.reportracking.app.model.User;

@Repository
public interface MyUserRepository extends JpaRepository <User,Long>{

@Query("select u from User u where u.username= :username")

		public User getUserByUsername(@Param("username") String username);

}
