$ErrorActionPreference = "Stop"

Set-Location $PSScriptRoot
Set-Location ..

mvn -pl web spring-boot:run
