package services;

import javax.ejb.Remote;

import entity.Course;

@Remote
public interface CourseServiceRemote {
void addCourse (Course course);
}
