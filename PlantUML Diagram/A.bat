@echo off
setlocal enabledelayedexpansion

:: Base file name
set "filename=z.puml"

:: Check if file exists
if exist "%filename%" (
    :: Generate timestamp (yyyyMMdd)
    for /f "tokens=2 delims==." %%a in ('"wmic os get localdatetime /value"') do (
        set "ts=%%a"
    )
    set "date=!ts:~0,8!" 
    set "newfile=z_!date!.puml"

    echo Creating new file: !newfile!
    > "!newfile!" echo @startuml
    >> "!newfile!" echo(
    >> "!newfile!" echo @enduml
) else (
    echo Creating new file: %filename%
    > "%filename%" echo @startuml
    >> "%filename%" echo(
    >> "%filename%" echo @enduml
)

endlocal
exit
