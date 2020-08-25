package guru.sfg.beer.order.service.services.beer;

import guru.sfg.beer.order.service.web.model.BeerDto;

import java.util.Optional;
import java.util.UUID;

/*
 * Created by Nibir Hossain on 25.08.20
 */
public interface BeerService {
    Optional<BeerDto> getBeerById(UUID beerId);
    Optional<BeerDto> getBeerByUpc(String upc);
}
