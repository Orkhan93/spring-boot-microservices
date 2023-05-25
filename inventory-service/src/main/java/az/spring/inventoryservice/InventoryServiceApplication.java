package az.spring.inventoryservice;

import az.spring.inventoryservice.mode.Inventory;
import az.spring.inventoryservice.repository.InventoryRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class InventoryServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(InventoryServiceApplication.class, args);
    }

    @Bean
    public CommandLineRunner loadData(InventoryRepository inventoryRepository) {
        return args -> {

            Inventory inventory = new Inventory();
            inventory.setSkuCode("iphone_12Plus");
            inventory.setQuantity(100);

            Inventory inventory1 = new Inventory();
            inventory.setSkuCode("Nokia_6233");
            inventory.setQuantity(0);

            Inventory inventory2 = new Inventory();
            inventory.setSkuCode("Samsung-S6");
            inventory.setQuantity(20);

            inventoryRepository.save(inventory);
            inventoryRepository.save(inventory1);
            inventoryRepository.save(inventory2);

        };
    }

}