package Model;

public class Produkte {
    private String name;
    private int preis;
    private String herkunftsregion;

    public Produkte(String name, int preis, String herkunftsregion) {
        this.name = name;
        this.preis = preis;
        this.herkunftsregion = herkunftsregion;
    }

    public Produkte() {
        this.name = null;
        this.preis = 0;
        this.herkunftsregion = null;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPreis() {
        return preis;
    }

    public void setPreis(int preis) {
        this.preis = preis;
    }

    public String getHerkunftsregion() {
        return herkunftsregion;
    }

    public void setHerkunftsregion(String herkunftsregion) {
        this.herkunftsregion = herkunftsregion;
    }

    @Override
    public String toString() {
        return "Produkte{" +
                "name='" + name + '\'' +
                ", preis=" + preis +
                ", herkunftsregion='" + herkunftsregion + '\'' +
                '}';
    }
}
