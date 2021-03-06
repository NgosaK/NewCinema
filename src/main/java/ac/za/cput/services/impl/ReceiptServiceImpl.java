package ac.za.cput.services.impl;

import ac.za.cput.domain.Receipt;
import ac.za.cput.repository.ReceiptRepository;
import ac.za.cput.services.ReceiptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by User on 2015/08/10.
 */
@Service
public class ReceiptServiceImpl implements ReceiptService {

    @Autowired
    ReceiptRepository repository;

    @Override
    public List<Receipt> getReceipts() {

        List<Receipt> allReceipts= new ArrayList<Receipt>();
        Iterable<Receipt> receipts= repository.findAll();

        for(Receipt receipt: receipts)
        {
            allReceipts.add(receipt);
        }

        return allReceipts;
    }

    @Override
    public Receipt getReceipt(long id) {
        return repository.findOne(id);
    }

    @Override
    public Receipt addReceipt(Receipt receipt) {

        return repository.save(receipt);
    }

    @Override
    public void removeReceipt(Receipt receipt) {

         repository.delete(receipt);

    }


    @Override
    public Receipt updateReceipt(Receipt receipt) {

        return repository.save(receipt);
    }

}
