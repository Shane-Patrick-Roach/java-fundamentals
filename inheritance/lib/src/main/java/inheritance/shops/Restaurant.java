package inheritance.shops;

import java.util.HashSet;

import static inheritance.enums.numberOfStars.*;

public class Restaurant extends Shop{

    String name;
    String chain;
    inheritance.enums.priceCategory priceCategory;
    inheritance.enums.numberOfStars numberOfStars;
    public HashSet <Review> reviewsList = new HashSet<>();

    public Restaurant(String name, String shopDescription, inheritance.enums.priceCategory priceCategory, String chain) {
        super(name, shopDescription, priceCategory);
        numberOfStars = ZERO;
        this.chain = chain;
    }

    @Override
    public String toString(){
        String reviewsListString = "Number of Reviews: " + reviewsList.size();
        return "Restaurant: " + name + " has a " + numberOfStars + " star rating and a price category of " + priceCategory
                + ".\n" + reviewsListString;
    }

    @Override
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
}
