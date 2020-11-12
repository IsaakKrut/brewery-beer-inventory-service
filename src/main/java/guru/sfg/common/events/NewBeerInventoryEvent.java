package guru.sfg.common.events;

import lombok.Builder;
import lombok.NoArgsConstructor;

@NoArgsConstructor
public class NewBeerInventoryEvent extends BeerEvent {

    public NewBeerInventoryEvent(BeerDto beerDto) {
        super(beerDto);
    }
}
