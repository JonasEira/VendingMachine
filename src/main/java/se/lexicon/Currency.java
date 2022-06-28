package se.lexicon;

public enum Currency {
    SEK1(1),
    SEK2(2),
    SEK5(5),
    SEK10(10),
    SEK20(20),
    SEK50(50),
    SEK100(100),
    SEK200(200),
    SEK500(500),
    SEK1000(1000);

    private final int value;
    private Currency(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
