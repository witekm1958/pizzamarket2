package pl.wszib.pizzamarket2.web.mappers;

import pl.wszib.pizzamarket2.data.entities.OrderAdressEntity;
import pl.wszib.pizzamarket2.web.models.OrderAddressModel;

public class OrderAddressMapper {

    public static OrderAdressEntity toEntity(OrderAddressModel model) {
        OrderAdressEntity entity = new OrderAdressEntity();
        entity.setFirstName(model.getFirstName());
        entity.setLastName(model.getLastName());
        entity.setStreet(model.getStreet());
        entity.setPostalCode(model.getPostalCode());
        entity.setCity(model.getCity());
        return entity;
    }
}
