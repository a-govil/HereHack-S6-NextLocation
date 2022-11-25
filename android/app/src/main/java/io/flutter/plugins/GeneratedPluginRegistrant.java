package io.flutter.plugins;

import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import io.flutter.Log;

import io.flutter.embedding.engine.FlutterEngine;

/**
 * Generated file. Do not edit.
 * This file is generated by the Flutter tool based on the
 * plugins that support the Android platform.
 */
@Keep
public final class GeneratedPluginRegistrant {
  private static final String TAG = "GeneratedPluginRegistrant";
  public static void registerWith(@NonNull FlutterEngine flutterEngine) {
    try {
      flutterEngine.getPlugins().add(new io.flutter.plugins.firebase.core.FlutterFirebaseCorePlugin());
    } catch(Exception e) {
      Log.e(TAG, "Error registering plugin firebase_core, io.flutter.plugins.firebase.core.FlutterFirebaseCorePlugin", e);
    }
    try {
      flutterEngine.getPlugins().add(new io.flutter.plugins.firebase.firebase_ml_model_downloader.FirebaseModelDownloaderPlugin());
    } catch(Exception e) {
      Log.e(TAG, "Error registering plugin firebase_ml_model_downloader, io.flutter.plugins.firebase.firebase_ml_model_downloader.FirebaseModelDownloaderPlugin", e);
    }
    try {
      flutterEngine.getPlugins().add(new com.here.here_sdk.HereSdkPlugin());
    } catch(Exception e) {
      Log.e(TAG, "Error registering plugin here_sdk, com.here.here_sdk.HereSdkPlugin", e);
    }
  }
}
