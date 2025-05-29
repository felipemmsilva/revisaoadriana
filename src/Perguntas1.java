import java.util.*;

public class Perguntas1 {
    static int vidajogador = 10;
    static int vidabugador = 24;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

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

        System.out.println("Chegou a hora de botar em prática tudo que aprendeu e começar a derrotar o Bugador Malígno");

        // Criar perguntas
        List<Pergunta> perguntas = new ArrayList<>();

        perguntas.add(new Pergunta(
                "Desafio 1 – A Porta da Decisão:\nint idade = 18;\nif (idade >= 18) {\n    System.out.println(\"Você pode votar.\");\n} else {\n    System.out.println(\"Você ainda não pode votar.\");\n}",
                new String[]{"Você pode votar.", "Você ainda não pode votar.", "Erro de compilação"},
                1));
        perguntas.add(new Pergunta(
                "Desafio 2 – O Caminho Par ou Ímpar:\nint numero = 5;\nif (numero % 2 == 0) {\n    System.out.println(\"Par\");\n} else {\n    System.out.println(\"Ímpar\");\n}",
                new String[]{"Par", "Ímpar", "Erro de sintaxe"},
                2));
        perguntas.add(new Pergunta(
                "Desafio 3 – O Erro no Código:\nint x = 10;\nif x > 5 {\n    System.out.println(\"Maior que 5\");\n}",
                new String[]{"Falta ponto e vírgula", "Faltam parênteses no if", "O valor de x não é comparado corretamente"},
                2));
        perguntas.add(new Pergunta(
                "Desafio 4 – O Símbolo Misterioso:\nO que significa '==' em um if?",
                new String[]{"Atribuição de valor", "Comparação de igualdade", "Comparação de referência"},
                2));
        perguntas.add(new Pergunta(
                "Desafio 5 – A Nota Suprema:\nint nota = 10;\nif (nota == 10) { ... }\n\nPara qual valor a saída será 'Nota excelente'?",
                new String[]{"10", "9", "Maior que 10"},
                1));
        // Adicione até as 12 perguntas conforme você criou...

        // Embaralhar e escolher 3
        Collections.shuffle(perguntas);
        List<Pergunta> selecionadas = perguntas.subList(0, 3);

        // Perguntas interativas
        for (Pergunta p : selecionadas) {
            System.out.println("\n" + p.enunciado);
            for (int i = 0; i < p.opcoes.length; i++) {
                System.out.println((i + 1) + ". " + p.opcoes[i]);
            }

            System.out.print("Sua resposta (1-" + p.opcoes.length + "): ");
            int resposta = scanner.nextInt();

            if (resposta == p.respostaCorreta) {
                vidabugador--;
                System.out.println(" Correto! Você tirou 1 vida do Bugador Malígno!");
            } else {
                vidajogador--;
                System.out.println(" Errado! Você perdeu 1 vida.");
                System.out.println("Resposta correta: " + p.opcoes[p.respostaCorreta - 1]);
            }

            System.out.println("Sua vida: " + vidajogador + " | Vida do Bugador: " + vidabugador);

            if (vidajogador == 0) {
                System.out.println(" Você foi derrotado pelo Bugador Malígno!");
                return;
            }

            if (vidabugador == 0) {
                System.out.println(" Você derrotou o Bugador Malígno e salvou Code City!");
                return;
            }
        }

        System.out.println("\nFim desta rodada. Prepare-se para os próximos desafios!");

        // Capítulo 2 - Estruturas de Repetição
        System.out.println("\n Capítulo 2 – Laços de Repetição:");
        System.out.println("Neste capítulo, você aprenderá a controlar o fluxo do tempo em Code City com estruturas de repetição. Essas estruturas permitem que um trecho de código seja executado várias vezes, sendo essenciais para tarefas automatizadas.");

// Explicações
        System.out.println("\n 1. O laço for é ideal quando sabemos quantas vezes algo deve se repetir.");
        System.out.println("Exemplo: for (int i = 1; i <= 5; i++) { System.out.println(i); }");

        System.out.println("\n 2. while é usado quando NÃO sabemos quantas vezes o código precisa se repetir.");
        System.out.println("Exemplo: while (temMoedas) { inserirMoeda(); }");
        System.out.println("Exemplo: do { jogar(); } while (jogadorDeseja);");

