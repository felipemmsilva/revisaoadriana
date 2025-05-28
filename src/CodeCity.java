
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class CodeCity {
    public static void main(String[] args) {

        int vidajogador = 10;
            if (vidajogador == 0) {
                System.out.println("Você morreu");

                int vidabugadormaligno = 24;
                if (vidabugadormaligno == 0);

            }
        // introdução
        System.out.println("Olá, jogador! Seja bem-vindo ao universo digital de Code City, um mundo construído com linhas de código, lógica e orientação a objetos. Você acaba de ser instanciado — seu nome é Instância, um objeto recém-criado no coração pulsante da programação Java. ");
        System.out.println("Mas este não é um nascimento comum... ");
        System.out.println("Seu criador, o lendário Código Mestre, foi capturado por uma entidade corrompida: o temível Bugador Malígno. Esta falha destrutiva ameaça descompilar Code City, byte por byte, deixando um rastro de erros fatais e métodos quebrados. ");
        System.out.println("Você tem 10 vidas, cada erro durante o percurso fará com que você perca uma das vidas, por isso, pense bem antes de codar!");
        System.out.println("O bugador malígno tem 24 vidas, e para derrotar ele precisa acabar com todas elas. A cada código correto você tira uma vida dele.");

        // tutorial inicial
        System.out.println("Antes de começar preciso de passar algumas informações:");
        System.out.println("Tudo que eu te ensinar está no Livro: Java: como programar, de Paul Deitel, disponível em https://plataforma.bvirtual.com.br/ ");
        System.out.println("Para jogar o jogo você só precisará de seu teclado e mouse, para escrever suas respostas");
        System.out.println("Primeiramente vou te explicar o que são variáveis:  uma variável é como um espaço na memória do computador onde podemos guardar um valor para usá-lo depois. Cada variável tem um nome (que você escolhe) e um tipo (que define que tipo de dado ela pode armazenar).\n" +
                "\n" +
                "Antes de usar uma variável, é preciso declarar qual será o tipo de dado e o nome da variável. Você também pode já atribuir um valor a ela no momento da declaração. Um exemplo é: int idade = 10. int é a variável que recebe numeros inteiros, idade é o nome da variável, = significa que a variável idade está recebendo o valor que vem logo em seguida e 10 é o valor da variável idade");
        System.out.println("Os tipos primitivos são os tipos de dados mais básicos da linguagem Java. Eles servem para representar valores simples. Cada tipo primitivo ocupa um certo espaço na memória e tem uma função específica.");
        System.out.println("int recebe números inteiros, double recebe números quebrados, char recebe um único caracter, string recebe texto, boolean recebe verdadeiro ou falso");
        System.out.println("Comando de saída: System.out.println(). Esse comando escreve uma mensagem no console (a tela do programa) e pula para a próxima linha. Também existe o System.out.print(), que escreve algo sem pular a linha depois. Por último temos o System.out.printf() que mostra mensagens formatadas");
        System.out.println("Comando de entrada: Para receber dados do usuário (por exemplo, ler algo digitado no teclado), usamos a classe Scanner. Com ela, podemos ler diferentes tipos de dados, como números inteiros, textos ou números decimais. Antes de usar o Scanner, é necessário importar a classe com o seguinte comando: import java.util.Scanner; Depois, criamos um objeto do tipo Scanner e usamos métodos para ler os dados: Scanner teclado = new Scanner(System.in); e na linha de baixo usamos a seguinte frase na hora de declarar o que uma varíavel recebe: Scanner teclado = new Scanner(System.in); ");

        //capítulo 2
        System.out.println("Pronto, agora você chegou no capítulo 1");
        System.out.println("Neste capítulo você irá aprender sobre estruturas de decisão: if e switch");
        System.out.println("O comando if em Java serve para tomar decisões. Ele permite que o programa execute um bloco de código somente se uma condição for verdadeira. ");
        System.out.println("if (condição) { ");
        System.out.println("vou passar um exemplo simples de if:");
        System.out.println("int idade = 18; \n" +
                "\n" +
                "  \n" +
                "\n" +
                "if (idade >= 18) { \n" +
                "\n" +
                "    System.out.println(\"Você é maior de idade.\"); \n" +
                "\n" +
                "} ");
        System.out.println("A variável significa a idade, ela recebeu 18, o if está sendo utilizado para verificar se é maior de idade ou não. Se a idade for maior ou igual 18, o sistema fala que o usuário é maior de idade");
        System.out.println("Else é um comando caso o valor não passe pelo if, o que o sistema deve fazer, segue um exemplo:");
        System.out.println("if (idade >= 18) {\n" +
                "    System.out.println(\"Você é maior de idade.\");\n" +
                "} else {\n" +
                "    System.out.println(\"Você é menor de idade.\");\n" +
                "}");
        System.out.println("O sistema faz a mesma verificação, entretanto se a idade for menor, com este comando o sistema emitirá para o usuário a mensagem de que o usuário é menor de idade");
        System.out.println("O comando while é um comando usado para repetir um bloco de código enquanto uma condição for verdadeira. Ele é muito útil quando você não sabe quantas vezes algo precisa se repetir.");
        System.out.println("while (condição) {\n" +
                "    // código que será repetido enquanto a condição for verdadeira\n" +
                "}");
        System.out.println("Se a condição for verdadeira será executado o código dentro do bloco {}, caso seja falso o código termina");
        System.out.println("Segue um exemplo de while:");
        System.out.println("int contador = 1;\n" +
                "\n" +
                "while (contador <= 5) {\n" +
                "    System.out.println(\"Contando: \" + contador);\n" +
                "    contador++; // aumenta o valor de contador\n" +
                "}");
        System.out.println("A variável recebe o valor de 1, a condição é que a varíavel deve ser menor ou igual 5. Então significa que enquanto a variável for menor ou igual 5 o código dentro de {} será executado");
        System.out.println("Cada vez que o a condição for verdadeira, o codigo executado faz com que a varíavel aumente 1 número, ou seja, ela vai aumentando de 1 em 1 até ficar maior que 5 e parar o while");
        System.out.println("Chegou a hora de botar em prática tudo que aprendeu e começar a derrotar o Bugador Malígno");

        // perguntas

        class Perguntas1 {

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
                    // Resultado final
                    System.out.println("\n✅ Você acertou " + acertos + " de 3 perguntas!");
                    if (acertos == 3) {
                        System.out.println("🎉 Você é um verdadeiro mestre dos ifs!");
                    } else if (acertos == 2) {
                        System.out.println("💡 Muito bem! Falta pouco para a perfeição.");
                    } else {
                        System.out.println("⚠ Continue estudando para derrotar o Bugador Malígno!");
                    }
                }

            }
        }
    }}











