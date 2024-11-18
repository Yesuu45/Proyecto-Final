package co.edu.uniquindio.poo.view;

import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;

import co.edu.uniquindio.poo.App;
import co.edu.uniquindio.poo.controller.SecondaryAdmController;
import co.edu.uniquindio.poo.model.Cliente;
import co.edu.uniquindio.poo.model.Empleado;
import co.edu.uniquindio.poo.model.Reporte;
import co.edu.uniquindio.poo.model.Transaccion;
import co.edu.uniquindio.poo.model.Vehiculo;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;



public class SecondaryAdmView {


        @FXML
        private ResourceBundle resources;

        @FXML
        private URL location;

        /*
         * Pane 1: Gestionar las Transacciones del Sistema
         */
        @FXML
        private Pane transaccionesPane;

        @FXML
        private TableView<Transaccion> principalPaneTablaTransacciones;

        @FXML
        private TableColumn<Transaccion, String> princiaplTablaTransaccionesCliente;

        @FXML
        private TableColumn<Transaccion, String> princiaplTablaTransaccionesCodigo;

        @FXML
        private TableColumn<Transaccion, String> princiaplTablaTransaccionesEmpleado;

        @FXML
        private TableColumn<Transaccion, Double> princiaplTablaTransaccionesMonto;

        @FXML
        private TableColumn<Transaccion, String> princiaplTablaTransaccionesTipo;

        @FXML
        private TableColumn<Transaccion, String> princiaplTablaTransaccionesVehiculo;

        @FXML
        private Button princiapalEliminarButton;

        @FXML
        private Button princiapalVolverButton;

        @FXML
        private Label principalNumeroTransaccionesLabel;

        /*
         * Panel 2: Gestion de empleados
         */
        @FXML
        private Pane gestionarEmpleadosPane;

        @FXML
        private TextField empleadoPanEmailField;

        @FXML
        private TextField empleadoPaneIDField;

        @FXML
        private TextField empleadoPaneNombreField;

        @FXML
        private TextField empleadoPanePasswordField;

        @FXML
        private TextField empleadoPanePuestoField;

        @FXML
        private TextField empleadoPaneTelField;

        @FXML
        private TextField empleadoPaneUserNameField;

        @FXML
        private TextField empleadoSecretWordField;

        @FXML
        private Button empleadoPaneActualizarButton;

        @FXML
        private Button empleadoPaneLimpiarCamposButton;

        @FXML
        private Button empleadoPaneRegistrarClienteButton;

        // Tabla de los empleados registrados

        @FXML
        private TableView<Empleado> paneEmpleadosTablaRegitrados;

        @FXML
        private TableColumn<Empleado, String> tablaEmpleadosRegistradosEmail;

        @FXML
        private TableColumn<Empleado, String> tablaEmpleadosRegistradosID;

        @FXML
        private TableColumn<Empleado, String> tablaEmpleadosRegistradosNombre;

        @FXML
        private TableColumn<Empleado, String> tablaEmpleadosRegistradosPuesto;

        @FXML
        private TableColumn<Empleado, String> tablaEmpleadosRegistradosTelefono;

        @FXML
        private Button tablaEmpleadosRegistradosEliminarButton;

        /*
         * Pane 3: Crear Reporte respecto al ID del empleado
         */

        @FXML
        private Pane gestionarReportesPane;

        @FXML
        private TextField reporteIdEmpleadoTextField;

        @FXML
        private TableView<Reporte> reporteTabla;

        @FXML
        private TableColumn<Reporte, String> reporteColumnaCodigo;
        @FXML
        private TableColumn<Reporte, String> reporteColumnaEmpleadoNombre;

        @FXML
        private TableColumn<Reporte, String> reporteColumnaEmpleado;

        @FXML
        private TableColumn<Reporte, LocalDate> reporteColumnaFecha;

        @FXML
        private TableColumn<Reporte, Integer> reporteColumnaTotalAlquileres;

        @FXML
        private TableColumn<Reporte, Integer> reporteColumnaTotalCompras;

