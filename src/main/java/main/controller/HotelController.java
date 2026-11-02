package main.controller;

import main.model.Hotel;
import main.service.IHotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController("/hotel")
public class HotelController {
    private final IHotelService iHotelService;

    HotelController(IHotelService iHotelService){
        this.iHotelService = iHotelService;
    }

    @GetMapping("/")
    public List<Hotel> getAllHotel(){
        return iHotelService.buscarTodosHoteis();
    }

}
