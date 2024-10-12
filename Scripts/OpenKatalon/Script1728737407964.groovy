import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.openBrowser("http:/www.google.co.in/")
WebUI.maximizeWindow()
WebUI.setText(findTestObject('Object Repository/Katalon/Page_Google/search'), 'Katalon Studio \n')
boolean verifyTextPresent = WebUI.verifyTextPresent('Katalon Studio', false)
def takeScreenshot = WebUI.takeScreenshot()
println "The path of the image is "+takeScreenshot
WebUI.closeBrowser()
println "Search result found: "+verifyTextPresent
