package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:
    TextView mTextView;
    Button mTopButton;
    Button mBottomButton;
    int mStoryIndex = 1;

    enum StoryButtonOption {
        Top,
        Bottom
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTextView = findViewById(R.id.storyTextView);
        mTopButton = findViewById(R.id.buttonTop);
        mBottomButton = findViewById(R.id.buttonBottom);

        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:
        mTopButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                UpdateStory(StoryButtonOption.Top);
            }
        });

        mBottomButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                UpdateStory(StoryButtonOption.Bottom);
            }
        });

    }

    public void UpdateStory(StoryButtonOption button)
    {
        switch (mStoryIndex){
            case 1:
                if(button == StoryButtonOption.Top){
                    mStoryIndex = 3;
                    mTextView.setText(R.string.T3_Story);
                    mTopButton.setText(R.string.T3_Ans1);
                    mBottomButton.setText(R.string.T3_Ans2);
                } else {
                    mStoryIndex = 2;
                    mTextView.setText(R.string.T2_Story);
                    mTopButton.setText(R.string.T2_Ans1);
                    mBottomButton.setText(R.string.T2_Ans2);
                }
                break;
            case 2:
                if(button == StoryButtonOption.Top){
                    mStoryIndex = 3;
                    mTextView.setText(R.string.T3_Story);
                    mTopButton.setText(R.string.T3_Ans1);
                    mBottomButton.setText(R.string.T3_Ans2);
                } else {
                    mStoryIndex = 4;
                    mTextView.setText(R.string.T4_End);
                } break;
            case 3:
                if(button == StoryButtonOption.Top){
                    mStoryIndex = 6;
                    mTextView.setText(R.string.T6_End);
                } else {
                    mStoryIndex = 5;
                    mTextView.setText(R.string.T5_End);
                } break;
        }
        if (mStoryIndex >= 4)
        {
            mTopButton.setVisibility(View.GONE);
            mBottomButton.setVisibility(View.GONE);
        }
    }
}
