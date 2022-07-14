package com.springprofessional.springpro.services;

import com.springprofessional.springpro.dao.CourseDao;
import com.springprofessional.springpro.entities.Course;
import org.springframework.beans.factory.annotation.Autowired;
import com.springprofessional.springpro.entities.Course;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class courseservice implements courseserviceimpl {

    @Autowired
    private CourseDao courseDao;
   // List<Course>list;

    public courseservice() {
       // list=new ArrayList<>();
//        Course course=new Course("Programming","Prasan",1234);
//        Course course1=new Course("Program","Sam",234);
//        list.add(course);
//        list.add(course1);
    }

    @Override
    public List<Course> getcourses() {

        return courseDao.findAll();
    }

    @Override
    public Optional<Course> getcourse(int courseid) {

            return courseDao.findById(courseid);
    }

    @Override
    public Course Addcourse(Course course) {

        courseDao.save(course);
        return course;

    }

    @Override
    @Transactional
    public Course Updatecourse(Course course) {

        courseDao.updatetitle(course.getTitle(),course.getId());

//        courseDao.save(course);
//
//        for (Course courseto:list) {
//            if(courseto.getId()==course.getId())
//            {
//                courseto.setAuthor("sdfsfsfdsfdsf");
//                courseto.setTitle("JAVA");
//                break;
//            }
//        }
        return course;
    }
    @Transactional
    public void Deletecourse(long parselong)
    {

        courseDao.deleteCourse(parselong);

    }

}
