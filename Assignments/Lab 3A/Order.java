public class Order {

    private String orderCode;
    private int orderPriority;

    public Order(String code, int priority)
    {
        orderCode = code;
        orderPriority = priority;
    }

    public String getOrderCode()
    {
        return orderCode;
    }

    public int getOrderPriority()
    {
        return orderPriority;
    }

    public String toString()
    {
        return orderCode + ":" + orderPriority;
    }

}
