package application;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

import java.util.List;

public class Program {

    public static void main(String[] args) {
        SellerDao sellerDao = DaoFactory.createSellerDao();

        System.out.println("------ FIND SELLER BY ID");
        Seller seller = sellerDao.findById(3);

        System.out.println("------ FIND SELLER BY DEPARTMENT");
        Department dep = new Department(2, null);
        List<Seller> sellers = sellerDao.findByDepartment(dep);

        sellers.stream().forEach(System.out::println);
    }
}
