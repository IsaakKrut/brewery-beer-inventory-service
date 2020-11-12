package guru.sfg.brewery.model.events;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class NewBeerInventoryEvent extends BeerEvent {

    public NewBeerInventoryEvent(BeerDto beerDto) {
        super(beerDto);
    }
}
