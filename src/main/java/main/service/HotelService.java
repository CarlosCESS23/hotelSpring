package main.service;

import main.model.Hotel;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Service
public class HotelService implements IHotelService{
    List<Hotel> listaHotel = new ArrayList<>();


    public HotelService(){
        this.listaHotel = lista_hotel();
    }
    private List<Hotel> lista_hotel(){
        return List.of(
                new Hotel(1L, "Tropical Executive Hotel", "Manaus", new BigDecimal("450.00"), 4, true),
                new Hotel(2L, "Hotel Juma Ópera", "Manaus", new BigDecimal("890.00"), 5, true),
                new Hotel(3L, "Blue Tree Premium", "Manaus", new BigDecimal("380.00"), 4, false),
                new Hotel(4L, "Ibis Manaus Aeroporto", "Manaus", new BigDecimal("260.00"), 3, true)
        );

    }

    @Override
    public List<Hotel> buscarTodosHoteis() {
        return listaHotel;
    }
}
