package co.edu.uniquindio.poo;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.time.LocalDate;
import java.util.LinkedList;

import co.edu.uniquindio.poo.model.Administrador;
import co.edu.uniquindio.poo.model.Cliente;
import co.edu.uniquindio.poo.model.Combustible;
import co.edu.uniquindio.poo.model.Empleado;
import co.edu.uniquindio.poo.model.Moto;
import co.edu.uniquindio.poo.model.RegistroTransacciones;
import co.edu.uniquindio.poo.model.RevisionTecnica;
import co.edu.uniquindio.poo.model.SistemaConcesionario;
import co.edu.uniquindio.poo.model.Trasmision;
import co.edu.uniquindio.poo.model.Vehiculo;
import co.edu.uniquindio.poo.viewController.LoginAdministradorViewController;
import co.edu.uniquindio.poo.viewController.LoginEmpleadoViewController;
import co.edu.uniquindio.poo.viewController.PrimaryViewController;
import co.edu.uniquindio.poo.viewController.SecondaryAdministradorViewController;
import co.edu.uniquindio.poo.viewController.SecondaryEmpleadoViewController;

/**
 * JavaFX App
 */
public class App extends Application {

        /*
         * Variables de Apoyo y Sus metodos
         */

        private Stage primaryStage;
        private SistemaConcesionario sistemaConcesionario;
        private Empleado empleadoAutenticado;
        private LinkedList<Vehiculo> listaDeEspera = new LinkedList<>();

        public Stage getPrimaryStage() {
                return primaryStage;
        }

        public void setPrimaryStage(Stage primaryStage) {
                this.primaryStage = primaryStage;
        }

        public void setSistemaConcesionario(SistemaConcesionario sistemaConcesionario) {
                this.sistemaConcesionario = sistemaConcesionario;
        }

        public ObservableList<Vehiculo> getListaDeEspera() {
                return FXCollections.observableArrayList(listaDeEspera);
        }

        public void setListaDeEspera(LinkedList<Vehiculo> listaDeEspera) {
                this.listaDeEspera = listaDeEspera;
        }

        public SistemaConcesionario getSistemaConcesionario() {
                return sistemaConcesionario;
        }

        public Empleado getEmpleadoAutenticado() {
                return empleadoAutenticado;
        }

        public void setEmpleadoAutenticado(Empleado empleadoAutenticado) {
                this.empleadoAutenticado = empleadoAutenticado;
        }

        private Administrador administradorAutenticado;

        public Administrador getAdministradorAutenticado() {
                return administradorAutenticado;
        }

        public void setAdministradorAutenticado(Administrador administradorAutenticado) {
                this.administradorAutenticado = administradorAutenticado;
        }

        public void openPrimaryView() {
                try {
                        primaryStage.setResizable(false);
                        FXMLLoader loader = new FXMLLoader();
                        loader.setLocation(App.class.getResource("Primary.fxml"));
                        Scene scene = new Scene(loader.load());

                        PrimaryViewController primaryView = loader.getController();
                        primaryView.setApp(this);

                        primaryStage.setScene(scene);
                        primaryStage.show();

                } catch (IOException e) {
                        e.printStackTrace();
                }
        }

