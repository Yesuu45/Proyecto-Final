package co.edu.uniquindio.poo.view;

import java.net.URL;
import java.util.ResourceBundle;

import co.edu.uniquindio.poo.App;
import co.edu.uniquindio.poo.controller.*;
import co.edu.uniquindio.poo.model.Cliente;
import co.edu.uniquindio.poo.model.Transaccion;
import co.edu.uniquindio.poo.model.Vehiculo;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;



public class SecondaryEmpleadoView {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    /*
     * No Modificar
     * Panel 1: Gestionar Clientes
     */
    @FXML
    private Pane gestionarClientesPane;
    @FXML
    private Button ClientesPaneActualizarButton;
    @FXML
    private Button ClientesPaneEliminarButton;
    @FXML
    private Button ClientesPaneLimpiarCamposButton;
    @FXML
    private Button ClientesPaneRegistrarClienteButton;
    @FXML
    private TextField ClientesPaneDireccionField;
    @FXML
    private TextField ClientesPaneEmailField;
    @FXML
    private TextField ClientesPaneIDField;
    @FXML
    private TextField ClientesPaneNombreField;
    @FXML
    private TextField ClientesPanePasswordField;
    @FXML
    private TextField ClientesPaneSecretWordField;
    @FXML
    private TextField ClientesPaneTelField;
    @FXML
    private TextField ClientesPaneUserNameField;
    @FXML
    private TableView<Cliente> paneClientesTablaCRegitrados;
    @FXML
    private TableColumn<Cliente, String> tablaClientesRegistradosID;
    @FXML
    private TableColumn<Cliente, String> tablaClientesRegistradosNombre;
    @FXML
    private TableColumn<Cliente, String> tablaClientesRegistradosDireccion;
    @FXML
    private TableColumn<Cliente, String> tablaClientesRegistradosEmail;
    @FXML
    private TableColumn<Cliente, String> tablaClientesRegistradosTelefono;

    /*
     * No Modificar
     * Panel 2: Gestionar Vehiculos
     */
    @FXML
    private Pane gestionarVehiculosPane;
    @FXML
    private Button gestionarVehiculosEliminarButton;
    @FXML
    private Button gestionarVehiculosRegistrarVehiculoButton;
    @FXML
    private Label gestionarVehiculosLabelMatricula;
    @FXML
    private TableView<Vehiculo> gestionarVehiculosTablaDeEspera;
    @FXML
    private TableColumn<Vehiculo, Boolean> tablaDeEsperaEstado;
    @FXML
    private TableColumn<Vehiculo, String> tablaDeEsperaMatricula;
    @FXML
    private TableColumn<Vehiculo, String> tablaDeEsperaModelo;
    @FXML
    private TableColumn<Vehiculo, String> tablaDeEsperaTipo;

    @FXML
    private TableView<Vehiculo> gestionarVehiculosTablaRegistro;
    @FXML
    private TableColumn<Vehiculo, String> tablaRegistroMatricula;
    @FXML
    private TableColumn<Vehiculo, String> tablaRegistroModelo;
    @FXML
    private TableColumn<Vehiculo, String> tablaRegistroTipo;

    /*
     * No Modificar
     * Panel 3: Gestionar Transacciones
     */
    @FXML
    private Pane gestionarTransaccionesPane;
    @FXML
    private TableView<Cliente> tablaTransaccionCliente;
    @FXML
    private TableColumn<Cliente, String> idClienteTransaccionColumna;
    @FXML
    private TableColumn<Cliente, String> nombreClienteTransaccionColumna;

    @FXML
    private TableView<Vehiculo> tablaTransaccionVehiculo;
    @FXML
    private TableColumn<Vehiculo, String> matriculaVehiculoTransaccionColumna;
    @FXML
    private TableColumn<Vehiculo, String> modeloVehiculoTransaccionColumna;
    @FXML
    private TableColumn<Vehiculo, Boolean> disponibleVehiculoTransaccionColumna;
    @FXML
    private TableColumn<Vehiculo, String> tipoVehiculoTransaccionColumna;

