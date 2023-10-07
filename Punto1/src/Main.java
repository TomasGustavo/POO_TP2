import ar.edu.unlu.poo.tp2.Club;
import ar.edu.unlu.poo.tp2.Mes;
import ar.edu.unlu.poo.tp2.TipoSubscripcion;

public class Main {
    public static void main(String[] args) {
        Club club = new Club();
        club.agregarActividad("Futbol", TipoSubscripcion.BASICA);
        club.agregarActividad("Tenis", TipoSubscripcion.DESTACADA);
        club.agregarActividad("Natacion", TipoSubscripcion.BASICA);
        club.agregarActividad("Hockey", TipoSubscripcion.INTERMEDIA);
        club.agregarActividad("Rugby", TipoSubscripcion.DESTACADA);

        club.agregarSocio("Tomas", "Loiacono", "La Plata 341",
                "Tomasl@gmail.com", "43589606", TipoSubscripcion.INTERMEDIA);
        club.agregarSocio("Carlos", "Lopes", "Misiones 723",
                "CarlosL@gmail.com", "24736278", TipoSubscripcion.BASICA);
        club.agregarSocio("Pedro", "Perez", "España 3021",
                "PP@gmail.com", "53136012", TipoSubscripcion.DESTACADA);

        System.out.println(club.reporteMensual(Mes.OCTUBRE));
        System.out.println(club.listadoActividades());
        System.out.println(club.listadoSocios());
    }
}