        System.out.println("\n 4. break interrompe o loop imediatamente.");
        System.out.println("Exemplo: if (senhaCerta) { break; }");

        System.out.println("\n⏭5. continue pula a iteração atual e volta para a próxima repetição.");
        System.out.println("Exemplo: if (x < 0) { continue; }");

        System.out.println("\n 6. Um loop pode imprimir sequências, como 'Turno 1' até 'Turno 3'.");
        System.out.println("Exemplo: for (int i = 1; i <= 3; i++) { System.out.println(\"Turno \" + i); }");

        System.out.println("\n✖7. Podemos calcular o fatorial de um número com um loop.");
        System.out.println("Exemplo: fatorial de 4 → 1 × 2 × 3 × 4 = 24");

        System.out.println("\n 8. Laços também permitem contagem regressiva.");
        System.out.println("Exemplo: for (int i = 5; i > 0; i--)");

        System.out.println("\n 9. Podemos ter loops dentro de loops, chamados aninhados, úteis para matrizes.");

        System.out.println("\n10. Variáveis booleanas podem controlar a execução de loops com true/false.");

        System.out.println("\n 11. Laços for são ideais para gerar tabuadas.");

        System.out.println("\n 12. Um while termina quando a condição se torna falsa.");

// Início do combate do capítulo 2
        System.out.println("\n Chegou a hora de testar seu conhecimento sobre laços e continuar sua batalha contra o Bugador Malígno!");

    }


    // Classe auxiliar para perguntas
    static class Pergunta {
        String enunciado;
        String[] opcoes;
        int respostaCorreta;

        Pergunta(String enunciado, String[] opcoes, int respostaCorreta) {
            this.enunciado = enunciado;
            this.opcoes = opcoes;
            this.respostaCorreta = respostaCorreta;
        }
    }

}

class Capitulo2 {
    static int vidajogador = 10;
    static int vidabugador = 24;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Capítulo 2 - O Labirinto da Repetição");
        System.out.println("Após vencer o primeiro desafio, você entra no Labirinto da Repetição, onde o Bugador Malígno distorce os laços de repetição e confunde os novatos em programação.");
        System.out.println("\nPrepare-se! Antes de enfrentar as próximas perguntas, revise os conceitos essenciais:");

        System.out.println("\n Resumo dos Conceitos:");
        System.out.println("1. for é ideal quando sabemos quantas vezes repetir.");
        System.out.println("2. while para repetições indefinidas.");
        System.out.println("3. do-while sempre executa pelo menos uma vez.");
        System.out.println("4. break encerra o loop.");
        System.out.println("5. continue pula para a próxima repetição.");
        System.out.println("6. Laço com i de 1 a 3 imprime: Turno 1, 2, 3.");
        System.out.println("7. Fatorial de 4: 1×2×3×4 = 24.");
        System.out.println("8. Contagem regressiva usa i--.");
        System.out.println("9. Loop aninhado é um dentro de outro.");
        System.out.println("10. Booleano pode controlar o loop.");
        System.out.println("11. for é ótimo para tabuada.");
        System.out.println("12. while para quando a condição ainda for verdadeira.");

        // Criar perguntas
        List<Pergunta> perguntas = new ArrayList<>();

        perguntas.add(new Pergunta("1. Qual laço usamos quando sabemos o número de repetições?",
                new String[]{"while", "do-while", "for"}, 3));

        perguntas.add(new Pergunta("2. Quando usamos while?",
                new String[]{"Para repetir quando não sabemos quantas vezes", "Para contar até 10", "Apenas para somar números"}, 1));

        perguntas.add(new Pergunta("3. Qual a principal diferença do do-while?",
                new String[]{"Nunca executa", "Executa ao menos uma vez", "Não tem condição"}, 2));

        perguntas.add(new Pergunta("4. O que faz o comando break dentro de um loop?",
                new String[]{"Pula para a próxima repetição", "Termina o loop", "Multiplica valores"}, 2));

        perguntas.add(new Pergunta("5. Qual a função do continue?",
                new String[]{"Sai do loop", "Reinicia a variável", "Pula para a próxima repetição"}, 3));

        perguntas.add(new Pergunta("6. O que esse código imprime?\nfor (int i = 1; i <= 3; i++) {\n    System.out.println(\"Turno \" + i);\n}",
                new String[]{"Turno 1 até Turno 3", "Turno 0", "Nada"}, 1));