    @FXML
    private TableView<Transaccion> tablaTransacciones;
    @FXML
    private TableColumn<Transaccion, String> transaccionesColumnaCliente;
    @FXML
    private TableColumn<Transaccion, String> transaccionesColumnaVehiculo;
    @FXML
    private TableColumn<Transaccion, String> transaccionesColumnaCodigo;
    @FXML
    private TableColumn<Transaccion, String> transaccionesColumnaEmpleado;
    @FXML
    private TableColumn<Transaccion, String> transaccionesColumnaTipo;

    @FXML
    private Label TransaccionLabelMatricula;
    @FXML
    private Label transaccionLabelID;
    @FXML
    private Button transaccionActualizarButton;
    @FXML
    private Button transaccionEliminarButton;
    @FXML
    private Button transaccionProcesarButton;
    @FXML
    private TextField transaccionCodigoField;
    @FXML
    private TextField numeroDeDias;
    @FXML
    private ChoiceBox<String> transaccionChoiceBox;

    /*
     * No Modificar
     * Panel 4: Transacciones que ha hecho el Empleado
     */
    @FXML
    private Pane registroPane;
    @FXML
    private Label registroPaneNumeroTransaccionesLabel;
    @FXML
    private Button registroPaneVolverButton;
    @FXML
    private TableView<Transaccion> registroPaneTablaTransacciones;
    @FXML
    private TableColumn<Transaccion, String> tablaTransaccionesEmpleadoTipo;
    @FXML
    private TableColumn<Transaccion, String> tablaTransaccionesEmpleadoCliente;
    @FXML
    private TableColumn<Transaccion, String> tablaTransaccionesEmpleadoMatricula;

    /*
     * No Modificar
     * Principal: Botones de Navegacion y Label
     */
    @FXML
    private Button gestionarClientesButton;
    @FXML
    private Button gestionarVehiculosButton;
    @FXML
    private Button verRegistroButton;
    @FXML
    private Button gestionarTransaccionesButton;
    @FXML
    private Label empleadoNombre;

    private App app;
    private SecondaryEmpleadoController controller;

