package com.example.homework3_2_1;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class NumerCreator implements View.OnClickListener {

    private String num = "";
    private boolean dotted;
    private TextView text;

    public NumerCreator (View ... buttons){

        for(int i = 0; i < buttons.length; i++) {
            if (buttons[i].getId()==R.id.text){
                text = (TextView) buttons[i];
            } else {
                buttons[i].setOnClickListener(this);
            }
        }
    }

    public String getNum() {
        return num;
    }

    @Override
    public void onClick(View v) {
        if (!(v.getId() == R.id.btndot)) {
            num += ((Button) v).getText().toString();
            text.setText(num);
            if (num.equals("0")){
                num = "";
            }
        }
        if (v.getId() == R.id.btndot){
            if (!dotted) {
                num += ((Button) v).getText().toString();
                text.setText(num);

                dotted = true;
            }
        }
    }
}
