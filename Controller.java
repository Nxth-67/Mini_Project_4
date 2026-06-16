import java.io.FileWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.Labeled;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;

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
    private Label label_output;

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
            name = textfield_name.getText();
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
        String result = //
        "- Name: " + name + "\n" +
                        "- DOB: " + dob + "\n" +
                        "- Department: " + department + "\n" +
                        "- Courses: " + String.join(", ", courses) + "\n";
        if (courses.size() == 0) {
            result = result + " - N/A";
        }else {
            for (int i = 0; i < courses.size(); i++) {
                result = result + " -" + courses.get(i) + "\n";
            }

            Date date = new Date();
            DateFormat format_date = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
            String formatted_date = format_date.format(date);
            System.out.println(formatted_date);

            try {
                FileWriter writer = new FileWriter(format_date.format(date) + ".txt");
                writer.write(result + "\n");
                writer.close();
                label_output.setText("Saved to" + format_date.format(date) + ".txt");
            } catch (Exception e) {
            }

        }
    }
}

