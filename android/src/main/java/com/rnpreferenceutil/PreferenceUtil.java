package com.rnpreferenceutil;

import android.content.Context;
import java.util.Set;


public class PreferenceUtil {

    private Context mContext;

    private PreferenceUtil(Context context) {
        this.mContext = context;
    }

    public static PreferenceUtil getInstance(Context context) {
        return new PreferenceUtil(context);
    }

    /**
     * Save string data
     */
    public void saveString(String key, String value) {

        mContext.getSharedPreferences(mContext.getPackageName(), 0)
                .edit()
                .putString(key, value)
                .apply();
    }

    /**
     * Return string value of key
     */
    public String getString(String key) {
        return mContext.getSharedPreferences(mContext.getPackageName(), 0)
                .getString(key, "");
    }

    /**
     * Save integer data
     */
    public void saveInteger(String key, Integer value) {

        mContext.getSharedPreferences(mContext.getPackageName(), 0)
                .edit()
                .putInt(key, value)
                .apply();
    }

    /**
     * Return integer value of key
     */
    public Integer getInteger(String key) {
        return mContext.getSharedPreferences(mContext.getPackageName(), 0)
                .getInt(key, 0);
    }

    /**
     * Save boolean data
     */
    public void saveBoolean(String key, boolean value) {
        mContext.getSharedPreferences(mContext.getPackageName(), 0)
                .edit()
                .putBoolean(key, value)
                .apply();
    }

    /**
     * Return boolean value of key
     */
    public boolean getBoolean(String key) {
        return mContext.getSharedPreferences(mContext.getPackageName(), 0)
                .getBoolean(key, false);
    }

    /**
     * Save float data
     */
    public void saveFloat(String key, Float value) {
        mContext.getSharedPreferences(mContext.getPackageName(), 0)
                .edit()
                .putFloat(key, value)
                .apply();
    }

    /**
     * Return float value of key
     */
    public Float getFloat(String key) {
        return mContext.getSharedPreferences(mContext.getPackageName(), 0)
                .getFloat(key, 0);
    }

    /**
     * Save long data
     */
    public void saveLong(String key, Long value) {
        mContext.getSharedPreferences(mContext.getPackageName(), 0)
                .edit()
                .putLong(key, value)
                .apply();
    }

    /**
     * Return long value of key
     */
    public Long getLong(String key) {
        return mContext.getSharedPreferences(mContext.getPackageName(), 0)
                .getLong(key, 0);
    }

    /**
     * Save set of value for one key
     */
    public void saveStringSet(String key, Set<String> value) {
        mContext.getSharedPreferences(mContext.getPackageName(), 0)
                .edit()
                .putStringSet(key, value)
                .apply();
    }

    /**
     * Return set of value
     */
    public Set<String> getStringSet(String key) {
        return mContext.getSharedPreferences(mContext.getPackageName(), 0)
                .getStringSet(key, null);
    }

    /**
     * Remove one key
     */
    public void remove(String key) {
        mContext.getSharedPreferences(mContext.getPackageName(), 0)
                .edit()
                .remove(key)
                .apply();
    }

    /**
     * Clear all key/value
     */
    public void clearAll() {
        mContext.getSharedPreferences(mContext.getPackageName(), 0)
                .edit()
                .clear()
                .apply();
    }

}