package com.example.frontend;

import android.content.Intent;
import android.view.animation.Animation;
import android.content.Context;
import android.view.animation.Transformation;
import android.widget.TextView;
import android.widget.ProgressBar;

public class ProgressBarAnimation extends Animation {

    private Context con;
    private ProgressBar progressionBar;
    private TextView text;
    private float from;
    private float to;

    public ProgressBarAnimation (Context con, ProgressBar pro, TextView text, float from, float to){
        this.con = con;
        this.progressionBar = pro;
        this.text = text;
        this.from = from;
        this.to= to;

    }
}
