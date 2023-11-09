import java.util.*;
import javax.swing.JOptionPane;

public class app {
    public static void main(String[] args) {
        int opc, opcCliente;

        String nome;
        Date hoje = new Date();
        String rua, bairro, cep, cidade, estado, cpf, cnpj, razao;
        int num, prazoMax, qtdparcelas;
        String[] opcoes = {"Cliente PJ", "Cliente PF"};
        ArrayList <Cliente> clientesList = new ArrayList<Cliente> (); 


        do{
            opc = Integer.parseInt(JOptionPane.showInputDialog(null, "1 - Cadastro de Clientes\n2 - Deletar Cliente por CPF ou CNPJ\n3 - Deletar Cliente pelo Nome"));

            switch(opc){
                case 1:
                    opcCliente = JOptionPane.showOptionDialog(null, null,"Escolha o tipo de cliente",
                    JOptionPane.DEFAULT_OPTION,JOptionPane.QUESTION_MESSAGE,null,opcoes,opcoes[0]);

                    if(opcCliente == 0) {
                        nome = JOptionPane.showInputDialog("Digite o nome fantasia:");
                        razao = JOptionPane.showInputDialog("Digite a razão social da empresa:");
                        cnpj = JOptionPane.showInputDialog("Digite o CNPJ do cliente:");
                        prazoMax = Integer.parseInt(JOptionPane.showInputDialog("Digite o prazo máximo (em dias) para pagamento:"));
                        rua = JOptionPane.showInputDialog("Digite o nome da rua do cliente:"); 
                        num = Integer.parseInt(JOptionPane.showInputDialog("Digite o nº da casa do cliente:"));
                        bairro = JOptionPane.showInputDialog("Digite o bairro:");
                        cep = JOptionPane.showInputDialog("Digite o cep:");
                        cidade = JOptionPane.showInputDialog("Digite a cidade:");
                        estado = JOptionPane.showInputDialog("Digite o estado:");
                        

                        Endereco end = new Endereco(rua, num, bairro, cep, cidade, estado);
                        ClientePJ c = new ClientePJ(nome,end,hoje, cnpj, razao, prazoMax);
                        clientesList.add(c);
                    }
                    else if (opcCliente == 1) {
                        nome = JOptionPane.showInputDialog("Digite o nome completo do cliente:");
                        cpf = JOptionPane.showInputDialog("Digite o CPF do cliente:");
                        qtdparcelas = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade máxima de parcelas:"));
                        rua = JOptionPane.showInputDialog("Digite o nome da rua do cliente:"); 
                        num = Integer.parseInt(JOptionPane.showInputDialog("Digite o nº da casa do cliente:"));
                        bairro = JOptionPane.showInputDialog("Digite o bairro:");
                        cep = JOptionPane.showInputDialog("Digite o cep:");
                        cidade = JOptionPane.showInputDialog("Digite a cidade:");
                        estado = JOptionPane.showInputDialog("Digite o estado:");
                        

                        Endereco end = new Endereco(rua, num, bairro, cep, cidade, estado);
                        ClientePF c = new ClientePF(nome,end,hoje, cpf, qtdparcelas);
                        clientesList.add(c);
                    }

                    
                
                    break;

                case 2:
                    opcCliente = JOptionPane.showOptionDialog(null, "Escolha o tipo de cliente a ser cadastrado:","Escolha do Cliente",
                    JOptionPane.DEFAULT_OPTION,JOptionPane.QUESTION_MESSAGE,null,opcoes,opcoes[0]); 

                    break;
                
                case 3:

                    break;

                default:System.out.println("--ERRO: Opcao invalida!!!");
                    break;

                    
            }   

        }while(opc != 8);


    }
}   