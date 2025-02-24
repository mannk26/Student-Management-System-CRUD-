package in.mrityunjay.service;


import org.springframework.data.domain.Page;

import in.mrityunjay.entity.Student;  

public interface IStudentService {  

	Long createStudent(Student student);  
	Student findOneStudent(Long id);  
	void deleteOneStudent(Long id);  
	void updateStudent(Student student); 
	int updateStudentName(String sname, Long sid);
	Page<Student> findStudentsWithPagination(int page, int size); 
}
