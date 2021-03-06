package ac.za.cput.services.impl;

import ac.za.cput.domain.TVShow;
import ac.za.cput.repository.TVShowRepository;
import ac.za.cput.services.TVShowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by User on 2015/09/12.
 */
@Service
public class TVShowServiceImpl implements TVShowService{

    @Autowired
    private TVShowRepository repository;

    @Override
    public List<TVShow> getTVShow() {

        List<TVShow> allsubjects = new ArrayList<>();
        Iterable<TVShow> subjects = repository.findAll();
        for (TVShow subject : subjects) {
            allsubjects.add(subject);
        }
        return allsubjects;
    }

    @Override
    public TVShow getTVShowByID(long id) {
        return repository.findOne(id);

    }

    @Override
    public TVShow addTVShow(TVShow tvShow) {
        return repository.save(tvShow);
    }

    @Override
    public void removeTVShow(TVShow tvShow) {
        repository.delete(tvShow);

    }

    @Override
    public TVShow updateTVShow(TVShow tvShow) {
        return repository.save(tvShow);
    }
}
