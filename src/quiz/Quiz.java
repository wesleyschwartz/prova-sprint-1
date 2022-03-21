package quiz;

import javax.swing.*;

public class Quiz {
    public static void main(String[] args) {
        String nome = JOptionPane.showInputDialog("Olá bem-vindo ao quizz sobre Java!\nQual seu nome?");

        String [] perguntas = new String[10];
        perguntas[0] = "1- Quando Java foi criado?";
        perguntas[1] = "2- Qual era a empresa que a equipe que desenvolveu o Java atuava?";
        perguntas[2] = "3- Quem é o \"pai\" do Java ?";
        perguntas[3] = "4- Hoje em dia o Java pertence a";
        perguntas[4] = "5- Java é uma linguagem de programação...";
        perguntas[5] = "6- Java é uma linguagem _________ tipada";
        perguntas[6] = "7- Qual mecanismo é responsável por converter os bytecodes e executar os aplicativos Java ?";
        perguntas[7] = "8- Graças ao JVM o Java é: ";
        perguntas[8] = "9- Qual mecanismo é responsável por gerenciar a exclusão de objetos não utilizados ?";
        perguntas[9] = "10- O Java garbage collection é um processo";

        String[][] respostas;
        respostas = new String[][]{
                {"1997", "2008", "1994", "1995"},//0 -R 3
                {"Sun Microsystem", "Oracle", "Microsoft", "Sony"}, //1 -R 0
                {"Steve Jobs", "James Gosling", "Peter Park", "Tony Stark"},//2 -R 1
                {"Sony", "Apple", "Oracle", "Sun Microsystem"},//3 -R 2
                {"Orientada", "Objetos", "Orientada a objetos", "WEB"},//4 -R 2
                {"fortemente", "fracamente", "mal", "ligeiramente"},//5 -R 0
                {"Java Multi Virtual (JMV)", "Machine Virtual(MV)", "Java Machine Virtual(JVM)", "Machine Java Virtual(MJV)"},//6 -R 2
                {"multiplataforma", "exclusivo: Android", "exclusivo: Windows", "exclusivo: IOS"},//7 -R 0
                {"Java Garbage", "Garbage Java", "Collection Java", "Java Garbage Collection"},//8 -R 3
                {"manual", "dimensional", "atual", "automático"}//9 -R 3
        };
        int[] escolhas = new int[10];
        for (int i = 0; i < 10; i++) {
            escolhas[i] = JOptionPane.showOptionDialog(null, perguntas[i],
                    nome + " escolha uma opção: ", 0, JOptionPane.QUESTION_MESSAGE, null
                    ,respostas[i], respostas[i]);
        }

        int acertos = 0;
        int erros = 0;
        if(escolhas[0] == 3)acertos++;else erros++;
        if(escolhas[1] == 0)acertos++;else erros++;
        if(escolhas[2] == 1)acertos++;else erros++;
        if(escolhas[3] == 2)acertos++;else erros++;
        if(escolhas[4] == 2)acertos++;else erros++;
        if(escolhas[5] == 0)acertos++;else erros++;
        if(escolhas[6] == 2)acertos++;else erros++;
        if(escolhas[7] == 0)acertos++;else erros++;
        if(escolhas[8] == 3)acertos++;else erros++;
        if(escolhas[9] == 3)acertos++;else erros++;

        JOptionPane.showMessageDialog(null,"Usuário " + nome +"\n acertos: " + acertos +"\n erros: " +erros);
    }
}
