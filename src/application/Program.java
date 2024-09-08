package application;

import java.util.Date;
import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {
	
	public static void main(String[] args) {
		
		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		
		System.out.println("=== TEST 1: Seller FindById ===");
		Seller seller = sellerDao.findById(3);
		System.out.println(seller);
		
		System.out.println("\n === TEST 2: Seller FindDepartment ===");
		
		Department department = new Department(2, null);
		List<Seller> list = sellerDao.findByDepartment(department);
		for(Seller obj : list) {
			System.out.println(obj);
		}
		
		System.out.println("\n === TEST 3: Seller FindAll ===");
		list = sellerDao.findAll();
		for(Seller obj : list) {
			System.out.println(obj);
		}
		
		System.out.println("\n === TEST 4: Seller insert ===");
		Seller newSeller = new Seller(null, "Greg", "greg@gmail.com", new Date(), 4000.00, department);
		sellerDao.insert(newSeller);
		System.out.println("Ususario inserido " + newSeller.getId());
		
		System.out.println("\n === TEST 5: Seller upadate ===");
		seller = sellerDao.findById(9);
		seller.setName("Ygor");
		sellerDao.update(seller);
		System.out.println("Ususario modificado " + seller);
		
		System.out.println("\n === TEST 6: Seller delete ===");
		sellerDao.deleteById(9);
		System.out.println("Usuario deletado ");
	}

}
