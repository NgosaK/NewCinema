package ac.za.cput.repository;

import ac.za.cput.domain.Manager;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by OWNER on 2015/04/22.
 */
@Repository
public interface EmployeeRepository extends CrudRepository<Manager,Long> {

    public Manager findOne(Long code);
}
