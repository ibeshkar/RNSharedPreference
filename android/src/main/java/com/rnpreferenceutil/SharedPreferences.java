package com.rnpreferenceutil;

import android.content.Context;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.Promise;
import com.facebook.react.uimanager.IllegalViewOperationException;
import java.util.Set;

public class SharedPreferences extends ReactContextBaseJavaModule {

    private final Context mContext = getReactApplicationContext();


    public SharedPreferences(ReactApplicationContext reactContext) {
        super(reactContext);
    }

    @Override
    public String getName() {
        return "RNPreferences";
    }

    /**
     * Save string data
     */
    @ReactMethod
    public void saveString(String key, String value) {
        PreferenceUtil.getInstance(mContext).saveString(key, value);
    }

    /**
     * Return string data
     */
    @ReactMethod
    public void getString(String key, Promise promise) {
        try {
             promise.resolve(PreferenceUtil.getInstance(mContext).getString(key));
        } catch(IllegalViewOperationException e){
             promise.reject(e.getMessage());
        }
    }

    /**
     * Save integer data
     */
    @ReactMethod
    public void saveInteger(String key, Integer value) {
        PreferenceUtil.getInstance(mContext).saveInteger(key, value);
    }

    /**
     * Return integer value of key
     */
    @ReactMethod
    public void getInteger(String key, Promise promise) {
        try{
             promise.resolve(PreferenceUtil.getInstance(mContext).getInteger(key));
        } catch(IllegalViewOperationException e) {
             promise.reject(e.getMessage());
        }
    }

    /**
     * Save boolean data
     */
    @ReactMethod
    public void saveBoolean(String key, boolean value) {
        PreferenceUtil.getInstance(mContext).saveBoolean(key, value);
    }

    /**
     * Return boolean value of key
     */
    @ReactMethod
    public void getBoolean(String key, Promise promise) {
        try {
             promise.resolve(PreferenceUtil.getInstance(mContext).getBoolean(key));
        } catch(IllegalViewOperationException e) {
             promise.reject(e.getMessage());
        }
    }

    /**
     * Save float data
     */
    @ReactMethod
    public void saveFloat(String key, Float value) {
        PreferenceUtil.getInstance(mContext).saveFloat(key, value);
    }

    /**
     * Return float value of key
     */
    @ReactMethod
    public void getFloat(String key, Promise promise) {
        try {
             promise.resolve(PreferenceUtil.getInstance(mContext).getFloat(key));
        } catch(IllegalViewOperationException e) {
             promise.reject(e.getMessage());
        }
    }

    /**
     * Save long data
     */
    @ReactMethod
    public void saveLong(String key, Long value) {
        PreferenceUtil.getInstance(mContext).saveLong(key, value);
    }

    /**
     * Return long value of key
     */
    @ReactMethod
    public void getLong(String key, Promise promise) {
        try {
             promise.resolve(PreferenceUtil.getInstance(mContext).getLong(key));
        } catch(IllegalViewOperationException e) {
             promise.reject(e.getMessage());
        }
    }

    /**
     * Remove one key
     */
    @ReactMethod
    public void remove(String key, Promise promise) {
        PreferenceUtil.getInstance(mContext).remove(key);
    }

    /**
     * Clear all key/value
     */
    @ReactMethod
    public void clearAll() {
        PreferenceUtil.getInstance(mContext).clearAll();
    }

}
