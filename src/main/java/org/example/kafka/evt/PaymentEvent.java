package org.example.kafka.evt;


import org.example.kafka.enums.PaymentStatus;

public class PaymentEvent {

    private Long orderId;
    private PaymentStatus status;

    public PaymentEvent(Long orderId) {
        this.orderId = orderId;
    }

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public PaymentStatus getStatus() {
        return status;
    }

    public void setStatus(PaymentStatus status) {
        this.status = status;
    }
}