        @Override
        public void start(Stage arg0) throws Exception {
            this.primaryStage = primaryStage;
            this.primaryStage.setTitle("Sistema de Concesionario");
        
            RegistroTransacciones registro = new RegistroTransacciones(LocalDate.now());
        
            // Crear un administrador
            Administrador administrador = new Administrador("Esteban", "1011201431", "Esteban45", "Duke", "Duke2005", "yesuaesteban@hotmail.com", "3218294076");
        
            // Crear 10 empleados
            Empleado empleado1 = new Empleado("Juan", "1011201432", "Juan45", "John", "John2005", "juanjose@hotmail.com", "Cajero", "3232342");
            Empleado empleado2 = new Empleado("Maicol", "234124331", "michel43", "mitch", "mitchel2005", "miti2005", "asesor", "23123123");
            Empleado empleado3 = new Empleado("Ana", "234124332", "ana45", "Ana", "Ana2005", "ana@hotmail.com", "Vendedora", "31231231");
            Empleado empleado4 = new Empleado("Carlos", "234124333", "carlos56", "Carlos", "Carlos2005", "carlos@hotmail.com", "Técnico", "42143124");
            Empleado empleado5 = new Empleado("Marta", "234124334", "marta78", "Marta", "Marta2005", "marta@hotmail.com", "Asistente", "54254332");
            Empleado empleado6 = new Empleado("Luis", "234124335", "luis92", "Luis", "Luis2005", "luis@hotmail.com", "Cajero", "64233452");
            Empleado empleado7 = new Empleado("Ricardo", "234124336", "ricardo11", "Ricardo", "Ricardo2005", "ricardo@hotmail.com", "Vendedor", "73245325");
            Empleado empleado8 = new Empleado("Jorge", "234124337", "jorge22", "Jorge", "Jorge2005", "jorge@hotmail.com", "Técnico", "83253452");
            Empleado empleado9 = new Empleado("Patricia", "234124338", "patricia33", "Patricia", "Patricia2005", "patricia@hotmail.com", "Asesor", "94254523");
            Empleado empleado10 = new Empleado("Isabel", "234124339", "isabel44", "Isabel", "Isabel2005", "isabel@hotmail.com", "Vendedora", "10245325");
        
            // Crear 20 clientes
            Cliente cliente1 = new Cliente("Santiago", "3123123", "stive", "shat54", "shael22", "shael@hotmail.com", "barrio los naranjos", "24322232");
            Cliente cliente2 = new Cliente("Laura", "2233445", "laura90", "laura_23", "laura2005", "laura@hotmail.com", "sector centro", "32234234");
            Cliente cliente3 = new Cliente("Carlos", "3344556", "carlos87", "carlitos89", "carlitos2005", "carlitos@hotmail.com", "calle 7", "34242424");
            Cliente cliente4 = new Cliente("Pedro", "4455667", "pedro45", "pedrito", "pedro2005", "pedro@hotmail.com", "calle la paz", "45353535");
            Cliente cliente5 = new Cliente("Maria", "5566778", "maria92", "mariita", "maria2005", "maria@hotmail.com", "barrio el sol", "56364636");
            Cliente cliente6 = new Cliente("Lucía", "6677889", "lucia72", "luchi", "lucia2005", "lucia@hotmail.com", "zona norte", "67475747");
            Cliente cliente7 = new Cliente("Miguel", "7788990", "miguel33", "miguelo", "miguel2005", "miguel@hotmail.com", "barrio del bosque", "78586858");
            Cliente cliente8 = new Cliente("Beatriz", "8899001", "beatriz53", "bea1987", "beatriz2005", "bea@hotmail.com", "calle el viento", "89697969");
            Cliente cliente9 = new Cliente("Juan", "9900112", "juan88", "juani", "juan2005", "juan@hotmail.com", "sector 3", "90708080");
            Cliente cliente10 = new Cliente("Paola", "1122334", "paola65", "paola123", "paola2005", "paola@hotmail.com", "calle nueva", "10111213");
            Cliente cliente11 = new Cliente("Ricardo", "2233445", "ricardo92", "rico_89", "ricardo2005", "ricardo@hotmail.com", "barrio el palmar", "21331415");
            Cliente cliente12 = new Cliente("José", "3344556", "jose77", "jose1984", "jose2005", "jose@hotmail.com", "zona oeste", "31451516");
            Cliente cliente13 = new Cliente("Sandra", "4455667", "sandra31", "sandrita", "sandra2005", "sandra@hotmail.com", "barrio del río", "41561617");
            Cliente cliente14 = new Cliente("Antonio", "5566778", "antonio84", "tonio", "antonio2005", "antonio@hotmail.com", "calle la estrella", "51671718");
            Cliente cliente15 = new Cliente("Verónica", "6677889", "veronica61", "vero84", "veronica2005", "veronica@hotmail.com", "sector oriente", "61781819");
            Cliente cliente16 = new Cliente("Raúl", "7788990", "raul99", "rauli", "raul2005", "raul@hotmail.com", "calle 5", "71891920");
            Cliente cliente17 = new Cliente("Teresa", "8899001", "teresa87", "teresa34", "teresa2005", "teresa@hotmail.com", "sector sur", "81902021");
            Cliente cliente18 = new Cliente("Javier", "9900112", "javier54", "javi88", "javier2005", "javier@hotmail.com", "barrio 13", "92012122");
            Cliente cliente19 = new Cliente("Raquel", "1122334", "raquel33", "raquel92", "raquel2005", "raquel@hotmail.com", "zona sur", "10112223");
            Cliente cliente20 = new Cliente("David", "2233445", "david76", "david_c", "david2005", "david@hotmail.com", "calle blanca", "21222324");

            RevisionTecnica revisionTecnica= new RevisionTecnica(LocalDate.of(22, 9, 2),2,LocalDate.of(24, 3, 1),"2324214214",true);
            

            Moto moto = new Moto("Bombre", "MT-2023", "YNJ85D", 5, 120.0, 5, false, 
            Trasmision.AUTOMATICA, 3500000, true, revisionTecnica, 32.2, 
            5.5, Combustible.DIESEL);
            sistemaConcesionario = new SistemaConcesionario("Consesionario Uniquindio", administrador, registro);


        }

