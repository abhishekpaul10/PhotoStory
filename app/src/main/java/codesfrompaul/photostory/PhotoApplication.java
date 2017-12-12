package codesfrompaul.photostory;

import android.app.Application;

import com.google.firebase.FirebaseApp;

/**
 * Created by Abhishek Paul on 09-Dec-17.
 */

public class PhotoApplication extends Application {
    @Override
    public void onCreate(){
        super.onCreate();
        FirebaseApp.initializeApp(this);
    }
}
