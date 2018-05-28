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

WebUI.openBrowser('', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.navigateToUrl('http://localhost:3000/Project_New_Reset_AIHD/WEB/', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Page_Bienvenido NEW RESET A.I.H.D./button_Inicia sesion'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('Page_Bienvenido NEW RESET A.I.H.D./input_email'), 'rct@email.com', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('Page_Bienvenido NEW RESET A.I.H.D./input_password'), '1234567', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Page_Bienvenido NEW RESET A.I.H.D./p_Ingresar'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Page_New Reset AIHD Admin Dashboard/03 Administrativo/divNomUsuarioAdministartivo'), 'Camilo Torres', 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Page_New Reset AIHD Admin Dashboard/03 Administrativo/i_Administrativo'), '                Administrativo', 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.closeBrowser(FailureHandling.CONTINUE_ON_FAILURE)

