package codesfrompaul.photostory;

import android.media.Image;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.firebase.ui.storage.images.FirebaseImageLoader;
import com.google.firebase.FirebaseApp;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;



public class PhotoStory extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        FirebaseApp.initializeApp(this);
        setContentView(R.layout.activity_photo_story);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        ImageView loadImage = (ImageView)findViewById(R.id.loadImage);
        ImageView loadImage1 = (ImageView)findViewById(R.id.loadImage1);
        ImageView loadImage2 = (ImageView)findViewById(R.id.loadImage2);
        ImageView loadImage3 = (ImageView)findViewById(R.id.loadImage3);

        FirebaseStorage firebaseStorage = FirebaseStorage.getInstance();
        StorageReference str = firebaseStorage.getReference();
        StorageReference load = str.child("pic1.jpg");
        Glide.with(this).using(new FirebaseImageLoader()).load(load).into(loadImage);


        //StorageReference str1 = firebaseStorage.getReference();
        StorageReference load1 = str.child("pic2.jpg");
        Glide.with(this).using(new FirebaseImageLoader()).load(load1).into(loadImage1);


        //StorageReference str2 = firebaseStorage.getReference();
        StorageReference load2 = str.child("pic3.jpg");
        Glide.with(this).using(new FirebaseImageLoader()).load(load2).into(loadImage2);

        StorageReference load3 = str.child("pic4.jpg");
        Glide.with(this).using(new FirebaseImageLoader()).load(load3).into(loadImage3);
    }
}
