package ac.za.cput.services.impl;

import ac.za.cput.domain.Beverage;
import ac.za.cput.repository.BeverageRepository;
import ac.za.cput.services.BeverageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by User on 2015/09/12.
 */
@Service
public class BeverageServiceImpl implements BeverageService {

    @Autowired
    private BeverageRepository repository;

    @Override
    public List<Beverage> getBeverages() {
        List<Beverage> allBeverages = new ArrayList<>();
        Iterable<Beverage> beverages = repository.findAll();
        for (Beverage beverage : beverages) {
            allBeverages.add(beverage);
        }
        return allBeverages;
    }

    @Override
    public Beverage getBeverageByID(long id) {
        return repository.findOne(id);    }

    @Override
    public Beverage addBeverage(Beverage beverage) {
        return repository.save(beverage);
    }

    @Override
    public void removeBeverage(Beverage beverage) {
        repository.delete(beverage);

    }

    @Override
    public Beverage updateBeverage(Beverage beverage) {
        return repository.save(beverage);    }
}
