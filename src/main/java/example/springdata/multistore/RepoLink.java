package example.springdata.multistore;


import example.springdata.multistore.meal.Meal;
import example.springdata.multistore.meal.MealRepository;
import example.springdata.multistore.restaurant.RestaurantRepository;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;



@Data
@Component

public class RepoLink {
    @Autowired
    private MealRepository mealRepository;
    @Autowired
    private RestaurantRepository restaurantRepository;

    public void repoLink(){
        Iterable<Meal> meals = mealRepository.findAll();
    }

}
