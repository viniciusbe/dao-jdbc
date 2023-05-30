package application;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

import java.util.Date;
import java.util.List;

public class Program {

    public static void main(String[] args) {
        SellerDao sellerDao = DaoFactory.createSellerDao();

//        System.out.println("------ FIND SELLER BY ID");
        Seller seller = sellerDao.findById(3);

//        System.out.println("------ FIND SELLER BY DEPARTMENT");
        Department dep = new Department(2, null);
        List<Seller> sellers = sellerDao.findByDepartment(dep);

//        System.out.println("------ FIND ALL SELLERS");
        sellers = sellerDao.findAll();

//        System.out.println("------ SELLER INSERT");
        Seller newSeller = new Seller(null, "Greg", "greg@gmail.com", new Date(), 2500.0, dep);
//        sellerDao.insert(newSeller);

//        System.out.println("------ SELLER UPDATE");
        seller = sellerDao.findById(1);
        seller.setName("Tob");
        sellerDao.update(seller);

        System.out.println("------ SELLER DELETE");
        sellerDao.deleteById(7);

        System.out.println("Seller deleted");
    }
}
