package com.example.lenovo.myapplication;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.util.AndroidException;
import android.util.Log;
import android.widget.Toast;

public class DialogActivity extends Activity {
    final CharSequence[] items ={"blue","red","yellow"};
@Override
    public void onCreate(Bundle savedStanceState){
    super.onCreate(savedStanceState);
   // showDialog();
//showDialogWithList();
    showDialogWithCheckBox();
    }
    private  void showDialog(){

    new AlertDialog.Builder(this)
    .setTitle("Title")
            .setMessage("Cerrar aplicacionEste es nuestro mensaje")
    .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {
        @Override
        public void onClick(DialogInterface dialogInterface, int i) {
finish();
        }
    })
    .setNegativeButton(android.R.string.no, new DialogInterface.OnClickListener() {
        @Override
        public void onClick(DialogInterface dialogInterface, int i) {
            Log.d("Dialog","Seguimos en la aplicacion");
        }
    }) .show();

    }
    private void showDialogWithList (){
    AlertDialog.Builder builder = new AlertDialog.Builder(this);
    builder.setTitle("pick a color");
    builder.setItems(items, new DialogInterface.OnClickListener() {
        @Override
        public void onClick(DialogInterface dialogInterface, int i) {
            Toast.makeText(getApplicationContext(),items[i],Toast.LENGTH_LONG).show();
        }
    });
AlertDialog alert = builder.create();
alert.show();
    }
    private void showDialogWithCheckBox(){
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("pick a color");
        builder.setSingleChoiceItems(items,-1, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(getApplicationContext(),items[i],Toast.LENGTH_LONG).show();
            }
        });
        AlertDialog alert = builder.create();
        alert.show();
    }
}
