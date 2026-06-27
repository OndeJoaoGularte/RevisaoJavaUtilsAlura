import java.util.*;
import java.util.stream.Collectors;

public class RevisaoCollections {
    static void main(String[] args) {

        // Adicionando elementos a uma lista
        System.out.println("Adicionando elementos a uma lista");
        List<String> funcionariosA = new ArrayList<>();

        funcionariosA.add("João");
        funcionariosA.add("Maria");
        funcionariosA.add("Vitor");
        funcionariosA.add("Ana");

        System.out.println("Lista de funcionários: " + funcionariosA);

        // Removendo elementos
        System.out.println("\nRemovendo elementos");
        List<String> funcionariosR = new ArrayList<>();

        funcionariosR.add("Joana");
        funcionariosR.add("Lucas");
        funcionariosR.add("Pedro");
        funcionariosR.add("Antônio");

        System.out.println("Lista inicial: " + funcionariosR);

        funcionariosR.remove("Pedro");

        System.out.println("Lista após a exclusão: " + funcionariosR);

        // Acessando elementos
        System.out.println("\nAcessando elementos");
        List<String> funcionariosS = new ArrayList<>();

        funcionariosS.add("João");
        funcionariosS.add("Maria");
        funcionariosS.add("Ana");
        funcionariosS.add("Pedro");
        funcionariosS.add("Antônio");

        System.out.println("A segunda pessoa da lista é: " + funcionariosS.get(1));
        System.out.println("Total de funcionários: " + funcionariosS.size());

        // Elementos únicos em uma lista
        System.out.println("\nElementos únicos em uma lista");
        List<String> eventos = new ArrayList<>();

        eventos.add("IA Conference Brasil");
        eventos.add("AI Summit");
        eventos.add("DevFest");
        eventos.add("Cloud Expo");
        eventos.add("IA Conference Brasil");
        eventos.add("DevFest");

        Set<String> eventosUnicos = new HashSet<>(eventos);

        System.out.println("Lista de eventos: " + eventosUnicos);

        // Criando um Map de clientes
        System.out.println("\nCriando um Map de clientes");
        Map<Integer, String> clientesC = new HashMap<>();

        clientesC.put(1, "Maria");
        clientesC.put(2, "Marcos");
        clientesC.put(3, "Ana");

        System.out.println("O nome do cliente com ID 2 é: " + clientesC.get(2));

        // Verificando se a chave existe
        System.out.println("\nVerificando se a chave existe");
        Map<Integer, String> clientesV = new HashMap<>();

        clientesV.put(1, "Maria");
        clientesV.put(2, "Marcos");
        clientesV.put(3, "Ana");
        clientesV.put(4, "Joana");
        clientesV.put(5, "Karen");

        int idCliente = 6;

        if (clientesV.containsKey(idCliente)) {
            String nomeCliente = clientesV.get(idCliente);
            System.out.println("O nome do cliente com ID " + idCliente + " é: " + nomeCliente);
        } else {
            System.out.println("Cliente com ID " + idCliente + " não encontrado.");
        }

        // Selecionando funcionários com nomes curtos
        System.out.println("\nSelecionando funcionários com nomes curtos");
        List<String> funcionariosC = List.of("Ana", "Bruno", "Carlos",
                "Amanda", "Alice", "Daniel", "Caroline");

        List<String> nomesCurtos = funcionariosC.stream()
                .filter(nome -> nome.length() <= 5)
                .toList();

        System.out.println(nomesCurtos);

        // Calculando o quadrado dos números
        System.out.println("\nCalculando o quadrado dos números");
        List<Integer> numeros = List.of(2, 3, 5, 7, 11);

        List<Integer> quadrados = numeros.stream()
                .map(numero -> numero * numero)
                .toList();

        System.out.println("Quadrados dos números: " + quadrados);

        // Calculando o total com imposto
        System.out.println("\nCalculando o total com imposto");
        List<Double> precosProdutos = List.of(29.99, 49.50, 15.75, 99.99);

        double totalGasto = precosProdutos.stream()
                .reduce(0.0, Double::sum);

        double imposto = totalGasto * 0.08;
        double totalComImposto = totalGasto + imposto;

        System.out.println("Valor total antes do imposto: " + String.format("%.2f", totalGasto));
        System.out.println("Valor total com imposto de 8%: " + String.format("%.2f", totalComImposto));

        // Calculando estatísticas das notas
        System.out.println("\nCalculando estatísticas das notas");
        List<Double> notas = List.of(7.5, 8.0, 6.5, 9.0, 10.0);

        DoubleSummaryStatistics estatisticas = notas.stream()
                .mapToDouble(Double::doubleValue)
                .summaryStatistics();

        double media = estatisticas.getAverage();
        double menorNota = estatisticas.getMin();
        double maiorNota = estatisticas.getMax();

        System.out.println("A média das notas é: " + media);
        System.out.println("A menor nota foi: " + menorNota);
        System.out.println("A maior nota foi: " + maiorNota);
    }
}
