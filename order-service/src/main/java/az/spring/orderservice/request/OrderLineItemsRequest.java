package az.spring.orderservice.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderLineItemsRequest {

    private Long id;
    private String skuCode;
    private BigDecimal price;
    private Integer quantity;

}