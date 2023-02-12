package edu.oru.cit352.ckmung1.bibleverseapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.util.Random; // for the Random class

public class MainActivity extends AppCompatActivity {

    // instantiate a string to hold the random verses
    String randomVerse = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // calls the displayVerse method on create
        displayVerse();
    }

    // Bible display function
    private void displayVerse() {
        // create a new instance from the Random class
        Random random = new Random();
        int minVerse = 1;
        int maxVerse = 12;

        // generate random number between 1 to 12 inclusive
        // according to an oracle documentation, this will actually generate a pseudorandom number
        int randomNum = random.nextInt((maxVerse - minVerse) + 1) + minVerse; // essentially equals to 12 + 1

        // assigns a Bible verse to randomQuote based on the generated number
        // default is just the text hint
        switch (randomNum) {
            case 1:
                randomVerse = getString(R.string.bible_verse_1);
                break;
            case 2:
                randomVerse = getString(R.string.bible_verse_2);
                break;
            case 3:
                randomVerse = getString(R.string.bible_verse_3);
                break;
            case 4:
                randomVerse = getString(R.string.bible_verse_4);
                break;
            case 5:
                randomVerse = getString(R.string.bible_verse_5);
                break;
            case 6:
                randomVerse = getString(R.string.bible_verse_6);
                break;
            case 7:
                randomVerse = getString(R.string.bible_verse_7);
                break;
            case 8:
                randomVerse = getString(R.string.bible_verse_8);
                break;
            case 9:
                randomVerse = getString(R.string.bible_verse_9);
                break;
            case 10:
                randomVerse = getString(R.string.bible_verse_10);
                break;
            case 11:
                randomVerse = getString(R.string.bible_verse_11);
                break;
            case 12:
                randomVerse = getString(R.string.bible_verse_12);
                break;
            default:
                randomVerse = getString(R.string.bible_verse_hint);
        }

        // get the text view to display the verse
        TextView verseDisplay = findViewById(R.id.textVerse);
        // displays the verse at the text view
        verseDisplay.setText(randomVerse);
    }
}