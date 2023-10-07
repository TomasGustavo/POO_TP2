import ar.edu.unlu.poo.tp2.Cuenta;
import ar.edu.unlu.poo.tp2.Usuario;

public class Main {
    public static void main(String[] args) {

        Usuario usuario = new Usuario(500,800,1500);
        System.out.println("ESTADO INICIAL:" + usuario.mostrarEstado());
        usuario.depositar(400);
        usuario.invertir(600);
        System.out.println("ESTADO LUEGO DE DEPOSITAR $400 E INVERTIR $600:" + usuario.mostrarEstado());
        System.out.println(usuario.realizarGasto(300));
        usuario.realizarGastoYGirar(1500);
        System.out.println("ESTADO LUEGO DE REALIZAR UN GASTO CON GIRO EN DESCUBIERTO($300):" + usuario.mostrarEstado());
        usuario.realizarCompra(800);
        System.out.println("ESTADO LUEGO DE REALIZAR UNA COMPRA CON CREDITO DE $800:" +
                usuario.mostrarEstado());
        usuario.pagarCompra(300,1);
        System.out.println("ESTDO LUEGO DE PAGAR $300 DE LA ULTIMA COMPRA: " + usuario.mostrarEstado());
    }
}