package Multi_Current_Money4;

public class Crowns extends Money {

    private String currency;

    public Crowns (int amount, String currency) {
        super(amount, currency);
    }

    @Override
    protected String currency () {
        return currency;
    }

    public Money times (int multiplier) {
        return new Money(amount * multiplier, this.currency);
    }
}