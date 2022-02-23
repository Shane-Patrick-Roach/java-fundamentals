package inheritance.shops;

import inheritance.enums.priceCategory;

import java.util.HashSet;

import static inheritance.enums.numberOfStars.*;

public class Shop {

    String name;
    String shopDescription;
    inheritance.enums.numberOfStars numberOfStars;
    inheritance.enums.priceCategory priceCategory;
    public HashSet<Review> reviewsList = new HashSet<>();


    public Shop(String name, String shopDescription, priceCategory priceCategory){
        this.name = name;
        this.shopDescription = shopDescription;
        this.priceCategory = priceCategory;
        this.numberOfStars = ZERO;
    }

    public void addReview(Review review) {
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

    @Override
    public String toString(){
        return  "Shop: " + name + " " + priceCategory + "\n" + shopDescription;
    }
}
