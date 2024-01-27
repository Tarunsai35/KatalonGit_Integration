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

WebUI.setText(findTestObject('Object Repository/002_OR/Page_OrangeHRM/input_username'), 'admin')

WebUI.setEncryptedText(findTestObject('Object Repository/002_OR/Page_OrangeHRM/input_password'), 'hUKwJTbofgPU9eVlw/CnDQ==')

WebUI.click(findTestObject('Object Repository/002_OR/Page_OrangeHRM/button_Login'))

WebUI.setText(findTestObject('Object Repository/002_OR/Page_OrangeHRM/input_oxd-input oxd-input--focus'), 'admin')

WebUI.click(findTestObject('Object Repository/002_OR/Page_OrangeHRM/span_Admin'))

WebUI.click(findTestObject('Object Repository/002_OR/Page_OrangeHRM/button_Add'))

WebUI.click(findTestObject('Object Repository/002_OR/Page_OrangeHRM/div_-- Select --'))

WebUI.click(findTestObject('Orange HRM_002_OR/Page_OrangeHRM/div_ESS'))

WebUI.click(findTestObject('Object Repository/002_OR/Page_OrangeHRM/input'))

WebUI.click(findTestObject('Object Repository/002_OR/Page_OrangeHRM/div_-- Select --'))

WebUI.click(findTestObject('Orange HRM_002_OR/Page_OrangeHRM/div_Enabled'))

WebUI.setText(findTestObject('Object Repository/002_OR/Page_OrangeHRM/input_oxd-input oxd-input--focus_1'), 'dinesh000')

WebUI.delay(3)

WebUI.setText(findTestObject('Orange HRM_002_OR/Page_OrangeHRM/input_Password_oxd-input oxd-input--active'), 'dinesh123')

WebUI.delay(3)

WebUI.setText(findTestObject('Orange HRM_002_OR/Page_OrangeHRM/input_Confirm Password_oxd-input oxd-input--active'), 'dinesh123')

