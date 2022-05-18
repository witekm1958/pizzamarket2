package pl.wszib.pizzamarket2.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("delivery")
public class DeliveryController {

    @GetMapping
    public String showDeliveryPage(Model model) {
        return "deliveryPage";
    }
}
