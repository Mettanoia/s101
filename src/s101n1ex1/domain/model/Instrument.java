package s101n1ex1.domain.model;

public final class Instrument implements Playable{

    private final InstrumentType type;
    private final String name;
    private final float price;

    Instrument(InstrumentType type, String name, float price) {

        if (name.isBlank())
            throw new IllegalArgumentException();

        this.name = name;

        if (price < 0.0)
            throw new IllegalArgumentException();

        this.price = price;
        this.type = type;

    }

    public String getName() {
        return name;
    }

    public float getPrice() {
        return price;
    }

    @Override
    public String play() {

        return switch (type) {
            case VENT -> "Està sonant un instrument de vent";
            case PERCUSSIO -> "Està sonant un instrument de percussió";
            case CORDA -> "Està sonant un instrument de coda";
        };

    }

}
