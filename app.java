    import java.text.ParseException;
    import java.text.SimpleDateFormat;
    import java.util.*;
    import javax.swing.JOptionPane;

    public class app {
        public static void main(String[] args) throws ParseException {
            int opc, opcCliente, opcMenu;
            boolean verificadorBoolean = false;
            Date hoje = new Date();
            double preco;
            String nome, rua, bairro, cep, cidade, estado, idCliente, razao, cod, descricao, retornoData;
            int num, prazoMax, qtdparcelas;
            String[] opcoesCliente = {"Pessoa Juridica", "Pessoa Fisica"};
            String[] opcaoMenu = {"Adicionar outro item", "Finalizar a compra"};
            ArrayList <Cliente> clientesList = new ArrayList<Cliente> ();
            ArrayList <Produto> produtosList = new ArrayList<Produto> ();
            ArrayList <Compra> comprasList = new ArrayList<Compra> ();
            

            do{
                opc = Integer.parseInt(JOptionPane.showInputDialog(null, 
                "1 - Cadastro de Clientes\n2 - Deletar Cliente por CPF ou CNPJ\n3 - Deletar Cliente pelo Nome\n4 - Cadastrar Produto\n5 - Efetuacao de uma Compra\n6 - Atualização da situação de pagamento de uma compra"));

                switch(opc){
                    case 1:
                        
                        opcCliente = JOptionPane.showOptionDialog(null, "Escolha o tipo de cliente a ser cadastrado","Escolha do cliente",
                        JOptionPane.DEFAULT_OPTION,JOptionPane.QUESTION_MESSAGE,null,opcoesCliente,opcoesCliente[0]);
                        if(opcCliente == 0) {
                            nome = JOptionPane.showInputDialog("Digite o nome fantasia:");
                            razao = JOptionPane.showInputDialog("Digite a razão social da empresa:");
                            idCliente = JOptionPane.showInputDialog("Digite o CNPJ do cliente:");
                            prazoMax = Integer.parseInt(JOptionPane.showInputDialog("Digite o prazo maximo (em dias) para pagamento:"));
                            rua = JOptionPane.showInputDialog("Digite o nome da rua do cliente:"); 
                            num = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero da casa do cliente:"));
                            bairro = JOptionPane.showInputDialog("Digite o bairro:");
                            cep = JOptionPane.showInputDialog("Digite o cep:");
                            cidade = JOptionPane.showInputDialog("Digite a cidade:");
                            estado = JOptionPane.showInputDialog("Digite o estado:");
                            

                            Endereco end = new Endereco(rua, num, bairro, cep, cidade, estado);
                            ClientePJ c = new ClientePJ(nome,end,hoje, idCliente, razao, prazoMax);
                            clientesList.add(c);
                        }
                        else if (opcCliente == 1) {
                            nome = JOptionPane.showInputDialog("Digite o nome completo do cliente:");
                            idCliente = JOptionPane.showInputDialog("Digite o CPF do cliente:");
                            qtdparcelas = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade maxima de parcelas:"));
                            rua = JOptionPane.showInputDialog("Digite o nome da rua do cliente:"); 
                            num = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero da casa do cliente:"));
                            bairro = JOptionPane.showInputDialog("Digite o bairro:");
                            cep = JOptionPane.showInputDialog("Digite o cep:");
                            cidade = JOptionPane.showInputDialog("Digite a cidade:");
                            estado = JOptionPane.showInputDialog("Digite o estado:");
                            

                            Endereco end = new Endereco(rua, num, bairro, cep, cidade, estado);
                            ClientePF c = new ClientePF(nome,end,hoje, idCliente, qtdparcelas);
                            clientesList.add(c);
                        }
                    
                        break;

                    case 2:
                        opcCliente = JOptionPane.showOptionDialog(null, "Escolha o tipo de cliente a ser deletado","Escolha do Cliente",
                        JOptionPane.DEFAULT_OPTION,JOptionPane.QUESTION_MESSAGE,null,opcoesCliente,opcoesCliente[0]); 
                        if(opcCliente == 0) {
                            idCliente = JOptionPane.showInputDialog(null, "Digite o CNPJ do cliente:");
                            for (int i = clientesList.size() - 1; i >= 0; i--) {
                                Cliente cliente = clientesList.get(i);
                                if (cliente instanceof ClientePJ) {
                                    ClientePJ clientePJ = (ClientePJ) cliente;
                                    if (clientePJ.getCnpj().equals(idCliente)) {
                                        clientesList.remove(i);
                                        verificadorBoolean = true;
                                    }
                                }
                            }
                            if (verificadorBoolean) {
                                JOptionPane.showMessageDialog(null,"Cliente deletado.");
                            } else {
                                JOptionPane.showMessageDialog(null,"Nao ha cliente com o com o CNPJ fornecido" );
                            } 
                        } 
                        else if (opcCliente == 1){
                            idCliente = JOptionPane.showInputDialog(null, "Digite o CPF do cliente:");
                            for (int i = clientesList.size() - 1; i >= 0; i--) {
                                Cliente cliente = clientesList.get(i);
                                if (cliente instanceof ClientePF) {
                                    ClientePF clientePF = (ClientePF) cliente;
                                    if (clientePF.getCpf().equals(idCliente)) {
                                        clientesList.remove(i);
                                        verificadorBoolean = true;
                                    }
                                }
                            }
                            if (verificadorBoolean) {
                                JOptionPane.showMessageDialog(null,"Cliente deletado com sucesso!");
                            } else {
                                JOptionPane.showMessageDialog(null,"Nao ha cliente com o com o CPF fornecido...");
                            }
                        }

                        break;
                    
                    case 3:
                        nome = JOptionPane.showInputDialog(null, "Digite o nome do cliente a ser deletado");
                        for(int i = 0; i < clientesList.size(); i++){
                            if(clientesList.get(i).getNome().equals(nome)){ 
                                clientesList.remove(i);
                                verificadorBoolean = true;
                            }
                        };

                        if (verificadorBoolean) {
                                JOptionPane.showMessageDialog(null,"Cliente deletado com sucesso!");
                            } else {
                                JOptionPane.showMessageDialog(null,"Nao ha cliente com o com o nome fornecido...");
                            }

                        break;

                    case 4:
                        nome = JOptionPane.showInputDialog(null, "Digite o nome do produto a ser cadastrado");
                        descricao = JOptionPane.showInputDialog(null, "Digite a descricao do produto");
                        preco = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o preco do produto"));
                        cod = JOptionPane.showInputDialog(null, "Digite o codigo identificador do produto");
                        retornoData = (JOptionPane.showInputDialog(null, "Digite a data de validade do produto"));

                        Date dataVal = new SimpleDateFormat("dd/MM/yyyy").parse(retornoData);
                        Produto p = new Produto(nome, descricao, preco, cod, dataVal);
                        produtosList.add(p);

                    break;

                    case 5:                  
                        idCliente = JOptionPane.showInputDialog(null, "Digite o CPF ou CNPJ do cliente que ira efetuar a compra:");
                        //Cliente clienteEncontrado = null;
                        for (Cliente cliente : clientesList) {
                            if ((cliente instanceof ClientePJ && ((ClientePJ) cliente).getCnpj().equals(idCliente))
                                || (cliente instanceof ClientePF && ((ClientePF) cliente).getCpf().equals(idCliente))) {
                                //clienteEncontrado = cliente;
                                ArrayList <Item> itensList = new ArrayList<Item>();
                                do {
                                cod = JOptionPane.showInputDialog(null, "Digite o codigo do produto a ser comprado:");
                                num = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a quantidade a ser comprada")); 
                                for(int i = 0; i < produtosList.size(); i++){
                                    if(produtosList.get(i).getCod().equals(cod)){ 
                                        Produto pI = new Produto(produtosList.get(i).getNome(), produtosList.get(i).getDescricao(), produtosList.get(i).getPreco(),
                                        produtosList.get(i).getCod(),produtosList.get(i).getDataVal());
                                        Item item = new Item(pI, num);
                                        itensList.add(item);
                                        }
                                        
                                    };
                                    opcMenu = JOptionPane.showOptionDialog(null, "Deseja adicionar outro item na compra?", "Menu de Compra",
                                    JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, opcaoMenu, opcaoMenu[0]);
                                }while(opcMenu == 0);
                                cod = JOptionPane.showInputDialog(null, "Digite o codigo identificador da compra:");
                                num = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o valor pago pelo cliente:")); 
                                Compra c = new Compra(cod, idCliente, hoje, 0.0, num, itensList); 
                                c.defineValorTotal();
                                comprasList.add(c);

                                break;
                            }
                            
                        }
                        
                    break;

                    case 6:
                        cod = JOptionPane.showInputDialog(null, "Digite o codigo identificador da compra:");

                    break;

                    default:System.out.println("Opcao invalida!");
                        break;

                        
                }   

            }while(opc > 0 && opc < 8);


        }
    }   