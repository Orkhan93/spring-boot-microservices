package az.spring.orderservice.mapper;

import az.spring.orderservice.model.OrderLineItems;
import az.spring.orderservice.request.OrderLineItemsRequest;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring",
unmappedSourcePolicy = ReportingPolicy.IGNORE,
unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface OrderMapper {

    OrderLineItems fromLineItemsRequestToLineItems(OrderLineItemsRequest orderLineItemsRequest);

}