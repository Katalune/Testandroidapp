package com.example.kata.smallandroidapp;

import android.view.View;
import com.facebook.litho.ClickEvent;
import com.facebook.litho.Component;
import com.facebook.litho.ComponentContext;
import com.facebook.litho.annotations.LayoutSpec;
import com.facebook.litho.annotations.OnCreateInitialState;
import com.facebook.litho.annotations.OnCreateLayout;
import com.facebook.litho.annotations.Prop;
import com.facebook.litho.widget.Text;

@LayoutSpec
class DemoSpec {

    @OnCreateInitialState
    static void createInitialState(ComponentContext c, @Prop int help, @Prop int two
    ) {
    }

    @OnCreateLayout
    static Component onCreateLayout(ComponentContext c, @Prop int a3
    ) {
        Demo.create(c).a3(2);
        return Text.create(c)
                .text("Hello World")
                .textSizeDip(50)
                .build();
   }
}