/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package inheritance;

import inheritance.shops.Restaurant;

import java.util.HashSet;

public class Library {


    static HashSet <Restaurant> restaurantList = new HashSet<>();

    public static void addRestaurant(Restaurant restaurant){
        restaurantList.add(restaurant);
    }

}