        @FXML
        private TableColumn<Reporte, Double> reporteColumnaTotalMonto;

        @FXML
        private TableColumn<Reporte, Integer> reporteColumnaTotalTransacciones;

        @FXML
        private TableColumn<Reporte, Integer> reporteColumnaTotalVentas;

        @FXML
        private Button reporteCrearButton;

        @FXML
        private Button reporteEliminarButton;

        @FXML
        private Label reporteMensajeError;

        /*
         * Pane 4: Tabla Clientes y Vehiculos
         */

        @FXML
        private Pane gestionarRegistroPane;

        @FXML
        private TableView<Cliente> paneClientesTablaCRegitrados;

        @FXML
        private TableColumn<Cliente, String> tablaClientesRegistradosDireccion;

        @FXML
        private TableColumn<Cliente, String> tablaClientesRegistradosEmail;

        @FXML
        private TableColumn<Cliente, String> tablaClientesRegistradosID;

        @FXML
        private TableColumn<Cliente, String> tablaClientesRegistradosNombre;

        @FXML
        private TableColumn<Cliente, String> tablaClientesRegistradosTelefono;

        @FXML
        private Button eliminarClienteButton;

        @FXML
        private TableView<Vehiculo> gestionarVehiculosTablaRegistro;

        @FXML
        private TableColumn<Vehiculo, Boolean> tablaRegistroDisponible;

        @FXML
        private TableColumn<Vehiculo, String> tablaRegistroMatricula;

        @FXML
        private TableColumn<Vehiculo, String> tablaRegistroModelo;

        @FXML
        private TableColumn<Vehiculo, String> tablaRegistroTipo;

        @FXML
        private Button eliminarVehiculoButton;

        /*
         * Atributos Generales
         */
        @FXML
        private Button generalButton;

        @FXML
        private Button generarReporteButton;

        @FXML
        private Button gestionarEmpleadosButton;

        @FXML
        private Button principalButton;

        private App app;
        private SecondaryAdmController controller;


