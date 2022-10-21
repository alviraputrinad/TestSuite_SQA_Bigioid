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
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.WebElement as WebElement
import org.openqa.selenium.By as By
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory

WebUI.openBrowser('')

WebUI.navigateToUrl('https://tester1.test.apps360.id/login')

WebUI.setText(findTestObject('Object Repository/Page_Karir Big/input_Email_email'), 'ceo@bigio.id')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Karir Big/input_Password_password'), 'QFHPinfKK2Bq9cfjzHZtCg==')

WebUI.click(findTestObject('Object Repository/Page_Karir Big/button_Log in'))

WebDriver driver = DriverFactory.getWebDriver()

name = driver.findElement(By.xpath("//table/tbody/tr[1]/td[1]")).getText()

email = driver.findElement(By.xpath("//table/tbody/tr[1]/td[2]")).getText()

phone = driver.findElement(By.xpath("//table/tbody/tr[1]/td[3]")).getText()

status = driver.findElement(By.xpath("//table/tbody/tr[1]/td[4]")).getText()

WebUI.click(findTestObject('Object Repository/Page_Karir Big/a_Detail'))

driver = DriverFactory.getWebDriver()

WebUI.verifyEqual(name, driver.findElement(By.xpath('//*[@id="name"]')).getText())

WebUI.verifyEqual(email, driver.findElement(By.xpath('//*[@id="email"]')).getText())

WebUI.verifyEqual(phone, driver.findElement(By.xpath('//*[@id="phone"]')).getText())

WebUI.verifyEqual(status, driver.findElement(By.xpath('//*[@id="status"]')).getText())
 
WebUI.closeBrowser()
