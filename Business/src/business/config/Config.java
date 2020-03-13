/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.config;
import comuns.enums.TipoRepositorio;
/**
 *
 * @author vitorlupinetti
 */


public class Config {
    private static Config uniqueInstance;
 
    private Config() {
    }
    private String acessoFuncionario;
    
    
    public static synchronized Config getInstance() {
        if (uniqueInstance == null)
            uniqueInstance = new Config();
 
        return uniqueInstance;
    }
     
    
    private TipoRepositorio tipoRepositorio; 

    public TipoRepositorio getTipoRepositorio() {
        return tipoRepositorio;
    }
    
    
    public void setDatabase(TipoRepositorio tipoRepositorio) {
        this.tipoRepositorio = tipoRepositorio;
    }

    /**
     * @return the acessoFuncionario
     */
    public String getAcessoFuncionario() {
        return acessoFuncionario;
    }

    /**
     * @param acessoFuncionario the acessoFuncionario to set
     */
    public void setAcessoFuncionario(String acessoFuncionario) {
        this.acessoFuncionario = acessoFuncionario;
    }
    
}
