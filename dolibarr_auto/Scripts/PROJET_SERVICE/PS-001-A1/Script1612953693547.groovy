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

WebUI.callTestCase(findTestCase('Special/Connexion'), [('Login') : 'admin', ('Password') : 'pass'], FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Object Repository/PS-001-A1/Page_Accueil - Dolibarr 1300/span_Projets'), 0)

WebUI.click(findTestObject('Object Repository/PS-001-A1/Page_Accueil - Dolibarr 1300/span_Projets'))

WebUI.navigateToUrl('http://localhost:3000/dolibarr/projet/index.php?mainmenu=project&leftmenu=')

WebUI.verifyElementPresent(findTestObject('Object Repository/PS-001-A1/Page_Projets/a_Liste'), 0)

WebUI.click(findTestObject('Object Repository/PS-001-A1/Page_Projets/a_Liste'))

WebUI.click(findTestObject('Object Repository/PS-001-A1/Page_Projets/span_PJ2102-0001_fas fa-sitemap infobox-pro_024f19'))

WebUI.navigateToUrl('http://localhost:3000/dolibarr/projet/card.php?id=4&save_lastsearch_values=1')

WebUI.click(findTestObject('Page_PJ2102-0001 - Test cration projet/a_Supprimer'))

WebUI.click(findTestObject('Page_PJ2102-0001 - Test cration projet/button_Oui'))

WebUI.closeBrowser()

