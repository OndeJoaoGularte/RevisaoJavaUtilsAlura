import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class RevisaoData {
    static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Data e hora atual
        System.out.println("Data e hora atual");
        String tarefa = "Enviar relatório semanal";

        LocalDate dataCriacao = LocalDate.now();
        LocalTime horaCriacao = LocalTime.now();

        System.out.println("Tarefa: \"" + tarefa + "\"");
        System.out.println("Data de criação: " + dataCriacao);
        System.out.println("Hora de criação: " + horaCriacao);

        // Formatando data e hora para relatórios
        System.out.println("\nFormatando data e hora para relatórios");
        LocalDate dataAtual = LocalDate.now();
        LocalTime horaAtual = LocalTime.now();

        DateTimeFormatter formatoData = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        DateTimeFormatter formatoHora = DateTimeFormatter.ofPattern("HH:mm");

        String dataFormatada = dataAtual.format(formatoData);
        String horaFormatada = horaAtual.format(formatoHora);

        System.out.println("Data formatada: " + dataFormatada);
        System.out.println("Hora formatada: " + horaFormatada);

        // Diferença entre horas
        System.out.println("\nDiferença entre horas");
        LocalTime horarioInicio = LocalTime.of(14, 30, 0);
        LocalTime horarioTermino = LocalTime.of(16, 45, 0);

        Duration duracao = Duration.between(horarioInicio, horarioTermino);

        System.out.println("Diferença de tempo: " + duracao.toHours() + " horas e " + duracao.toMinutesPart() + " minutos");

        // Calculando a data de entrega
        System.out.println("\nCalculando a data de entrega");
        LocalDate dataInicio = LocalDate.now();
        int prazoDias = 15;
        LocalDate dataEntrega = dataInicio.plusDays(prazoDias);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String dataCalculada = dataEntrega.format(formatter);

        System.out.println("Data de entrega: " + dataCalculada);

        // Ajustando a data de vencimento
        System.out.println("\nAjustando a data de vencimento");
        LocalDate dataVencimentoOriginal = LocalDate.of(2025, 3, 20);
        int adiamentoMeses = 1;
        LocalDate novaDataVencimento = dataVencimentoOriginal.plusMonths(adiamentoMeses);

        String dataAjustada = novaDataVencimento.format(formatter);

        System.out.println("Nova data de vencimento: " + dataAjustada);

        // Verificando a data de um evento
        System.out.println("\nVerificando a data de um evento");
        LocalDate dataEvento = LocalDate.of(2025, 3, 10);
        LocalDate dataLocal = LocalDate.of(2025, 3, 15);

        String dataEventoFormatada = dataEvento.format(formatter);
        String dataAtualFormatada = dataLocal.format(formatter);

        System.out.println("Data do evento: " + dataEventoFormatada);
        System.out.println("Data atual: " + dataAtualFormatada);

        if (dataEvento.isBefore(dataLocal)) {
            System.out.println("O evento já ocorreu.");
        } else {
            System.out.println("O evento ainda não ocorreu.");
        }

        // Lembrete de pagamento
        System.out.println("\nLembrete de pagamento");
        LocalDate dataVencimento = LocalDate.of(2025, 3, 30);
        int antecedenciaDias = 5;
        LocalDate dataLembrete = dataVencimento.minusDays(antecedenciaDias);

        String dataLembrada = dataLembrete.format(formatter);

        System.out.println("Data do lembrete: " + dataLembrada);

        // Fuso horário
        System.out.println("\nFuso horário");
        ZonedDateTime horarioTokyo = ZonedDateTime.now(ZoneId.of("Asia/Tokyo"));
        DateTimeFormatter fusoFormatter = DateTimeFormatter.ofPattern("HH:mm" +
                ":ss");
        String horarioFormatado = horarioTokyo.format(fusoFormatter);

        System.out.println("Horário atual em Tóquio: " + horarioFormatado);

        // Convertendo horário para outro fuso
        System.out.println("\nConvertendo horário para outro fuso");
        ZonedDateTime horarioSistema = ZonedDateTime.now();
        ZonedDateTime horarioSydney = horarioSistema.withZoneSameInstant(ZoneId.of("Australia/Sydney"));

        DateTimeFormatter convertFormatter = DateTimeFormatter.ofPattern("HH" +
                ":mm");
        System.out.println("Horário atual no sistema: " + horarioSistema.format(convertFormatter));
        System.out.println("Horário atual em Sydney: " + horarioSydney.format(convertFormatter));

        // Controle de expediente
        System.out.println("\nControle de expediente");

        // Entrada do usuário
        System.out.print("Digite o horário de entrada (HH:mm): ");
        LocalTime entrada = LocalTime.parse(scanner.next(), convertFormatter);

        System.out.print("Digite a carga horária diária (em horas): ");
        int cargaHoraria = scanner.nextInt();

        System.out.print("Digite o horário real de saída (HH:mm): ");
        LocalTime saidaReal = LocalTime.parse(scanner.next(), convertFormatter);

        // Cálculo da saída prevista
        LocalTime saidaPrevista = entrada.plusHours(cargaHoraria);

        // Cálculo da diferença entre saída real e prevista
        Duration diferenca = Duration.between(saidaPrevista, saidaReal);
        long horasExtras = diferenca.toHours();
        long minutosExtras = diferenca.toMinutesPart();

        // Exibição dos resultados formatados
        System.out.println("\nHorário de entrada: " + entrada.format(convertFormatter));
        System.out.println("Horário de saída previsto: " + saidaPrevista.format(convertFormatter));
        System.out.println("Horário real de saída: " + saidaReal.format(convertFormatter));

        if (horasExtras == 0 && minutosExtras == 0) {
            System.out.println("Saldo de horas: 0h 0min");
        } else {
            String sinal;

            if (horasExtras > 0 || minutosExtras > 0) {
                sinal = "+";
            } else {
                sinal = "-";
            }

            System.out.println("Saldo de horas: " + sinal + Math.abs(horasExtras) + "h " + Math.abs(minutosExtras) + "min");
        }

        scanner.close();
    }
}