    /* Inicializa la vista y configura las tablas y botones */
    @FXML
    void initialize() {
        // Configuración de columnas de tablas para clientes
        tablaClientesRegistradosNombre.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getNombre()));
        tablaClientesRegistradosID.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getId()));
        tablaClientesRegistradosEmail.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getCorreo()));
        tablaClientesRegistradosDireccion.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getDireccion()));

        // Configuración de columnas de tablas para vehículos
        tablaRegistroMatricula.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getMatricula()));
        tablaRegistroModelo.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getModelo()));
        tablaRegistroTipo.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getClass().getSimpleName()));
        tablaRegistroDisponible.setCellValueFactory(cellData -> new SimpleBooleanProperty(cellData.getValue().isDisponible()));

        // Configuración de acciones de botones
        eliminarClienteButton.setOnAction(event -> eliminarCliente());
        eliminarVehiculoButton.setOnAction(event -> eliminarVehiculo());
        reporteCrearButton.setOnAction(event -> crearReporte());
        reporteEliminarButton.setOnAction(event -> eliminarReporte());

        // Configuración de selección de reportes
        reporteMensajeError.setVisible(false);
        reporteTabla.getSelectionModel().selectedItemProperty().addListener((observable, oldValue, newValue) -> {
            if (newValue != null) {
                reporteIdEmpleadoTextField.setText(newValue.getEmpleado().getId());
            }
        });

        // Configuración de tablas y botones para empleados
        configurarTablaEmpleados();
        tablaEmpleadosRegistradosEliminarButton.setOnAction(event -> eliminarEmpleadoSeleccionado());
        paneEmpleadosTablaRegitrados.getSelectionModel().selectedItemProperty().addListener((observable, oldValue, newValue) -> manejarSeleccionEmpleado());
        empleadoPaneLimpiarCamposButton.setOnAction(event -> limpiarCampos());
        empleadoPaneRegistrarClienteButton.setOnAction(event -> registrarEmpleado());
        empleadoPaneActualizarButton.setOnAction(event -> actualizarEmpleado());

        // Configuración de tablas y botones para transacciones
        configurarTablaTransacciones();
        princiapalEliminarButton.setOnAction(event -> eliminarTransaccionSeleccionada());
        princiapalVolverButton.setOnAction(event -> volverAVistaAnterior());

        // Configuración de visibilidad de paneles
        gestionarEmpleadosPane.setVisible(false);
        gestionarReportesPane.setVisible(false);
        transaccionesPane.setVisible(true);
        gestionarRegistroPane.setVisible(false);

        // Configuración de botones de navegación
        principalButton.setOnAction(e -> showPanel(transaccionesPane));
        gestionarEmpleadosButton.setOnAction(e -> showPanel(gestionarEmpleadosPane));
        generarReporteButton.setOnAction(e -> showPanel(gestionarReportesPane));
        generalButton.setOnAction(e -> showPanel(gestionarRegistroPane));
    }

    /* Registra un nuevo empleado en el sistema */
    private void registrarEmpleado() {
        Empleado nuevoEmpleado = new Empleado(
            empleadoPaneNombreField.getText(),
            empleadoPaneIDField.getText(),
            empleadoPaneUserNameField.getText(),
            empleadoPanePasswordField.getText(),
            empleadoSecretWordField.getText(),
            empleadoPanEmailField.getText(),
            empleadoPanePuestoField.getText(),
            empleadoPaneTelField.getText()
        );
        controller.registrarEmpleado(nuevoEmpleado);
        cargarEmpleadosEnTabla();
        limpiarCampos();
        System.out.println("Empleado registrado exitosamente.");
    }

    /* Crea un nuevo reporte basado en el ID del empleado */
    @FXML
    private void crearReporte() {
        String idEmpleado = reporteIdEmpleadoTextField.getText();
        if (idEmpleado.isEmpty()) {
            reporteMensajeError.setText("Por favor, ingrese un ID de empleado.");
            reporteMensajeError.setVisible(true);
            return;
        }
        controller.crearReporte(idEmpleado);
        cargarReportesEnTabla();
        reporteIdEmpleadoTextField.clear();
        reporteMensajeError.setText("Reporte creado exitosamente.");
        reporteMensajeError.setVisible(true);
    }

    /* Elimina el reporte seleccionado */
    @FXML
    private void eliminarReporte() {
        reporteMensajeError.setVisible(true);
        Reporte reporteSeleccionado = reporteTabla.getSelectionModel().getSelectedItem();
        if (reporteSeleccionado != null) {
            controller.eliminarReporte(reporteSeleccionado);
            cargarReportesEnTabla();
            reporteMensajeError.setText("Reporte eliminado exitosamente.");
        } else {
            reporteMensajeError.setText("Por favor, seleccione un reporte para eliminar.");
        }
    }

    /* Carga los clientes en la tabla de clientes */
    private void cargarClientesEnTabla() {
        ObservableList<Cliente> clientes = FXCollections.observableArrayList(controller.getSistema().getClientes());
        paneClientesTablaCRegitrados.setItems(clientes);
    }

    /* Carga los vehículos en la tabla de vehículos */
    private void cargarVehiculosEnTabla() {
        ObservableList<Vehiculo> vehiculos = FXCollections.observableArrayList(controller.getSistema().getVehiculos());
        gestionarVehiculosTablaRegistro.setItems(vehiculos);
    }

    /* Actualiza la vista con los datos actuales del sistema */
    public void actualizarVista() {
        ObservableList<Empleado> empleados = FXCollections.observableArrayList(controller.getSistema().getEmpleados());
        paneEmpleadosTablaRegitrados.setItems(empleados);
        actualizarTransacciones();
        actualizarEmpleado();
        cargarReportesEnTabla();
        cargarClientesEnTabla();
        cargarVehiculosEnTabla();
    }

    /* Elimina el cliente seleccionado */
    private void eliminarCliente() {
        Cliente clienteSeleccionado = paneClientesTablaCRegitrados.getSelectionModel().getSelectedItem();
        if (clienteSeleccionado != null) {
            String idCliente = clienteSeleccionado.getId();
            controller.eliminarCliente(idCliente);
            cargarClientesEnTabla();
        }
    }

    /* Elimina el vehículo seleccionado */
    private void eliminarVehiculo() {
        Vehiculo vehiculoSeleccionado = gestionarVehiculosTablaRegistro.getSelectionModel().getSelectedItem();
        if (vehiculoSeleccionado != null) {
            controller.eliminarVehiculo(vehiculoSeleccionado);
            cargarVehiculosEnTabla();
        }
    }

    /* Carga los empleados en la tabla de empleados */
    private void cargarEmpleadosEnTabla() {
        ObservableList<Empleado> empleados = FXCollections.observableArrayList(controller.getSistema().getEmpleados());
        paneEmpleadosTablaRegitrados.setItems(empleados);
        paneEmpleadosTablaRegitrados.refresh();
    }

    /* Carga los reportes en la tabla de reportes */
    @FXML
    private void cargarReportesEnTabla() {
        ObservableList<Reporte> reportes = FXCollections.observableArrayList(controller.getSistema().getReportes());
        reporteTabla.setItems(reportes);
        reporteColumnaCodigo.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getCodigo()));
        reporteColumnaEmpleado.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getEmpleado().getId()));
        reporteColumnaEmpleadoNombre.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getEmpleado().getNombre()));
        reporteColumnaFecha.setCellValueFactory(cellData -> new SimpleObjectProperty<>(cellData.getValue().getFechaDeReporte()));
        reporteColumnaTotalAlquileres.setCellValueFactory(cellData -> new SimpleIntegerProperty(cellData.getValue().getTotalAlquileres()).asObject());
        reporteColumnaTotalCompras.setCellValueFactory(cellData -> new SimpleIntegerProperty(cellData.getValue().getTotalCompras()).asObject());
        reporteColumnaTotalMonto.setCellValueFactory(cellData -> new SimpleDoubleProperty(cellData.getValue().getMontoTotal()).asObject());
        reporteColumnaTotalTransacciones.setCellValueFactory(cellData -> new SimpleIntegerProperty(cellData.getValue().getTotalTransacciones()).asObject());
        reporteColumnaTotalVentas.setCellValueFactory(cellData -> new SimpleIntegerProperty(cellData.getValue().getTotalVentas()).asObject());
    }

    /* Configura la tabla de transacciones */
    @FXML
    private void configurarTablaTransacciones() {
        princiaplTablaTransaccionesCliente.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getCliente().getNombre()));
        princiaplTablaTransaccionesCodigo.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getCodigo()));
        princiaplTablaTransaccionesEmpleado.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getEmpleado().getNombre()));
        princiaplTablaTransaccionesMonto.setCellValueFactory(cellData -> new SimpleObjectProperty<>(cellData.getValue().getMonto()));
        princiaplTablaTransaccionesTipo.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getTipo()));
        princiaplTablaTransaccionesVehiculo.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getVehiculo().getMatricula()));
    }

    /* Maneja la selección de un empleado en la tabla */
    @FXML
    private void manejarSeleccionEmpleado() {
        Empleado empleadoSeleccionado = paneEmpleadosTablaRegitrados.getSelectionModel().getSelectedItem();
        if (empleadoSeleccionado != null) {
            empleadoPanEmailField.setText(empleadoSeleccionado.getCorreo());
            empleadoPaneIDField.setText(empleadoSeleccionado.getId());
            empleadoPaneNombreField.setText(empleadoSeleccionado.getNombre());
            empleadoPanePasswordField.setText(empleadoSeleccionado.getContraseña());
            empleadoPanePuestoField.setText(empleadoSeleccionado.getPuesto());
            empleadoPaneUserNameField.setText(empleadoSeleccionado.getUsuario());
            empleadoSecretWordField.setText(empleadoSeleccionado.getPalabraSecreta());
        }
    }

    /* Configura la tabla de empleados */
    @FXML
    private void configurarTablaEmpleados() {
        tablaEmpleadosRegistradosEmail.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getCorreo()));
        tablaEmpleadosRegistradosID.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getId()));
        tablaEmpleadosRegistradosNombre.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getNombre()));
        tablaEmpleadosRegistradosPuesto.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getPuesto()));
    }

    /* Actualiza la tabla de transacciones */
    @FXML
    private void actualizarTransacciones() {
        if (controller.getSistema() != null) {
            ObservableList<Transaccion> listaTransacciones = FXCollections.observableArrayList(controller.getSistema().getRegistro().getTransacciones());
            principalPaneTablaTransacciones.setItems(listaTransacciones);
            int totalTransacciones = listaTransacciones.size();
            principalNumeroTransaccionesLabel.setText("Total de transacciones: " + totalTransacciones);
        }
    }

    /* Actualiza la información del empleado seleccionado */
    private void actualizarEmpleado() {
        Empleado empleadoSeleccionado = paneEmpleadosTablaRegitrados.getSelectionModel().getSelectedItem();
        if (empleadoSeleccionado != null) {
            empleadoSeleccionado.setNombre(empleadoPaneNombreField.getText());
            empleadoSeleccionado.setId(empleadoPaneIDField.getText());
            empleadoSeleccionado.setUsuario(empleadoPaneUserNameField.getText());
            empleadoSeleccionado.setContraseña(empleadoPanePasswordField.getText());
            empleadoSeleccionado.setPalabraSecreta(empleadoSecretWordField.getText());
            empleadoSeleccionado.setCorreo(empleadoPanEmailField.getText());
            empleadoSeleccionado.setPuesto(empleadoPanePuestoField.getText());
            cargarEmpleadosEnTabla();
            limpiarCampos();
            System.out.println("Empleado actualizado exitosamente.");
        } else {
            System.out.println("Seleccione un empleado para actualizar.");
        }
    }

    /* Elimina la transacción seleccionada */
    @FXML
    private void eliminarTransaccionSeleccionada() {
        Transaccion transaccionSeleccionada = (Transaccion) principalPaneTablaTransacciones.getSelectionModel().getSelectedItem();
        if (transaccionSeleccionada != null) {
            controller.getSistema().getRegistro().eliminarTransaccion(transaccionSeleccionada.getCodigo());
            actualizarTransacciones();
            System.out.println("Transacción eliminada con éxito.");
        } else {
            System.out.println("Seleccione una transacción para eliminar.");
        }
    }

    /* Elimina el empleado seleccionado */
    private void eliminarEmpleadoSeleccionado() {
        Empleado empleadoSeleccionado = paneEmpleadosTablaRegitrados.getSelectionModel().getSelectedItem();
        if (empleadoSeleccionado != null) {
            controller.eliminarEmpleado(empleadoSeleccionado);
            paneEmpleadosTablaRegitrados.getItems().remove(empleadoSeleccionado);
            System.out.println("Empleado eliminado: " + empleadoSeleccionado.getId());
        } else {
            System.out.println("No se ha seleccionado ningún empleado.");
        }
    }

    /* Limpia los campos de entrada del formulario de empleados */
    private void limpiarCampos() {
        empleadoPanEmailField.clear();
        empleadoPaneIDField.clear();
        empleadoPaneNombreField.clear();
        empleadoPanePasswordField.clear();
        empleadoPanePuestoField.clear();
        empleadoPaneTelField.clear();
        empleadoPaneUserNameField.clear();
        empleadoSecretWordField.clear();
    }

    /* Vuelve a la vista anterior */
    private void volverAVistaAnterior() {
        app.openPrimaryView();
    }

    /* Muestra el panel especificado y oculta los demás */
    private void showPanel(Pane pane) {
        actualizarVista();
        gestionarEmpleadosPane.setVisible(false);
        gestionarReportesPane.setVisible(false);
        transaccionesPane.setVisible(false);
        gestionarRegistroPane.setVisible(false);
        pane.setVisible(true);
    }

    /* Establece la aplicación principal y actualiza la vista */
    public void setApp(App app) {
        this.app = app;
        controller = new SecondaryAdmController(app.getSistemaConcesionario().getAdministrador(), app.getSistemaConcesionario());
        actualizarVista();
    }
}