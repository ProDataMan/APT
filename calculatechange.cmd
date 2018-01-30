call ant build
@if errorlevel 1 goto finish
@setlocal
set USEPATH=bin2;packages/*
set USEPATH=%USEPATH%;C:\Microsoft" "JDBC" "Driver" "4.2" "for" "SQL" "Server\sqljdbc_4.2\enu\sqljdbc4.jar
set USEPATH=%USEPATH%;C:\oraclexe\app\oracle\product\10.2.0\server\jdbc\lib\ojdbc14.jar
set USEPATH=%USEPATH%;C:\oraclexe\app\oracle\product\11.2.0\server\jdbc\lib\ojdbc6.jar
java -classpath %USEPATH% calculatechange.App
:finish
@pause
