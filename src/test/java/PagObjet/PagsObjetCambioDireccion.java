package PagObjet;

import java.io.File;

import org.testng.annotations.Test;

import MapsObjet.MapsObjectCambioDireccion;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class PagsObjetCambioDireccion extends MapsObjectCambioDireccion

{
	
	public PagsObjetCambioDireccion(AppiumDriver<MobileElement> driver) {
		super(driver);
		this.driver = driver;
		// TODO Auto-generated constructor stub
	}
	/*
	public void urlAcceso(String url) {
		driver.get(url);
		// busquedaInicial();
	}
	*/
	public void rutaFormAtc(String Evidencia,File rutaCarpeta) throws Exception {
	
		try {
		click(btnlogo, rutaCarpeta, Evidencia);
		tiempoEspera(2000);
		click(btncorreo, rutaCarpeta, Evidencia);
		tiempoEspera(2000);
		click(btnactualizar, rutaCarpeta, Evidencia);
		tiempoEspera(2000);
		click(btnnumcelular, rutaCarpeta, Evidencia);
		tiempoEspera(5000);
		click(esfero, rutaCarpeta, Evidencia);
		tiempoEspera(7000);
		
		
		} catch (Exception e) {
			System.out.println(e);
		}
		
		
	}
	

		
		public void  diligenciarForm(String Evidencia,String Barrio,String Principal,String NumSecundario,String NumComplemento,String NumApto,
				 File rutaCarpeta) throws Exception {
		
			try {
			
			tiempoEspera(2000);
			click(btnDepartamento, rutaCarpeta, Evidencia);
			tiempoEspera(2000);
			click(selDepBog, rutaCarpeta, Evidencia);
			tiempoEspera(2000);
			click(btnCiudadBog, rutaCarpeta, Evidencia);
			tiempoEspera(3000);
			click(selCiudad2, rutaCarpeta, Evidencia);
			tiempoEspera(2000);
			
			sendkey(Barrio,txtBarrio,rutaCarpeta,Evidencia);
			tiempoEspera(2000);
			click(selTipo, rutaCarpeta, Evidencia);
			tiempoEspera(2000);
			click(selKR, rutaCarpeta, Evidencia);
			tiempoEspera(2000);
			scrollVertical(360, 440, 160, 3);
			sendkey(Principal,intPrincipal,rutaCarpeta, Evidencia);
			tiempoEspera(2000);
			click(selSufijo, rutaCarpeta, Evidencia);
			tiempoEspera(2000);
			click(selC, rutaCarpeta, Evidencia);
			tiempoEspera(2000);
			sendkey(NumSecundario,intSecuendario,rutaCarpeta,Evidencia);
			tiempoEspera(2000);
			click(btnSufijo2, rutaCarpeta, Evidencia);
			tiempoEspera(1000);
			click(intSufijo, rutaCarpeta, Evidencia);
			tiempoEspera(1000);
			sendkey(NumComplemento,intCimplementaio,rutaCarpeta,Evidencia);
			tiempoEspera(1000);
			click(selComplemento, rutaCarpeta, Evidencia);
			tiempoEspera(1000);
			click(selApto, rutaCarpeta, Evidencia);
			scrollVertical(360, 440, 160, 1);
			tiempoEspera(1000);
			sendkey(NumApto,intNum,rutaCarpeta, Evidencia);
//			scrollVertical(572, 1800, 1400, 2);
			click(selComplemento2, rutaCarpeta, Evidencia);
			tiempoEspera(1000);
			click(selBloque, rutaCarpeta, Evidencia);
			tiempoEspera(1000);
//			sendkey(NumBloque,intBloque,rutaCarpeta, Evidencia); 
			click(btnValidar, rutaCarpeta, Evidencia); 
			tiempoEspera(1000);
			click(btnCancelar, rutaCarpeta, Evidencia);
			
		
			
			
			} catch (Exception e) {
				System.out.println(e);
			}
		
		  }

	}
	
	




