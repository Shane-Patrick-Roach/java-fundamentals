/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package inheritance;

import inheritance.shops.*;
import org.junit.jupiter.api.Test;

import java.sql.SQLOutput;

import static inheritance.enums.numberOfStars.*;
import static inheritance.enums.priceCategory.*;


class LibraryTest {

    @Test
    void newMakeRestaurant() {
        Library sut = new Library();
        Restaurant toniesPizza = new Restaurant("Tony's Pizza", "Authentic American Pizza", $$, "private");
        Library.addRestaurant(toniesPizza);
        assert(sut.restaurantList.size()>0);
    }

    @Test
    void newMakeRestaurantToString() {
        Library sut = new Library();
        Restaurant toniesPizza = new Restaurant("Tony's Pizza", "Authentic American Pizza", $$, "private");
        System.out.println(toniesPizza);
        assert(toniesPizza.toString().equals("Restaurant: Tony's Pizza has a ZERO star rating and a price category of $$.\n" +
                "Number of Reviews: 0"));
    }

    @Test
    void newMakeReviewToStringAndAssociateWithRestaurant() {
        Library sut = new Library();
        Restaurant toniesPizza = new Restaurant("Tony's Pizza", "Authentic American Pizza", $$, "private");
        Review bobReview = new Review("This was really bad.", "Bob", FOUR, toniesPizza);
        System.out.println(bobReview);
        assert(bobReview.toString().equals("Tony's Pizza $$\n" +
                "Review by Bob.\n" +
                "This was really bad.\n" +
                "Number of Reviews: FOUR"));
    }


    @Test
    void makeReviewAboutRestaurant() {
        Library sut = new Library();
        Restaurant toniesPizza = new Restaurant("Tony's Pizza", "Authentic American Pizza", $$, "private");
        Review bobReview = new Review("This was really bad.", "Bob", FOUR, toniesPizza);
        toniesPizza.addReview(bobReview);
        assert(toniesPizza.reviewsList.size()>0);
    }


    @Test
    void newRestaurantReviewList() {
    Library sut = new Library();
        Restaurant toniesPizza = new Restaurant("Tony's Pizza", "Authentic American Pizza", $$, "private");
        Review bobReview = new Review("This was really bad.", "Bob", FOUR, toniesPizza);
        Review sallyReview = new Review("This was really good.", "Sally", TWO, toniesPizza);
        Review jimReview = new Review("Could have been better.", "Jim", THREE, toniesPizza);
        toniesPizza.addReview(bobReview);
        toniesPizza.addReview(sallyReview);
        toniesPizza.addReview(sallyReview);
        assert(toniesPizza.reviewsList.size() == 2);
    }


    @Test
    void testNewShop(){
        Shop sut = new Shop("Martin's Bookstore", "We have all the books.", $);
        assert(sut.toString().equals("Shop: Martin's Bookstore $\n" +
                "We have all the books."));
    }


    @Test
    void testNewShopReview(){
        Shop sut = new Shop("Martin's Bookstore", "We have all the books.", $);
        Review jimReview = new Review("Could have been better.", "Jim", THREE, sut );
        sut.addReview(jimReview);
        assert(sut.reviewsList.size() > 0);
    }

    @Test
    void testNewTheaterAddMovie(){
        Theater bobsTheater = new Theater("Bob's Theater", "Come watch a movie!", $$$);
        bobsTheater.addMovie("The Phantom Menace");
        assert(bobsTheater.moviesList.size() > 0);
    }

    @Test
    void testNewTheaterRemoveMovie(){
        Theater bobsTheater = new Theater("Bob's Theater", "Come watch a movie!", $$$);
        bobsTheater.addMovie("The Phantom Menace");
        bobsTheater.removeMovie("The Phantom Menace");
        assert(bobsTheater.moviesList.size() == 0);
    }

    @Test
    void addNewTheaterReview(){
        Theater bobsTheater = new Theater("Bob's Theater", "Come watch a movie!", $$$);
        bobsTheater.addMovie("The Phantom Menace");
        Review jimReview = new Review("Could have been better.", "Jim", THREE, bobsTheater);
        bobsTheater.addReview(jimReview, null);
        assert(bobsTheater.reviewsList.size() > 0);
    }

    @Test
    void addNewTheaterAndNewShopReview(){
        Restaurant bookStore = new Restaurant("Martin's Bookstore", "We have all the books.", $, "Mcdonalds");
        Review jimReview = new Review("Could have been better.", "Jim", THREE, bookStore);
        Theater bobsTheater = new Theater("Bob's Theater", "Come watch a movie!", $$$);
        bobsTheater.addMovie("The Phantom Menace");
        bobsTheater.addReview(jimReview, "The Phantom Menace");
        bookStore.addReview(jimReview);
        assert(bookStore.reviewsList.size() > 0 || bobsTheater.reviewsList.size() > 0);
    }
}