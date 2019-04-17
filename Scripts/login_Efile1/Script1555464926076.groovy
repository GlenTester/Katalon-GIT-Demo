import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('')

WebUI.navigateToUrl('https://efileforbusiness.efile1.edqa.com/')

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/Login_logout/Page_efile1.dev.com/div_Dont Have an Account'))

WebUI.setText(findTestObject('Object Repository/Login_logout/Page_efile1.dev.com/input_Your Email_ctl00ContentP'), 'miaoglenda@yahoo.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Login_logout/Page_efile1.dev.com/input_Your Password_ctl00Conte'), 
    'aeHFOx8jV/A=')

WebUI.click(findTestObject('Object Repository/Login_logout/Page_efile1.dev.com/input_Forgot Password_ctl00Con'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Login_logout/Page_efile1.dev.com/a_Processing_close-window'))

not_run: WebUI.click(findTestObject('Object Repository/Login_logout/Page_efile1.dev.com/img_View Form Descriptions _ct'))

WebUI.click(findTestObject('Object Repository/Login_logout/Page_efile1.dev.com/a_Log Out'))

WebUI.closeBrowser()

