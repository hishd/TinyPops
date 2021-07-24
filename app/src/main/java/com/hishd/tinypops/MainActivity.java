package com.hishd.tinypops;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.app.Dialog;
import android.os.Bundle;

import com.hishd.tinypops.databinding.ActivityMainBinding;
import com.hishd.tinypopup.TinyPopups;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;
    TinyPopups tinyPopupsSingleDialog;
    TinyPopups tinyPopupsDualDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        tinyPopupsSingleDialog = new TinyPopups(this)
                //This will create a Single Action Dialog
                .createSingleActionDialog()
                //Setting to TRUE will dismiss the popup when selected outside
                .setCancelledOnOutside(false)
                //Set the dialog Title
                .setTitle("Single Dialog")
                //Set the dialog Caption
                .setMessage("This is a simple single action dialog with a single button")
                //Set the dialog background color
                .setBackgroundColor(R.color.white)
                //Set the dialog title color
                .setTitleColor(R.color.black)
                //Set the dialog message color
                .setMessageColor(R.color.black)
                //Set the dialog Button 1 caption
                .setBtn1Caption("Action 1")
                //Set the dialog Button 1 Color
                .setBtn1Color( R.color.purple_700)
                //Set the dialog Button 1 caption color
                .setBtn1CaptionColor(R.color.white)
                //Setting TRUE will make all the button caption UPPERCASED
                .setBtn1AllCaps(false)
                //Set the action to the Button 1
                .setBtn1Action(dialog -> {
                    dialog.dismiss();
                });

        tinyPopupsDualDialog = new TinyPopups(this)
                //This will create a Dual Action Dialog
                .createDualActionDialog()
                //Setting to TRUE will dismiss the popup when selected outside
                .setCancelledOnOutside(false)
                //Set the dialog Title
                .setTitle("Single Dialog")
                //Set the dialog Caption
                .setMessage("This is a simple dual action dialog with a dual buttons.")
                //Set the dialog background color
                .setBackgroundColor(R.color.white)
                //Set the dialog title color
                .setTitleColor(R.color.black)
                //Set the dialog message color
                .setMessageColor(R.color.black)
                //Set the dialog Button 1 caption
                .setBtn1Caption("Action 1")
                //Set the dialog Button 1 Color
                .setBtn1Color(R.color.purple_700)
                //Set the dialog Button 1 caption color
                .setBtn1CaptionColor(R.color.white)
                //Setting TRUE will make all the button caption UPPERCASED
                .setBtn1AllCaps(false)
                //Set the action to the Button 1
                .setBtn1Action(dialog -> {
                    dialog.dismiss();
                })
                //Set the dialog Button 2 caption
                .setBtn2Caption("Action 1")
                //Set the dialog Button 2 Color
                .setBtn2Color(R.color.purple_700)
                //Set the dialog Button 2 caption color
                .setBtn2CaptionColor(R.color.white)
                //Setting TRUE will make all the button caption UPPERCASED
                .setBtn2AllCaps(false)
                //Set the action to the Button 2
                .setBtn2Action(dialog -> {
                    dialog.dismiss();
                });


        binding.btn1.setOnClickListener(v -> {
            tinyPopupsSingleDialog.show();
        });

        binding.btn2.setOnClickListener(v -> {
            tinyPopupsDualDialog.show();
        });
    }
}