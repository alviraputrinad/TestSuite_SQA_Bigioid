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

WebUI.setText(findTestObject('Object Repository/Page_Karir Big/input_Email_email'), 'hrd@bigio.id')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Karir Big/input_Password_password'), 'hlGIHlM1YFgawinq7P05yw==')

WebUI.click(findTestObject('Object Repository/Page_Karir Big/button_Log in'))

WebUI.click(findTestObject('Object Repository/Page_Karir Big/div_Applicants List'))

WebDriver driver = DriverFactory.getWebDriver()

WebUI.verifyEqual("Dashboard", driver.findElement(By.xpath("/html/body/div[2]/header/div/h2")).getText())

WebUI.verifyEqual("Applicants List", driver.findElement(By.xpath("/html/body/div[2]/main/div/div/div/div/div")).getText())

WebUI.verifyEqual("Name", driver.findElement(By.xpath("//table/thead/tr/th[1]")).getText())

WebUI.verifyEqual("Email", driver.findElement(By.xpath("//table/thead/tr/th[2]")).getText())

WebUI.verifyEqual("Phone", driver.findElement(By.xpath("//table/thead/tr/th[3]")).getText())

WebUI.verifyEqual("Actions", driver.findElement(By.xpath("//table/thead/tr/th[4]")).getText())

WebUI.verifyEqual("Detail", driver.findElement(By.xpath("//table/tbody/tr[1]/td[4]/a")).getText())

WebUI.verifyEqual("Proceed", driver.findElement(By.xpath("//table/tbody/tr[1]/td[4]/form/button[1]")).getText())

WebUI.verifyEqual("Delete", driver.findElement(By.xpath("//table/tbody/tr[1]/td[4]/form/button[2]")).getText())

WebUI.closeBrowser()
