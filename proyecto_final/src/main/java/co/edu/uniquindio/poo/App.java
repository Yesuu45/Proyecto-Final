package co.edu.uniquindio.poo;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;
import java.time.LocalDate;
import java.util.LinkedList;

import co.edu.uniquindio.poo.model.Administrador;
import co.edu.uniquindio.poo.model.Bus;
import co.edu.uniquindio.poo.model.Camion;
import co.edu.uniquindio.poo.model.Camioneta;
import co.edu.uniquindio.poo.model.Cliente;
import co.edu.uniquindio.poo.model.Combustible;
import co.edu.uniquindio.poo.model.Deportivo;
import co.edu.uniquindio.poo.model.Empleado;
import co.edu.uniquindio.poo.model.Moto;
import co.edu.uniquindio.poo.model.PickUps;
import co.edu.uniquindio.poo.model.RegistroTransacciones;
import co.edu.uniquindio.poo.model.RevisionTecnica;
import co.edu.uniquindio.poo.model.Sedan;
import co.edu.uniquindio.poo.model.SistemaConcesionario;
import co.edu.uniquindio.poo.model.TAlquiler;
import co.edu.uniquindio.poo.model.TCompra;
import co.edu.uniquindio.poo.model.TVenta;
import co.edu.uniquindio.poo.model.TipoCamion;
import co.edu.uniquindio.poo.model.Trasmision;
import co.edu.uniquindio.poo.model.Van;
import co.edu.uniquindio.poo.model.Vehiculo;
import co.edu.uniquindio.poo.view.LoginAdmView;
import co.edu.uniquindio.poo.view.LoginEmpleadoView;
import co.edu.uniquindio.poo.view.PrimaryView;
import co.edu.uniquindio.poo.view.SecondaryAdmView;
import co.edu.uniquindio.poo.view.SecondaryEmpleadoView;


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

        @SuppressWarnings("exports")
        public Stage getPrimaryStage() {
                return primaryStage;
        }

        public void setPrimaryStage(@SuppressWarnings("exports") Stage primaryStage) {
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

        @Override
        public void start(@SuppressWarnings("exports") Stage primaryStage) throws Exception {
                this.primaryStage = primaryStage;
                this.primaryStage.setTitle("Sistema Concesionario");
                Image icono = new Image(getClass().getResourceAsStream("/co/edu/uniquindio/poo/MediaFx/S.png"));
                primaryStage.getIcons().add(icono);
                RegistroTransacciones registro = new RegistroTransacciones(LocalDate.now());
        
            // Crear un administrador
                Administrador adm1 = new Administrador("Esteban", "1011201431", "Esteban", "Duke", "Duke2005", "yesuaesteban@hotmail.com", "3218294076");
                
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

                  // Crear 10 revisiones técnicas
                RevisionTecnica revisionTecnica1 = new RevisionTecnica(LocalDate.of(2022, 9, 2), 2, LocalDate.of(2024, 3, 1), "2324214214", true);
                RevisionTecnica revisionTecnica2 = new RevisionTecnica(LocalDate.of(2021, 9, 11), 3, LocalDate.of(2022, 9, 21), "2313123123", false);
                RevisionTecnica revisionTecnica3 = new RevisionTecnica(LocalDate.of(2022, 5, 18), 1, LocalDate.of(2023, 5, 18), "4123124312", true);
                RevisionTecnica revisionTecnica4 = new RevisionTecnica(LocalDate.of(2020, 7, 9), 4, LocalDate.of(2021, 7, 9), "2343243242", true);
                RevisionTecnica revisionTecnica5 = new RevisionTecnica(LocalDate.of(2023, 4, 5), 2, LocalDate.of(2025, 4, 5), "5435454345", false);
                RevisionTecnica revisionTecnica6 = new RevisionTecnica(LocalDate.of(2021, 3, 20), 3, LocalDate.of(2023, 3, 20), "6546546546", true);
                RevisionTecnica revisionTecnica7 = new RevisionTecnica(LocalDate.of(2022, 10, 11), 1, LocalDate.of(2023, 10, 11), "7657657657", false);
                RevisionTecnica revisionTecnica8 = new RevisionTecnica(LocalDate.of(2023, 7, 15), 2, LocalDate.of(2024, 7, 15), "8768768768", true);
                RevisionTecnica revisionTecnica9 = new RevisionTecnica(LocalDate.of(2021, 12, 14), 3, LocalDate.of(2022, 12, 14), "9879879879", true);
                RevisionTecnica revisionTecnica10 = new RevisionTecnica(LocalDate.of(2022, 8, 20), 4, LocalDate.of(2024, 8, 20), "1091091091", false);

                // Crear 10 motos
                Moto moto1 = new Moto("Bombre", "MT-2023", "YNJ85D", 5, 120.0, 5, false, Trasmision.AUTOMATICA, 3500000, true, revisionTecnica1, 32.2, 5.5, Combustible.DIESEL);
                Moto moto2 = new Moto("Yamaha", "YZF-R6", "YJG32D", 5, 140.0, 6, true, Trasmision.MANUAL, 4500000, false, revisionTecnica2, 34.5, 6.0, Combustible.GASOLINA);
                Moto moto3 = new Moto("Honda", "CBR600RR", "HJR43K", 4, 130.0, 5, true, Trasmision.MANUAL, 4200000, true, revisionTecnica3, 33.1, 5.8, Combustible.GASOLINA);
                Moto moto4 = new Moto("Suzuki", "GSX-R1000", "SXR65E", 5, 150.0, 6, false, Trasmision.AUTOMATICA, 5500000, true, revisionTecnica4, 36.0, 7.0, Combustible.GASOLINA);
                Moto moto5 = new Moto("Kawasaki", "Ninja ZX-6R", "KZX99F", 4, 160.0, 6, true, Trasmision.MANUAL, 6000000, false, revisionTecnica5, 37.0, 6.2, Combustible.GASOLINA);
                Moto moto6 = new Moto("BMW", "S1000RR", "BMR47Y", 5, 180.0, 7, false, Trasmision.AUTOMATICA, 7000000, true, revisionTecnica6, 35.0, 6.8, Combustible.GASOLINA);
                Moto moto7 = new Moto("Ducati", "Panigale V4", "DUC80J", 4, 170.0, 6, true, Trasmision.MANUAL, 7500000, false, revisionTecnica7, 38.0, 7.1, Combustible.GASOLINA);
                Moto moto8 = new Moto("Aprilia", "RSV4", "APR32N", 5, 155.0, 6, true, Trasmision.AUTOMATICA, 6500000, true, revisionTecnica8, 36.5, 7.0, Combustible.GASOLINA);
                Moto moto9 = new Moto("KTM", "RC8", "KTM84L", 5, 140.0, 5, false, Trasmision.MANUAL, 5300000, true, revisionTecnica9, 34.3, 6.4, Combustible.GASOLINA);
                Moto moto10 = new Moto("Triumph", "Daytona 675", "TRI11S", 5, 135.0, 5, true, Trasmision.MANUAL, 4800000, false, revisionTecnica10, 33.8, 5.9, Combustible.GASOLINA);

                // Crear 10 camionetas
                Camioneta camioneta1 = new Camioneta("Chevrolet", "Tv-2022", "PDH32H", 4, 22.3, 200, false, Trasmision.AUTOMATICA, 200000, false, revisionTecnica2, 32.2, 12.2, 4, 4, 9, false, false, true, 8, false, false, false, true, false);
                Camioneta camioneta2 = new Camioneta("Ford", "F-150", "F15001", 4, 23.0, 250, true, Trasmision.MANUAL, 220000, true, revisionTecnica3, 33.2, 14.5, 5, 5, 10, true, false, false, 9, true, true, false, false, true);
                Camioneta camioneta3 = new Camioneta("Toyota", "Hilux 2023", "HIL23F", 4, 21.5, 230, false, Trasmision.AUTOMATICA, 240000, true, revisionTecnica4, 32.5, 13.3, 4, 5, 8, false, true, true, 7, false, false, true, false, false);
                Camioneta camioneta4 = new Camioneta("Ram", "1500", "RAM1500", 4, 24.5, 280, true, Trasmision.MANUAL, 250000, false, revisionTecnica5, 34.0, 15.0, 5, 6, 11, false, false, false, 10, true, true, true, false, true);
                Camioneta camioneta5 = new Camioneta("Nissan", "Navara", "NAV23T", 4, 25.0, 270, false, Trasmision.AUTOMATICA, 230000, true, revisionTecnica6, 33.0, 14.0, 4, 5, 9, false, true, false, 8, true, false, false, true, false);
                Camioneta camioneta6 = new Camioneta("Mitsubishi", "Triton", "TRI32N", 4, 22.0, 260, true, Trasmision.MANUAL, 220000, false, revisionTecnica7, 32.8, 12.0, 4, 4, 8, true, false, true, 7, true, false, false, false, true);
                Camioneta camioneta7 = new Camioneta("GMC", "Sierra 2500", "SIERRA23", 4, 26.0, 300, false, Trasmision.AUTOMATICA, 280000, true, revisionTecnica8, 33.5, 13.8, 5, 6, 12, false, true, true, 9, false, true, true, false, false);
                Camioneta camioneta8 = new Camioneta("Honda", "Ridgeline", "RIDG42G", 4, 23.5, 250, true, Trasmision.MANUAL, 200000, false, revisionTecnica9, 33.7, 14.0, 4, 5, 10, true, false, false, 8, true, true, false, true, true);
                Camioneta camioneta9 = new Camioneta("Volkswagen", "Amarok", "AMR01V", 4, 22.8, 260, false, Trasmision.AUTOMATICA, 210000, true, revisionTecnica10, 34.2, 13.6, 5, 5, 11, false, true, true, 8, false, false, false, true, true);
                Camioneta camioneta10 = new Camioneta("Chevrolet", "Colorado", "COL56E", 4, 23.0, 250, true, Trasmision.MANUAL, 240000, false, revisionTecnica1, 32.9, 14.1, 4, 5, 9, false, false, true, 7, false, true, true, false, false);

                // Crear 10 Pick-ups
                PickUps pickUp1 = new PickUps("Ford", "F-250", "FO201M", 7, 32.3, 250, false, Trasmision.AUTOMATICA, 150000, true, revisionTecnica1, false, true, 4, 4, 9, false, true, 0, false, false, 3);
                PickUps pickUp2 = new PickUps("Chevrolet", "Silverado", "SV1234", 7, 32.5, 270, true, Trasmision.MANUAL, 170000, false, revisionTecnica2, true, false, 5, 5, 10, true, false, 3, true, false, 2);
                PickUps pickUp3 = new PickUps("Ram", "1500", "RAM123", 7, 30.0, 280, false, Trasmision.AUTOMATICA, 180000, true, revisionTecnica3, true, true, 4, 4, 8, false, true, 2, false, true, 5);
                PickUps pickUp4 = new PickUps("Nissan", "Frontier", "FRN345", 7, 31.2, 260, true, Trasmision.MANUAL, 160000, true, revisionTecnica4, false, true, 6, 6, 7, true, false, 3, true, false, 4);
                PickUps pickUp5 = new PickUps("Toyota", "Hilux", "HIL678", 7, 33.1, 230, false, Trasmision.AUTOMATICA, 150000, true, revisionTecnica5, false, false, 5, 4, 9, true, false, 2, true, true, 3);
                PickUps pickUp6 = new PickUps("Ford", "Ranger", "RNG789", 7, 34.0, 300, false, Trasmision.MANUAL, 200000, true, revisionTecnica6, true, false, 4, 4, 10, false, true, 1, false, false, 5);
                PickUps pickUp7 = new PickUps("Chevrolet", "Colorado", "COL890", 7, 32.5, 240, true, Trasmision.AUTOMATICA, 170000, false, revisionTecnica7, true, false, 5, 5, 8, false, true, 2, true, true, 4);
                PickUps pickUp8 = new PickUps("Honda", "Ridgeline", "RID901", 7, 31.0, 220, false, Trasmision.MANUAL, 140000, true, revisionTecnica8, false, false, 6, 6, 10, true, false, 3, false, true, 2);
                PickUps pickUp9 = new PickUps("Ram", "2500", "RAM101", 7, 32.0, 280, true, Trasmision.AUTOMATICA, 210000, true, revisionTecnica9, true, true, 4, 5, 9, false, true, 4, false, false, 3);
                PickUps pickUp10 = new PickUps("GMC", "Canyon", "CYN102", 7, 33.2, 260, false, Trasmision.MANUAL, 190000, true, revisionTecnica10, false, true, 5, 4, 8, false, false, 2, true, false, 4);

                // Crear 10 Sedanes
                Sedan sedan1 = new Sedan("Audi", "A4", "A4-2023", 5, 200.0, 300, true, Trasmision.MANUAL, 3000000, false, revisionTecnica1, 20.0, 15.0, 2, 2, 45, false, true, false, 2, true, false, false, true);
                Sedan sedan2 = new Sedan("BMW", "Serie 3", "BMW-2023", 5, 210.0, 320, true, Trasmision.MANUAL, 3500000, true, revisionTecnica2, 21.5, 16.0, 2, 2, 50, true, false, true, 2, false, true, false, false);
                Sedan sedan3 = new Sedan("Mercedes-Benz", "Clase C", "MERC-2022", 5, 220.0, 330, false, Trasmision.AUTOMATICA, 4000000, false, revisionTecnica3, 22.0, 17.5, 3, 3, 40, false, true, false, 2, true, false, true, true);
                Sedan sedan4 = new Sedan("Volkswagen", "Passat", "VWP-2021", 5, 190.0, 280, true, Trasmision.MANUAL, 2500000, true, revisionTecnica4, 19.5, 14.5, 2, 2, 40, false, false, true, 2, false, true, true, false);
                Sedan sedan5 = new Sedan("Audi", "A6", "A6-2023", 5, 240.0, 350, true, Trasmision.MANUAL, 4500000, true, revisionTecnica5, 23.0, 18.0, 3, 3, 55, true, false, false, 2, true, true, false, false);
                Sedan sedan6 = new Sedan("BMW", "Serie 5", "BMW-2023", 5, 250.0, 380, false, Trasmision.AUTOMATICA, 5000000, false, revisionTecnica6, 25.0, 20.0, 3, 3, 60, true, false, true, 3, true, false, false, true);
                Sedan sedan7 = new Sedan("Mercedes-Benz", "Clase E", "MERC-2022", 5, 260.0, 400, true, Trasmision.MANUAL, 5500000, true, revisionTecnica7, 24.5, 19.0, 4, 4, 50, false, true, false, 3, false, false, true, true);
                Sedan sedan8 = new Sedan("Volkswagen", "Jetta", "Jetta-2021", 5, 180.0, 260, true, Trasmision.MANUAL, 2200000, true, revisionTecnica8, 18.0, 13.0, 2, 2, 35, false, false, true, 3, true, true, false, true);
                Sedan sedan9 = new Sedan("Honda", "Accord", "ACCD-2021", 5, 230.0, 330, false, Trasmision.AUTOMATICA, 3800000, false, revisionTecnica9, 22.0, 17.0, 2, 2, 45, true, false, true, 2, true, true, false, false);
                Sedan sedan10 = new Sedan("Chevrolet", "Malibu", "MALB-2023", 5, 240.0, 340, true, Trasmision.MANUAL, 4200000, true, revisionTecnica10, 23.5, 18.5, 3, 3, 50, false, true, false, 3, true, false, true, true);

                // Crear 10 vehículos deportivos
                Deportivo deportivo1 = new Deportivo("Ferrari", "488 GTB", "FER488", 2, 330.0, 720, true, Trasmision.AUTOMATICA, 35000000, true, revisionTecnica1, false, true, 2, 2, 2, 200, 12, "Deportivo de lujo italiano");
                Deportivo deportivo2 = new Deportivo("Porsche", "911 Turbo", "POR911T", 2, 320.0, 650, true, Trasmision.MANUAL, 30000000, false, revisionTecnica2, true, false, 2, 2, 2, 180, 10, "Deportivo clásico alemán");
                Deportivo deportivo3 = new Deportivo("Lamborghini", "Huracán Evo", "LAMHUR", 2, 340.0, 760, false, Trasmision.AUTOMATICA, 38000000, true, revisionTecnica3, true, true, 2, 2, 2, 220, 15, "Deportivo de lujo italiano");
                Deportivo deportivo4 = new Deportivo("McLaren", "720S", "MCL720S", 2, 335.0, 710, true, Trasmision.MANUAL, 36000000, false, revisionTecnica4, false, true, 2, 2, 2, 210, 14, "Deportivo de lujo británico");
                Deportivo deportivo5 = new Deportivo("Aston Martin", "Vantage", "ASTVAN", 2, 310.0, 503, true, Trasmision.MANUAL, 27000000, true, revisionTecnica5, true, false, 2, 2, 2, 175, 9, "Deportivo británico elegante");
                Deportivo deportivo6 = new Deportivo("BMW", "M8", "BMWM8", 2, 310.0, 617, false, Trasmision.AUTOMATICA, 29000000, true, revisionTecnica6, false, true, 2, 2, 2, 190, 11, "Deportivo alemán de alto rendimiento");
                Deportivo deportivo7 = new Deportivo("Chevrolet", "Corvette Z06", "CHEVZ06", 2, 330.0, 670, true, Trasmision.MANUAL, 31000000, false, revisionTecnica7, true, true, 2, 2, 2, 205, 13, "Deportivo estadounidense icónico");
                Deportivo deportivo8 = new Deportivo("Bugatti", "Chiron", "BUGCHIRON", 2, 400.0, 1500, false, Trasmision.AUTOMATICA, 90000000, true, revisionTecnica8, false, true, 2, 2, 2, 250, 18, "Hypercar de lujo francés");
                Deportivo deportivo9 = new Deportivo("Koenigsegg", "Agera RS", "KONAGERA", 2, 420.0, 1600, true, Trasmision.MANUAL, 95000000, false, revisionTecnica9, true, false, 2, 2, 2, 270, 20, "Hypercar sueco de altísima tecnología");
                Deportivo deportivo10 = new Deportivo("Pagani", "Huayra", "PAGHUAYRA", 2, 370.0, 730, true, Trasmision.AUTOMATICA, 85000000, true, revisionTecnica10, false, true, 2, 2, 2, 240, 17, "Deportivo de lujo italiano artesanal");


                // Crear 10 vehículos tipo camión
                Camion camion1 = new Camion("Volvo", "FH16", "VFH16A", 4, 85.0, 400, true, Trasmision.MANUAL, 25000000, true, revisionTecnica1, true, false, 35, false, true, false, 4, TipoCamion.CARGAPESADA);
                Camion camion2 = new Camion("Mercedes-Benz", "Actros", "MBACT2023", 4, 90.0, 450, true, Trasmision.AUTOMATICA, 27000000, false, revisionTecnica2, true, true, 40, false, true, true, 4, TipoCamion.CARGAPESADA);
                Camion camion3 = new Camion("Scania", "R500", "SCR500X", 4, 88.0, 470, false, Trasmision.MANUAL, 28000000, true, revisionTecnica3, false, true, 38, true, false, false, 4, TipoCamion.CARGAPESADA);
                Camion camion4 = new Camion("Kenworth", "T680", "KWT680", 4, 75.0, 400, true, Trasmision.MANUAL, 24000000, true, revisionTecnica4, true, false, 32, false, true, false, 4, TipoCamion.CARGAPESADA);
                Camion camion5 = new Camion("Freightliner", "Cascadia", "FRCAS23", 4, 80.0, 430, false, Trasmision.AUTOMATICA, 26000000, false, revisionTecnica5, true, true, 36, true, false, false, 4, TipoCamion.CARGAPESADA);
                Camion camion6 = new Camion("Mack", "Anthem", "MACANT2023", 4, 82.0, 450, true, Trasmision.MANUAL, 25000000, true, revisionTecnica6, false, true, 33, false, false, true, 4, TipoCamion.CARGAPESADA);
                Camion camion7 = new Camion("International", "LT", "INTLT34", 4, 85.0, 440, true, Trasmision.MANUAL, 26500000, true, revisionTecnica7, true, false, 37, true, true, false, 4, TipoCamion.CARGAPESADA);
                Camion camion8 = new Camion("DAF", "XF 105", "DAFXF105", 4, 87.0, 460, false, Trasmision.AUTOMATICA, 27500000, false, revisionTecnica8, true, true, 39, false, true, true, 4, TipoCamion.CARGAPESADA);
                Camion camion9 = new Camion("MAN", "TGX 18.640", "MANTGX640", 4, 80.0, 420, true, Trasmision.MANUAL, 24500000, true, revisionTecnica9, true, false, 34, true, false, false, 4, TipoCamion.CARGAPESADA);
                Camion camion10 = new Camion("Iveco", "Stralis", "IVES23S", 4, 90.0, 480, false, Trasmision.AUTOMATICA, 29000000, false, revisionTecnica10, false, true, 41, true, false, true, 4, TipoCamion.CARGAPESADA);

                // Crear 10 vehículos tipo bus
                Bus bus1 = new Bus("SCANIA", "2023", "SNT23MN", 5, 90.0, 250, false, Trasmision.MANUAL, 500000, false, revisionTecnica1, 10, 40, 10, 2, 400, false, false, 4, false, 5, 3213123);
                Bus bus2 = new Bus("Volvo", "B8R", "VLB8R22", 5, 85.0, 240, true, Trasmision.AUTOMATICA, 600000, true, revisionTecnica2, 12, 50, 12, 2, 450, true, false, 4, true, 4, 4321123);
                Bus bus3 = new Bus("Mercedes-Benz", "Sprinter", "MBS2023", 6, 80.0, 230, false, Trasmision.MANUAL, 550000, true, revisionTecnica3, 8, 30, 8, 2, 350, false, true, 3, false, 6, 5432134);
                Bus bus4 = new Bus("MAN", "Lion's City", "MALC2023", 6, 95.0, 270, true, Trasmision.MANUAL, 650000, false, revisionTecnica4, 14, 50, 14, 2, 480, false, false, 5, false, 3, 6543245);
                Bus bus5 = new Bus("Iveco", "Crossway", "IVCX2023", 5, 90.0, 260, true, Trasmision.AUTOMATICA, 700000, false, revisionTecnica5, 12, 45, 12, 2, 470, true, true, 4, true, 6, 7654356);
                Bus bus6 = new Bus("MAN", "TGE 3.180", "MANTGE2023", 5, 85.0, 240, false, Trasmision.MANUAL, 560000, true, revisionTecnica6, 9, 40, 9, 2, 400, true, true, 4, false, 7, 8765467);
                Bus bus7 = new Bus("Toyota", "Coaster", "TOYC2023", 6, 80.0, 220, false, Trasmision.AUTOMATICA, 600000, false, revisionTecnica7, 10, 35, 10, 2, 430, true, false, 3, true, 8, 9876578);
                Bus bus8 = new Bus("Volvo", "9700", "VL9700", 5, 100.0, 280, true, Trasmision.MANUAL, 750000, true, revisionTecnica8, 15, 55, 15, 2, 500, false, true, 5, false, 9, 1098767);
                Bus bus9 = new Bus("Scania", "Citywide", "SCW2023", 5, 95.0, 250, true, Trasmision.MANUAL, 650000, false, revisionTecnica9, 11, 40, 11, 2, 460, false, false, 4, true, 2, 2109876);
                Bus bus10 = new Bus("Hyundai", "Elec City", "HYUEC2023", 6, 90.0, 260, false, Trasmision.AUTOMATICA, 700000, true, revisionTecnica10, 13, 45, 13, 2, 480, false, true, 4, false, 1, 3212345);

                // Crear 10 vehículos tipo van
                Van van1 = new Van("BYT-T3", "2022", "BTE-23", 7, 120.0, 250, false, Trasmision.MANUAL, 3000000, false, revisionTecnica1, 120.0, 40, Combustible.DIESEL, 19, 2, 34, false, false, true, false, 2);
                Van van2 = new Van("Mercedes-Benz", "Sprinter", "MB-2023", 7, 130.0, 280, true, Trasmision.AUTOMATICA, 3500000, true, revisionTecnica2, 150.0, 45, Combustible.DIESEL, 22, 3, 36, true, false, false, true, 1);
                Van van3 = new Van("Volkswagen", "Transporter", "VW-T2023", 8, 110.0, 230, false, Trasmision.MANUAL, 2500000, false, revisionTecnica3, 115.0, 38, Combustible.HIBRIDO, 20, 2, 32, false, true, true, false, 3);
                Van van4 = new Van("Ford", "Transit", "FT-2023", 7, 125.0, 240, false, Trasmision.MANUAL, 2700000, true, revisionTecnica4, 120.0, 42, Combustible.DIESEL, 18, 2, 35, false, false, true, true, 4);
                Van van5 = new Van("Renault", "Master", "RM-2023", 7, 115.0, 220, true, Trasmision.AUTOMATICA, 2800000, true, revisionTecnica5, 110.0, 37, Combustible.DIESEL, 21, 2, 33, false, true, false, false, 5);
                Van van6 = new Van("Fiat", "Ducato", "FD-2023", 8, 120.0, 240, true, Trasmision.MANUAL, 2600000, false, revisionTecnica6, 125.0, 40, Combustible.DIESEL, 23, 3, 34, false, true, false, true, 6);
                Van van7 = new Van("Peugeot", "Boxer", "PB-2023", 7, 110.0, 230, false, Trasmision.MANUAL, 2500000, true, revisionTecnica7, 130.0, 41, Combustible.DIESEL, 20, 2, 32, false, false, true, false, 7);
                Van van8 = new Van("Citroën", "Jumper", "CJ-2023", 7, 125.0, 245, true, Trasmision.AUTOMATICA, 2700000, true, revisionTecnica8, 120.0, 42, Combustible.GASOLINA, 19, 2, 33, true, false, false, true, 8);
                Van van9 = new Van("Nissan", "NV350", "NS-NV2023", 7, 130.0, 250, false, Trasmision.MANUAL, 3000000, false, revisionTecnica9, 140.0, 43, Combustible.DIESEL, 22, 3, 36, true, true, false, false, 9);
                Van van10 = new Van("Toyota", "HiAce", "TH-2023", 8, 120.0, 240, true, Trasmision.AUTOMATICA, 2900000, true, revisionTecnica10, 125.0, 44, Combustible.DIESEL, 23, 3, 35, false, false, true, true, 10);
                
                sistemaConcesionario = new SistemaConcesionario("Consesionario Uniquindio", adm1, registro);

                sistemaConcesionario.agregarEmpleado(empleado1);
                sistemaConcesionario.agregarEmpleado(empleado2);
                sistemaConcesionario.agregarEmpleado(empleado3);
                sistemaConcesionario.agregarEmpleado(empleado4);
                sistemaConcesionario.agregarEmpleado(empleado5);
                sistemaConcesionario.agregarEmpleado(empleado6);
                sistemaConcesionario.agregarEmpleado(empleado7);
                sistemaConcesionario.agregarEmpleado(empleado8);
                sistemaConcesionario.agregarEmpleado(empleado9);
                sistemaConcesionario.agregarEmpleado(empleado10);

                sistemaConcesionario.agregarCliente(cliente1);
                sistemaConcesionario.agregarCliente(cliente2);
                sistemaConcesionario.agregarCliente(cliente3);
                sistemaConcesionario.agregarCliente(cliente4);
                sistemaConcesionario.agregarCliente(cliente5);
                sistemaConcesionario.agregarCliente(cliente6);
                sistemaConcesionario.agregarCliente(cliente7);
                sistemaConcesionario.agregarCliente(cliente8);
                sistemaConcesionario.agregarCliente(cliente9);
                sistemaConcesionario.agregarCliente(cliente10);

                sistemaConcesionario.agregarVehiculo(moto1);
                sistemaConcesionario.agregarVehiculo(moto2);
                sistemaConcesionario.agregarVehiculo(moto3);
                sistemaConcesionario.agregarVehiculo(moto4);
                sistemaConcesionario.agregarVehiculo(moto5);
                sistemaConcesionario.agregarVehiculo(moto5);
                sistemaConcesionario.agregarVehiculo(moto6);
                sistemaConcesionario.agregarVehiculo(moto7);
                sistemaConcesionario.agregarVehiculo(moto8);
                sistemaConcesionario.agregarVehiculo(moto9);
                sistemaConcesionario.agregarVehiculo(moto10);

                sistemaConcesionario.agregarVehiculo(camioneta1);
                sistemaConcesionario.agregarVehiculo(camioneta2);
                sistemaConcesionario.agregarVehiculo(camioneta3);
                sistemaConcesionario.agregarVehiculo(camioneta4);
                sistemaConcesionario.agregarVehiculo(camioneta5);
                sistemaConcesionario.agregarVehiculo(camioneta6);
                sistemaConcesionario.agregarVehiculo(camioneta7);
                sistemaConcesionario.agregarVehiculo(camioneta8);
                sistemaConcesionario.agregarVehiculo(camioneta9);
                sistemaConcesionario.agregarVehiculo(camioneta10);

                sistemaConcesionario.agregarVehiculo(pickUp1);
                sistemaConcesionario.agregarVehiculo(pickUp2);
                sistemaConcesionario.agregarVehiculo(pickUp3);
                sistemaConcesionario.agregarVehiculo(pickUp4);
                sistemaConcesionario.agregarVehiculo(pickUp5);
                sistemaConcesionario.agregarVehiculo(pickUp6);
                sistemaConcesionario.agregarVehiculo(pickUp7);
                sistemaConcesionario.agregarVehiculo(pickUp8);
                sistemaConcesionario.agregarVehiculo(pickUp9);
                sistemaConcesionario.agregarVehiculo(pickUp10);

                sistemaConcesionario.agregarVehiculo(sedan1);
                sistemaConcesionario.agregarVehiculo(sedan2);
                sistemaConcesionario.agregarVehiculo(sedan3);
                sistemaConcesionario.agregarVehiculo(sedan4);
                sistemaConcesionario.agregarVehiculo(sedan5);
                sistemaConcesionario.agregarVehiculo(sedan6);
                sistemaConcesionario.agregarVehiculo(sedan7);
                sistemaConcesionario.agregarVehiculo(sedan8);
                sistemaConcesionario.agregarVehiculo(sedan9);
                sistemaConcesionario.agregarVehiculo(sedan10);

                sistemaConcesionario.agregarVehiculo(deportivo1);
                sistemaConcesionario.agregarVehiculo(deportivo2);
                sistemaConcesionario.agregarVehiculo(deportivo3);
                sistemaConcesionario.agregarVehiculo(deportivo4);
                sistemaConcesionario.agregarVehiculo(deportivo5);
                sistemaConcesionario.agregarVehiculo(deportivo6);
                sistemaConcesionario.agregarVehiculo(deportivo7);
                sistemaConcesionario.agregarVehiculo(deportivo8);
                sistemaConcesionario.agregarVehiculo(deportivo9);
                sistemaConcesionario.agregarVehiculo(deportivo10);

                sistemaConcesionario.agregarVehiculo(camion1);
                sistemaConcesionario.agregarVehiculo(camion2);
                sistemaConcesionario.agregarVehiculo(camion3);
                sistemaConcesionario.agregarVehiculo(camion4);
                sistemaConcesionario.agregarVehiculo(camion5);
                sistemaConcesionario.agregarVehiculo(camion6);
                sistemaConcesionario.agregarVehiculo(camion7);
                sistemaConcesionario.agregarVehiculo(camion8);
                sistemaConcesionario.agregarVehiculo(camion9);
                sistemaConcesionario.agregarVehiculo(camion10);

                sistemaConcesionario.agregarVehiculo(bus1);
                sistemaConcesionario.agregarVehiculo(bus2);
                sistemaConcesionario.agregarVehiculo(bus3);
                sistemaConcesionario.agregarVehiculo(bus4);
                sistemaConcesionario.agregarVehiculo(bus5);
                sistemaConcesionario.agregarVehiculo(bus6);
                sistemaConcesionario.agregarVehiculo(bus7);
                sistemaConcesionario.agregarVehiculo(bus8);
                sistemaConcesionario.agregarVehiculo(bus9);
                sistemaConcesionario.agregarVehiculo(bus10);

                sistemaConcesionario.agregarVehiculo(van1);
                sistemaConcesionario.agregarVehiculo(van2);
                sistemaConcesionario.agregarVehiculo(van3);
                sistemaConcesionario.agregarVehiculo(van4);
                sistemaConcesionario.agregarVehiculo(van5);
                sistemaConcesionario.agregarVehiculo(van6);
                sistemaConcesionario.agregarVehiculo(van7);
                sistemaConcesionario.agregarVehiculo(van8);
                sistemaConcesionario.agregarVehiculo(van9);
                sistemaConcesionario.agregarVehiculo(van10);

               // Crear 10 transacciones de alquiler
                TAlquiler alquiler1 = new TAlquiler("2313123123", 30);
                TAlquiler alquiler2 = new TAlquiler("9834234234", 15);
                TAlquiler alquiler3 = new TAlquiler("3456789087", 7);
                TAlquiler alquiler4 = new TAlquiler("5634239120", 25);
                TAlquiler alquiler5 = new TAlquiler("8473629123", 10);
                TAlquiler alquiler6 = new TAlquiler("2345678901", 20);
                TAlquiler alquiler7 = new TAlquiler("1234567890", 30);
                TAlquiler alquiler8 = new TAlquiler("4567890123", 5);
                TAlquiler alquiler9 = new TAlquiler("6789012345", 18);
                TAlquiler alquiler10 = new TAlquiler("7890123456", 12);


                // Creación de transacciones de compra con identificadores únicos
                TCompra compra1 = new TCompra("21414124");
                TCompra compra2 = new TCompra("54789231");
                TCompra compra3 = new TCompra("98321475");
                TCompra compra4 = new TCompra("47201984");
                TCompra compra5 = new TCompra("15834729");
                TCompra compra6 = new TCompra("63485012");
                TCompra compra7 = new TCompra("78349056");
                TCompra compra8 = new TCompra("92018473");
                TCompra compra9 = new TCompra("56719238");
                TCompra compra10 = new TCompra("83567019");
                // Creación de transacciones de venta con identificadores únicos
                TVenta venta1 = new TVenta("41241241");
                TVenta venta2 = new TVenta("98765432");
                TVenta venta3 = new TVenta("12345678");
                TVenta venta4 = new TVenta("87654321");
                TVenta venta5 = new TVenta("11223344");
                TVenta venta6 = new TVenta("55667788");
                TVenta venta7 = new TVenta("22334455");
                TVenta venta8 = new TVenta("66778899");
                TVenta venta9 = new TVenta("99887766");
                TVenta venta10 = new TVenta("44332211");


                alquiler1.procesar(sistemaConcesionario, cliente20, van10, empleado10);
                alquiler2.procesar(sistemaConcesionario, cliente19, van9, empleado9);
                alquiler3.procesar(sistemaConcesionario, cliente18, van8, empleado8);
                alquiler4.procesar(sistemaConcesionario, cliente17, van7, empleado7);
                alquiler5.procesar(sistemaConcesionario, cliente16, van6, empleado6);
                alquiler6.procesar(sistemaConcesionario, cliente15, van5, empleado5);
                alquiler7.procesar(sistemaConcesionario, cliente14, van4, empleado4);
                alquiler8.procesar(sistemaConcesionario, cliente13, van3, empleado3);
                alquiler9.procesar(sistemaConcesionario, cliente12, van2, empleado2);
                alquiler10.procesar(sistemaConcesionario, cliente11, van1, empleado1);

                compra1.procesar(sistemaConcesionario, cliente20, van10, empleado10);
                compra2.procesar(sistemaConcesionario, cliente20, van10, empleado10);
                compra3.procesar(sistemaConcesionario, cliente19, van9, empleado9);
                compra4.procesar(sistemaConcesionario, cliente18, van8, empleado8);
                compra5.procesar(sistemaConcesionario, cliente17, van7, empleado7);
                compra6.procesar(sistemaConcesionario, cliente16, van6, empleado6);
                compra7.procesar(sistemaConcesionario, cliente15, van5, empleado5);
                compra8.procesar(sistemaConcesionario, cliente14, van4, empleado4);
                compra9.procesar(sistemaConcesionario, cliente13, van3, empleado3);
                compra10.procesar(sistemaConcesionario, cliente12, van2, empleado2);

                venta1.procesar(sistemaConcesionario, cliente20, van10, empleado10);
                venta2.procesar(sistemaConcesionario, cliente20, van10, empleado10);
                venta3.procesar(sistemaConcesionario, cliente19, van9, empleado9);
                venta4.procesar(sistemaConcesionario, cliente18, van8, empleado8);
                venta5.procesar(sistemaConcesionario, cliente17, van7, empleado7);
                venta6.procesar(sistemaConcesionario, cliente16, van6, empleado6);
                venta7.procesar(sistemaConcesionario, cliente15, van5, empleado5);
                venta8.procesar(sistemaConcesionario, cliente14, van4, empleado4);
                venta9.procesar(sistemaConcesionario, cliente13, van3, empleado3);
                venta10.procesar(sistemaConcesionario, cliente12, van2, empleado2);

                listaDeEspera.add(van10);
                listaDeEspera.add(van9);
                listaDeEspera.add(van8);
                listaDeEspera.add(bus3);
                listaDeEspera.add(bus2);
                listaDeEspera.add(bus1);

                adm1.crearReporte(empleado3);
                adm1.crearReporte(empleado1);
                adm1.crearReporte(empleado2);

                System.out.println(empleado1.getTransacciones().size());
                openPrimaryView();



        }


        
        /*
         * No Modificar
         * Abre la ventana Principal
         */
        public void openPrimaryView() {
                try {
                    // Abrir la vista principal
                    primaryStage.setResizable(false);
                    FXMLLoader loader = new FXMLLoader();
                    loader.setLocation(App.class.getResource("Primary.fxml"));
                    Scene scene = new Scene(loader.load());
            
                    // Controlador de la vista principal
                    PrimaryView primaryView = loader.getController();
                    primaryView.setApp(this);
            
                    primaryStage.setScene(scene);
                    primaryStage.show();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            
            /*
             * No Modificar
             * Abre la ventana Principal de Empleado
             */
            public void openSecondaryEmpleadoView() {
                try {
                    primaryStage.setResizable(true);
                    // Cierra la ventana principal antes de abrir la secundaria
                    primaryStage.close();
                    
                    FXMLLoader loader = new FXMLLoader(getClass().getResource("SecondaryEmpleado.fxml"));
                    Scene scene = new Scene(loader.load());
            
                    // Controlador de la vista secundaria de empleado
                    SecondaryEmpleadoView view = loader.getController();
                    view.setApp(this);
            
                    primaryStage.setScene(scene);
                    primaryStage.show();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            
            /*
             * No Modificar
             * Abre la venta de inicio de Sesion de empleado
             */
            public void openLoginEmpleadoView() {
                try {
                    primaryStage.setResizable(false);
                    // Cierra la ventana actual (si es necesario) antes de abrir el inicio de sesión
                    primaryStage.close();
                    
                    FXMLLoader loader = new FXMLLoader(getClass().getResource("LoginEmpleado.fxml"));
                    Scene scene = new Scene(loader.load());
            
                    // Controlador de la vista de login de empleado
                    LoginEmpleadoView loginEmpleadoView = loader.getController();
                    loginEmpleadoView.setApp(this);
            
                    primaryStage.setScene(scene);
                    primaryStage.show();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            
            /*
             * No Modificar
             * Abre la Ventana de Inicio de Administrador
             */
            public void openLoginAdmView() {
                try {
                    FXMLLoader loader = new FXMLLoader();
                    loader.setLocation(getClass().getResource("LoginAdm.fxml"));
                    Scene scene = new Scene(loader.load());
            
                    // Controlador de la vista de login de administrador
                    LoginAdmView loginAdmView = loader.getController();
                    loginAdmView.setApp(this);
            
                    primaryStage.setScene(scene);
                    primaryStage.show();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            
            /*
             * No Modificar
             * Abre la Ventana principal de Administrador
             */
            public void openSecondaryAdmView() {
                try {
                    primaryStage.setResizable(true);
                    primaryStage.close();
                    
                    FXMLLoader loader = new FXMLLoader(getClass().getResource("SecondaryAdm.fxml"));
                    Scene scene = new Scene(loader.load());
            
                    // Controlador de la vista secundaria de administrador
                    SecondaryAdmView view = loader.getController();
                    view.setApp(this);
            
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