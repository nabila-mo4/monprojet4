package org.librarypro.webapp.consumer.contract.dao;

import java.util.List;

import org.librarypro.webapp.model.EmpruntDTO;

public interface EmpruntDao {
	
	List<EmpruntDTO> prets();
	void prolonger(int idemprunt);
	List<EmpruntDTO> getEmpruntByUtilisateur(int idutilisateur);
	List<EmpruntDTO> getEmpruntsEnCours();

}
