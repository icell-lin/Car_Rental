package lab7.controller;

import lab7.repository.CarRepository;
import lab7.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CarRentalController {

    @Autowired
    private CarRepository carRepository;

    @Autowired
    private ClientRepository clientRepository;

    @GetMapping("/cars")
    public String showCarsPage(Model model) {
        model.addAttribute("cars", carRepository.findAll());
        model.addAttribute("title", "Наш автопарк");
        return "cars_list";
    }
}