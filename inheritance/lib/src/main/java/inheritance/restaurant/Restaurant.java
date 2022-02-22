package inheritance.restaurant;

import inheritance.enums.numberOfStars;
import inheritance.enums.priceCategory;

import java.util.ArrayList;
import java.util.HashSet;

import static inheritance.enums.numberOfStars.*;

public class Restaurant {

    String name;
    String chain;
    inheritance.enums.priceCategory priceCategory;
    inheritance.enums.numberOfStars numberOfStarsOfRestaurant;
    public HashSet <Review> reviewsList = new HashSet<>();


    public Restaurant(String name, priceCategory priceCategory, String chain){
        this.name = name;
        this.priceCategory = priceCategory;
        this.numberOfStarsOfRestaurant = ZERO;
    }

    public void addReview(Review review){
        reviewsList.add(review);

        if (reviewsList.size() == 1){
            numberOfStarsOfRestaurant = ONE;
        } else if (reviewsList.size() == 2){
            numberOfStarsOfRestaurant = TWO;
        } else if (reviewsList.size() == 3){
            numberOfStarsOfRestaurant = THREE;
        } else if (reviewsList.size() == 4){
            numberOfStarsOfRestaurant = FOUR;
        } else {
            numberOfStarsOfRestaurant = FIVE;
        }
    }

    @Override
    public String toString(){
        String reviewsListString = "Number of Reviews: " + reviewsList.size();
        return "Restaurant: " + name + " has a " + numberOfStarsOfRestaurant + " star rating and a price category of " + priceCategory
                + ".\n" + reviewsListString;
    }

}
