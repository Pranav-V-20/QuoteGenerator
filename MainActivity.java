package com.example.quotegenerator;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private TextView quoteTextView;
    private final String[] quotes = {
            "Keep calm and avoid the battle",
            "Keep calm and face the devil",
            "Be your Own competitor",
            "Wakeup to Reality... Nothing ever goes as planned in this accursed world",
            "Two things can judge you \n Determination when you have nothing \n Attitude when you everything",
            "Problems are part of life \n Facing them with smile is art of life",
            "Pain is inevitable \n Suffering is optional",
            "Everyone have someone but for me I am the only one",
            "Don't search for a good person \n Be a good person",
            "An Apology without change in behaviour is a betrayal of trust",
            "Acting like nothing affects me But actually it destroyed me",
            "You can take away my suits, you can take away my home, but there's one thing you can never take away from me... my mind",
            "Heroes are made by the paths they choose, not by the powers they are graced with",
            "I believe what doesn't kill you simply makes you, stranger",
            "You either die a hero or live long enough to see yourself become the villain",
            "If you're good at something, never do it for free",
            "It's not who I am underneath, But I do is defines me",
            "Why so Serious",
            "The world only makes sense if you force it to",
            "Some men just want to watch the world burn",
            "Let the games begin!",
            "Under the game before entering into it",
            "If you want to crack a system, First under the System",
            "Don't be her man, Be a Batman",
            "Love someone they will use you \n Use someone they will love you",
            "If there is no struggle, there is no progress",
            "Be not afraid of growing slowly; be afraid only of standing still",
            "Changes brings opportunity",
            "Makeups makes women beauty \n Breakups make men beauty",
            "Education is not preparation for life \n education is life itself.",
            "Failure is a stepping stone of success",
            "Do not let circumstances control you ",
            "I'm crazy, but I'm not stupid",
            "Mistakes are always forgivable, If one has the courage to admit them ",
            "You not failed, You just learned",
            "Do not pray for an easy life, pray for the strength to endore a difficult one",
            "If you spend too much time thinking about a thing, you'll never get it done",
            "The more we value things, the less we value ourselves",
            "The key to immortality is first living a life worth remembering",
            "It's just a bad day not a bad life",
            "My efforts may be quiet, But my results will roar",
            "Death can have me When it Earns me"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        quoteTextView = findViewById(R.id.quoteTextView);
        Button generateButton = findViewById(R.id.generateButton);

        generateButton.setOnClickListener(v -> {
            Random random = new Random();
            int index = random.nextInt(quotes.length);
            quoteTextView.setText(quotes[index]);
        });
    }
}
