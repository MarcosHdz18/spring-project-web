/**
 * 
 */
package com.devmark.springprojectweb.test;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import com.devmark.springprojectweb.services.SpringService;

/**
 * @author marcos.hernandez
 * 
 * Clase de Prueba Unitaria de JUnit 4 y Spring.
 * No tiene soporte Spring Test para JUnit 5
 *
 */
@RunWith(SpringRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext-test.xml"})
public class SpringJUnit4Test {
	
	@Autowired
	private SpringService springServiceImpl;

	@Test
	public void testNombreEmpresa() {
		assertNotNull(this.springServiceImpl);
		System.out.println(this.springServiceImpl.mostrarNombreEmpresa());
	}
	
	@Test
	public void testNombreEmpleado() {
		assertNotNull(this.springServiceImpl);
		System.out.println(this.springServiceImpl.mostrarNombreEmpleado());
	}

}
