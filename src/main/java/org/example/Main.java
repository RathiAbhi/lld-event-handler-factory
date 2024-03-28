package org.example;

public class Main {
    public static void main(String[] args) {
        String[] events = {"order","payment","transport"};
        OrderHandler oh = new OrderHandler();
        PaymentHandler ph = new PaymentHandler();
        TransportHandler th = new TransportHandler();
        int i=0;
        while (i<events.length){
            if(events[i].equals("order")){
                oh.Process(events[i]);
            } else if (events[i].equals("payment")){
                ph.process(events[i]);
            } else {
                th.process(events[i]);
            }
            i++;
        }
    }
}