        perguntas.add(new Pergunta("7. Como calcular fatorial de 4?",
                new String[]{"1 + 2 + 3 + 4", "1 × 2 × 3 × 4", "4 ÷ 2 ÷ 1"}, 2));

        perguntas.add(new Pergunta("8. Qual loop usamos para contar de trás para frente?",
                new String[]{"for (int i = 5; i > 0; i--)", "for (int i = 0; i < 5; i++)", "while (true)"}, 1));

        perguntas.add(new Pergunta("9. O que é um loop aninhado?",
                new String[]{"Um loop com if", "Um loop dentro de outro", "Um loop que não termina"}, 2));

        perguntas.add(new Pergunta("10. Para que serve um booleano em loop?",
                new String[]{"Para formatar saída", "Para interromper o loop com lógica", "Para contar variáveis"}, 2));

        perguntas.add(new Pergunta("11. Qual estrutura usamos para gerar uma tabuada?",
                new String[]{"while", "if", "for"}, 3));

        perguntas.add(new Pergunta("12. Quando um loop while para de executar?",
                new String[]{"Quando a condição se torna falsa", "Quando ele imprime", "Quando somamos"}, 1));

        // Embaralhar e escolher 3
        Collections.shuffle(perguntas);
        List<Pergunta> selecionadas = perguntas.subList(0, 3);

        // Perguntas interativas
        for (Pergunta p : selecionadas) {
            System.out.println("\n" + p.enunciado);
            for (int i = 0; i < p.opcoes.length; i++) {
                System.out.println((i + 1) + ". " + p.opcoes[i]);
            }

            System.out.print("Sua resposta (1-" + p.opcoes.length + "): ");
            int resposta = scanner.nextInt();

            if (resposta == p.respostaCorreta) {
                vidabugador--;
                System.out.println(" Correto! Você tirou 1 vida do Bugador Malígno!");
            } else {
                vidajogador--;
                System.out.println(" Errado! Você perdeu 1 vida.");
                System.out.println("Resposta correta: " + p.opcoes[p.respostaCorreta - 1]);
            }

            System.out.println("Sua vida: " + vidajogador + " | Vida do Bugador: " + vidabugador);

            if (vidajogador == 0) {
                System.out.println("️ Você foi derrotado pelo Bugador Malígno!");
                return;
            }

            if (vidabugador == 0) {
                System.out.println("Você derrotou o Bugador Malígno e salvou Code City mais uma vez!");
                return;
            }
        }

        System.out.println("\nFim do Capítulo 2. Prepare-se para desafios ainda maiores nos próximos capítulos!");
    }

    // Classe auxiliar para perguntas
    static class Pergunta {
        String enunciado;
        String[] opcoes;
        int respostaCorreta;

        Pergunta(String enunciado, String[] opcoes, int respostaCorreta) {
            this.enunciado = enunciado;
            this.opcoes = opcoes;
            this.respostaCorreta = respostaCorreta;
        }
    }
}

class Capitulo3 {
    static int vidajogador = 10;
    static int vidabugador = 24;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(" CAPÍTULO 3: MESTRE DOS MÉTODOS ");
        System.out.println("\nVocê chegou ao Laboratório dos Códigos Encapsulados.");
        System.out.println("Aqui, os métodos são os poderes mágicos dos programadores, moldando o fluxo da lógica com eficiência.");
        System.out.println("Aprenda a usar os métodos, entender seus retornos e controlar o fluxo do programa com precisão.");
        System.out.println("------------------------------------------------------------");

        System.out.println(" DICAS RÁPIDAS:");
        System.out.println("1. void para métodos sem retorno.");
        System.out.println("2. Parâmetros enviam dados ao método.");
        System.out.println("3. return envia valor de volta.");
        System.out.println("4. Retorna se número é par: return n % 2 == 0;");
        System.out.println("5. Método que retorna int usa 'int'.");
        System.out.println("6. Overloading = mesmo nome, diferentes parâmetros.");
        System.out.println("7. Métodos podem se chamar entre si.");
        System.out.println("8. Dobrar(4) = 8.");
        System.out.println("9. Conta de 1 até n com loop.");
        System.out.println("10. Concatenação é a junção de textos: +.");
        System.out.println("11. Booleanos controlam lógica interna.");
        System.out.println("12. senha.length() >= 6 verifica o tamanho.");

