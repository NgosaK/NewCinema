package ac.za.cput.services;

import ac.za.cput.domain.Movie;

import java.util.List;

/**
 * Created by User on 2015/09/12.
 */
public interface MovieService {

    List<Movie> getMovie();

    Movie getMovieByID(long id);
    Movie addMovie(Movie movie);
    void removeMovie(Movie movie);
    Movie updateMovie(Movie movie);

}
