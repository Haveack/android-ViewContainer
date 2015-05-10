package me.raid.viewcontainerexample.ui;

import android.widget.Button;
import android.widget.FrameLayout;

import me.raid.viewcontainerexample.R;
import me.raid.viewcontainerexample.ViewContainer;

public class MainActivityViewContainer extends ViewContainer<FrameLayout> {
    public static final int LAYOUT_ID = R.layout.activity_main;

    public LayoutLineViewContainer upperLine = new LayoutLineViewContainer(R.id.upper_line);
    public LayoutLineViewContainer lowerLine = new LayoutLineViewContainer(R.id.lower_line);
    public ViewContainer<Button> btnGo = new ViewContainer<>(R.id.btn_go);

    public MainActivityViewContainer(int id) {
        super(id);
    }
}