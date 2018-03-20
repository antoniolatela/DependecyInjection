package main.Guice.singleImpl;

import com.google.inject.Guice;
import com.google.inject.Injector;

public class Main {

    public static void main(String[] args) {
        Injector guice = Guice.createInjector(new DiscountGModule());
        CheckoutService service = guice.getInstance(CheckoutService.class);
        
        service.checkout(100.00D);
    }
}
