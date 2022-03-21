package usuario_senha;

import javax.swing.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Main {
    public static void main(String[] args) throws ParseException {

        Usuario usuario1 = new Usuario("wesley", "01234");
        Usuario usuario2 = new Usuario("fulano", "56789");
        Usuario usuario3 = new Usuario("beltrano", "00000");

        ArrayList<Usuario> usuarios = new ArrayList<>();
        usuarios.add(usuario1);
        usuarios.add(usuario2);
        usuarios.add(usuario3);

        boolean check = false;

        do {
            Usuario informado = new Usuario
                    (JOptionPane.showInputDialog(null, "Informe o usuario"),
                    JOptionPane.showInputDialog(null, "Informe a senha"));

            for (Usuario usuario : usuarios) {
                if (usuario.getUsuario().equals(informado.getUsuario()) && usuario.getSenha().equals(informado.getSenha())) {
                    JOptionPane.showMessageDialog(null, mensagem());
                    check = true;
                    break;
                }
            }
            if (!check) {
                JOptionPane.showMessageDialog(null, "Usuário e/ou senha incorretos");
            }
        } while (!check);
    }

    public static String mensagem() throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
        Date data = new Date();
        String format = sdf.format(data);
        Date horaAtual = sdf.parse(format);
        Date hora1 = sdf.parse("00:00:00");
        Date hora2 = sdf.parse("06:00:00");
        Date hora3 = sdf.parse("12:00:00");
        Date hora4 = sdf.parse("18:00:00");

        String[] mensagens = new String[4];
        mensagens[0] = "Boa madrugada, você se logou ao nosso sistema";
        mensagens[1] = "Bom dia, você se logou ao nosso sistema.";
        mensagens[2] = "Boa tarde, você se logou ao nosso sistema";
        mensagens[3] = "Boa noite, você se logou ao nosso sistema";

        if (horaAtual.after(hora1) && horaAtual.before(hora2)) {
            return mensagens[0];
        } else if (horaAtual.after(hora2) && horaAtual.before(hora3)) {
            return mensagens[1];
        } else if (horaAtual.after(hora3) && horaAtual.before(hora4)) {
            return mensagens[2];
        } else {
            return mensagens[3];
        }
    }

}




