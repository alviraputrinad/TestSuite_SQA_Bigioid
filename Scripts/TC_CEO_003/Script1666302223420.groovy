
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

WebElement Table = driver.findElement(By.xpath("//table/tbody"))

List<WebElement> rows_table = Table.findElements(By.tagName('tr'))

int i = 0;

while( rows_table.get(i).findElements(By.tagName('td')).get(3).getText() == "hired") {
	i ++;
}
xpath = "/html/body/div[2]/main/div/div/div/table/tbody/tr["
xpath += i+1
xpath += "]/td[5]/form/button[1]"

xpath_test = "/html/body/div[2]/main/div/div/div/table/tbody/tr["
xpath_test += i+1
xpath_test += "]/td[4]" 
driver.findElement(By.xpath(xpath)).click()
WebUI.verifyEqual("hired", driver.findElement(By.xpath(xpath_test)).getText())





