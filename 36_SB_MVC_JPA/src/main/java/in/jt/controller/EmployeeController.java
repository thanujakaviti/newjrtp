package in.jt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import in.jt.entity.Employee;
import in.jt.service.EmployeeService;

@Controller
public class EmployeeController {
	
	@Autowired
	private EmployeeService empService;
	
	
	@GetMapping("/curdoperations")
	public String displayOperation() {
		return "curdoperation";
	}
	
	@GetMapping("/save")
	public String getEmpRegForm(Model model) {
		Employee empObj =new Employee();
		model.addAttribute("employee", empObj);
		return "empreg";
	}
	
	@PostMapping("/saveEmployee")
	public String saveEmployeeRecord(Employee employee, Model model) {
		System.err.println(employee);
		empService.saveEmployee(employee);
		model.addAttribute("employee", employee);
		
		return "empinfo";
	}
	
	@GetMapping("/get")
	public String getEmpSelect() {
		return "selectemp";
	}
	
	@GetMapping("/fetch")
	public String getEmpData(@RequestParam Integer eid,Model model) {
		System.out.println("****************8");
		Employee empObj = empService.getEmployeeRecord(eid);
		if(empObj != null) {
			model.addAttribute("employee", empObj);	
			return "empinfo";
		}
		else {
			return "emperror";
		}
	}
	
	@GetMapping("/update")
	public String getEmpSelectRecord() {
		return "fetchemp";
	}
	@GetMapping("/updaterecord")
	public String getEmpDataForUpdate(@RequestParam Integer eid,Model model) {
		System.out.println("****************8");
		Employee empObj = empService.getEmployeeRecord(eid);
		if(empObj != null) {
			model.addAttribute("employee", empObj);	
			return "empreg";
		}
		else {
			return "emperror";
		}
	}
	@GetMapping("/delete")
	public String deleEmpRecord() {
		return "deleteemp";
	}
	@GetMapping("/deleterecord")
	public String deleteEmployeeRecord(@RequestParam Integer eid) {
		Employee empObj = empService.deleteEmployeeRecordById(eid);
		if(empObj !=null) {
			return "deleteempform";
		}
		else {
			return "emperror";
		}
	}
}
