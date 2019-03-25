package org.institutoserpis.ed.apostdelayed;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Switch;
import android.widget.TableLayout;
import android.widget.TableRow;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private final static String TAG = MainActivity.class.getSimpleName();
    private List<Integer> ids =
            Arrays.asList(R.id.button, R.id.button2, R.id.button3);
    private List<Button> buttons = new ArrayList<>();
    private ColorDrawable colorDrawable = new ColorDrawable(Color.LTGRAY);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        for (int id : ids) {
            final Button button = findViewById(id);
            buttons.add(button);
            button.setOnClickListener(v -> {
                Log.i(TAG, "onClickListener ");
            });

        }

        Button button = findViewById(R.id.button5);
        TableRow.LayoutParams layoutParams = new TableRow.LayoutParams();
        layoutParams.weight = 3;
        button.setLayoutParams(layoutParams);


        TableLayout tableLayout = findViewById(R.id.tableLayout);
        for (View view : getLeafChildren(tableLayout)){
            Log.i(TAG, String.format("view %s", view));
        }

        ImageButton imageButton = findViewById(R.id.imageButton);
        new Handler().postDelayed(
                () -> imageButton.setImageDrawable(colorDrawable)
        , 4000);

        //button = findViewById(R.id.button);


//        button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//            }
//        });
//
//        button.setOnClickListener( v -> {
//
//        });
//
//        button.setOnClickListener( this::onButtonClick);
    }

    private List<View> getLeafChildren(ViewGroup viewGroup) {
        List<View> leafChildren = new ArrayList<>();
        for (int index = 0; index < viewGroup.getChildCount(); index++){
            View view = viewGroup.getChildAt(index);
            if (view instanceof ViewGroup)
                leafChildren.addAll(getLeafChildren((ViewGroup)view));
            else
                leafChildren.add(view);
        }
        return leafChildren;
    }

//    public void onButtonClick(View view) {
//        Log.i(MainActivity.class.getSimpleName(), "Ejecutando onButtonCLick");
//        button.setText("Hola soy el bola");
//
////        button.postDelayed(new Runnable() {
////            @Override
////            public void run() {
////                button.setText("");
////            }
////        }, 5000);
//
//
//        //button.postDelayed( () -> button.setText(""), 5000 );
//        button.postDelayed( this::kkita, 5000);
////        new Handler().postDelayed(new Runnable() {
////            @Override
////            public void run() {
////                button.setText("");
////            }
////        }, 5000);
//    }
//
//    private void kkita() {
//        button.setText("En kkita");
//    }
}
