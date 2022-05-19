package pl.wszib.pizzamarket2.data.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.wszib.pizzamarket2.data.entities.PizzaEntity;

@Repository
public interface PizzaRepository extends JpaRepository<PizzaEntity, Long> {
}
