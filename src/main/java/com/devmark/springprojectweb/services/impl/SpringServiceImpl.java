/**
 * 
 */
package com.devmark.springprojectweb.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devmark.springprojectweb.dao.SpringDAO;
import com.devmark.springprojectweb.services.SpringService;

/**
 * @author marcos.hernandez
 *
 */
@Service
public class SpringServiceImpl implements SpringService {

	@Autowired
	private SpringDAO springDAOImpl;
	
	@Override
	public String mostrarNombreEmpresa() {
		return "SONDA";
	}

	@Override
	public String mostrarNombreEmpleado() {
		return this.springDAOImpl.consultarNombre();
	}

}
