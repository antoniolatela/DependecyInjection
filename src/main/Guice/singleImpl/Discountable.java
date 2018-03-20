package main.Guice.singleImpl;

import com.google.inject.ImplementedBy;

@ImplementedBy(NightOwlDiscount.class)
public interface Discountable {
    double getDiscount ();
}
