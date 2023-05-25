package az.spring.orderservice.mapper;

import az.spring.orderservice.model.OrderLineItems;
import az.spring.orderservice.request.OrderLineItemsRequest;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-05-21T21:30:37+0400",
    comments = "version: 1.5.2.Final, compiler: javac, environment: Java 19.0.1 (Oracle Corporation)"
)
@Component
public class OrderMapperImpl implements OrderMapper {

    @Override
    public OrderLineItems fromLineItemsRequestToLineItems(OrderLineItemsRequest orderLineItemsRequest) {
        if ( orderLineItemsRequest == null ) {
            return null;
        }

        OrderLineItems orderLineItems = new OrderLineItems();

        orderLineItems.setId( orderLineItemsRequest.getId() );
        orderLineItems.setSkuCode( orderLineItemsRequest.getSkuCode() );
        orderLineItems.setPrice( orderLineItemsRequest.getPrice() );
        orderLineItems.setQuantity( orderLineItemsRequest.getQuantity() );

        return orderLineItems;
    }
}