    /**
     * Método de inicialización de la vista.
     * Configura la visibilidad inicial de los elementos y las acciones de los botones.
     */
    @FXML
    private void initialize() {
        // Configura la visibilidad inicial de ciertos elementos
        transaccionLabelID.setVisible(false);
        TransaccionLabelMatricula.setVisible(false);

        // Configura acciones para botones y listeners para tablas
        transaccionEliminarButton.setOnAction(e -> eliminarTransaccionSeleccionada());

        tablaTransaccionCliente.getSelectionModel().selectedItemProperty()
                .addListener((observable, oldValue, newValue) -> {
                    if (newValue != null) {
                        transaccionLabelID.setText("ID Cliente: " + newValue.getId());
                        transaccionLabelID.setVisible(true);
                    } else {
                        transaccionLabelID.setVisible(false);
                    }
                });

        tablaTransaccionVehiculo.getSelectionModel().selectedItemProperty()
                .addListener((observable, oldValue, newValue) -> {
                    if (newValue != null) {
                        TransaccionLabelMatricula.setText("Matrícula: " + newValue.getMatricula());
                        TransaccionLabelMatricula.setVisible(true);
                    } else {
                        TransaccionLabelMatricula.setVisible(false);
                    }
                });

        // Inicializa la visibilidad de los paneles
        gestionarClientesPane.setVisible(false);
        gestionarVehiculosPane.setVisible(false);
        gestionarTransaccionesPane.setVisible(false);
        registroPane.setVisible(true);
        numeroDeDias.setVisible(false);
        gestionarVehiculosLabelMatricula.setVisible(false);

        // Llena el ChoiceBox con opciones de transacción
        transaccionChoiceBox.getItems().addAll("Alquiler", "Compra", "Venta");

        transaccionChoiceBox.getSelectionModel().selectedItemProperty()
                .addListener((observable, oldValue, newValue) -> {
                    numeroDeDias.setVisible("Alquiler".equals(newValue));
                });

        transaccionProcesarButton.setOnAction(e -> procesarTransaccion());

        // Configura las columnas de las tablas
        matriculaVehiculoTransaccionColumna.setCellValueFactory(
                cellData -> new SimpleStringProperty(cellData.getValue().getMatricula()));
        modeloVehiculoTransaccionColumna.setCellValueFactory(
                cellData -> new SimpleStringProperty(cellData.getValue().getModelo()));
        disponibleVehiculoTransaccionColumna.setCellValueFactory(
                cellData -> new SimpleBooleanProperty(cellData.getValue().isDisponible()).asObject());
        tipoVehiculoTransaccionColumna.setCellValueFactory(
                cellData -> new SimpleStringProperty(cellData.getValue().getClass().getSimpleName()));

        gestionarVehiculosTablaDeEspera.getSelectionModel().selectedItemProperty()
                .addListener((observable, oldValue, newValue) -> {
                    if (newValue != null) {
                        gestionarVehiculosLabelMatricula.setVisible(true);
                        gestionarVehiculosLabelMatricula.setText("Matrícula: " + newValue.getMatricula());
                    } else {
                        gestionarVehiculosLabelMatricula.setText("Seleccione un vehículo");
                    }
                });

        tablaDeEsperaMatricula.setCellValueFactory(
                cellData -> new SimpleStringProperty(cellData.getValue().getMatricula()));
        tablaDeEsperaModelo.setCellValueFactory(
                cellData -> new SimpleStringProperty(cellData.getValue().getModelo()));
        tablaDeEsperaTipo.setCellValueFactory(
                cellData -> new SimpleStringProperty(cellData.getValue().getClass().getSimpleName()));
        tablaDeEsperaEstado.setCellValueFactory(
                cellData -> new SimpleBooleanProperty(cellData.getValue().isDisponible()));

        tablaRegistroMatricula.setCellValueFactory(
                cellData -> new SimpleStringProperty(cellData.getValue().getMatricula()));
        tablaRegistroModelo.setCellValueFactory(
                cellData -> new SimpleStringProperty(cellData.getValue().getModelo()));
        tablaRegistroTipo.setCellValueFactory(
                cellData -> new SimpleStringProperty(cellData.getValue().getClass().getSimpleName()));

        tablaClientesRegistradosID.setCellValueFactory(
                cellData -> new SimpleStringProperty(cellData.getValue().getId()));
        tablaClientesRegistradosNombre.setCellValueFactory(
                cellData -> new SimpleStringProperty(cellData.getValue().getNombre()));
        tablaClientesRegistradosDireccion.setCellValueFactory(
                cellData -> new SimpleStringProperty(cellData.getValue().getDireccion()));
        tablaClientesRegistradosEmail.setCellValueFactory(
                cellData -> new SimpleStringProperty(cellData.getValue().getCorreo()));
        tablaClientesRegistradosTelefono.setCellValueFactory(
                cellData -> new SimpleStringProperty(cellData.getValue().getTelefono()));

        tablaTransaccionesEmpleadoTipo.setCellValueFactory(
                cellData -> new SimpleStringProperty(cellData.getValue().getClass().getSimpleName()));
        tablaTransaccionesEmpleadoCliente.setCellValueFactory(
                cellData -> new SimpleStringProperty(cellData.getValue().getCliente().getNombre()));
        tablaTransaccionesEmpleadoMatricula.setCellValueFactory(
                cellData -> new SimpleStringProperty(cellData.getValue().getVehiculo().getMatricula()));

        transaccionesColumnaCliente.setCellValueFactory(
                cellData -> new SimpleStringProperty(cellData.getValue().getCliente().getNombre()));
        transaccionesColumnaVehiculo.setCellValueFactory(
                cellData -> new SimpleStringProperty(cellData.getValue().getVehiculo().getMatricula()));
        transaccionesColumnaCodigo.setCellValueFactory(
                cellData -> new SimpleStringProperty(cellData.getValue().getCodigo()));
        transaccionesColumnaEmpleado.setCellValueFactory(
                cellData -> new SimpleStringProperty(cellData.getValue().getEmpleado().getNombre()));
        transaccionesColumnaTipo.setCellValueFactory(
                cellData -> new SimpleStringProperty(cellData.getValue().getClass().getSimpleName()));

        idClienteTransaccionColumna.setCellValueFactory(
                cellData -> new SimpleStringProperty(cellData.getValue().getId()));
        nombreClienteTransaccionColumna.setCellValueFactory(
                cellData -> new SimpleStringProperty(cellData.getValue().getNombre()));

        // Configura acciones para botones de gestión
        gestionarVehiculosRegistrarVehiculoButton.setOnAction(e -> registrarVehiculoDesdeEspera());
        gestionarVehiculosEliminarButton.setOnAction(e -> eliminarVehiculoRegistradoSeleccionado());
        ClientesPaneRegistrarClienteButton.setOnAction(e -> registrarCliente());
        ClientesPaneActualizarButton.setOnAction(e -> actualizarCliente());
        ClientesPaneEliminarButton.setOnAction(e -> eliminarCliente());
        ClientesPaneLimpiarCamposButton.setOnAction(e -> limpiarCampos());
        gestionarClientesButton.setOnAction(e -> showPanel(gestionarClientesPane));
        gestionarVehiculosButton.setOnAction(e -> showPanel(gestionarVehiculosPane));
        gestionarTransaccionesButton.setOnAction(e -> showPanel(gestionarTransaccionesPane));
        verRegistroButton.setOnAction(e -> showPanel(registroPane));
        registroPaneVolverButton.setOnAction(e -> openPrimaryView());

        paneClientesTablaCRegitrados.getSelectionModel().selectedItemProperty()
                .addListener((observable, oldValue, newValue) -> {
                    if (newValue != null) {
                        mostrarDatosCliente(newValue);
                    }
                });

        registroPaneVolverButton.setOnAction(e -> openPrimaryView());
    }

