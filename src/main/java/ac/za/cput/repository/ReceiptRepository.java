package ac.za.cput.repository;

import ac.za.cput.domain.Receipt;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by User on 2015/08/10.
 */
@Repository
public interface ReceiptRepository extends CrudRepository<Receipt,Long> {
    @Override
    public Receipt findOne(Long code);
}
