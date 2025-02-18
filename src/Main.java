import Controller.CharaktereController;
import Model.Charaktere;
import Model.Produkte;
import Repository.CharaktereRepository;
import UI.UI;
import Controller.ProdukteController;
import Repository.ProdukteRepository;

import java.util.ArrayList;
import java.util.List;


public class Main {

    public static void main(String[] args) {
        CharaktereRepository charaktereRepository = new CharaktereRepository();
        ProdukteRepository produkteRepository = new ProdukteRepository();
        CharaktereController charaktereController = new CharaktereController(charaktereRepository);
        ProdukteController produkteController = new ProdukteController(produkteRepository);
        UI ui = new UI(produkteController, charaktereController);
        ui.menu();
    }
}