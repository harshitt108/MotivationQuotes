package com.example.motivationquotes;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_main );

        RecyclerView quoteList = findViewById ( R.id.quoteList );
        quoteList.setLayoutManager ( new LinearLayoutManager(this) );

        List<String> quotes = new ArrayList <> (  );
        quotes.add( "There are three gates to self-destruction and hell: Lust, Anger & Greed. – Lord Krishna" );
        quotes.add("“A man is made by his beliefs. As he believes. So he becomes.” – Lord Krishna");
        quotes.add("Do everything you have to do, but not with ego, not with lust, not with envy but with love, compassion, humility, and devotion.– Lord Krishna ");
        quotes.add("”For one who has conquered his mind, a mind is best of friends, but for one who has failed to do so, a mind is the greatest enemy.” – Lord Krishna");
        quotes.add("“Why do you worry unnecessarily? Whom do you fear? Who can kill you? The soul is neither born nor dies.” – Lord Krishna ");
        quotes.add("Whatever happened was good. What’s happening is going well. Whatever will happen will also be good. Do not worry about the future. Live in the present.” – Lord Krishna");
        quotes.add("“Set your heart upon your work but never its reward.” – Lord Krishna ");
        quotes.add("“The only way you can conquer me is through love, and there I am gladly conquered.” – Lord Krishna ");
        quotes.add(" “When a person responds to the joys and sorrows of others as though they were his own, he or she has attained the highest spiritual union.” – Lord Krishna ");
        quotes.add("“Calmness, gentleness, silence, self-restraint and purity: these are the disciplines of the mind.” – Lord Krishna");
        quotes.add("“Perform your obligatory duty, because action is indeed better than inaction.” – Lord Krishna");
        quotes.add("“The mind is fickle. It won’t obey you every time the mind misbehaves, use your discretionary intellect to bring it back to the equanimous position.” – Lord Krishna ");
        quotes.add("“Among all kind of killers, time is the ultimate because time kills everything.” – Lord Krishna");
        quotes.add("Each man is a mixture of all the three tendencies:divinely noble, vibrantly restless and indolently dull.The wise men transcends all these qualities– Lord Krishna ");
        quotes.add("Perform your obligatory duty.Because action is indeed better than inaction– Lord Krishna ");
        quotes.add("For one who have conquered his mind ,mind is best of friends,but for one who has failed to do so, mind is the greatest enemy – Lord Krishna ");
        quotes.add("When a person is devoted to something with complete faith,I unify his faith in that,then, when his faith is completely unified,he gains the object of his devotion– Lord Krishna ");
        quotes.add("Actions do not cling to me because I am not attached to their results,those who this and practice it live in freedom– Lord Krishna ");
        quotes.add("I am the father of this universe ,the mother,the support and the grandsire,I am the object of knowledge,the purifier and the syllable om. I am also the Rg, the Sama and the Yajur Veda– Lord Krishna ");
        quotes.add("I am the goal ,the sustainer, the master, the witness,the abode,the refuge,and the most dear friend. I am the creation and the annihilation,the basis of everything,the resting place and the eternal seed– Lord Krishna ");
        quoteList.setAdapter (new QuoteAdapter ( quotes,this )  );


    }
}