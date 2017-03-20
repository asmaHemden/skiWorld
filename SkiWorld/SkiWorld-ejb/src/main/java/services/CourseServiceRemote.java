package services;

import java.util.Date;
import java.util.List;

import javax.ejb.Remote;

import entity.Coach;
import entity.Course;

@Remote
public interface CourseServiceRemote {
void addCourse (Course course);
List<Course>findAllCourses();
void deleteCourse(Course course);
void updateCourse(Course course);
List<String>FindCategory();
Course findCourseById(Integer id);
void saveOrUpdateCourse(Course course);
List<Course> findCourseByIdCoachAndDate(Coach coach,Date date);
Course findCourseByCoachId(Integer coach_id);
}
