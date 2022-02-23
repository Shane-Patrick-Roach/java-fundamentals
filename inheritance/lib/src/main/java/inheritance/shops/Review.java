package inheritance.shops;

import inheritance.enums.numberOfStars;

public class Review {

    String movieName;
    String body;
    String author;
    numberOfStars numberOfStarsOfReview;
    Shop shop;

    public Review(String body, String author, numberOfStars numberOfStarsOfReview, Shop shop){
        this.body = body;
        this.author = author;
        this.numberOfStarsOfReview = numberOfStarsOfReview;
        this.shop = shop;
        String movieName = null;
    }

    @Override
    public String toString() {

        if (movieName != null) {
            return shop.name + " " + shop.priceCategory + "\nReview by " + author + " about the movie, " + movieName + ".\n" + body + "\nNumber of Reviews: " + numberOfStarsOfReview;
        } else {
            return shop.name + " " + shop.priceCategory + "\nReview by " + author + ".\n" + body + "\nNumber of Reviews: " + numberOfStarsOfReview;
        }
    }

}
