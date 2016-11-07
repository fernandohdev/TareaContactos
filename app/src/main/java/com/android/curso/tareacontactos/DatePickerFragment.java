package com.android.curso.tareacontactos;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.os.Bundle;
import android.support.design.widget.TextInputEditText;
import android.support.v4.app.DialogFragment;
import android.util.Log;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Calendar;


public class DatePickerFragment extends DialogFragment implements DatePickerDialog.OnDateSetListener {


    public Dialog onCreateDialog(Bundle savedInstanceState){
        final Calendar c = Calendar.getInstance();
        int year = c.get(Calendar.YEAR);
        int month = c.get(Calendar.MONTH);
        int day = c.get(Calendar.DAY_OF_MONTH);

        return new DatePickerDialog(getActivity(), this, year, month, day);

    }

    @Override
    public void onDateSet(DatePicker view, int year, int month, int day){


        //Log.w("DATE PICKER", "" + day + "/" + month + "/" + year);
        //((TextInputEditText) getActivity().findViewById(R.id.tietNacimiento)).setText(day + "/" + month + "/" + year);
        ((EditText) getActivity().findViewById(R.id.tietNacimiento)).setText(day + "/" + month + "/" + year);
    }



}