package com.example.ticket_estacionamiento;

import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.widget.EditText;
import android.widget.TextView;

public class Ticket extends Activity {

    public String datosCliente = "Juan";

    public double tiempoEstacionamiento;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ticket);

        System.out.println(datosCliente);

        //System.out.println(MainActivity.getTarifaFraccion());

        EventoTeclado teclado = new EventoTeclado();

        //Estas líneas permiten ingresar el nombre del cliente en el campo EditText

        EditText datos_cliente = (EditText)findViewById(R.id.datos_cliente);

        datos_cliente.setOnEditorActionListener(teclado);


        //Estas líneas permiten ingresar el tiempo de estacionamiento en su respectivo campo editText

        EventoTeclado tecladoTiempo = new EventoTeclado();

        EditText tiempo_est = (EditText)findViewById(R.id.tiempo_est);

        tiempo_est.setOnEditorActionListener(tecladoTiempo);

        System.out.println("fin del método onCreate");

    }//fin del método onCreate


    /*Método para obtener el nombre del cliente
    public void obtenerNombre(View vista){

        TextView vista2 = (TextView)findViewById(R.id.datos_cliente);

        String datosCliente = vista2.getText().toString();

        //System.out.println(datosCliente);
    }*/

    //Creamos una clase interna, no lo tengo claro, pero por lo que entiendo al ejecutar el método onEditorAction este toma el TextView dónde lo estoy ejecutando como campoTexto
    class EventoTeclado implements TextView.OnEditorActionListener{

        @Override
        public boolean onEditorAction(TextView campoTexto, int actionId, KeyEvent event) {

            if(actionId == EditorInfo.IME_ACTION_DONE){

                String cadena = campoTexto.getText().toString();

                if(campoTexto.getId() == R.id.datos_cliente){
                    datosCliente = cadena;
                    campoTexto.setText("");
                }
                if(campoTexto.getId() == R.id.tiempo_est){
                    tiempoEstacionamiento = Double.parseDouble(cadena);
                    campoTexto.setText("");
                }

                System.out.println(datosCliente);
                System.out.println(tiempoEstacionamiento);
            }

            return false;
        }
    }
}
