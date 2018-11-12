package com.example.elliotm.taxiapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText fare, passengers, amountPaid, returnedAmount;
    double taxi_fare, amount, change;
    int passengersOnBoard;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fare = findViewById(R.id.et_fare);
        passengers = findViewById(R.id.et_passengers);
        amountPaid = findViewById(R.id.et_amount_paid);
        returnedAmount = findViewById(R.id.et_change_due);
        returnedAmount.setEnabled(false);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.et_fare:
                fare.addTextChangedListener(new TextWatcher() {
                    @Override
                    public void beforeTextChanged(CharSequence s, int start, int count, int after) {

                    }

                    @Override
                    public void onTextChanged(CharSequence s, int start, int before, int count) {

                        taxi_fare = Double.parseDouble(fare.getText().toString());
                        passengersOnBoard = Integer.parseInt(passengers.getText().toString());
                        amount = Double.parseDouble(amountPaid.getText().toString());
                        change = Double.parseDouble(returnedAmount.getText().toString());
                        change = amount - ( taxi_fare * passengersOnBoard);
                        returnedAmount.setText(String.valueOf(change));
                    }

                    @Override
                    public void afterTextChanged(Editable s) {

                    }
                });
                break;
            case R.id.et_passengers:

                passengers.addTextChangedListener(new TextWatcher() {
                    @Override
                    public void beforeTextChanged(CharSequence s, int start, int count, int after) {

                    }

                    @Override
                    public void onTextChanged(CharSequence s, int start, int before, int count) {
                        taxi_fare = Double.parseDouble(fare.getText().toString());
                        passengersOnBoard = Integer.parseInt(passengers.getText().toString());
                        amount = Double.parseDouble(amountPaid.getText().toString());
                        change = Double.parseDouble(returnedAmount.getText().toString());
                        change = amount - ( taxi_fare * passengersOnBoard);
                        returnedAmount.setText(String.valueOf(change));
                    }

                    @Override
                    public void afterTextChanged(Editable s) {

                    }
                });
                break;
            case R.id.et_amount_paid:

                amountPaid.addTextChangedListener(new TextWatcher() {
                    @Override
                    public void beforeTextChanged(CharSequence s, int start, int count, int after) {

                    }

                    @Override
                    public void onTextChanged(CharSequence s, int start, int before, int count) {
                        taxi_fare = Double.parseDouble(fare.getText().toString());
                        passengersOnBoard = Integer.parseInt(passengers.getText().toString());
                        amount = Double.parseDouble(amountPaid.getText().toString());
                        change = Double.parseDouble(returnedAmount.getText().toString());
                        change = amount - ( taxi_fare * passengersOnBoard);
                        returnedAmount.setText(String.valueOf(change));
                    }

                    @Override
                    public void afterTextChanged(Editable s) {

                    }
                });

                break;
        }
    }
}
