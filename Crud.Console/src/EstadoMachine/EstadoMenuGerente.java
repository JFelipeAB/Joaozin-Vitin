/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EstadoMachine;

import crud.console.CrudConsole;
import java.util.Scanner;

/*
 * 
 *
 * @author 082170017
 */
public class EstadoMenuGerente extends EstadoMachine {

    @Override
    public boolean Executa() {
        System.out.println("\n ---Menu Principal---");
        Scanner scan = new Scanner(System.in);
        System.out.println("0 - Sair");        
        System.out.println("1 - Cadastrar pedido");
        System.out.println("2 - Cadastrar produto");
        System.out.println("3 - Cadastrar cliente");
        System.out.println("4 - Cadastrar funcionario");

        
        int opcao = scan.nextInt();
        switch (opcao)
        {
            case 0:
                CrudConsole.estadoConsole = EnumEstado.Inicio.getEstadoMaquina();
                break;            
            case 1:
                CrudConsole.estadoConsole = EnumEstado.CadastraPedido.getEstadoMaquina();
                break;
            case 2:
                CrudConsole.estadoConsole = EnumEstado.CadastraProduto.getEstadoMaquina();
                break;
            case 3:
                CrudConsole.estadoConsole = EnumEstado.CadastraCliente.getEstadoMaquina();
                break;
            case 4:
                CrudConsole.estadoConsole = EnumEstado.CadastroFuncionario.getEstadoMaquina();
                break;
        }
        return false;
    }
    
}
