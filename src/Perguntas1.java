import java.util.*;

public class Perguntas1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int acertos = 0;

        // Perguntas
        ArrayList<String> perguntas = new ArrayList<>(List.of(
                "⿡ Desafio 1 – A Porta da Decisão:\nVocê chega a uma porta com sensores. Um painel exibe o seguinte código:\n\nint idade = 18;\nif (idade >= 18) {\n    System.out.println(\"Você pode votar.\");\n} else {\n    System.out.println(\"Você ainda não pode votar.\");\n}\n\nO que a porta vai dizer?",
                "⿢ Desafio 2 – O Caminho Par ou Ímpar:\nUm enigma bloqueia a ponte. O console mostra:\n\nint numero = 5;\nif (numero % 2 == 0) {\n    System.out.println(\"Par\");\n} else {\n    System.out.println(\"Ímpar\");\n}\n\nQual será a saída?",
                "⿣ Desafio 3 – A Muralha dos Aprovados:\nVocê tenta atravessar uma muralha mágica que só deixa passar os aprovados:\n\nint nota = 7;\nif (nota >= 6) {\n    System.out.println(\"Aprovado\");\n} else {\n    System.out.println(\"Reprovado\");\n}\n\nCom qual condição o jogador será aprovado?",
                "⿤ Desafio 4 – O Erro no Código:\nVocê encontra um código quebrado no chão digital:\n\nint x = 10;\nif x > 5 {\n    System.out.println(\"Maior que 5\");\n}\n\nQual é o erro neste código?",
                "⿥ Desafio 5 – O Encontro dos Iguais:\nDois valores se encaram no meio da arena:\n\nint a = 3, b = 3;\nif (a == b) {\n    System.out.println(\"Iguais\");\n} else {\n    System.out.println(\"Diferentes\");\n}\n\nQual será a saída?",
                "⿦ Desafio 6 – O Caminho Correto:\nO caminho se divide em múltiplas decisões.\nQual alternativa representa corretamente o uso de else if?",
                "⿧ Desafio 7 – A Temperatura da Cidade:\nUm painel sensível à temperatura lê:\n\nint temp = 25;\nif (temp > 30) {\n    System.out.println(\"Muito quente\");\n} else if (temp >= 20) {\n    System.out.println(\"Agradável\");\n} else {\n    System.out.println(\"Frio\");\n}\n\nO que será impresso?",
                "⿨ Desafio 8 – A Armadilha Lógica:\nBugador Malígno tenta confundir sua mente.\nQual das afirmações sobre if está incorreta?",
                "⿩ Desafio 9 – A Nota Suprema:\nUm código misterioso aparece:\n\nint nota = 10;\nif (nota == 10) {\n    System.out.println(\"Nota excelente\");\n} else {\n    System.out.println(\"Boa nota\");\n}\n\nPara qual valor de nota a saída será \"Nota excelente\"?",
                "🔟 Desafio 10 – A Verificação da Aposentadoria:\nVocê encontra uma placa antiga com este código:\n\nint idade = 65;\nif (idade >= 60) {\n    System.out.println(\"Você tem direito à aposentadoria.\");\n} else {\n    System.out.println(\"Continue contribuindo.\");\n}\n\nQual é o objetivo do código?",
                "⿡⿡ Desafio 11 – O Símbolo Misterioso:\nUm símbolo mágico aparece no céu: == \n\nO que significa '==' dentro de uma estrutura if?",
                "⿡⿢ Desafio 12 – O Nível do Guerreiro:\nVocê consulta seu nível de experiência no terminal:\n\nint nivel = 4;\nif (nivel > 5) {\n    System.out.println(\"Avançado\");\n} else if (nivel >= 3) {\n    System.out.println(\"Intermediário\");\n} else {\n    System.out.println(\"Iniciante\");\n}\n\nQual será a saída?")
        );

        // Alternativas
        ArrayList<String[]> alternativas = new ArrayList<>(List.of(
                new String[]{"A) Você pode votar", "B) Você ainda não pode votar", "C) Erro de compilação", "D) Nenhuma das anteriores"},
                new String[]{"A) Par", "B) Ímpar", "C) Número inválido", "D) Nada"},
                new String[]{"A) nota >= 5", "B) nota >= 6", "C) nota >= 7", "D) nota > 7"},
                new String[]{"A) Falta de ponto e vírgula", "B) Falta de parênteses na condição", "C) A variável x não foi inicializada", "D) Nenhum erro"},
                new String[]{"A) Iguais", "B) Diferentes", "C) Erro de comparação", "D) Nenhuma saída"},
                new String[]{"A) if (x > 10) { ... } else if (x == 10) { ... }", "B) if (x > 10) else if (x == 10)", "C) if (x > 10) else (x == 10)", "D) if x > 10 else x == 10"},
                new String[]{"A) Muito quente", "B) Agradável", "C) Frio", "D) Nenhuma saída"},
                new String[]{"A) O if pode ter apenas uma linha sem chaves", "B) O else é obrigatório sempre que há um if", "C) Pode-se usar else if para múltiplas condições", "D) O if aceita expressões booleanas"},
                new String[]{"A) 8", "B) 9", "C) 10", "D) 11"},
                new String[]{"A) Verifica se a pessoa é idosa", "B) Verifica idade para desconto", "C) Verifica idade para aposentadoria", "D) Verifica se a idade é válida"},
                new String[]{"A) Atribuição de valor", "B) Comparação de igualdade", "C) Soma de valores", "D) Verificação de tipo"},
                new String[]{"A) Avançado", "B) Intermediário", "C) Iniciante", "D) Nenhuma saída"}
        ));

        // Gabarito
        ArrayList<String> gabarito = new ArrayList<>(List.of(
                "A", "B", "B", "B", "A", "A", "B", "B", "C", "C", "B", "B"
        ));

        // Gerar 3 índices aleatórios únicos
        ArrayList<Integer> indices = new ArrayList<>();
        for (int i = 0; i < perguntas.size(); i++) {
            indices.add(i);
        }
        Collections.shuffle(indices);

        // Mostrar 3 perguntas aleatórias
        for (int i = 0; i < 3; i++) {
            int index = indices.get(i);
            System.out.println("\n" + perguntas.get(index));
            for (String opcao : alternativas.get(index)) {
                System.out.println(opcao);
            }
            System.out.print("Sua resposta: ");
            String resposta = scanner.nextLine();
            if (resposta.equalsIgnoreCase(gabarito.get(index))) {
                acertos++;
            }
        }

        // Resultado final
        System.out.println("\n✅ Você acertou " + acertos + " de 3 perguntas!");
        if (acertos == 3) {
            System.out.println("🎉 Você é um verdadeiro mestre dos ifs!");
        } else if (acertos == 2) {
            System.out.println("💡 Muito bem! Falta pouco para a perfeição.");
        } else {
            System.out.println("⚠ Continue estudando para derrotar o Bugador Malígno!");
        }

        scanner.close();


}
}