package com.example.kata.smallandroidapp;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import com.facebook.litho.Column;
import com.facebook.litho.Component;
import com.facebook.litho.ComponentContext;
import com.facebook.litho.TouchEvent;
import com.facebook.litho.annotations.*;

import java.util.List;

@LayoutSpec
class ItemSpec {

    @OnCreateLayout
    static Component onCreateLayout(ComponentContext c,
                                    @Prop int requiredPropOne,
                                    @Prop(varArg = "item") List<Integer> requiredPropTwo,
                                    @Prop(optional = true) int optionalProp) {
                
        return Column.create(c)
                .heightDip(102)
                .build();
    }
}