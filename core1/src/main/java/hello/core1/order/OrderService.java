package hello.core1.order;

public interface OrderService {
    Order createOrder(Long memberId, String name, int itemPrice);
}
