package com.nabesh.spotongameapp;

import android.animation.Animator;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

public class SpotOnView extends View {
    //constants for accessing high score in SharedPreference
    private static final String HIGH_SCORE = "HIGH SCORE";
    private SharedPreferences preferences; //stores the high score

    //variables for managing the game
    private int spotsTouched;
    private int score;
    private int level;
    private int ViewWidth;
    private int viewHeight;
    private long animationTime;
    private boolean gameOver;
    private boolean gamePaused;
    private boolean dialogDisplayed;
    private int highScore;

    //collection of spots (ImageViews) and Animators
    private final Queue<ImageView> spots = new ConcurrentLinkedQueue<ImageView>();
    private final Queue<Animator> animators = new ConcurrentLinkedQueue<Animator>();

    private TextView highScoreTextView;
    private TextView currentScoreTextView;
    private TextView levelTextView;
    private LinearLayout livesLinearLayout;
    private RelativeLayout relativeLayout; //displays spots
    private Resources resources; //used to load resources
    private LayoutInflater layoutInflater; //used to inflate GUIs
    

}
