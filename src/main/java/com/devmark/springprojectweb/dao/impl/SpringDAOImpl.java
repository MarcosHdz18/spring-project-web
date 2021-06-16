/**
 * 
 */
package com.devmark.springprojectweb.dao.impl;

import org.springframework.stereotype.Repository;

import com.devmark.springprojectweb.dao.SpringDAO;

/**
 * @author marcos.hernandez
 *
 */
@Repository
public class SpringDAOImpl implements SpringDAO {

	@Override
	public String consultarNombre() {		
		return "Marcos Salvador Hernández Guadarrama.";
	}

}
