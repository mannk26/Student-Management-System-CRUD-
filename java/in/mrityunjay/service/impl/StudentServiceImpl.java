package in.mrityunjay.service.impl;
  
import java.util.Optional; 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import in.mrityunjay.entity.Student;
import in.mrityunjay.exception.StudentNotFoundException;
import in.mrityunjay.repo.StudentRepository;
import in.mrityunjay.service.IStudentService;

@Service
public class StudentServiceImpl implements IStudentService {

	@Autowired
	private StudentRepository repo;

	@Override
	public Long createStudent(Student student) {
		student = repo.save(student);
		return student.getStudentId();
	}
	
	@Override
	public Page<Student> findStudentsWithPagination(int page, int size) {
	    Pageable pageable = PageRequest.of(page, size);
	    return repo.findAll(pageable);
	}


	
	@Override
	public Student findOneStudent(Long id) {
		Optional<Student> opt = repo.findById(id);
		if(opt.isPresent()) 
			return opt.get();
		else
			throw new StudentNotFoundException("Student '"+id+"' Not exist");
	}
	
	@Override
	public void deleteOneStudent(Long id) {
		repo.delete(findOneStudent(id));
	}
	
	@Override
	public void updateStudent(Student student) {
		Long id = student.getStudentId();
		if(id != null && repo.existsById(id)) {
			repo.save(student);
		} else {
			throw new StudentNotFoundException("Student '"+id+"' Not exist");
		}
	}

	@Override
	@Transactional
	public int updateStudentName(String sname, Long id) {
		if(id != null && repo.existsById(id)) {
			return repo.updateStudentName(sname, id);
		} else {
			throw new StudentNotFoundException("Student '"+id+"' Not exist");
		}
	}

}