    /**
     * Actualiza la vista con los datos más recientes del controlador.
     * Refresca las tablas y actualiza las etiquetas de información.
     */
    public void actualizarVista() {

        empleadoNombre.setText("!Hola " + app.getEmpleadoAutenticado().getNombre() + "!");


        tablaTransaccionVehiculo.setItems(controller.obtenerVehiculosRegistrados());

        ObservableList<Transaccion> transaccionesGeneral = FXCollections
                .observableArrayList(controller.getTransaccionesSistema());
        ObservableList<Transaccion> transaccionesEmpleado = FXCollections
                .observableArrayList(controller.obtenerTransacciones());
        tablaTransacciones.setItems(transaccionesGeneral);
        registroPaneTablaTransacciones.setItems(transaccionesEmpleado);
        registroPaneTablaTransacciones.refresh();
        tablaTransaccionCliente.setItems(controller.getClientesList());

        ObservableList<Cliente> clientes = FXCollections.observableArrayList(controller.obtenerClientes());
        paneClientesTablaCRegitrados.setItems(clientes);
        paneClientesTablaCRegitrados.refresh();
        gestionarVehiculosTablaDeEspera.setItems(app.getListaDeEspera());
        gestionarVehiculosTablaDeEspera.refresh();
        gestionarVehiculosTablaRegistro.setItems(controller.obtenerVehiculosRegistrados());
        gestionarVehiculosTablaRegistro.refresh();

        registroPaneNumeroTransaccionesLabel.setText("Total de Transacciones Hechas: " + transaccionesEmpleado.size());

        transaccionChoiceBox.getSelectionModel().selectedItemProperty()
                .addListener((observable, oldValue, newValue) -> {
                    Cliente clienteSeleccionado = tablaTransaccionCliente.getSelectionModel().getSelectedItem();
                    if (clienteSeleccionado != null) {
                        actualizarVehiculos(clienteSeleccionado, newValue);
                    }
                });

        tablaTransaccionCliente.getSelectionModel().selectedItemProperty()
                .addListener((observable, oldValue, newValue) -> {
                    String tipoTransaccion = transaccionChoiceBox.getValue();
                    if (newValue != null && tipoTransaccion != null) {
                        actualizarVehiculos(newValue, tipoTransaccion);
                    }
                });
    }



