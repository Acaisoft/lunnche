package example.springdata.multistore.meal;

import org.springframework.data.repository.CrudRepository;

public interface MealRepository extends CrudRepository<Meal,Long> {

}
