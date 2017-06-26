package cn.edu.shou.staff.service;

import java.util.List;

import cn.edu.shou.staff.model.Emp;

public interface EmpService {
	public boolean addEmp(Emp emp);
	public List<Emp> listEmp();
	public boolean deleteEmp(Emp emp);
	public Emp findEmp(int id);
	public boolean editEmp(Emp emp);
}
