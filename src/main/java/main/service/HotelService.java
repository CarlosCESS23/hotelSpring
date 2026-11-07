package main.service;

import main.exception.DuplicationByIdException;
import main.exception.NotFoundIdHotelException;
import main.model.Hotel;
import main.repository.HotelRepository;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

@Service
public class HotelService implements IHotelService{
    HotelRepository repository;

    public HotelService(HotelRepository repository){
        this.repository = repository;
    }
//    private List<Hotel> lista_hotel(){
//        return List.of(
//                new Hotel(1L, "Tropical Executive Hotel", "Manaus", new BigDecimal("450.00"), 4, true),
//                new Hotel(2L, "Hotel Juma Ópera", "Manaus", new BigDecimal("890.00"), 5, true),
//                new Hotel(3L, "Blue Tree Premium", "Manaus", new BigDecimal("380.00"), 4, false),
//                new Hotel(4L, "Ibis Manaus Aeroporto", "Manaus", new BigDecimal("260.00"), 3, true)
//        );
//    }

    @Override
    public List<Hotel> buscarTodosHoteis() {
        return repository.findAll();
    }

    @Override
    public Hotel buscarPorId(long id) {
        Optional<Hotel> hotelSelecionado =  repository.findById(id);
        if(hotelSelecionado.isEmpty()){
            throw new NotFoundIdHotelException("Não foi possível encontra o ID, não existe");
        }
        return hotelSelecionado.get();
    }

    @Override
    public Hotel addHotel(Hotel hotel) {
        var verificar_duplicidade = buscarTodosHoteis().stream()
                .anyMatch(hotels -> hotels.getHotid() == hotel.getHotid());

        if (verificar_duplicidade){
            throw new DuplicationByIdException("ID duplicado, não será feito adição");
        }
        repository.save(hotel);
        return hotel;
    }

    @Override
    public Hotel rmHotel(long id) {
        Optional<Hotel> hotelSelecionado = repository.findById(id);

        if(hotelSelecionado.isEmpty()){
            throw new NotFoundIdHotelException("Não foi encontrado o ID, talvez tenha sido apagado");
        }
        repository.delete(hotelSelecionado.get());
        return hotelSelecionado.get();
    }
}
