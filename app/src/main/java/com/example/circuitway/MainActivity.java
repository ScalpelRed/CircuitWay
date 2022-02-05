package com.example.circuitway;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TableLayout;
import android.widget.TableRow;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    public TableLayout tableLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tableLayout = findViewById(R.id.CircuitTable);

        BuildField(5, 5);
    }

    void BuildField(int x, int y){
        for (int i = 1; i < x; i++){
            new CircuitPoint(i * 10, 50, this);
        }
    }
}

class CircuitPoint{
    public TableRow tableRow;
    public Button button;

    public CircuitPoint(int x, int y, MainActivity c) {

        tableRow = new TableRow(c);
        c.tableLayout.addView(tableRow);
        ViewGroup.LayoutParams lp = new TableLayout.LayoutParams(
                TableLayout.LayoutParams.WRAP_CONTENT,
                TableLayout.LayoutParams.WRAP_CONTENT);
        tableRow.setLayoutParams(lp);

        button = new Button(c);
        button.setLayoutParams(lp);
        button.setBackground(c.getDrawable(R.drawable.circuit_dot));
        tableRow.addView(button);

    }
}