package homeworklvl.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import homeworklvl.demo.domain.modelDiary.Diary;

@Repository
public interface DiaryRepository extends JpaRepository<Diary, Long> { 

}
