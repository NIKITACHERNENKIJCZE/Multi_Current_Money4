package Multi_Current_Money4;

public class Money implements Expression {
    public String currency;
    protected int amount;

    public Money (int amount, String currency) {

    }

    public static Money crowns (int i) {
        return null;
    }

    public static Expression dollars (int i) {
        return null;
    }

    protected String currency(){
        return currency;
    }

    public Expression times(int multiplier) {
        return null;
    }

    public static Money Crowns(int amount) {
        return new Crowns (amount, "CZK");
    }

    public static Euro Euro(int amount) {
        return new Euro(amount, "EUR");
    }

    public boolean equal(Object object) {
        Money money = (Crowns) object;
        return amount == money.amount
                && this.currency == money.currency;
    }

    public Expression plus(Expression addend) {
        return new Sum(this, addend) {
            @Override
            public Money reduce (Bank String) {
                return null;
            }

            @Override
            public Expression plus (Expression addend) {
                return null;
            }

            @Override
            public Expression times (int multiplier) {
                return null;
            }
        };
    }

    @Override
    public Money reduce (Bank String) {
        return null;
    }

    @Override
    public Sum reduce (String to) {
        return null;
    }


}

