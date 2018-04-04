@echo off

Set classpath=D:\Selenium_Practice\Selenium\lib\*; D:\Selenium_Practice\Selenium\bin

java -cp bin;lib\* org.testng.TestNG testng.xml
@pause