package application;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.dao.SellerDao;
import model.entities.Department;

public class Program {
	public static void main(String args[]) {
		SellerDao sellerDao = DaoFactory.createSellerDao();
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		System.out.println("=== TEST 1 : seller findById ===");
		System.out.println(sellerDao.findById(2));
		System.out.println("=== TEST 2 : seller deleteById ===");
		sellerDao.deleteById(2);
		System.out.println("=== TEST 3 : seller update ===");
		Seller s = new Seller(null, "test", "test@email", new Date(), 3400.00, new Department());
		s.setEmail("new@email");
		sellerDao.update(s);
		System.out.println("=== TEST 4 : seller findAll ===");
		System.out.println(sellerDao.findAll());
	}
}
