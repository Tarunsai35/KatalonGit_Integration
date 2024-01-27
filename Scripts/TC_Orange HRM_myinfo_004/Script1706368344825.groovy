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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://opensource-demo.orangehrmlive.com/web/index.php/auth/login')

WebUI.setText(findTestObject('Object Repository/Orange HRM_004_OR/Page_OrangeHRM/input_username'), 'Admin')

WebUI.setEncryptedText(findTestObject('Object Repository/Orange HRM_004_OR/Page_OrangeHRM/input_password'), 'hUKwJTbofgPU9eVlw/CnDQ==')

WebUI.click(findTestObject('Object Repository/Orange HRM_004_OR/Page_OrangeHRM/button_Login'))

WebUI.click(findTestObject('Object Repository/Orange HRM_004_OR/Page_OrangeHRM/span_My Info'))

WebUI.setText(findTestObject('Orange HRM_004_OR/Page_OrangeHRM/input_firstName'), 'qwerty')

WebUI.setText(findTestObject('Object Repository/Orange HRM_004_OR/Page_OrangeHRM/input_lastName'), 'sdfgdfgh')

WebUI.setText(findTestObject('Object Repository/Orange HRM_004_OR/Page_OrangeHRM/input_oxd-input oxd-input--focus'), '12345')

WebUI.click(findTestObject('Object Repository/Orange HRM_004_OR/Page_OrangeHRM/span_oxd-radio-input oxd-radio-input--activ_00d6a5'))

WebUI.click(findTestObject('Object Repository/Orange HRM_004_OR/Page_OrangeHRM/div_-- Select --'))

WebUI.click(findTestObject('Object Repository/Orange HRM_004_OR/Page_OrangeHRM/div_Single'))

WebUI.click(findTestObject('Object Repository/Orange HRM_004_OR/Page_OrangeHRM/i_oxd-icon bi-caret-up-fill oxd-select-text--arrow'))

WebUI.click(findTestObject('Object Repository/Orange HRM_004_OR/Page_OrangeHRM/div_Indian'))

WebUI.click(findTestObject('Object Repository/Orange HRM_004_OR/Page_OrangeHRM/button_Save'))

WebUI.closeBrowser()

