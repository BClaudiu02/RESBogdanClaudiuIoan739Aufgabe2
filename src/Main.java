import UI.UI;
import Controller.ProdukteController;
import Repository.ProdukteRepository;


/**
 * Main class of program
 */
public class Main {
    public static void main(String[] args) {
        ProdukteRepository produkteRepository = new ProdukteRepository();
        ProdukteController produkteController = new ProdukteController(produkteRepository);
        UI ui = new UI(produkteController);
        ui.menu();
    }
}