package in.jt.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.jt.entity.Employee;
import in.jt.repository.EmployeeRepository;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepository empRepo;
	
	public void saveEmployee(Employee emp) {
		empRepo.save(emp);
	}

	public Employee getEmployeeRecord(Integer eid) {
		Optional<Employee> optional = empRepo.findById(eid);
		if(optional.isPresent()) {
			System.out.println("&&&&&&&&&&&&&&&&&&&&&");
			Employee emp = optional.get();
			System.out.println(emp);
			return emp;
		}
		else {
			return null;
		}
		
	}

	public Employee deleteEmployeeRecordById(Integer eid) {
		Optional<Employee> optional = empRepo.findById(eid);
		if(optional.isPresent()) {
			System.out.println("&&&&&&&&&&&&&&&&&&&&&");
			Employee emp = optional.get();
			empRepo.deleteById(eid);
			return emp;
		}
		else {
			return null;
		}
	}
	
}
