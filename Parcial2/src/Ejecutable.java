
public class Ejecutable {
    public static void main (String[] args) {
    	
        Serie listaSeries[] = new Serie[5];
        VideoJuego listaVideojuegos[] = new VideoJuego[5];

        listaSeries[0] = new Serie ();
        listaSeries[1] = new Serie ("Lupin", "Maurice Leblanc");
        listaSeries[2] = new Serie ("inventando a anna", 1, "Drama", "Shonda Rhimes");
        listaSeries[3] = new Serie ("gambito de dama", 1 ,"Drama", "Scott Frank y Allan scott");
        listaSeries[4] = new Serie ("The walking dead", 11, "Suspenso y accion", "Frank Darabont");

        listaVideojuegos[0] = new VideoJuego ();
        listaVideojuegos[1] = new VideoJuego ("Super Mario 64", 30, "aventura", "nintendo");
        listaVideojuegos[2] = new VideoJuego ("Gta 5", 120, "mundo libre", "Rockstar games");
        listaVideojuegos[3] = new VideoJuego ("Apex", "EA");
        listaVideojuegos[4] = new VideoJuego ("Gran Turismo", 80, "Carreras", "Sport");

        listaSeries[1].entregar ();
        listaSeries[4].entregar ();
        listaVideojuegos[0].entregar ();
        listaVideojuegos[3].entregar ();

        int entregados = 0;

        for (int i = 0; i < listaSeries.length; i++) {
            if (listaSeries[i].isEntregado ()) {
                entregados += 1;
                listaSeries[i].devolver ();
            }
            if (listaVideojuegos[i].isEntregado ()) {
                entregados += 1;
                listaVideojuegos[i].devolver ();
            }
        }
        System.out.println("Hay "+entregados+" articulos entregados");

        Serie serieMayor = listaSeries[0];
        VideoJuego videojuegoMayor = listaVideojuegos[0];

        for (int i = 1; i < listaSeries.length; i++) {
            if (listaSeries[i].compareTo (serieMayor) == Serie.MAYOR) {
                serieMayor=listaSeries[i];
            }
            if (listaVideojuegos[i].compareTo (videojuegoMayor) == VideoJuego.MAYOR) {
                videojuegoMayor = listaVideojuegos[i];
            }
        }
        System.out.println (videojuegoMayor);
        System.out.println (serieMayor);
    }
}
