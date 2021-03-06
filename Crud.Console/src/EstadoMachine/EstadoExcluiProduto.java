/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EstadoMachine;

import business.crud.Crud;
import comuns.enums.EntidadesDisponiveis;
import crud.console.CrudConsole;
import java.util.Scanner;
/**
 *
 * @author joao-
 */
public class EstadoExcluiProduto extends EstadoMachine{
    Scanner scan = new Scanner(System.in);
    @Override
    public boolean Executa() {
        System.out.println("Escolha o Código do produto para exclusão: ");
        Crud crud = new Crud();
        try{
        crud.Deleta(scan.nextInt(), EntidadesDisponiveis.PRODUTO);        
        }
        catch(Exception e){
            System.out.println("\n\n *****!ENTRADA DE DADOS INVALIDA!*****\n\n");
        }
        CrudConsole.estadoConsole = EnumEstado.ListaProduto.getEstadoMaquina();
        return false;
    }
    
}
