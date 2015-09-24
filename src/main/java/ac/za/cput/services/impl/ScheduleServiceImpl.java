package ac.za.cput.services.impl;

import ac.za.cput.domain.Schedule;
import ac.za.cput.repository.ScheduleRepository;
import ac.za.cput.services.ScheduleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by User on 2015/08/10.
 */
@Service
public class ScheduleServiceImpl implements ScheduleService {

    @Autowired
    ScheduleRepository repository;
    public List<Schedule> getSchedules() {

        List<Schedule> allSchedules= new ArrayList<Schedule>();
        Iterable<Schedule> schedules= repository.findAll();

        for(Schedule schedule: schedules)
        {
            allSchedules.add(schedule);
        }

        return allSchedules;
    }

    @Override
    public Schedule getSchedule(long id) {
        return repository.findOne(id);
    }

    @Override
    public Schedule addSchedule(Schedule schedule) {

        return repository.save(schedule);
    }

    @Override
    public void removeSchedule(Schedule schedule) {

        repository.delete(schedule);
    }


    @Override
    public Schedule updateSchedule(Schedule schedule) {

        return repository.save(schedule);
    }


}
