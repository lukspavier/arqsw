package br.usjt.sdesk.model.service;
/**
 * @author Lucas Spavier 816117892 SI3AN MCA D1
 */
import java.io.IOException;
import java.util.ArrayList;

import br.usjt.sdesk.model.dao.FilaDAO;
import br.usjt.sdesk.model.entity.Fila;

public class FilaService {
	private FilaDAO dao;
	
	public FilaService(){
		dao = new FilaDAO();
	}
	
	public ArrayList<Fila> listarFilas() throws IOException{
		return dao.listarFilas();
	}
	
	public Fila carregar(int id) throws IOException{
		return dao.carregar(id);
	}

}
