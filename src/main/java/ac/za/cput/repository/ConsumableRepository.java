package ac.za.cput.repository;

import ac.za.cput.domain.Consumables;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by User on 2015/08/10.
 */
@Repository
public interface ConsumableRepository extends CrudRepository<Consumables,Long> {

    public Consumables findOne(Long code);
}
