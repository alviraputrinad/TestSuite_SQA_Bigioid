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

WebUI.navigateToUrl('https://tester1.test.apps360.id')

WebDriver driver = DriverFactory.getWebDriver()

WebUI.verifyEqual("Career", driver.findElement(By.xpath("/html/body/div/div/div/div[1]/h2")).getText())

WebUI.verifyEqual("Your journey starts here!", driver.findElement(By.xpath("/html/body/div/div/div/div[1]/p")).getText())

WebUI.verifyEqual("Name", driver.findElement(By.xpath("/html/body/div/div/div/div[2]/form/div[1]/div/div[1]/label")).getText())

WebUI.click(findTestObject('Object Repository/Page_Karir Big/input_Name_name'))

WebUI.verifyEqual("Email address", driver.findElement(By.xpath("/html/body/div/div/div/div[2]/form/div[1]/div/div[2]/label")).getText())

WebUI.verifyEqual("Phone number", driver.findElement(By.xpath("/html/body/div/div/div/div[2]/form/div[1]/div/div[3]/label")).getText())

WebUI.verifyEqual("Description", driver.findElement(By.xpath("/html/body/div/div/div/div[2]/form/div[1]/div/div[4]/label")).getText())

WebUI.verifyEqual("Apply", driver.findElement(By.xpath("/html/body/div/div/div/div[2]/form/div[2]/button")).getText())

WebUI.click(findTestObject('Object Repository/Page_Karir Big/button_Apply'))

WebUI.closeBrowser()
