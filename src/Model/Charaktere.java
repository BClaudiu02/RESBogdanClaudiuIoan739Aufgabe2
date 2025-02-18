package Model;

import java.util.ArrayList;
import java.util.List;

public class Charaktere {
    private int id;
    private String name;
    private String herkunftsort;
    private List<Produkte> produkte;

    public Charaktere(int id, String name, String herkunftsort, List<Produkte> produkte) {
        this.id = id;
        this.name = name;
        this.herkunftsort = herkunftsort;
        this.produkte = produkte;
    }

    public Charaktere(int id, String name, String herkunftsort) {
        this.id = id;
        this.name = name;
        this.herkunftsort = herkunftsort;
        this.produkte = new ArrayList<>();
    }

    public Charaktere() {
        this.id = 0;
        this.name = null;
        this.herkunftsort = null;
        this.produkte = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHerkunftsort() {
        return herkunftsort;
    }

    public void setHerkunftsort(String herkunftsort) {
        this.herkunftsort = herkunftsort;
    }

    public List<Produkte> getProdukte() {
        return produkte;
    }

    public void setProdukte(List<Produkte> produkte) {
        this.produkte = produkte;
    }

    @Override
    public String toString() {
        return "Charaktere{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", herkunftsort='" + herkunftsort + '\'' +
                ", produkte=" + produkte +
                '}';
    }
}
