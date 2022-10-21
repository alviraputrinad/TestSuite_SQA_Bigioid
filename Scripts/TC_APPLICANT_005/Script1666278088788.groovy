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

WebUI.navigateToUrl('https://tester1.test.apps360.id/')

WebUI.setText(findTestObject('Object Repository/Page_Karir Big/input_Name_name'), 'Sabrina')

WebUI.setText(findTestObject('Object Repository/Page_Karir Big/input_Email address_email'), 'sabrina@gmail.com')

WebUI.setText(findTestObject('Object Repository/Page_Karir Big/input_Phone number_phone'), 'abcdefghi')

WebUI.setText(findTestObject('Object Repository/Page_Karir Big/textarea_Description_description'), 'Software Engineer')

WebUI.click(findTestObject('Object Repository/Page_Karir Big/button_Apply'))

WebUI.verifyElementAttributeValue(findTestObject('Object Repository/Page_Karir Big/input_Name_name'), 'value', 'Sabrina', 20)

WebUI.verifyElementAttributeValue(findTestObject('Object Repository/Page_Karir Big/input_Email address_email'), 'value', 'sabrina@gmail.com', 20)

WebUI.verifyElementAttributeValue(findTestObject('Object Repository/Page_Karir Big/input_Phone number_phone'), 'value', 'abcdefghi', 20)

WebUI.verifyElementAttributeValue(findTestObject('Object Repository/Page_Karir Big/textarea_Description_description'), 'value', 'Software Engineer', 20)

WebUI.closeBrowser()
