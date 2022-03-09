package PagObjet;

import java.io.File;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import MapsObjet.MapObjectTarjeta;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class PagsObjetTarjeta extends MapObjectTarjeta {

	public PagsObjetTarjeta(AppiumDriver<MobileElement> driver) {
		super(driver);
		this.driver = driver;
		// TODO Auto-generated constructor stub
	}

	public void seleccionpagos(String Evidencia,String Usuario,String Contrasena,String NumeroTarjeta, String CodigoSeguridad, 
			String NombreImpreso,String NumeroDocumento, String Telefono, String Correo, File rutaCarpeta) throws Exception {

		 try {

		tiempoEspera(10000);
		click(btnusucon, rutaCarpeta, Evidencia);
		tiempoEspera(5000);
		click(btncorreo1, rutaCarpeta, Evidencia);
		tiempoEspera(1000);
		sendkey(Usuario, correo, rutaCarpeta, Evidencia);
		sendkey(Contrasena, contraseña, rutaCarpeta, Evidencia);
		click(btniniciar, rutaCarpeta, Evidencia);
	/*	tiempoEspera(4000);
		click(cancelar, rutaCarpeta, Evidencia); 
		*/

		tiempoEspera(6000);
		click(btnpagos, rutaCarpeta, Evidencia);
		tiempoEspera(6000);
		scrollVertical(330, 930, 430, 1 );
		click(btnfactura, rutaCarpeta, Evidencia);
		tiempoEspera(2000);
		click(btndeseofactura, rutaCarpeta, Evidencia);
		tiempoEspera(6000);
		tocarPantalla(350,460);
//		click(btnbarra, rutaCarpeta, Evidencia);
		tiempoEspera(2000);
		tocarPantalla(322,800);
//		click(btntarjeta, rutaCarpeta, Evidencia);
		tiempoEspera(2000);
		tocarPantalla(340,740);
//		click(btncontinuar, rutaCarpeta, Evidencia);
		tiempoEspera(10000);
		scrollVertical(330, 930, 430, 3);
		tiempoEspera(5000);
/*		tocarPantalla(320,890);
		tiempoEspera(2000);
		sendkey(NumeroTarjeta, btnnumtarjeta, rutaCarpeta, Evidencia);
*/
//		tiempoEspera(2000);
//		tocarPantalla(350,560);
//		click(btnmm, rutaCarpeta, Evidencia);
//		tiempoEspera(2000);
//		tocarPantalla(320,630);
//		click(btnmm2, rutaCarpeta, Evidencia);
//		tiempoEspera(2000);
//		click(btnaaaa, rutaCarpeta, Evidencia);
//		tiempoEspera(2000);
//		click(btnaaaa2, rutaCarpeta, Evidencia);
//		tiempoEspera(2000);
//		tocarPantalla(240,820);
//		sendkey(CodigoSeguridad, btncodigoseg, rutaCarpeta, Evidencia);
//		tiempoEspera(2000);
//		scrollVertical(330, 930, 430, 1 );
//		tocarPantalla(290,990);
//		click(btncoutas, rutaCarpeta, Evidencia);
//		tiempoEspera(2000);
//		click(btncoutas2, rutaCarpeta, Evidencia);
//		tiempoEspera(2000);
//		sendkey(NombreImpreso, btnnombreape, rutaCarpeta, Evidencia);
//		tiempoEspera(2000);
//		click(btndocumentacion, rutaCarpeta, Evidencia);
//		tiempoEspera(2000);
//		click(btncc, rutaCarpeta, Evidencia);
//		tiempoEspera(2000);
		scrollVertical(330, 930, 430, 1 );
//		tiempoEspera(2000);
//		sendkey(NumeroDocumento, btncc2, rutaCarpeta, Evidencia);
//		tiempoEspera(2000);
//		sendkey(Telefono, btntelefono, rutaCarpeta, Evidencia);
//		tiempoEspera(2000);
//		sendkey(Correo, btncorreo, rutaCarpeta, Evidencia);
//		tiempoEspera(2000);
		scrollVertical(330, 930, 430, 2 );
		tiempoEspera(2000);
		tocarPantalla(360,1066);
//		click(btncancelar, rutaCarpeta, Evidencia);
		tiempoEspera(2000);
		click(btnclickdevolver, rutaCarpeta, Evidencia);
		tiempoEspera(2000);
		click(btnpersona, rutaCarpeta, Evidencia);
		tiempoEspera(2000);
		click(btncerrarsesion, rutaCarpeta, Evidencia);
		tiempoEspera(2000);
		click(btnsalir, rutaCarpeta, Evidencia);
		tiempoEspera(5000);
//		click(btnInicio ,rutaCarpeta, Evidencia);
//		tiempoEspera(1000);
		click(btnpersona, rutaCarpeta, Evidencia);
		tiempoEspera(2000);
		click(btncerrarsesion, rutaCarpeta, Evidencia);
		tiempoEspera(2000);
		click(btnsalir, rutaCarpeta, Evidencia);
		tiempoEspera(5000);
		
		 }  catch (Exception e) {
			  System.out.println(e);   }
		 
	}
	
}

