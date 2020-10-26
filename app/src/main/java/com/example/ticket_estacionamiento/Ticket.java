package com.example.ticket_estacionamiento;

import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.widget.EditText;
import android.widget.TextView;

public class Ticket extends Activity {

    public String datosCliente;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ticket);

        //System.out.println(datosCliente);

        //System.out.println(MainActivity.getTarifaFraccion());

        EventoTeclado teclado = new EventoTeclado();

        //Estas líneas permiten ingresar el nombre del cliente en el campo EditText

        EditText datos_cliente = (EditText)findViewById(R.id.datos_cliente);

        datos_cliente.setOnEditorActionListener(teclado);

        //System.out.println(datosCliente);
    }


    /*Método para obtener el nombre del cliente
    public void obtenerNombre(View vista){

        TextView vista2 = (TextView)findViewById(R.id.datos_cliente);

        String datosCliente = vista2.getText().toString();

        //System.out.println(datosCliente);
    }*/

    //Creamos una clase interna
    class EventoTeclado implements TextView.OnEditorActionListener{


        @Override
        public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {

            if(actionId == EditorInfo.IME_ACTION_DONE){

                EditText campoTexto;


                campoTexto = (EditText)findViewById(R.id.datos_cliente);

                datosCliente = campoTexto.getText().toString();

                campoTexto.setText("");

                System.out.println(datosCliente);
            }

            return false;
        }
    }
}
