package me.raid.viewcontainerexample.ui;

import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import me.raid.viewcontainerexample.R;
import me.raid.viewcontainerexample.ViewContainer;

public class LayoutLineViewContainer extends ViewContainer<LinearLayout> {
    public static final int LAYOUT_ID = R.layout.layout_line;

    public ViewContainer<TextView> tvLeft = new ViewContainer<>(R.id.tv_left);
    public ViewContainer<EditText> etRight = new ViewContainer<>(R.id.et_right);

    public LayoutLineViewContainer(int id) {
        super(id);
    }
}