package application;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {
	
	public static void main (String[] args) {
		
	
	DepartmentDao departmentDao = DaoFactory.creatDepartmentDao();
	
	System.out.println("=== TEST 1: Department FindById ===");
	Department department = departmentDao.findById(1);
	System.out.println(department);
	
	
	System.out.println("=== TEST 2: Department Insert ===");
	Department newDepartment = new Department(7, "VideoGames");
	departmentDao.insert(newDepartment);
	System.out.println("Department inserido " + newDepartment.getId());
	
	System.out.println("=== TEST 3: Department Update ===");
	Department newUpdate = new Department(5, "MicroOndas");
	departmentDao.update(newUpdate);
	System.out.println("Department atualizado " + newUpdate.getId());
	
	System.out.println("=== TEST 4: Department Delete ===");
	departmentDao.deleteById(5);
	System.out.println("Department deletado");
	
	}
}
