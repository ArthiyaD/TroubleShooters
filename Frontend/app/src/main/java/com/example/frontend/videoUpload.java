package com.example.frontend;

import static android.content.ContentValues.TAG;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.VideoView;
import android.app.Activity;
import android.os.Bundle;
import android.widget.Toast;

import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;
import android.media.MediaPlayer.OnPreparedListener;
public class videoUpload extends AppCompatActivity implements MediaPlayer.OnPreparedListener {

    public Button button;

    Button videoButton;
    VideoView gallery;

    @Override
    public void onPrepared(MediaPlayer mediaPlayer) {
        View placeholder = (View) findViewById(R.id.placeholder);
        placeholder.setVisibility(View.GONE);
    }
}
