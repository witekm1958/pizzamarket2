package pl.wszib.pizzamarket2.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.wszib.pizzamarket2.data.entities.OrderEntity;
import pl.wszib.pizzamarket2.data.repositories.OrderRepository;

import java.util.List;

@Controller
@RequestMapping("orders")
public class OrderController {

    private final OrderRepository orderRepository;

    public OrderController(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    @GetMapping
    public String showOrderPage(Model model) {
        List<OrderEntity> orders = orderRepository.findAll();
        model.addAttribute("orders", orders);
        return "orderPage";
    }
}
