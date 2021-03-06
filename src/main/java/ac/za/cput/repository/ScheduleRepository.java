package ac.za.cput.repository;

import ac.za.cput.domain.Schedule;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by User on 2015/08/10.
 */
@Repository
public interface ScheduleRepository extends CrudRepository<Schedule,Long> {
    @Override
    public Schedule findOne(Long code);
}
