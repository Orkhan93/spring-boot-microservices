package az.spring.orderservice.service;

import az.spring.orderservice.mapper.OrderMapper;
import az.spring.orderservice.model.Order;
import az.spring.orderservice.model.OrderLineItems;
import az.spring.orderservice.repository.OrderRepository;
import az.spring.orderservice.request.OrderRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
@Transactional
public class OrderService {

    private final OrderRepository orderRepository;
    private final OrderMapper orderMapper;

    public void placeOrder(OrderRequest orderRequest) {
        Order order = new Order();
        order.setOrderNumber(UUID.randomUUID().toString());
        List<OrderLineItems> orderLineItems = orderRequest.getOrderLineItemsRequestList()
                .stream().map(orderMapper::fromLineItemsRequestToLineItems).toList();

        order.setOrderLineItemsList(orderLineItems);
        orderRepository.save(order);
    }

}