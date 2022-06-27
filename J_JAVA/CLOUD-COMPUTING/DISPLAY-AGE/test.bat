start cmd.exe /c "Javac *.java"
start cmd.exe /c "start rmiregistry"
timeout 3
start cmd.exe /k "Java ServerSw"
start cmd.exe /k "Java ClientApp"