package Multi_Current_Money4;

public class Euro extends Money {

    private String currency;

    public Euro (int amount, String currency) {
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