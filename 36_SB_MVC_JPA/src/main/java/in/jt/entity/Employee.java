package in.jt.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="EMPLOYEE_DETAILS")
public class Employee {

	@Id
	@Column(name="EMP_ID")
	private Integer eid;
	
	@Column(name="EMP_NAME")
	private String ename;
	
	@Column(name="EMP_AGE")
	private Integer eage;
	
	@Column(name="EMP_SAL")
	private Integer esal;

	public Integer getEid() {
		return eid;
	}

	public void setEid(Integer eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public Integer getEage() {
		return eage;
	}

	public void setEage(Integer eage) {
		this.eage = eage;
	}

	public Integer getEsal() {
		return esal;
	}

	public void setEsal(Integer esal) {
		this.esal = esal;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", eage=" + eage + ", esal=" + esal + "]";
	}
	
}
