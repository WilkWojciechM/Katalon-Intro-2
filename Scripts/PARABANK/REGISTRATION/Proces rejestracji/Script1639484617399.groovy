import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

/*
 *Uruchomienie aplikacji
 */
WebUI.openBrowser(GlobalVariable.url)

WebUI.delay(2)

WebUI.click(findTestObject('PARABANK/Page_ParaBank/a_Register'))

WebUI.maximizeWindow()

WebUI.setText(findTestObject('PARABANK/registrationPage/input_fName'), findTestData("data").getValue(1,1))

WebUI.setText(findTestObject('PARABANK/registrationPage/input_LName'), findTestData("data").getValue(2,1))

WebUI.setText(findTestObject('PARABANK/registrationPage/input_address'),findTestData("data").getValue(3,1))

WebUI.setText(findTestObject('PARABANK/registrationPage/input_city'),findTestData("data").getValue(4,1))

WebUI.setText(findTestObject('PARABANK/registrationPage/input_state'),findTestData("data").getValue(5,1))

WebUI.setText(findTestObject('PARABANK/registrationPage/input_zip'), findTestData("data").getValue(6,1))

WebUI.setText(findTestObject('PARABANK/registrationPage/input_phone'), findTestData("data").getValue(7,1))

WebUI.setText(findTestObject('PARABANK/registrationPage/input_ssn'), findTestData("data").getValue(8,1))

WebUI.setText(findTestObject('PARABANK/registrationPage/input_username'), findTestData("data").getValue(9,1))

WebUI.setText(findTestObject('PARABANK/registrationPage/input_passw'), findTestData("data").getValue(10,1))

WebUI.setText(findTestObject('PARABANK/registrationPage/input_confPass'), findTestData("data").getValue(10,1))

WebUI.click(findTestObject('PARABANK/registrationPage/Page_ParaBank Register/input_Register_button'))

