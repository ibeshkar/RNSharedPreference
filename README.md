# RNSharedPreferences

 A package for working with native shared preferences

# Overview

 This package provides a lot of function for save and retrieve data from shared preference.
 By this package save and retrieve string,boolean,float,long values.

## Installation

### < RN 0.47
```bash
npm install react-native-preferencesutils@1.0.0 --save
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
import RNPrefs from "react-native-preferencesutils";
```

#### Save string

```javascript
RNPrefs.saveString("key","value");
```

#### Retrieve string value

```javascript
RNPrefs.getString('key').then(value => {
  console.log(value);
});
```

#### Save boolean

```javascript
RNPrefs.saveBoolean("key","value");
```

#### Retrieve boolean value

```javascript
RNPrefs.getBoolean('key').then(value => {
  console.log(value);
});
```

.
.
.

#### Clear all values

```javascript
RNPrefs.clearAll();
```

#### Remove Item

```javascript
RNPrefs.remove("key");
```