        System.out.println("\nPrepare-se para os desafios do capítulo 3!");

        List<Pergunta> perguntas = new ArrayList<>();

        perguntas.add(new Pergunta(
                "1. Qual palavra usamos para declarar um método que não retorna nada?",
                new String[]{"int", "void", "return"},
                2));
        perguntas.add(new Pergunta(
                "2. Como passamos dados para um método?",
                new String[]{"Comentando", "Chamando a função", "Usando parâmetros"},
                3));
        perguntas.add(new Pergunta(
                "3. O que faz o comando return?",
                new String[]{"Chama outro método", "Interrompe o programa", "Envia um valor de volta"},
                3));
        perguntas.add(new Pergunta(
                "4. O que esse método retorna?\n\npublic static boolean ehPar(int n) {\n    return n % 2 == 0;\n}",
                new String[]{"Se é múltiplo de 10", "Se é par", "Se é ímpar"},
                2));
        perguntas.add(new Pergunta(
                "5. Como chamamos um método que retorna int?",
                new String[]{"public void soma()", "public int soma()", "public double soma()"},
                2));
        perguntas.add(new Pergunta(
                "6. O que é overloading de método?",
                new String[]{"Ter vários métodos com o mesmo nome e parâmetros diferentes", "Erro de sobrecarga", "Funções dentro de outras"},
                1));
        perguntas.add(new Pergunta(
                "7. Podemos chamar um método dentro de outro?",
                new String[]{"Sim", "Não", "Apenas se for void"},
                1));
        perguntas.add(new Pergunta(
                "8. Qual é o resultado de dobrar(4) se o método for return n * 2?",
                new String[]{"8", "6", "2"},
                1));
        perguntas.add(new Pergunta(
                "9. O que esse método faz?\n\npublic static void contar(int n) {\n    for (int i = 1; i <= n; i++) {\n        System.out.println(i);\n    }\n}",
                new String[]{"Imprime de 1 até n", "Soma todos os valores", "Cria um vetor"},
                1));
        perguntas.add(new Pergunta(
                "10. Como se chama a junção de textos em Java?",
                new String[]{"merge()", "concatenação", "stringar()"},
                2));
        perguntas.add(new Pergunta(
                "11. Para que serve o parâmetro booleano em um método?",
                new String[]{"Para formatar texto", "Para controle de lógica", "Para multiplicar"},
                2));
        perguntas.add(new Pergunta(
                "12. Qual método é válido para checar se uma senha tem 6 ou mais caracteres?",
                new String[]{"senha.length() > 6", "senha.equals(6)", "senha.length() >= 6"},
                3));

        Collections.shuffle(perguntas);
        List<Pergunta> selecionadas = perguntas.subList(0, 3); // Sorteia 3

        for (Pergunta p : selecionadas) {
            System.out.println("\n" + p.enunciado);
            for (int i = 0; i < p.opcoes.length; i++) {
                System.out.println((i + 1) + ". " + p.opcoes[i]);
            }

            System.out.print("Sua resposta (1-" + p.opcoes.length + "): ");
            int resposta = scanner.nextInt();

            if (resposta == p.respostaCorreta) {
                vidabugador--;
                System.out.println(" Correto! Você tirou 1 vida do Bugador Malígno!");
            } else {
                vidajogador--;
                System.out.println(" Errado! Você perdeu 1 vida.");
                System.out.println("Resposta correta: " + p.opcoes[p.respostaCorreta - 1]);
            }

            System.out.println("Sua vida: " + vidajogador + " | Vida do Bugador: " + vidabugador);

            if (vidajogador == 0) {
                System.out.println("☠ Você foi derrotado pelo Bugador Malígno!");
                return;
            }

            if (vidabugador == 0) {
                System.out.println(" Você derrotou o Bugador Malígno e salvou Code City!");
                return;
            }
        }

        System.out.println("\nFim desta rodada. Prepare-se para os próximos desafios!");
    }

    static class Pergunta {
        String enunciado;
        String[] opcoes;
        int respostaCorreta;

        Pergunta(String enunciado, String[] opcoes, int respostaCorreta) {
            this.enunciado = enunciado;
            this.opcoes = opcoes;
            this.respostaCorreta = respostaCorreta;
        }
    }
}

