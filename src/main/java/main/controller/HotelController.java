package main.controller;

import main.exception.NotFoundIdHotelException;
import main.model.Hotel;
import main.service.IHotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/hotel")
public class HotelController {
    private final IHotelService iHotelService;

    HotelController(IHotelService iHotelService){
        this.iHotelService = iHotelService;
    }

    @GetMapping("/")
    public List<Hotel> getAllHotel(){
        return iHotelService.buscarTodosHoteis();
    }

    @GetMapping("/{id}")
    public Hotel getHotelById(@PathVariable long id){
        return iHotelService.buscarPorId(id);
    }

    @PostMapping("/")
    public Hotel addHotel(@RequestBody Hotel hotel){
        return iHotelService.addHotel(hotel);
    }

    @DeleteMapping("/{id}")
    public Hotel rmHotel(@PathVariable long id){
        return iHotelService.rmHotel(id);
    }
}
