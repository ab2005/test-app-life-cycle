A test to prove that sending an intent will start the application process of the broadcast receiver and Application#onCreate() is called.
```
./gradlew installDebug
# We must launch main activity to authorize the app.  
adb shell am start -n "com.example.ab.receiver/com.example.ab.receiver.Installer"
# Check if the process is running
adb shell ps | grep example
# Start the process
adb shell am broadcast -a start
adb shell ps | grep example
# Stop the process
adb shell am broadcast -a stop
adb shell ps | grep example

```
