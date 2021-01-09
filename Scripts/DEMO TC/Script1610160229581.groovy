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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.delay(5)

WebUI.navigateToUrl('https://filings.formstaxqa.com/')

WebUI.click(findTestObject('Object Repository/demo/Page_Efile4biz/div_Email'))

WebUI.setText(findTestObject('Object Repository/demo/Page_Efile4biz/input_Log in to My Account_emailAddress'), 'edqatester+mb8crtest@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/demo/Page_Efile4biz/input_Email_password'), '8tmQP900cn+KcSNHKgJU7Q==')

WebUI.click(findTestObject('Object Repository/demo/Page_Efile4biz/button_Continue'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/demo/Page_Efile4biz/img_Filings_navIcon'))

WebUI.click(findTestObject('Object Repository/demo/Page_Efile4biz/a_Summary Report'))

WebUI.click(findTestObject('demo/Page_Efile4biz/select_Select Status_Dropdown'))

WebUI.selectOptionByValue(findTestObject('Object Repository/demo/Page_Efile4biz/select_Select StatusForms in ProgressIn Car_6efc84'), 
    'InProgress', true)

WebUI.click(findTestObject('Object Repository/demo/Page_Efile4biz/button_Download Report'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/demo/Page_Efile4biz/button_Sign Out'))

WebUI.closeBrowser()

