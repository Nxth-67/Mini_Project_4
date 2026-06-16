import java.util.ArrayList;
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

        //
        String name = "N/A";
        if (textfield_name.getText() != " ") {
            textfield_name.getText();
        } 
        
        //
        String dob = "N/A";
        if (datepicker_dob.getValue() != null) {
            dob = datepicker_dob.getValue().toString();
        }
        //
        String department = "N/A";
        if (radiobutton_ams.isSelected()) {
            department = "AMS";
        } else if (radiobutton_gic.isSelected()) {
            department = "GIC";
        } else if (radiobutton_gtr.isSelected()) {
            department = "GTR";
        }

        //
        ArrayList<String> courses = new ArrayList<>();
        if (checkbox_network.isSelected()) {
            courses.add("Network");
        }
        if (checkbox_oop.isSelected()) {
            courses.add("OOP");
        }
        if (checkbox_os.isSelected()) {
            courses.add("OS");
        }

        // Print the result
        System.out.println("Name: " + name);
        System.out.println("Date of Birth: " + dob);
        System.out.println("Department: " + department);
        System.out.println("Courses: " + String.join(", ", courses));
    }
}
