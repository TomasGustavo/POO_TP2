import ar.edu.unlu.poo.tp2.*;

public class Main {
    public static void main(String[] args) {
        AgenciaDeTurismo agencia = new AgenciaDeTurismo();
        Proveedor proveedor = new Proveedor("Viajes SRL", "15-42735902-5", "2323514682", TipoProveedor.EXCURSION);
        Destino destino1 = new Destino("Cordoba", "Argentina", proveedor);
        Destino destino2 = new Destino("Roma", "Italia", proveedor);
        Hospedaje hospedaje = new Hospedaje(3450,"Luxury", TipoHospedaje.HOTEL, proveedor);
        Transporte transporte = new Transporte("Quatar Airlines", proveedor, TipoTransporte.AEREO, 53000);
        //Defino dos paquetes con distintos destinos
        Paquete paquete1 = new Paquete(destino1,hospedaje,transporte);
        Paquete paquete2 = new Paquete(destino2,hospedaje,transporte);

        //Defino varios clientes
        Cliente cliente1 = new Cliente("Juan", "Perez", "juanP@gmail.com", "432251");
        Cliente cliente2 = new Cliente("Jose", "Garza", "joseG@gmail.com", "6343223");
        Cliente cliente3 = new Cliente("Camila", "Holms", "holmsc@gmail.com", "6436233");
        Cliente cliente4 = new Cliente("Tomas", "Loiacono", "tomasl@gmail.com", "23645312");

        //Creo ventas para los clientes
        agencia.realizarVenta(cliente1, paquete1);
        agencia.realizarVenta(cliente1, paquete2);
        agencia.realizarVenta(cliente2, paquete2);
        agencia.realizarVenta(cliente3, paquete1);
        agencia.realizarVenta(cliente3, paquete2);
        agencia.realizarVenta(cliente4, paquete2);

        //Muestro el destino favorito
        System.out.println("El destino favorito es " + agencia.obtenerDestinoFavorito());

        //Lista de ventas por destino
        System.out.println(agencia.obtenerVentasPorDestino());

    }
}