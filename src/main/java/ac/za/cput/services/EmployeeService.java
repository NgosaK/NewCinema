package ac.za.cput.services;

import ac.za.cput.domain.Manager;

import java.util.List;

/**
 * Created by OWNER on 2015/04/24.
 */
public interface EmployeeService {

    List<Manager> getEmployees();

    Manager getEmployee(long id);
    Manager addEmployee(Manager employee);
    void removeEmployee(Manager employee);
    Manager updateEmployee(Manager employee);

}
