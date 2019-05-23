package com.sprout.programmingtest;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.main_toolbar);
        setSupportActionBar(toolbar);

        ActionBar actionBar = getSupportActionBar();
        assert actionBar != null;
        actionBar.setTitle("Programming Test");


        init();



    }
    Integer[] mFinalArray;
    private ArrayList<Integer> mArray = new ArrayList<Integer>();
    private void addToArray() {
        String inputtedText;
        inputtedText = mInputArray.getText().toString();


        if (inputtedText.length()!=0){
            mArray.add(Integer.valueOf(inputtedText));
            mInputtedArray.setText(String.valueOf(mArray));
            mInputArray.setText("");
        }

         mFinalArray = mArray.toArray(new Integer[mArray.size()]);
        Log.i("**** added:", Arrays.toString(mFinalArray));


        //Log.e("fuck", String.valueOf(mArray));
    }

    Toolbar toolbar;


    EditText mInputArray;
    TextView mSortedArray,mMaximumNumber, mMinimumNumber,mDuplicateNumber, mRemovedDuplicate, mReverseArray, mInputtedArray;

    Button mAdd,mSubmit;
    private void init() {

        mAdd = (Button) findViewById(R.id.add_button);
        mSubmit = (Button) findViewById(R.id.submit_button);

        mAdd.setOnClickListener(addClickListener);
        mSubmit.setOnClickListener(submitClickListener);


        mInputArray = findViewById(R.id.et_input);
        mInputtedArray = findViewById(R.id.inputted_array);
        mSortedArray = findViewById(R.id.tv_sorted_result);
        mMaximumNumber = findViewById(R.id.tv_max_number_result);
        mMinimumNumber = findViewById(R.id.tv_min_number_result);
        mDuplicateNumber = findViewById(R.id.tv_duplicate_number_result);
        mRemovedDuplicate = findViewById(R.id.tv_duplicate_number_remove_result);
        mReverseArray = findViewById(R.id.tv_reverse_array_result);

    }


    View.OnClickListener submitClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            int n = mArray.size();
            Integer[] a = mFinalArray;

            sortTheArray(a,n);

            maxNumber(a,n);

            minimumNumber(a,n);

            removedDuplicateNumber(a,n);

            reversedArray(a,n);


        }
    };

    private void reversedArray(Integer[] a, int n) {
        //Write your code here




        mReverseArray.setText(Arrays.toString(a));
    }

    private void removedDuplicateNumber(Integer[] a, int n) {
        //Write your code here




        mRemovedDuplicate.setText(Arrays.toString(a));
    }

    private void minimumNumber(Integer[] a, int n) {
        //Write your code here





        mMinimumNumber.setText(Arrays.toString(a));
    }

    private void maxNumber(Integer[] a, int n) {
        //Write your code here



        mMaximumNumber.setText(Arrays.toString(a));
    }

    private void sortTheArray(Integer[] a, int n) {
        //Write your code here



        mSortedArray.setText(Arrays.toString(a));

    }

    View.OnClickListener addClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            addToArray();
        }
    };
}
