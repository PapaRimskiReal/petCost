package homeworklvl.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import homeworklvl.demo.domain.modelUser.User;

@Repository
public interface PetRepository extends JpaRepository<User, Long> {

}