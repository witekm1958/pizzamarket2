package pl.wszib.pizzamarket2.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.wszib.pizzamarket2.data.entities.PizzaEntity;
import pl.wszib.pizzamarket2.data.repositories.PizzaRepository;

import java.util.List;

@Controller
@RequestMapping("menu")
public class MenuController {

    private final PizzaRepository pizzaRepository;

    public MenuController(PizzaRepository pizzaRepository) {
        this.pizzaRepository = pizzaRepository;
    }

    @GetMapping
    public String showPizzaMenu(Model model) {
        List<PizzaEntity> pizzas = pizzaRepository.findAll();
        model.addAttribute("pizzas", pizzas);
        return "menuPage";
    }



}
