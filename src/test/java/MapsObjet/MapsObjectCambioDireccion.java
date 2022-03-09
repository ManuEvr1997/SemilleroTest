package MapsObjet;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.testNG.ClaseBaseFinalMobil;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class MapsObjectCambioDireccion extends ClaseBaseFinalMobil

{
	public MapsObjectCambioDireccion(AppiumDriver<MobileElement> driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
    
	protected By btnlogo = By.xpath("//android.widget.ImageView[@resource-id='com.clarocolombia.miclaro.debug:id/imgPerfil']");
	protected By btncorreo = By.xpath("//android.widget.TextView[@resource-id='com.clarocolombia.miclaro.debug:id/tvConfiguracion']");
	protected By btnactualizar = By.xpath("//android.widget.Button[@resource-id='com.clarocolombia.miclaro.debug:id/btnimgActualizarDatos']");
	protected By btnnumcelular = By.xpath("//android.widget.Button[@resource-id='com.clarocolombia.miclaro.debug:id/btnimgActualizarDatos']");
	protected By resultado =By.xpath("//android.widget.TextView[@text = '¡Hola!']");
	protected By esfero = By.xpath("//android.widget.ImageView[@resource-id='com.clarocolombia.miclaro.debug:id/imgEditarDir']");
 
	
	
	// INGRESAR DATOS
				protected By btnDepartamento = By.xpath("//android.widget.Spinner[@resource-id = 'com.clarocolombia.miclaro.debug:id/spDepartamento']");
				protected By selDepBog = By.xpath("//android.widget.ListView/android.widget.CheckedTextView[6]");
				protected By btnCiudadBog = By.xpath("//android.widget.Spinner[@resource-id = 'com.clarocolombia.miclaro.debug:id/spCiudad']");
				protected By selCiudad2 = By.xpath("//android.widget.CheckedTextView[@text = 'BOGOTÁ, D.C.']");
				protected By txtBarrio = By.xpath("//android.widget.EditText[@resource-id = 'com.clarocolombia.miclaro.debug:id/edtBarrio']");
				protected By selTipo = By.xpath("//android.widget.Spinner[@resource-id = 'com.clarocolombia.miclaro.debug:id/spTipo']");
				protected By selKR = By.xpath("//android.widget.CheckedTextView[@text='Avenida Carrera']");
				protected By intPrincipal = By.xpath("//droid.widget.EditText[@resource-id = 'com.clarocolombia.miclaro.debug:id/txtNPricipal']");
				protected By selSufijo = By.xpath("//android.widget.Spinner[@resource-id = 'com.clarocolombia.miclaro.debug:id/spSufijo1']");
				protected By selC = By.xpath("//android.widget.CheckedTextView[@text='A']");
				protected By intSecuendario = By.xpath("//android.widget.EditText[@resource-id = 'com.clarocolombia.miclaro.debug:id/txtNSecuendario']");
				protected By intCimplementaio = By.xpath("//android.widget.EditText[@resource-id='com.clarocolombia.miclaro.debug:id/txtNComponente']");
				protected By btnSufijo2 = By.xpath("//android.widget.Spinner[@resource-id = 'com.clarocolombia.miclaro.debug:id/spSufijo2']");
				protected By intSufijo = By.xpath("//android.widget.CheckedTextView[@text='A']");
				protected By btnSufijo3 = By.xpath("//android.widget.Spinner[@resource-id = 'com.clarocolombia.miclaro.debug:id/spSufijo2']");
				protected By selComplemento = By.xpath("//android.widget.Spinner[@resource-id = 'com.clarocolombia.miclaro.debug:id/spComplemento1']");
				protected By selApto= By.xpath("//android.widget.CheckedTextView [@text = 'Apartamento']");
				protected By intNum= By.xpath("//android.widget.EditText[@resource-id = 'com.clarocolombia.miclaro.debug:id/txtNumero1']");
				protected By selComplemento2 = By.xpath("//android.widget.Spinner[@resource-id = 'com.clarocolombia.miclaro.debug:id/spComplemento2']");
				protected By selBloque= By.xpath("//android.widget.CheckedTextView [@text = 'Bloque']");
//				protected By intBloque = By.xpath("//android.widget.Button[@text = 'Guardar']");
				protected By btnValidar= By.xpath("//android.widget.Button[@resource-id = 'com.clarocolombia.miclaro.debug:id/btnAgregar']");
				
				protected By btnCancelar = By.xpath("//android.widget.Button[@text='Cancelar']");
}
