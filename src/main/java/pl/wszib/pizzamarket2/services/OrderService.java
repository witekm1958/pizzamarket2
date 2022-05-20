package pl.wszib.pizzamarket2.services;

import org.springframework.stereotype.Service;
import pl.wszib.pizzamarket2.data.entities.OrderAdressEntity;
import pl.wszib.pizzamarket2.data.entities.OrderEntity;
import pl.wszib.pizzamarket2.data.entities.PizzaEntity;
import pl.wszib.pizzamarket2.data.repositories.OrderRepository;
import pl.wszib.pizzamarket2.data.repositories.PizzaRepository;
import pl.wszib.pizzamarket2.web.mappers.OrderAddressMapper;
import pl.wszib.pizzamarket2.web.models.OrderAddressModel;

import javax.persistence.EntityNotFoundException;
import javax.transaction.Transactional;

@Service
public class OrderService {

    private final PizzaRepository pizzaRepository;
    private final OrderRepository orderRepository;

    public OrderService(PizzaRepository pizzaRepository, OrderRepository orderRepository) {
        this.pizzaRepository = pizzaRepository;
        this.orderRepository = orderRepository;
    }

    @Transactional
    public void saveOrder(Long pizzaId, OrderAddressModel orderAddressModel) {
        PizzaEntity pizzaEntity = pizzaRepository.findById(pizzaId).orElseThrow(EntityNotFoundException::new);

        OrderAdressEntity orderAdressEntity = OrderAddressMapper.toEntity(orderAddressModel);

        OrderEntity orderEntity = new OrderEntity();
        orderEntity.setPizzaName(pizzaEntity.getName());
        orderEntity.setOrderAdress(orderAdressEntity);

        orderRepository.save(orderEntity);
    }
}
