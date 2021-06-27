package com.example.kata.smallandroidapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import com.facebook.litho.Component;
import com.facebook.litho.ComponentContext;
import com.facebook.litho.LithoView;
import com.facebook.litho.widget.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        final ComponentContext context = new ComponentContext(this);

        final Component component = Text.create(context)
                .text("Hello World")   
                .textSizeDip(50)
                .build();
        // Class from arc.abc which is renamed arc.zip
//        new Some().get();

        /*setContentView(LithoView.create(context,
                Item.create(context)
                        .build()));*/
    }
}
