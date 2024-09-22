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

Mobile.startApplication(GlobalVariable.apk, true)

Mobile.tap(findTestObject('Object Repository/create-new-acc/android.widget.ImageView'), 0)

Mobile.tap(findTestObject('Object Repository/create-new-acc/android.widget.LinearLayout'), 0)

Mobile.tap(findTestObject('Object Repository/create-new-acc/android.widget.TextView - SIGN UP TODAY'), 0)

Mobile.setText(findTestObject('Object Repository/create-new-acc/android.widget.TextView - USER NAME'), GlobalVariable.username, 
    0)

Mobile.setText(findTestObject('Object Repository/create-new-acc/android.widget.TextView - EMAIL'), GlobalVariable.email, 
    0)

Mobile.setText(findTestObject('Object Repository/create-new-acc/android.widget.TextView - PASSWORD'), GlobalVariable.password, 
    0)

Mobile.setText(findTestObject('Object Repository/create-new-acc/android.widget.TextView - CONFIRM PASSWORD'), GlobalVariable.confirmpassword, 
    0)

Mobile.pressBack()

Mobile.scrollToText('REGISTER')

Mobile.tap(findTestObject('create-new-acc/android.widget.Button - REGISTER'), 0)

WebUI.delay(2)

Mobile.closeApplication()

