package main.service;

import main.model.Hotel;

import java.util.List;
import java.util.Optional;

public interface IHotelService {
    public List<Hotel> buscarTodosHoteis();
    public Hotel buscarPorId(long id);
    public Hotel addHotel(Hotel hotel);
    public Hotel rmHotel(long id);
}
