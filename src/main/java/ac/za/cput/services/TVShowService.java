package ac.za.cput.services;

import ac.za.cput.domain.TVShow;

import java.util.List;

/**
 * Created by User on 2015/09/12.
 */
public interface TVShowService {
    List<TVShow> getTVShow();

    TVShow getTVShowByID(long id);
    TVShow addTVShow(TVShow tvShow);
    void removeTVShow(TVShow tvShow);
    TVShow updateTVShow(TVShow tvShow);
}
