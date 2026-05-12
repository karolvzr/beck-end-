import javax.swing.*;

void main() {

//Cria a tela
    JFrame tela = new JFrame("Cadastro de produto");
    //tamanho da tela
    tela.setSize(600, 400);
    //Permite colocar os itens na posição desejada
    tela.setLayout(null);

    // Texto produto
    JLabel labelProduto = new JLabel("Produto");
    labelProduto.setBounds(20, 50, 150, 40);
    tela.add(labelProduto);

    // Campo para escrever o nome do produto
    JTextField nomeProduto = new JTextField();
    nomeProduto.setBounds(20, 80, 150, 40);
    tela.add(nomeProduto);

    // Texto preco
    JLabel labelPreco = new JLabel("Preco");
    labelPreco.setBounds(20, 110, 150, 40);
    tela.add(labelPreco);
    JTextField preco = new JTextField();
    preco.setBounds(20, 150, 150, 40);
    tela.add(preco);

    // Texto quantidade
    JLabel labelQuantidade = new JLabel("Quantidade");
    labelQuantidade.setBounds(20, 190, 150, 40);
    tela.add(labelQuantidade);

    //  para escrever a quantidade
    JTextField quantidade = new JTextField();
    quantidade.setBounds(20, 220, 150, 40);
    tela.add(quantidade);

    // Botao para cadastrar
    JButton cadastrar = new JButton("Cadastrar");
    cadastrar.setBounds(20, 270, 150, 40);
    tela.add(cadastrar);

    // Quando clicar no botao cadastrar
    cadastrar.addActionListener(e -> {

        // Guarda o que foi digitado
        String nome = nomeProduto.getText();
        String preco1 = preco.getText();
        String quantidade1 = quantidade.getText();

        // Verifica se os campos estao vazios
        if (nome.isEmpty() || preco1.isEmpty() || quantidade1.isEmpty()) {
            JOptionPane.showMessageDialog(null,
                    "Preencha todos os campos.");

        } else {
            // Transforma os valores em numeros
            double valorPreco = Double.parseDouble(preco1);
            int valorQuantidade = Integer.parseInt(quantidade1);

            // Verifica se os valores sao invalidos
            if (valorPreco <= 0 || valorQuantidade <= 0) {

                JOptionPane.showMessageDialog(null,
                        "Preço e quantidade devem ser maiores que zero.");


            } else {

                // Faz a conta do estoque
                double total = Double.parseDouble(preco1) *
                        Integer.parseInt(quantidade1);

                // Mostra os dados cadastrados
                JOptionPane.showMessageDialog(null,
                        "Cadastro realizado com sucesso!\n\n" +
                                "Produto: " + nome +
                                "\nPreço: R$ " + preco1 +
                                "\nQuantidade: " + quantidade1 +
                                "\nValor total em estoque: R$ " + total);
            }
        }

    });
    // Botao de limpar
        JButton limpar = new JButton("limpar");
        limpar.setBounds(180, 270, 150, 40);
        tela.add(limpar);

    // Quando clicar no botao de limpar
        limpar.addActionListener(e -> {

            // Limpa os campos
            nomeProduto.setText("");
            preco.setText("");
            quantidade.setText("");

        });

    // Mostra a tela
        tela.setVisible(true);
    }
