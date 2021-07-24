package com.hishd.tinypopup;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;

import com.hishd.tinypopup.databinding.LayoutDualActionBinding;
import com.hishd.tinypopup.databinding.LayoutSingleActionBinding;

public class TinyPopups extends Dialog {

    RelativeLayout rootLayout;
    TextView txtTitle;
    TextView txtMessage;
    Button btn1;
    Button btn2;
    Context context;

    private LayoutSingleActionBinding singleActionBinding;
    private LayoutDualActionBinding dualActionBinding;

    public TinyPopups(Context context) {
        super(context);
        this.context = context;
        this.setCanceledOnTouchOutside(false);
        singleActionBinding = LayoutSingleActionBinding.inflate(getLayoutInflater());
        dualActionBinding = LayoutDualActionBinding.inflate(getLayoutInflater());
    }

    public TinyPopups setCancelledOnOutside(boolean cancellable) {
        this.setCanceledOnTouchOutside(cancellable);
        return this;
    }

    public TinyPopups createSingleActionDialog() {
        this.rootLayout = singleActionBinding.getRoot();
        setContentView(rootLayout);
        getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        this.txtTitle = singleActionBinding.txtTitle;
        this.txtMessage = singleActionBinding.txtMessage;
        this.btn1 = singleActionBinding.btn1;
        return this;
    }

    public TinyPopups createDualActionDialog() {
        this.rootLayout = dualActionBinding.getRoot();
        setContentView(rootLayout);
        getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        this.txtTitle = dualActionBinding.txtTitle;
        this.txtMessage = dualActionBinding.txtMessage;
        this.btn1 = dualActionBinding.btn1;
        this.btn2 = dualActionBinding.btn2;
        return this;
    }

    public TinyPopups setTitle(String title) {
        txtTitle.setText(title);
        return this;
    }

    public TinyPopups setMessage(String message) {
        txtMessage.setText(message);
        return this;
    }

    public TinyPopups setBackgroundColor(int color) {
        Drawable background = rootLayout.getBackground();
        if (background instanceof ShapeDrawable) {
            ((ShapeDrawable) background).getPaint().setColor(context.getColor(color));
        } else if (background instanceof GradientDrawable) {
            ((GradientDrawable) background).setColor(context.getColor(color));
        } else if (background instanceof ColorDrawable) {
            ((ColorDrawable) background).setColor(context.getColor(color));
        }
        return this;
    }

    public TinyPopups setTitleColor(int color) {
        if (txtTitle != null)
            txtTitle.setTextColor(context.getColor(color));
        return this;
    }

    public TinyPopups setMessageColor(int color) {
        if (txtMessage != null)
            txtMessage.setTextColor(context.getColor(color));
        return this;
    }

    public TinyPopups setBtn1Caption(String text) {
        if(btn1 != null)
            btn1.setText(text);

        return this;
    }

    public TinyPopups setBtn2Caption(String text) {
        if(btn2 != null)
            btn2.setText(text);

        return this;
    }

    public TinyPopups setBtn1CaptionColor(int textColor) {
        if(btn1 != null)
            btn1.setTextColor(context.getColor(textColor));

        return this;
    }

    public TinyPopups setBtn2CaptionColor(int textColor) {
        if(btn2 != null)
            btn2.setTextColor(context.getColor(textColor));

        return this;
    }

    public TinyPopups setBtn1AllCaps(boolean allCaps) {
        if(btn1 != null)
            btn1.setAllCaps(allCaps);

        return this;
    }

    public TinyPopups setBtn2AllCaps(boolean allCaps) {
        if(btn2 != null)
            btn2.setAllCaps(allCaps);

        return this;
    }

    public TinyPopups setBtn1Color(int color) {
        if(btn1 == null)
            return this;

        Drawable background = btn1.getBackground();
        if (background instanceof ShapeDrawable) {
            ((ShapeDrawable) background).getPaint().setColor(context.getColor(color));
        } else if (background instanceof GradientDrawable) {
            ((GradientDrawable) background).setColor(context.getColor(color));
        } else if (background instanceof ColorDrawable) {
            ((ColorDrawable) background).setColor(context.getColor(color));
        }
        return this;
    }

    public TinyPopups setBtn2Color(int color) {
        if(btn2 == null)
            return this;

        Drawable background = btn2.getBackground();
        if (background instanceof ShapeDrawable) {
            ((ShapeDrawable) background).getPaint().setColor(context.getColor(color));
        } else if (background instanceof GradientDrawable) {
            ((GradientDrawable) background).setColor(context.getColor(color));
        } else if (background instanceof ColorDrawable) {
            ((ColorDrawable) background).setColor(context.getColor(color));
        }
        return this;
    }

    public TinyPopups setBtn1Action(TinyPopupOnClickListener listener) {
        if(btn1 == null)
            return this;
        btn1.setOnClickListener(v -> {
            listener.onClicked(TinyPopups.this);
        });

        return  this;
    }

    public TinyPopups setBtn2Action(TinyPopupOnClickListener listener) {
        if(btn2 == null)
            return this;
        btn2.setOnClickListener(v -> {
            listener.onClicked(TinyPopups.this);
        });

        return  this;
    }

    public interface TinyPopupOnClickListener {
        void onClicked(Dialog dialog);
    }
}
