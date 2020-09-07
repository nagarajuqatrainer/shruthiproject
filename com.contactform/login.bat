set projectLocation=F:\shruthi\com.contactform
cd %projectLocation%
set classpath=%projectLocation%\bin;%projectLocation%\lib\*
echo %classpath%
java org.testng.TestNG %projectLocation%\testng.xml
pause