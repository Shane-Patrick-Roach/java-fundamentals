package inheritance.shops;

import inheritance.enums.numberOfStars;

import java.util.HashSet;

import static inheritance.enums.numberOfStars.*;
import static inheritance.enums.numberOfStars.FIVE;

public class Theater extends Shop{


    public HashSet<Review> reviewsList = new HashSet<>();
    public HashSet <String> moviesList = new HashSet<>();

    public Theater(String name, String shopDescription, inheritance.enums.priceCategory priceCategory) {
        super(name, shopDescription, priceCategory);
        numberOfStars = ZERO;
    }


    public void addReview(Review review, String movieName) {
        review.movieName = movieName;
        reviewsList.add(review);
        if (reviewsList.size() == 1){
            numberOfStars = ONE;
        } else if (reviewsList.size() == 2){
            numberOfStars = TWO;
        } else if (reviewsList.size() == 3){
            numberOfStars = THREE;
        } else if (reviewsList.size() == 4){
            numberOfStars = FOUR;
        } else {
            numberOfStars = FIVE;
        }
    }

    public void addMovie(String movie){
        moviesList.add(movie);
    }

    public void removeMovie(String movie){
        moviesList.remove(movie);
    }


    @Override
    public String toString(){

        String stringBuilder = "Theater: " + name + " " + priceCategory + "\nNow Showing:";
        int counter = 1;
        for (String movie : moviesList){

            stringBuilder += "\nMovie " + counter + ": " + movie;
            counter ++;
        }
        return  stringBuilder;
    }


}
