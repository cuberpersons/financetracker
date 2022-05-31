package app;

public class Finance {
    String name;
    String purpose;
    String amount;

    public Finance(String name, String purpose, String amount) {
        this.name = name;
        this.purpose = purpose;
        this.amount = amount;
    }

    public String printString() {
        String result = "";
        result = "Your purchase from " + name + ", with a purpose of " + purpose + ", came out to be $" + amount;
        return result;
    }
}
