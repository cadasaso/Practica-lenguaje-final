import com.carlos.qqsmillonario.enumeracion.Comodin;
import com.carlos.qqsmillonario.modelo.Participante;
import com.carlos.qqsmillonario.modelo.ProgresoParticipante;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        int cantidadDias = 1;
        Scanner sc = new Scanner(System.in);
        Map<Integer, List<ProgresoParticipante>> mapaProgreso = new HashMap<Integer, List<ProgresoParticipante>>();
        int valorPesosSemanal = 0;
        while(cantidadDias<=5) {
            System.out.println("Información del día "+cantidadDias);
            List<ProgresoParticipante> listaProgreso = new LinkedList<ProgresoParticipante>();
            int cantidadParticipantes = 1;
            int valorPesosEmision = 0;
            while(cantidadParticipantes <= 2){
                System.out.println("Registre información del concursante "+cantidadParticipantes+": ");
                Participante participante = new Participante();
                ProgresoParticipante progreso = new ProgresoParticipante();
                System.out.println("Nombres del concursante "+cantidadParticipantes+": ");
                participante.setNombres(sc.nextLine());
                System.out.println("Apellidos del concursante "+cantidadParticipantes+": ");
                participante.setApellidos(sc.nextLine());
                System.out.println("Teléfono del concursante "+cantidadParticipantes+": ");
                participante.setTelefono(sc.nextLine());
                System.out.println("Número de documento del concursante "+cantidadParticipantes+": ");
                participante.setNumeroDocumento(sc.nextLine());
                System.out.println("Registrar progreso del concursante "+cantidadParticipantes+": ");
                System.out.println("Tiempo que tardó en responder la pregunta clasificatoria (en minutos): ");
                progreso.setTiempoRespPregClasificatoria(sc.nextInt());
                System.out.println("Número de la última pregunta respondida correctamente: ");
                progreso.setUltimaPreguntaRespondida(sc.nextInt());
                progreso.setParticipante(participante);
                progreso.setValorPremioPesos(progreso.calcularPremio(progreso.getUltimaPreguntaRespondida()));
                System.out.println("Valor del premio obtenido en pesos: "+progreso.getValorPremioPesos());
                valorPesosEmision = valorPesosEmision + progreso.getValorPremioPesos();
                progreso.setComodinesUsados(new LinkedList<Comodin>());
                System.out.println("Seleccione los comodines usados: ");
                int conteoComodines = 0;
                while(conteoComodines <= 3) {
                    System.out.println("Digite 1 para 50/50");
                    System.out.println("Digite 2 para llamada a un amigo");
                    System.out.println("Digite 3 para ayuda del público");
                    System.out.println("Digite 4 para finalizar registro de comodines");
                    System.out.println("Digite una opción: ");
                    int opcion = sc.nextInt();
                    Comodin comodin = progreso.cargarComodinPorCodigo(opcion);
                    if(comodin != null){
                        System.out.println("Comodin usado: "+comodin.nombreComodin());
                        progreso.getComodinesUsados().add(comodin);
                        conteoComodines++;
                    }

                    switch (opcion){
                        case 4:
                            conteoComodines = 4;
                    }
                }
                listaProgreso.add(progreso);
                cantidadParticipantes++;
                sc.nextLine();
            }
            System.out.println("El valor en pesos otorgado en la emisión del día "+cantidadDias+" es: "+valorPesosEmision);
            valorPesosSemanal = valorPesosSemanal + valorPesosEmision;
            mapaProgreso.put(cantidadDias, listaProgreso);
            cantidadDias++;
        }
        System.out.println("El valor en pesos otorgado a los concursantes durante la semana es: "+valorPesosSemanal);
        System.exit(0);
    }
}