        public void openPrimaryViewController() {
                try {
                        primaryStage.setResizable(false);
                        FXMLLoader loader = new FXMLLoader();
                        loader.setLocation(App.class.getResource("Primary.fxml"));
                        Scene scene = new Scene(loader.load());

                        PrimaryViewController primaryView = loader.getController();
                        primaryView.setApp(this);

                        primaryStage.setScene(scene);
                        primaryStage.show();

                } catch (IOException e) {
                        e.printStackTrace();
                }
        }
        
        public void openLoginEmpleadoViewController() {
                primaryStage.setResizable(false);
                primaryStage.close();
                try {
                        FXMLLoader loader = new FXMLLoader(getClass().getResource("LoginEmpleado.fxml"));
                        Scene scene = new Scene(loader.load());

                        LoginEmpleadoViewController loginEmpleadoViewController = loader.getController();
                        loginEmpleadoViewController.setApp(this);

                        primaryStage.setScene(scene);
                        primaryStage.show();
                } catch (IOException e) {
                        e.printStackTrace();
                }
        }

        public void openSecondaryEmpleadoViewController() {
                primaryStage.setResizable(true);
                primaryStage.close();
                try {
                        FXMLLoader loader = new FXMLLoader(getClass().getResource("SecondaryEmpleado.fxml"));

                        Scene scene = new Scene(loader.load());

                        SecondaryEmpleadoViewController view = loader.getController();
                        view.setApp(this);

                        primaryStage.setScene(scene);
                        primaryStage.show();
                } catch (IOException e) {
                        e.printStackTrace();
                }

        }

        public void openLoginAdministradorViewController() {
                try {
                        FXMLLoader loader = new FXMLLoader();
                        loader.setLocation(getClass().getResource("LoginAdm.fxml"));
                        Scene scene = new Scene(loader.load());

                        LoginAdministradorViewController loginAdmViewController = loader.getController();
                        loginAdmViewController.setApp(this);

                        primaryStage.setScene(scene);
                        primaryStage.show();
                } catch (IOException e) {
                        e.printStackTrace();
                }
        }

        public void openSecondaryAdministradorViewController() {
                primaryStage.setResizable(true);
                try {
                        FXMLLoader loader = new FXMLLoader(getClass().getResource("SecondaryAdm.fxml"));
                        Scene scene = new Scene(loader.load());

                        SecondaryAdministradorViewController secondaryAdministradorViewController = loader.getController();

                        primaryStage.setScene(scene);
                        primaryStage.show();
                } catch (IOException e) {
                        e.printStackTrace();
                }
        }

        public static void main(String[] args) {
                launch();
        }
        


}