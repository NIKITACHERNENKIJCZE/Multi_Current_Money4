package Multi_Current_Money4;

public abstract class Sum implements Expression {
    public Money augmend;
    public Money addmend;

    public Sum (Money money, Expression addend) {
    }

    public abstract Money reduce (Bank String);

    @Override
    public Sum reduce (String to) {
        return null;
    }

    public abstract Expression plus (Expression addend);

    public abstract Expression times (int multiplier);
}