class Perguntas4 {
    static int vidajogador = 10;
    static int vidabugador = 24;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Introdução do Capítulo 4
        System.out.println("Capítulo 4: Polimorfismo e Herança");
        System.out.println("Nesta etapa você vai aprender sobre polimorfismo, herança, interfaces e muito mais.");
        System.out.println("Vamos entender como um mesmo método pode agir de formas diferentes e como as classes podem se relacionar.\n");

        System.out.println("Preparado para desafiar o Bugador Malígno com o poder da Orientação a Objetos? Vamos lá!");

        // Criar perguntas
        List<Pergunta> perguntas = new ArrayList<>();

        perguntas.add(new Pergunta(
                "1. O que é polimorfismo?",
                new String[]{
                        "A) Múltiplas formas de um método se comportar",
                        "B) Multiplicação de números",
                        "C) Variáveis privadas"},
                1));
        perguntas.add(new Pergunta(
                "2. O que é herança?",
                new String[]{
                        "A) Compartilhamento de atributos entre objetos",
                        "B) Classe herdando outra",
                        "C) Variável local"},
                2));
        perguntas.add(new Pergunta(
                "3. Como usamos polimorfismo em Java?",
                new String[]{
                        "A) Criando métodos anônimos",
                        "B) Declarando um objeto com tipo pai e instância de tipo filho",
                        "C) Usando arrays apenas"},
                2));
        perguntas.add(new Pergunta(
                "4. Qual o papel do super?",
                new String[]{
                        "A) Chamar o construtor da subclasse",
                        "B) Chamar método da superclasse",
                        "C) Ignorar herança"},
                2));
        perguntas.add(new Pergunta(
                "5. O que @Override indica?",
                new String[]{
                        "A) Que o método será ocultado",
                        "B) Que está criando um novo método",
                        "C) Que o método está sendo sobrescrito"},
                3));
        perguntas.add(new Pergunta(
                "6. Como impedir que um método seja sobrescrito?",
                new String[]{
                        "A) final",
                        "B) static",
                        "C) void"},
                1));
        perguntas.add(new Pergunta(
                "7. O que este código faz?\nForma f = new Circulo();\nf.desenhar();",
                new String[]{
                        "A) Chama desenhar() da classe Forma",
                        "B) Chama desenhar() de Circulo",
                        "C) Dá erro de compilação"},
                2));
        perguntas.add(new Pergunta(
                "8. Qual o uso do instanceof?",
                new String[]{
                        "A) Criar uma nova classe",
                        "B) Verificar o tipo real de um objeto",
                        "C) Substituir atributos"},
                2));
        perguntas.add(new Pergunta(
                "9. Quando usar interface?",
                new String[]{
                        "A) Quando quiser definir contratos de comportamento",
                        "B) Para herdar atributos",
                        "C) Para calcular somas"},
                1));
        perguntas.add(new Pergunta(
                "10. O que este código faz?\nSystem.out.println(new Livro());",
                new String[]{
                        "A) Imprime endereço de memória",
                        "B) Imprime \"Livro Java\" se toString() estiver sobrescrito",
                        "C) Dá erro"},
                2));
        perguntas.add(new Pergunta(
                "11. Qual vantagem do polimorfismo?",
                new String[]{
                        "A) Código repetitivo",
                        "B) Acoplamento forte",
                        "C) Flexibilidade de comportamento"},
                3));
        perguntas.add(new Pergunta(
                "12. Como criar um método genérico para várias classes?",
                new String[]{
                        "A) Usar casting",
                        "B) Usar métodos estáticos",
                        "C) Usar polimorfismo com herança ou interface"},
                3));

        // Embaralhar perguntas
        Collections.shuffle(perguntas);

        // Selecionar 3 perguntas para o desafio (pode ajustar conforme quiser)
        List<Pergunta> selecionadas = perguntas.subList(0, 3);