    /**
     * Actualiza la lista de vehículos disponibles para una transacción
     * según el cliente y el tipo de transacción.
     *
     * @param cliente El cliente seleccionado.
     * @param tipoTransaccion El tipo de transacción seleccionada.
     */
    private void actualizarVehiculos(Cliente cliente, String tipoTransaccion) {
        if ("Compra".equals(tipoTransaccion)) {
            tablaTransaccionVehiculo.setItems(FXCollections.observableArrayList(
                    controller.getVehiculosPorCliente(cliente)));
        } else {
            tablaTransaccionVehiculo.setItems(controller.obtenerVehiculosRegistrados());
        }
    }

    /**
     * Registra un vehículo desde la lista de espera.
     */
    private void registrarVehiculoDesdeEspera() {
        Vehiculo vehiculoSeleccionado = gestionarVehiculosTablaDeEspera.getSelectionModel().getSelectedItem();
        if (vehiculoSeleccionado != null) {
            controller.registrarVehiculoDesdeEspera(vehiculoSeleccionado);
            actualizarVista();
        }
    }

    /**
     * Elimina un vehículo registrado seleccionado.
     */
    private void eliminarVehiculoRegistradoSeleccionado() {
        Vehiculo vehiculoSeleccionado = gestionarVehiculosTablaRegistro.getSelectionModel().getSelectedItem();
        if (vehiculoSeleccionado != null) {
            controller.eliminarVehiculo(vehiculoSeleccionado);
            gestionarVehiculosTablaRegistro.getItems().remove(vehiculoSeleccionado);
            gestionarVehiculosLabelMatricula.setText("Vehículo eliminado: " + vehiculoSeleccionado.getMatricula());
            actualizarVista();
        } else {
            gestionarVehiculosLabelMatricula.setText("Seleccione un vehículo para eliminar");
        }
    }



    /**
     * Procesa una transacción utilizando los datos seleccionados e ingresados.
     */
    private void procesarTransaccion() {
        Cliente cliente = tablaTransaccionCliente.getSelectionModel().getSelectedItem();
        Vehiculo vehiculo = tablaTransaccionVehiculo.getSelectionModel().getSelectedItem();
        String codigo = transaccionCodigoField.getText();
        String tipoTransaccion = transaccionChoiceBox.getValue();

        if (cliente == null || vehiculo == null || codigo.isEmpty() || codigo == null || tipoTransaccion == null) {
            System.out.println("Por favor, complete todos los campos necesarios.");
            return;
        }

        int dias = 0;
        if ("Alquiler".equals(tipoTransaccion)) {
            try {
                dias = Integer.parseInt(numeroDeDias.getText());
            } catch (NumberFormatException e) {
                System.out.println("Número de días inválido.");
                return;
            }
        }

        controller.procesarTransaccion(cliente, vehiculo, codigo, tipoTransaccion, dias);
        actualizarVista();
    }

    /**
     * Elimina una transacción seleccionada de la tabla.
     */
    private void eliminarTransaccionSeleccionada() {
        Transaccion transaccionSeleccionada = tablaTransacciones.getSelectionModel().getSelectedItem();
        if (transaccionSeleccionada != null) {
            controller.eliminarTransaccion(transaccionSeleccionada);
            actualizarVista();
        }
    }


