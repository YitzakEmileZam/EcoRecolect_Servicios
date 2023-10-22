package com.example.proyecto_ecorecolect_aedii.Actividades;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.example.proyecto_ecorecolect_aedii.FragmentsMuestra.HomeMuestraFragment;
import com.example.proyecto_ecorecolect_aedii.FragmentsMuestra.MisionMuestraFragment;
import com.example.proyecto_ecorecolect_aedii.FragmentsMuestra.NosotrosMuestraFragment;
import com.example.proyecto_ecorecolect_aedii.FragmentsMuestra.VisionMuestraFragment;
import com.example.proyecto_ecorecolect_aedii.Outlook_Email.EmailTask;
import com.example.proyecto_ecorecolect_aedii.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.navigation.NavigationBarView;
import com.google.android.material.navigation.NavigationView;

public class ActIniciarSesion extends AppCompatActivity  {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lyt_iniciar_ses_cliente);
    }

    /* ESTE METODO SIRVE PARA PASAR DE UNA ACTIVIDAD A OTRA  */
    public void registrarmeOnClick(View view) {
        Intent intent = new Intent(this, ActRegistrarCliente.class);
        startActivity(intent);
    }

    /* ESTE METODO SIRVE PARA PASAR DE UNA ACTIVIDAD A OTRA  */
    public void irAloginAdministradores(View view){
        Intent intent = new Intent(this, ActIniciarSesionAdmin.class);
        startActivity(intent);
    }


}