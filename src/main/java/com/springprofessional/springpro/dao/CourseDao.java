package com.springprofessional.springpro.dao;

import com.springprofessional.springpro.entities.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;


public interface CourseDao  extends JpaRepository<Course,Integer> {
    @Transactional
    @Modifying
    @Query("update Course u set u.title = :title where u.id = :id")
    int updatetitle(@Param("title") String title,
                                   @Param("id") long id);

    @Transactional
    @Modifying
    @Query("delete Course u where u.id = :id")
    int deleteCourse(@Param("id") long id);

}
