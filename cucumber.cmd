call ant build
@if errorlevel 1 goto finish
@setlocal
call \ansicon\launch.cmd -p
set USEPATH=bin2;packages\cucumber-core.jar;packages\UCanAccess.jar;packages\aopalliance.jar;packages\commons-lang.jar;packages\commons-logging.jar;packages\cucumber-html.jar;packages\cucumber-java.jar;packages\cucumber-junit.jar;packages\cucumber-jvm-deps.jar;packages\gherkin.jar;packages\guice.jar;packages\hsqldb.jar;packages\jackcess.jar;packages\javax.inject.jar;packages\junit.jar;packages\mockito-all.jar
set USEPATH=%USEPATH%;C:\Microsoft" "JDBC" "Driver" "6.0" "for" "SQL" "Server\sqljdbc_6.0\enu\sqljdbc4.jar
set USEPATH=%USEPATH%;C:\oraclexe\app\oracle\product\11.2.0\server\jdbc\lib\ojdbc6.jar
java -classpath %USEPATH% cucumber.api.cli.Main --glue cucumber.stepdefs test\cucumber\features --plugin pretty --snippets camelcase
:finish
@pause
