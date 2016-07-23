package com.rkrgames.flamesgame;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class finalactivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_finalactivity);
        final String friend[]={"","There is nothing on this earth more to be prized than true friendship",
                "A real friend is one who walks in when the rest of the world walks out",
                "Friendship is always a sweet responsibility, never an opportunity",
                "A friend is what the heart needs all the time.",
                "True friendship multiplies the good in life and divides its evils."};
        final String love[]={"","Love isn't something you find. Love is something that finds you.",
                            "Immature love says: 'I love you because I need you.' Mature love says 'I need you because I love you.",
                            "Sometimes the heart sees what is invisible to the eye",
                            "True love is like ghosts, which everyone talks about and few have seen.",
                            "Love is composed of a single soul inhabiting two bodies."};
        final  String affection[]={"","I was born with an enormous need for affection, and a terrible need to give it.-Audrey Hepburn",
        "Never regret anything you have done with a sincere affection; nothing is lost that is born of the heart.",
        "Affection is responsible for nine-tenths of whatever solid and durable happiness there is in our lives.",
        "Love is not to be purchased, and affection has no price.",
        "Every gift which is given, even though is be small, is in reality great, if it is given with affection."};
        final  String marriage[]={"","Happy is the man who finds a true friend, and far happier is he who finds that true friend in his wife.",
        "A successful marriage requires falling in love many times, always with the same person.",
        "Marriage is the highest state of friendship. If happy, it lessens our cares by dividing them, at the same time that it doubles our pleasures by mutual participation.",
        "Don't marry the person you think you can live with; marry only the individual you think you can't live without.",
        "Marriage may be the closest thing to Heaven or Hell any of us will know on this earth."};
        final String enemy[]={"","Love is the only force capable of transforming an enemy into friend.",
        "It takes a great deal of bravery to stand up to our enemies, but just as much to stand up to our friends.",
        "Supreme excellence consists in breaking the enemy's resistance without fighting.",
        "Always forgive your enemies - nothing annoys them so much.",
        "There are only two people who can tell you the truth about yourself - an enemy who has lost his temper and a friend who loves you dearly."};
        String getstr= getIntent().getExtras().getString(Intent.EXTRA_TEXT);
        TextView tv = (TextView)findViewById(R.id.textView5);
        TextView tv4 = (TextView)findViewById(R.id.textView4);
        Integer rand=getRandomInteger(5,1);

        //noinspection ConstantConditions
        switch (getstr) {
         case "f":   tv.setText("FRIEND");
                tv4.setText(friend[rand]);
         break;
         case "l":  tv.setText("LOVE");
                    tv4.setText(love[rand]);
                    break;
         case "a":  tv.setText("AFFECTION");
                    tv4.setText(affection[rand]);
                    break;
         case "m":  tv.setText("MARRIAGE");
                    tv4.setText(marriage[rand]);
                    break;
         case "e": tv.setText("ENEMY");
             tv4.setText(enemy[rand]);
                    break;
         }
    }
    public static int getRandomInteger(int maximum, int minimum){ return ((int) (Math.random()*(maximum - minimum))) + minimum; }
}
