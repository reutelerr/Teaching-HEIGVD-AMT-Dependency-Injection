package ch.heigvd.amt;

import ch.heigvd.amt.fishing.Fish;
import ch.heigvd.amt.fishing.Fisherman;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Fisherman fisherman = new Fisherman();
        Fish meal = fisherman.goGetFish();
        meal.eat();
    }
}
