package edil.secure.product_service.service;

import edil.secure.product_service.repositories.WarehouseRepository;
import org.springframework.stereotype.Service;

@Service
public class WarehouseService {
    private final WarehouseRepository warehouseRepository;

    public WarehouseService(WarehouseRepository warehouseRepository) {
        this.warehouseRepository = warehouseRepository;
    }

    public Integer findQuantity(){
        return warehouseRepository.findAll().size();
    }


}
