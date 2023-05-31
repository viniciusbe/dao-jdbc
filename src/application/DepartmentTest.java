package application;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

import java.util.List;

public class DepartmentTest {
    public static void main(String[] args) {
        DepartmentDao departmentDao = DaoFactory.createDepartmentDao();

//        System.out.println("------ FIND DEPARTMENT BY ID");
        Department dep = departmentDao.findById(5);

//        System.out.println("------ FIND ALL DEPARTMENTS");
        List<Department> deps = departmentDao.findAll();

//        System.out.println("------ INSERT DEPARTMENT");
        Department newDep = new Department(null,"Food");
//        departmentDao.insert(newDep);

//        System.out.println("------ UPDATE DEPARTMENT");

        dep.setName("Food2");
        departmentDao.update(dep);

//        System.out.println("------ DELETE DEPARTMENT");
        departmentDao.deleteById(6);


        System.out.println("deleted");
    }
}
