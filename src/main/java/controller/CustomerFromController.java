package controller;

import com.jfoenix.controls.JFXTextField;
import dto.Customer;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import service.ServiceFactory;
import service.custom.CustomerService;
import util.ServiceType;

public class CustomerFromController {

    @FXML
    private TableColumn colAddress;

    @FXML
    private TableColumn colId;

    @FXML
    private TableColumn colName;

    @FXML
    private TableColumn colSalary;

    @FXML
    private TableView tblCustomer;

    @FXML
    private TextField txtAddress;

    @FXML
    private JFXTextField txtId;

    @FXML
    private JFXTextField txtName;

    @FXML
    private TextField txtSalary;

    CustomerService service = ServiceFactory.getInstance().getServiceType(ServiceType.CUSTOMER);

    @FXML
    void btnAddCustomerOnAction(ActionEvent event) {

        String id = txtId.getText();
        String name = txtName.getText();
        String address = txtAddress.getText();
        double salary = Double.parseDouble(txtSalary.getText());

        Customer customer = new Customer(id,name,address,salary);

        service.addCustomer(customer);






    }

    @FXML
    void btnDeleteCustomerOnAction(ActionEvent event) {

    }

    @FXML
    void btnSearchCustomerOnAction(ActionEvent event) {

    }

    @FXML
    void btnUpdateCustomerOnAction(ActionEvent event) {

    }

}
