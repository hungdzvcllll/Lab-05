package hust.soict.dsai.aims.screen;

import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;

import javafx.scene.control.TableView;
import javafx.beans.value.ObservableValue;



import javafx.beans.value.ChangeListener;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;

public class CartScreenController {
    private Cart cart;

    @FXML
    private TableView<Media> tblMedia;

    @FXML
    private Button btnPlay;

    @FXML
    private Button btnRemove;

    @FXML
    private TableColumn<Media, String> colMediaTitle;

    @FXML
    private TableColumn<Media, String> colMediaCategory;

    @FXML
    private TableColumn<Media, Float> colMediaCost;

    @FXML
    private Label l;

    public CartScreenController(Cart cart) {
        super();
        this.cart = cart;
    }

    @FXML
    private void initialize() {
        colMediaTitle.setCellValueFactory(
                new PropertyValueFactory<Media, String>("title"));
        colMediaCategory.setCellValueFactory(
                new PropertyValueFactory<Media, String>("category"));
        colMediaCost.setCellValueFactory(
                new PropertyValueFactory<Media, Float>("price"));
        tblMedia.setItems(cart.getList());
        l.setText(cart.totalCost()+"$");
        btnPlay.setVisible(false);
        btnRemove.setVisible(false);
        btnRemove.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
                Media media = tblMedia.getSelectionModel().getSelectedItem();
                cart.removeMedia(media);
                l.setText(cart.totalCost()+"$");
                
            }
        });

        tblMedia.getSelectionModel().selectedItemProperty().addListener(
                new ChangeListener<Media>() {
                    @Override
                    public void changed(ObservableValue<? extends Media> observable, Media oldValue, Media newValue) {
                        if (newValue != null) {
                            updateButtonBar(newValue);
                        }
                    }
                });
    }

    void updateButtonBar(Media media) {
        btnRemove.setVisible(true);
        if (media instanceof PlayAble) {
            btnPlay.setVisible(true);
        } else {
            btnPlay.setVisible(false);
        }
    }

}