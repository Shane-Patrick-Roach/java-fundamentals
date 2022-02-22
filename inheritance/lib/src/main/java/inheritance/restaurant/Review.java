package inheritance.restaurant;

import inheritance.enums.numberOfStars;

public class Review {

    String body;
    String author;
    numberOfStars numberOfStarsOfReview;
    Restaurant restaurant;

    public Review(String body, String author, numberOfStars numberOfStarsOfReview, Restaurant restaurant){
        this.body = body;
        this.author = author;
        this.numberOfStarsOfReview = numberOfStarsOfReview;
        this.restaurant = restaurant;
    }


    @Override
    public String toString(){
        return restaurant.name + " " + restaurant.priceCategory + "\nReview by " + author + ".\n" + body + "\nNumber of Reviews: " + numberOfStarsOfReview;
    }

}