    /**
     * Registra un nuevo cliente utilizando los datos ingresados en los campos de texto.
     */
    private void registrarCliente() {
        String nombre = ClientesPaneNombreField.getText();
        String id = ClientesPaneIDField.getText();
        String direccion = ClientesPaneDireccionField.getText();
        String email = ClientesPaneEmailField.getText();
        String telefono = ClientesPaneTelField.getText();
        String usuario = ClientesPaneUserNameField.getText();
        String password = ClientesPanePasswordField.getText();
        String palabraSecreta = ClientesPaneSecretWordField.getText();

        controller.crearCliente(nombre, id, usuario, password, palabraSecreta, email, direccion, telefono);
        actualizarVista();
    }

    /**
     * Muestra los datos de un cliente seleccionado en los campos de texto.
     *
     * @param cliente El cliente cuyos datos se mostrarán.
     */
    private void mostrarDatosCliente(Cliente cliente) {
        ClientesPaneIDField.setText(cliente.getId());
        ClientesPaneNombreField.setText(cliente.getNombre());
        ClientesPaneDireccionField.setText(cliente.getDireccion());
        ClientesPaneEmailField.setText(cliente.getCorreo());
        ClientesPaneUserNameField.setText(cliente.getUsuario());
        ClientesPanePasswordField.setText(cliente.getContraseña());
        ClientesPaneSecretWordField.setText(cliente.getPalabraSecreta());
    }

    /**
     * Actualiza la información de un cliente seleccionado.
     */
    private void actualizarCliente() {
        String nombre = ClientesPaneNombreField.getText();
        String id = ClientesPaneIDField.getText();
        String direccion = ClientesPaneDireccionField.getText();
        String email = ClientesPaneEmailField.getText();
        String telefono = ClientesPaneTelField.getText();
        String usuario = ClientesPaneUserNameField.getText();
        String password = ClientesPanePasswordField.getText();
        String palabraSecreta = ClientesPaneSecretWordField.getText();

        if (id.isEmpty() || nombre.isEmpty() || direccion.isEmpty() || email.isEmpty() || telefono.isEmpty()) {
            System.out.println("Todos los campos deben estar completos.");
            return;
        }

        Cliente nuevosDatos = new Cliente(nombre, id, usuario, password, palabraSecreta, email, direccion, telefono);
        boolean actualizado = controller.actualizarClientePorID(id, nuevosDatos);

        if (actualizado) {
            actualizarVista();
        } else {
            System.out.println("No se pudo actualizar el cliente.");
        }
    }

    /**
     * Elimina un cliente seleccionado de la tabla.
     */
    private void eliminarCliente() {
        Cliente clienteSeleccionado = paneClientesTablaCRegitrados.getSelectionModel().getSelectedItem();
        if (clienteSeleccionado != null) {
            controller.eliminarCliente(clienteSeleccionado.getId());
            actualizarVista();
        }
    }

    /**
     * Limpia todos los campos de texto relacionados con los clientes.
     */
    private void limpiarCampos() {
        ClientesPaneNombreField.clear();
        ClientesPaneIDField.clear();
        ClientesPaneDireccionField.clear();
        ClientesPaneEmailField.clear();
        ClientesPaneTelField.clear();
        ClientesPaneUserNameField.clear();
        ClientesPanePasswordField.clear();
        ClientesPaneSecretWordField.clear();
    }


    /**
     * Muestra el panel especificado y oculta los demás.
     *
     * @param pane El panel que se debe mostrar.
     */
    private void showPanel(Pane pane) {
        actualizarVista();
        gestionarClientesPane.setVisible(false);
        gestionarVehiculosPane.setVisible(false);
        gestionarTransaccionesPane.setVisible(false);
        registroPane.setVisible(false);
        pane.setVisible(true);
    }

    /**
     * Abre la vista principal de la aplicación.
     */
    private void openPrimaryView() {
        app.openPrimaryView();
    }

    /**
     * Establece la aplicación y el controlador para esta vista.
     *
     * @param app La instancia de la aplicación.
     */
    public void setApp(App app) {
        this.app = app;
        controller = new SecondaryEmpleadoController(app.getSistemaConcesionario(), app.getEmpleadoAutenticado());
        actualizarVista();
    }
}