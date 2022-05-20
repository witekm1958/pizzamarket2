package pl.wszib.pizzamarket2.data.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.wszib.pizzamarket2.data.entities.OrderEntity;

@Repository
public interface OrderRepository extends JpaRepository<OrderEntity, Long > {
}
