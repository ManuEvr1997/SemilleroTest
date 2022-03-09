package com.testNG;

import org.testng.annotations.Test;
import com.Utilidades.ExcelUtilidades;
import com.Utilidades.GenerarReportePdf;
import com.Utilidades.MyScreenRecorder;

import PagObjet.PagsObjectIngresarApp;
import PagObjet.PagsObjetCambioDireccion;
import PagObjet.PagsObjetCerrarSesion;
import PagObjet.PagsObjetTarjeta;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import java.io.File;
import org.testng.annotations.AfterClass;

public class EjemploTestNG

{

	PagsObjectIngresarApp selecObject;
	PagsObjetTarjeta tarjeta;
	PagsObjetCambioDireccion rutaForm;
	PagsObjetCerrarSesion CerrarSes;
	ClaseBaseFinalMobil claseBase;
	File rutaCarpeta = null;
	GenerarReportePdf generarReportepdf;
//	String valor;
	private AppiumDriver<MobileElement> driver;

	@SuppressWarnings("unchecked")
	@BeforeClass
	@Parameters({ "rutaImagenReporte", "rutaOutput", "platformName", "deviceName", "platfotmVersion", "appPackage",
			"appActivity", "noReset", "autoGrantPermissior" })

	public void beforeClass(@Optional("default") String rutaImagenReporte, @Optional("default") String rutaOutput,
			@Optional("default") String platformName, @Optional("default") String deviceName,
			@Optional("default") String platfotmVersion, @Optional("default") String appPackage,
			@Optional("default") String appActivity, @Optional("default") String noReset,
			@Optional("default") String autoGrantPermissior) {

		driver = ClaseBaseFinalMobil.appiumDriverConection(platformName, deviceName, platfotmVersion, appPackage,
				appActivity, noReset, autoGrantPermissior);

		claseBase = new ClaseBaseFinalMobil(driver);
		generarReportepdf = new GenerarReportePdf();
		rutaForm = new PagsObjetCambioDireccion(driver);
		CerrarSes = new PagsObjetCerrarSesion(driver);
		tarjeta = new PagsObjetTarjeta(driver);
		selecObject = new PagsObjectIngresarApp(driver);
		generarReportepdf.setRutaImagen(rutaImagenReporte);
		claseBase.setrutaOutput(rutaOutput, driver);
	}

// 	/*	

	@Test(dataProvider = "CAMBIAR DATOS", description = "CAMBIO DE DIRECCION")
	public void IngresarDireccion(String Ejecutar, String Evidencia, String Usuario, String Contrasena, String Barrio,
			String Principal, String NumSecundario, String NumComplemento, String NumApto) throws Exception {
		if (Ejecutar.equals("SI")) {
			// OBTENER EL NOMBRE DEL MÉTODO A EJECUTAR
			String nomTest = Thread.currentThread().getStackTrace()[1].getMethodName();
			
			File rutaCarpeta = claseBase.crearCarpeta(nomTest);
			
			if (Evidencia.equals("SI")) {
				// CREAR CARPETA
				
				// INICIAR VIDEO
				claseBase.iniVideo();
				// INICIA CREACIÓN DE REPORTE PDF
				generarReportepdf.crearPlantilla(nomTest, rutaCarpeta);

				// METODO INGRESO A APP
				selecObject.ingresarApp(Evidencia, Usuario, Contrasena, rutaCarpeta);
				// METODO PASOS AL FORMULARIO
				rutaForm.rutaFormAtc(Evidencia, rutaCarpeta);
				// METODO DILIGENCIAR FORMULARIO
				rutaForm.diligenciarForm(Evidencia, Barrio, Principal, NumSecundario, NumComplemento, NumApto, rutaCarpeta);
				// CERRAR SESIÓN
				CerrarSes.cerrarSesion(Evidencia, rutaCarpeta);
				
				// FINALIZAR VIDEO
				claseBase.finVideo(rutaCarpeta);
				// FINALIZAR PDF
				generarReportepdf.cerrarPlantilla();

			
			} else {
				
				  // INICIO
				  selecObject.ingresarApp(Evidencia, Usuario, Contrasena, rutaCarpeta);
				  // FORMULARIO
				  rutaForm.rutaFormAtc(Evidencia,rutaCarpeta);
				  // AGREGAR DIRECCIÓN
				  rutaForm.diligenciarForm(Evidencia,
				  Barrio,Principal,NumSecundario,NumComplemento,NumApto, rutaCarpeta);
				  // CERRAR SESIÓN
				  CerrarSes.cerrarSesion(Evidencia, rutaCarpeta);
			}
		}

	}

	@DataProvider(name = "CAMBIAR DATOS")
	public Object[][] primerPaso() throws Exception {
		Object[][] arreglo = ExcelUtilidades.getTableArray("./Data/datos.xlsx", "Hoja4");

		return arreglo;
	}
	
	@AfterClass
public void afterClass1() {
driver.quit();
}

//	*/

//	/*

	@Test(dataProvider = "PASO PAGOS", description = "PAGOS")
	public void IngresarPagos(String Ejecutar, String Evidencia, String Usuario, String Contrasena,
			String NumeroTarjeta, String CodigoSeguridad, String NombreImpreso, String NumeroDocumento, String Telefono,
			String Correo) throws Exception {
		if (Ejecutar.equals("S")) {
			// OBTENER EL NOMBRE DEL MÉTODO A EJECUTAR
			String nomTest = Thread.currentThread().getStackTrace()[1].getMethodName();
			
			if (Evidencia.equals("SI")) {
				// CREAR CARPETA
				rutaCarpeta = claseBase.crearCarpeta(nomTest);
				// INICIA VIDEO
				claseBase.iniVideo();
				// INICIA CREACIÓN DE REPORTE PDF
				generarReportepdf.crearPlantilla(nomTest, rutaCarpeta);

				// INICIO DE ACCIONES
				tarjeta.seleccionpagos(Evidencia, Usuario, Contrasena, NumeroTarjeta, CodigoSeguridad, NombreImpreso,
						NumeroDocumento, Telefono, Correo, rutaCarpeta);
				// CERRAR SESIÓN
			//	CerrarSes.cerrarSesion(nomTest, rutaCarpeta);
				
				// FIN VIDEO
				claseBase.finVideo(rutaCarpeta);
				// FINALIZA CREACIÓN DE REPORTE PDF
				generarReportepdf.cerrarPlantilla();


			} else {
				// INICIO
				tarjeta.seleccionpagos(Evidencia, Usuario, Contrasena, NumeroTarjeta, CodigoSeguridad, NombreImpreso,
						NumeroDocumento, Telefono, Correo, rutaCarpeta);
				// CERRAR SESIÓN
				// cerrarSesion.CerrarClaro(Evidencia, rutaCarpeta);
			}
		}
	}

	@DataProvider(name = "PASO PAGOS")
	public Object[][] primerPaso1() throws Exception {
		Object[][] arreglo = ExcelUtilidades.getTableArray("./Data/datos.xlsx", "Hoja2");

		return arreglo;
	}

//	*/

		@AfterClass
public void afterClass() {
	driver.quit();
	}
}
