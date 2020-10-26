package com.example.ticket_estacionamiento;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    double tarifaMinima = 2; //Corresponde al valor mínimo a pagar por 3 horas o menos de estacionamiento

    double tiempoMinimo = 3; //Tiempo al que le corresponde la tarifa mínima

    static double tarifaFraccion = 0.5; //Valor de la tarifa por fracción de 1 hora o menos tiempo, pasada las 3 horas inciales

    double tarifaDiaria = 12; // valor de la tarifa diaria, a la vez es la tarifa máxima

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //Método para ejecutar la clase Config
    public void ejecutarTicket(View vista){

        Intent i = new Intent(this, Ticket.class);

        startActivity(i);
    }

    //Métodos set y get para las variables (de clase?)

    public void setTarifaMinima(double tarifaMinima){

        this.tarifaMinima = tarifaMinima;
    }

    public double getTarifaMinima() {
        return tarifaMinima;
    }

    public void setTarifaFraccion(double tarifaFraccion) {
        this.tarifaFraccion = tarifaFraccion;
    }

    public void setTarifaDiaria(double tarifaDiaria) {
        this.tarifaDiaria = tarifaDiaria;
    }

    public void setTiempoMinimo(double tiempoMinimo) {
        this.tiempoMinimo = tiempoMinimo;
    }

    public double getTarifaDiaria() {
        return tarifaDiaria;
    }

    public static double getTarifaFraccion() {
        return tarifaFraccion;
    }

    public double getTiempoMinimo() {
        return tiempoMinimo;
    }


}