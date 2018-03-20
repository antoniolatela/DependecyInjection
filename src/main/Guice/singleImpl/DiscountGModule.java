package main.Guice.singleImpl;

public class DiscountGModule extends com.google.inject.AbstractModule{

    @Override
    protected void configure() {
       bind(Discountable.class).to(EarlyBirdDiscount.class);
    }

}
