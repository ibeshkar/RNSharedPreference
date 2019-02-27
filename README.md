# RNSharedPreferences

 A package for working with native shared preferences

# Overview

 This package provides a lot of function for save and retrieve data from shared preference.
 By this package save and retrieve string,boolean,float,long values.

## Installation

### < RN 0.47
```bash
npm install react-native-rnpreferencesutils@1.0.0 --save
```

### >= RN 0.47
```bash
npm install react-native-rnpreferencesutils --save
```

## Project setup and initialization


* In `android/settings.gradle`

```gradle
...
include ':react-native-rnpreferencesutils', ':app'
project(':react-native-rnpreferencesutils').projectDir = new File(rootProject.projectDir, '../node_modules/react-native-rnpreferencesutils/android')
```

* In `android/app/build.gradle`

```gradle
...
dependencies {
    compile "com.facebook.react:react-native:+"
    compile project(":react-native-rnpreferencesutils") // <--- add this
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
import RNPrefs from "react-native-rnpreferencesutils";
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
