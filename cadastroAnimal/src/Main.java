import javax.swing.*;
import java.sql.Connection;
import java.sql.PreparedStatement;

void main() {
    JFrame tela = new JFrame("Tela Informação");
    tela.setSize(400, 550); // Ajustado para não ficar muito comprida e vazia
    tela.setLayout(null);
    tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Fecha o app ao fechar a janela

// 1. Nome
    JLabel nome = new JLabel("Nome:");
    nome.setBounds(20, 20, 200, 25);
    JTextField campoNome = new JTextField();
    campoNome.setBounds(20, 45, 340, 30);

// 2. Espécie (Usando JComboBox para conectar com seu Enum)
    JLabel especie = new JLabel("Espécie:");
    especie.setBounds(20, 85, 200, 25);
// Substitui o JTextField pelas opções do seu Enum Especie
    JComboBox<Tipo> campoEspecie = new JComboBox<>(Tipo.values());
    campoEspecie.setBounds(20, 110, 340, 30);

// 3. Idade
    JLabel idade = new JLabel("Idade:");
    idade.setBounds(20, 150, 200, 25);
    JTextField campoIdade = new JTextField();
    campoIdade.setBounds(20, 175, 340, 30);

// 4. Raça
    JLabel raca = new JLabel("Raça:");
    raca.setBounds(20, 215, 200, 25);
    JTextField campoRaca = new JTextField();
    campoRaca.setBounds(20, 240, 340, 30);

// 5. Endereço
    JLabel endereco = new JLabel("Endereço:");
    endereco.setBounds(20, 280, 200, 25);
    JTextField campoEndereco = new JTextField();
    campoEndereco.setBounds(20, 305, 340, 30);

// 6. Telefone
    JLabel telefone = new JLabel("Telefone:");
    telefone.setBounds(20, 345, 200, 25);
    JTextField campoTelefone = new JTextField();
    campoTelefone.setBounds(20, 370, 340, 30);

// Botão Enviar (Posicionado no final do formulário)
    JButton enviar = new JButton("Enviar");
    enviar.setBounds(120, 430, 140, 40);

    enviar.addActionListener(e -> {

        // Ajustado para inserir na tabela 'adocao' com as colunas corretas
        String sql =
                "INSERT INTO adocao(nome, especie, idade, raca, endereco, telefone) VALUES(?,?,?,?,?,?)";

        try {
            // Conexão do banco
            Connection conexao = Conexao.conectar();

            PreparedStatement ps =
                    conexao.prepareStatement(sql);

            // Mapeia cada campo da tela para uma interrogação (?) do SQL
            ps.setString(1, campoNome.getText());

            // Pega a opção selecionada no JComboBox e converte para texto
            Tipo especieSelecionada = (Tipo) campoEspecie.getSelectedItem();
            ps.setString(2, especieSelecionada.name());

            ps.setString(3, campoIdade.getText());
            ps.setString(4, campoRaca.getText());
            ps.setString(5, campoEndereco.getText());
            ps.setString(6, campoTelefone.getText());

            ps.executeUpdate();

            JOptionPane.showMessageDialog(
                    tela,
                    "Animal cadastrado com sucesso!"
            );

            // Limpa os campos de texto após salvar com sucesso
            campoNome.setText("");
            campoIdade.setText("");
            campoRaca.setText("");
            campoEndereco.setText("");
            campoTelefone.setText("");
            campoEspecie.setSelectedIndex(0);

            ps.close();
            conexao.close();

        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }
    });

// Adicionando componentes na tela
    tela.add(nome);
    tela.add(campoNome);
    tela.add(especie);
    tela.add(campoEspecie);
    tela.add(idade);
    tela.add(campoIdade);
    tela.add(raca);
    tela.add(campoRaca);
    tela.add(endereco);
    tela.add(campoEndereco);
    tela.add(telefone);
    tela.add(campoTelefone);
    tela.add(enviar);

    tela.setVisible(true);
}