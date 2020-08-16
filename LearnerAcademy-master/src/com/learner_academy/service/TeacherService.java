package com.learner_academy.service;

import java.util.List;

import com.learner_academy.exception.BusinessException;
import com.learner_academy.model.Teacher;

public interface TeacherService {

	public Teacher createTeacher(Teacher teacher);

	public Teacher getTeacherById(int teacherId) throws BusinessException;

	public List<Teacher> getAllTeachers();

	public Teacher updateTeacher(Teacher teacher);

	public void removeTeacher(int teacherId);
}
