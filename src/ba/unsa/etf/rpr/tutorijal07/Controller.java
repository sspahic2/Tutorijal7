package ba.unsa.etf.rpr.tutorijal07;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;


public class Controller {
    private TextField ime;
    private TextField prezime;
    private TextField email;
    private TextField korisnickoIme;
    private TextField lozinka;
    @FXML private ListView<Korisnik> listView;

    @FXML
    public void dugme(ActionEvent event) {
        if(((Button)event.getSource()).getId().equals("dodajBtn")) {
            listView.getItems().add(new Korisnik());
        }

        if(((Button)event.getSource()).getId().equals("krajBtn")) {
            return;
        }
    }

    @FXML
    public void unos(ActionEvent event) {
        Korisnik k = new Korisnik();
        if (((TextField) event.getSource()).getId().equals("ime")) {
            k.setIme(((TextField) event.getSource()).getText());
        }
        listView.getItems().add(k);
    }
}