package ac.za.cput.services;

import ac.za.cput.domain.Beverage;
import ac.za.cput.domain.Consumables;

import java.util.List;

/**
 * Created by User on 2015/08/10.
 */
public interface ConsumablesService {

    List<Beverage> getConsumables();
    Consumables getConsumables(long id);
    Consumables addConsumables(Beverage consumables);
    void removeConsumables(Beverage consumables);
    Consumables updateConsumables(Beverage consumables);
}