        // Perguntas interativas
        for (Pergunta p : selecionadas) {
            System.out.println("\n" + p.enunciado);
            for (int i = 0; i < p.opcoes.length; i++) {
                System.out.println(p.opcoes[i]);
            }

            System.out.print("Sua resposta (A, B ou C): ");
            String respostaUsuario = scanner.next().toUpperCase();

            int respostaInt = respostaUsuario.charAt(0) - 'A' + 1;

            if (respostaInt == p.respostaCorreta) {
                vidabugador--;
                System.out.println(" Correto! Você tirou 1 vida do Bugador Malígno!");
            } else {
                vidajogador--;
                System.out.println(" Errado! Você perdeu 1 vida.");
                System.out.println("Resposta correta: " + p.opcoes[p.respostaCorreta - 1]);
            }

            System.out.println("Sua vida: " + vidajogador + " | Vida do Bugador: " + vidabugador);

            if (vidajogador == 0) {
                System.out.println("☠ Você foi derrotado pelo Bugador Malígno!");
                return;
            }

            if (vidabugador == 0) {
                System.out.println(" Você derrotou o Bugador Malígno e salvou Code City!");
                return;
            }
        }

        System.out.println("\nFim desta rodada. Prepare-se para os próximos desafios!");
    }

    // Classe auxiliar para perguntas
    static class Pergunta {
        String enunciado;
        String[] opcoes;
        int respostaCorreta;

        Pergunta(String enunciado, String[] opcoes, int respostaCorreta) {
            this.enunciado = enunciado;
            this.opcoes = opcoes;
            this.respostaCorreta = respostaCorreta;
        }
    }
}
 class CapituloFinal {
    static int vidajogador = 10;
    static int vidabugador = 24;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Introdução
        System.out.println("Chegou o momento!");
        System.out.println("Depois de passar por todas as fases e suar pra entender if, for, método, herança e o raio do polimorfismo...");
        System.out.println("Agora é tu contra o Bugador Malígno.");
        System.out.println("Aqui não tem mais tutorial: ou tu usa tudo que aprendeu ou Code City vai pro brejo.");
        System.out.println("Boa sorte, e bora pro fight!");

        List<Pergunta> perguntas = new ArrayList<>();

        // Perguntas adicionadas
        perguntas.add(new Pergunta("Qual é o resultado lógico da expressão (5 > 3) && (2 < 1)?",
                new String[]{"true", "false", "Erro"}, 2));
        perguntas.add(new Pergunta("Como representamos uma negação em Java?",
                new String[]{"!=", "not()", "!"}, 3));
        perguntas.add(new Pergunta("int a = 10;\nif (a != 5) {\n    System.out.println(\"Diferente de 5\");\n}",
                new String[]{"Nada", "Diferente de 5", "Erro"}, 2));
        perguntas.add(new Pergunta("O que o operador == verifica?",
                new String[]{"Se dois objetos são o mesmo", "Se dois valores primitivos são iguais", "Se duas strings têm o mesmo conteúdo"}, 2));
        perguntas.add(new Pergunta("Qual estrutura permite testar várias condições em sequência?",
                new String[]{"if", "else", "if-else if-else"}, 3));
        perguntas.add(new Pergunta("Em qual situação usamos o operador ||?",
                new String[]{"Quando todas as condições devem ser verdadeiras", "Quando basta uma condição verdadeira", "Para negar a condição"}, 2));

        perguntas.add(new Pergunta("int i = 0;\nwhile (i < 2) {\n    System.out.print(i);\n    i++;\n}",
                new String[]{"01", "12", "02"}, 1));
        perguntas.add(new Pergunta("Como garantir que um loop pare quando uma condição for atingida?",
                new String[]{"continue", "break", "return"}, 2));
        perguntas.add(new Pergunta("Para repetir uma ação até que um valor seja inserido corretamente, usamos:",
                new String[]{"if", "loop do-while", "switch"}, 2));
        perguntas.add(new Pergunta("for (int i = 5; i >= 1; i--) {\n    System.out.println(i);\n}",
                new String[]{"Imprime 1 a 5", "Imprime 5 a 1", "Nada"}, 2));
        perguntas.add(new Pergunta("Qual comando ignora o restante do loop e passa para a próxima repetição?",
                new String[]{"break", "continue", "exit"}, 2));
        perguntas.add(new Pergunta("int i = 1;\ndo {\n    System.out.println(i);\n    i++;\n} while (i <= 3);",
                new String[]{"1 2", "1 2 3", "Nada"}, 2));

        perguntas.add(new Pergunta("Qual desses nomes é um exemplo válido de método em Java?",
                new String[]{"método-soma", "metodoSoma", "1metodo"}, 2));
        perguntas.add(new Pergunta("Qual palavra-chave usamos para retornar um valor inteiro de um método?",
                new String[]{"void", "return", "int"}, 2));
        perguntas.add(new Pergunta("public static int quadrado(int x) {\n    return x * x;\n}",
                new String[]{"Retorna o dobro de x", "Retorna o quadrado de x", "Soma dois valores"}, 2));
        perguntas.add(new Pergunta("Podemos ter dois métodos com o mesmo nome, se:",
                new String[]{"Os parâmetros forem diferentes", "Usarmos final", "Tiverem o mesmo corpo"}, 1));
        perguntas.add(new Pergunta("O que é obrigatório ao declarar um método?",
                new String[]{"Parâmetros", "Tipo de retorno e nome", "Comentário"}, 2));
        perguntas.add(new Pergunta("public static void verificar(boolean ativo) {\n    if (ativo) {\n        System.out.println(\"Ativado\");\n    } else {\n        System.out.println(\"Desativado\");\n    }\n}",
                new String[]{"Erro", "Ativado", "Desativado"}, 2));

        perguntas.add(new Pergunta("Qual o principal benefício do uso de interfaces com polimorfismo?",
                new String[]{"Evita herança", "Reduz a flexibilidade", "Permite criar código genérico"}, 3));
        perguntas.add(new Pergunta("Animal a = new Cachorro();\na.emitirSom();\n(Cachorro sobrescreve emitirSom)",
                new String[]{"Da classe Animal", "Da classe Object", "Da classe Cachorro"}, 3));
        perguntas.add(new Pergunta("public class Gato extends Animal {\n    @Override\n    public void falar() {\n        System.out.println(\"Miau\");\n    }\n}",
                new String[]{"Classe Gato ignora falar()", "Gato sobrescreve falar()", "Gato cria uma nova classe"}, 2));
        perguntas.add(new Pergunta("Qual é o papel da herança múltipla em Java?",
                new String[]{"Java não permite", "Pode ser feita com classes", "É feita via interfaces"}, 3));
        perguntas.add(new Pergunta("Quando devemos sobrescrever um método?",
                new String[]{"Quando ele é private", "Para mudar o comportamento herdado", "Quando não queremos usá-lo"}, 2));
        perguntas.add(new Pergunta("O que o modificador final faz em métodos?",
                new String[]{"Permite herdar", "Permite sobrescrever", "Impede sobrescrita"}, 3));

        // Embaralhar e selecionar 12
        Collections.shuffle(perguntas);
        List<Pergunta> selecionadas = perguntas.subList(0, 12);

        for (Pergunta p : selecionadas) {
            System.out.println("\n" + p.enunciado);
            for (int i = 0; i < p.opcoes.length; i++) {
                System.out.println((i + 1) + ". " + p.opcoes[i]);
            }

            System.out.print("Sua resposta (1-" + p.opcoes.length + "): ");
            int resposta = scanner.nextInt();

            if (resposta == p.respostaCorreta) {
                vidabugador--;
                System.out.println(" Correto! Você tirou 1 vida do Bugador Malígno!");
            } else {
                vidajogador--;
                System.out.println(" Errado! Você perdeu 1 vida.");
                System.out.println("Resposta correta: " + p.opcoes[p.respostaCorreta - 1]);
            }

            System.out.println("Sua vida: " + vidajogador + " | Vida do Bugador: " + vidabugador);

            if (vidajogador == 0) {
                System.out.println(" Você foi derrotado pelo Bugador Malígno!");
                return;
            }

            if (vidabugador == 0) {
                System.out.println(" Você derrotou o Bugador Malígno e salvou Code City!");
                return;
            }
        }

        System.out.println("\nFim do capítulo final. Continue treinando para manter Code City segura!");
    }

    static class Pergunta {
        String enunciado;
        String[] opcoes;
        int respostaCorreta;

        Pergunta(String enunciado, String[] opcoes, int respostaCorreta) {
            this.enunciado = enunciado;
            this.opcoes = opcoes;
            this.respostaCorreta = respostaCorreta;
        }
    }
}
class Resultado {
    public static void main(String[] args) {
        System.out.println("Você salvou Code City, você é o melhor e agora podemos falar que você é o nosso gênio de java! Meus parabéns");
    }
}
