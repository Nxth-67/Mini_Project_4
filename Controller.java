import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.AnchorPane;

public class Controller {

    @FXML
    private Button button_submit;

    @FXML
    private CheckBox checkbox_network;

    @FXML
    private CheckBox checkbox_oop;

    @FXML
    private CheckBox checkbox_os;

    @FXML
    private DatePicker datepicker_dob;

    @FXML
    private ToggleGroup group_department;

    @FXML
    private AnchorPane label_result;

    @FXML
    private RadioButton radiobutton_ams;

    @FXML
    private RadioButton radiobutton_gic;

    @FXML
    private RadioButton radiobutton_gtr;

    @FXML
    private TextField textfield_name;

    @FXML
    void on_submit(ActionEvent event) {

    }

}
