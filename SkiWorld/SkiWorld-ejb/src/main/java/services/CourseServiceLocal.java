package services;

import javax.ejb.Local;

import entity.Course;

@Local
public interface CourseServiceLocal {
	void addCourse (Course course);
}
