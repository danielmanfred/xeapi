/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business;

import data.EstudanteData;
import service.SelecaoOferta;
import service.UsuarioService;
import utility.Conexao;

/**
 *
 * @author Manfred
 */
public class EstudanteControl extends UsuarioService {

    public EstudanteControl(Conexao conexao) {
        super(conexao);
    }
    
    public void selecionarOfertaNaoDemandada(Integer oferta, Integer prazo) {
		SelecaoOferta sond = new SelecaoOfertaNaoDemandadaControl();
		
		//sond.selecionarOferta(oferta, dao.getConexao());  
	}
	
	public void selecionarOfertaDemandada(Integer oferta, Integer prazo) {
		SelecaoOferta sod = new SelecaoOfertaDemandadaControl();
		
		//sod.selecionarOferta(oferta, dao.getConexao());
	}
}
