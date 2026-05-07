import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaLogin extends JFrame {

    private JTextField campoEmail;
    private JPasswordField campoSenha;
    private JButton botaoLogin;
    private JButton botaoLimpar;

    public TelaLogin() {

        setTitle("Tela de Login");
        setSize(400, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);

        // EMAIL
        JLabel labelEmail = new JLabel("E-mail:");
        labelEmail.setBounds(50, 40, 100, 25);
        add(labelEmail);

        campoEmail = new JTextField();
        campoEmail.setBounds(150, 40, 180, 25);
        add(campoEmail);

        // SENHA
        JLabel labelSenha = new JLabel("Senha:");
        labelSenha.setBounds(50, 90, 100, 25);
        add(labelSenha);

        campoSenha = new JPasswordField();
        campoSenha.setBounds(150, 90, 180, 25);
        add(campoSenha);

        // BOTÃO LOGIN
        botaoLogin = new JButton("Login");
        botaoLogin.setBounds(70, 150, 100, 35);
        add(botaoLogin);

        // BOTÃO LIMPAR
        botaoLimpar = new JButton("Limpar");
        botaoLimpar.setBounds(210, 150, 100, 35);
        add(botaoLimpar);

        // AÇÃO LOGIN
        botaoLogin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String email = campoEmail.getText();
                String senha = new String(campoSenha.getPassword());

                if(email.isEmpty() || senha.isEmpty()) {

                    JOptionPane.showMessageDialog(null,
                            "Preencha todos os campos!");

                } else if(email.equals("admin@senai.com")
                        && senha.equals("123456")) {

                    JOptionPane.showMessageDialog(null,
                            "Login realizado com sucesso!");

                } else {

                    JOptionPane.showMessageDialog(null,
                            "E-mail ou senha inválidos!");

                }
            }
        });

        // AÇÃO LIMPAR
        botaoLimpar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                campoEmail.setText("");
                campoSenha.setText("");

            }
        });
    }
}