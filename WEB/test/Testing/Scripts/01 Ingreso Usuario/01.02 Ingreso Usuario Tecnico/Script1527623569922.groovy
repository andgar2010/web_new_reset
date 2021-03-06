import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:3000/Project_New_Reset_AIHD/WEB/')

WebUI.click(findTestObject('01 Ingreso Usuarios/01.01 Ingreso Usuario SuperAdministrador/Page_Bienvenido NEW RESET A.I.H.D/button_Inicia sesion'))

WebUI.delay(2)

WebUI.setText(findTestObject('01 Ingreso Usuarios/01.01 Ingreso Usuario SuperAdministrador/Page_Bienvenido NEW RESET A.I.H.D/input_email'), 
    'tech@email.com')

WebUI.setText(findTestObject('01 Ingreso Usuarios/01.01 Ingreso Usuario SuperAdministrador/Page_Bienvenido NEW RESET A.I.H.D/input_password'), 
    '12345678')

WebUI.click(findTestObject('01 Ingreso Usuarios/01.01 Ingreso Usuario SuperAdministrador/Page_Bienvenido NEW RESET A.I.H.D/button_Ingresar'))

WebUI.verifyElementText(findTestObject('01 Ingreso Usuarios/01.02 Ingreso Usuario Tecnico/Page_New Reset AIHD Admin Dashboard/div_Tech Admin'), 
    'Tech Admin')

WebUI.verifyElementText(findTestObject('01 Ingreso Usuarios/01.02 Ingreso Usuario Tecnico/Page_New Reset AIHD Admin Dashboard/i_Tcnico'), 'Técnico')

WebUI.closeBrowser()

