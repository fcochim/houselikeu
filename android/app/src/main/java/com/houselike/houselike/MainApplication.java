package com.houselike.houselike;

import com.facebook.react.ReactPackage;
import com.reactnativenavigation.NavigationApplication;

import java.util.Arrays;
import java.util.List;

import io.invertase.firebase.RNFirebasePackage;
import io.invertase.firebase.admob.RNFirebaseAdMobPackage;
import io.invertase.firebase.analytics.RNFirebaseAnalyticsPackage;
import io.invertase.firebase.auth.RNFirebaseAuthPackage;
import io.invertase.firebase.config.RNFirebaseRemoteConfigPackage;
import io.invertase.firebase.database.RNFirebaseDatabasePackage;
import io.invertase.firebase.fabric.crashlytics.RNFirebaseCrashlyticsPackage;
import io.invertase.firebase.firestore.RNFirebaseFirestorePackage;
import io.invertase.firebase.instanceid.RNFirebaseInstanceIdPackage;
import io.invertase.firebase.links.RNFirebaseLinksPackage;
import io.invertase.firebase.messaging.RNFirebaseMessagingPackage;
import io.invertase.firebase.notifications.RNFirebaseNotificationsPackage;
import io.invertase.firebase.perf.RNFirebasePerformancePackage;
import io.invertase.firebase.storage.RNFirebaseStoragePackage;

// optional packages - add/remove as appropriate


public class MainApplication extends NavigationApplication {

  @Override
  public boolean isDebug() {
    // Make sure you are using BuildConfig from your own application
    return BuildConfig.DEBUG;
  }

  protected List<ReactPackage> getPackages() {
    // Add additional packages you require here
    // No need to add RnnPackage and MainReactPackage
    return Arrays.<ReactPackage>asList(
            // eg. new VectorIconsPackage()
            new RNFirebasePackage(),
            // add/remove these packages as appropriate
            new RNFirebaseAdMobPackage(),
            new RNFirebaseAnalyticsPackage(),
            new RNFirebaseAuthPackage(),
            new RNFirebaseCrashlyticsPackage(),
            new RNFirebaseDatabasePackage(),
            new RNFirebaseFirestorePackage(),
            new RNFirebaseInstanceIdPackage(),
            new RNFirebaseLinksPackage(),
            new RNFirebaseMessagingPackage(),
            new RNFirebaseNotificationsPackage(),
            new RNFirebasePerformancePackage(),
            new RNFirebaseRemoteConfigPackage(),
            new RNFirebaseStoragePackage()
    );
  }

  @Override
  public List<ReactPackage> createAdditionalReactPackages() {
    return getPackages();
  }

  @Override
  public String getJSMainModuleName() {
    return "index";
  }

}
