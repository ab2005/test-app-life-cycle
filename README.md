This is a test to prove that broadcast receiver could start application process which invokes Application.onCreate() call.
```
./gradlew installDebug
adb shell am start -n "com.example.ab.receiver/com.example.ab.receiver.Installer"
adb shell ps | grep example
adb shell am broadcast -a world
```
