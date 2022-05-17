package pl.wszib.pizzamarket2.data.entities;

import javax.persistence.*;

@Entity
@Table(name = "orders")
public class OrderEntity {
    @Id
    @GeneratedValue
    @Column(name = "id")
    private Long id;
    @Column(name = "pizza_name")
    private String pizzaName;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "order_address_id")
    private OrderAdressEntity orderAdress;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPizzaName() {
        return pizzaName;
    }

    public void setPizzaName(String pizzaName) {
        this.pizzaName = pizzaName;
    }

    public OrderAdressEntity getOrderAdress() {
        return orderAdress;
    }

    public void setOrderAdress(OrderAdressEntity orderAdress) {
        this.orderAdress = orderAdress;
    }
}
