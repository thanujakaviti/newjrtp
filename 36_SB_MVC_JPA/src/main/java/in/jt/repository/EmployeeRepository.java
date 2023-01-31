package in.jt.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import in.jt.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Serializable> {

}
