/**
 * 
 */
package com.devmark.springprojectweb.controllers;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;

import com.devmark.springprojectweb.services.SpringService;

/**
 * @author marcos.hernandez
 * 
 * Controlador de ejemplo para demostrar la inegracion de JSF con Spring
 *
 */
@ManagedBean
@ViewScoped
public class SpringJSFController {
	
	@ManagedProperty("#{springServiceImpl}")
	private SpringService springService;
	
	private String nombreEmpresa;
	
	private String nombreEmpleado;
	
	@PostConstruct
	public void init() {
		String nombreEmpresa  = this.springService.mostrarNombreEmpresa();
		String nombreEmpleado = this.springService.mostrarNombreEmpleado();	
		
		System.out.println("Empresa: " + nombreEmpresa);
		System.out.println("Empleado: " + nombreEmpleado);
		
		this.nombreEmpresa = nombreEmpresa;
		this.nombreEmpleado = nombreEmpleado;
	}

	/**
	 * @return the springService
	 */
	public SpringService getSpringService() {
		return springService;
	}

	/**
	 * @param springService the springService to set
	 */
	public void setSpringService(SpringService springService) {
		this.springService = springService;
	}

	/**
	 * @return the nombreEmpresa
	 */
	public String getNombreEmpresa() {
		return nombreEmpresa;
	}

	/**
	 * @param nombreEmpresa the nombreEmpresa to set
	 */
	public void setNombreEmpresa(String nombreEmpresa) {
		this.nombreEmpresa = nombreEmpresa;
	}

	/**
	 * @return the nombreEmpleado
	 */
	public String getNombreEmpleado() {
		return nombreEmpleado;
	}

	/**
	 * @param nombreEmpleado the nombreEmpleado to set
	 */
	public void setNombreEmpleado(String nombreEmpleado) {
		this.nombreEmpleado = nombreEmpleado;
	}

}
