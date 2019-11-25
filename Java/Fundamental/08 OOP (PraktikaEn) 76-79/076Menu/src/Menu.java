
import java.util.ArrayList;

public class Menu {

    private ArrayList<String> meals;

    public Menu() {
        this.meals = new ArrayList<String>();
    }

   public void addMeal (String meal){
        meals.add(meal);
   }

    public void printMeals(){
        for (String st: meals) {
            System.out.println(st);
        };
    }

    public void clearMenu(){
        meals.clear();
    }
}
