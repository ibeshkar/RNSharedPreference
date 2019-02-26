# RNSharedPreferences

 A package for working with native shared preferences

# Overview

 This package provides a lot of function for save and retrieve data from shared preference
 By this package Save and retrieve string,boolean,float,long values.

## Installation

### < RN 0.47
```bash
npm install react-native-preferencesutils@0.0.1 --save
```

### >= RN 0.47
```bash
npm install react-native-preferencesutils --save
```

## Project setup and initialization


* In `android/settings.gradle`

```gradle
...
include ':react-native-preferencesutils', ':app'
project(':react-native-preferencesutils').projectDir = new File(rootProject.projectDir, '../node_modules/react-native-preferencesutils/android')
```

* In `android/app/build.gradle`

```gradle
...
dependencies {
    /* YOUR DEPENDENCIES HERE */
    compile "com.facebook.react:react-native:+"
    compile project(":react-native-preferencesutils") // <--- add this
}

```

* Register Module (in MainApplication.java)

```java
import com.rnpreferenceutil.PreferencePackage;;  // <--- import

public class MainActivity extends ReactActivity {
  ......

  @Override
  protected List<ReactPackage> getPackages() {
      return Arrays.<ReactPackage>asList(
          new MainReactPackage(),
          new PreferencePackage() // <--- Add this
      );
  }

  ......

}
```


## Usage

#### Import

```javascript
import RNPreferences from "reac-native-preferencesutils";
```

#### Save string

```javascript
RNPreferences.saveString("key","value");
```

#### Retrieve string value

```javascript
RNPreferences.getString("key", (value) => {
  console.log(value);
});
```

#### Clear all values

```javascript
RNPreferences.clearAll();
```

#### Remove Item

```javascript
RNPreferences.remove("key");
```
