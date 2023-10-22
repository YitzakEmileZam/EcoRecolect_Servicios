package com.example.proyecto_ecorecolect_aedii.Desarrolladores;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.proyecto_ecorecolect_aedii.Entidades.Desarrolladores;
import com.example.proyecto_ecorecolect_aedii.Entidades.Servicios;
import com.example.proyecto_ecorecolect_aedii.R;

import java.sql.Date;
import java.util.ArrayList;

public class FragmentListaDesarrollador extends Fragment {
    ArrayList<Desarrolladores> listaDesarrolladores;
    ListView lstDesarrollador;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.lista_desarrollador,container,false);
        return rootView;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        lstDesarrollador = getView().findViewById(R.id.lstDesarrollador);
        listaDesarrolladores = new ArrayList<>();
        listaDesarrolladores.add(new Desarrolladores("99887766",R.drawable.michael ,"Michael","Gustavo","Orihuela ","michaelorihuela00@gmail.com","965 275 078","MASCULINO","Ingeniería de Computación y Sistemas"));
        listaDesarrolladores.add(new Desarrolladores("99887765",R.drawable.renzo,"Renzo Marlon","Huamán","Melgar","renzo_huaman2@usmp.pe","974 658 992","MASCULINO","Ingeniería de Computación y Sistemas"));
        listaDesarrolladores.add(new Desarrolladores("99887764",R.drawable.bryan,"Bryan Arnold","Valdivia","Pillaca","bryan2910arnold@gmail.com","958 526 643","MASCULINO","Ingeniería de Computación y Sistemas"));
        listaDesarrolladores.add(new Desarrolladores("99887763",R.drawable.pacha,"Mathías Marcelo","Cueto","Escobar","mathias_cueto@usmp.pe","973 597 929","MASCULINO","Ingeniería de Computación y Sistemas"));
        listaDesarrolladores.add(new Desarrolladores("99887762",R.drawable.thaine,"Thaine Alexander","Alarcon","Segovia","thaine_alarcon@usmp.pe","963 481 267","MASCULINO","Ingeniería de Computación y Sistemas"));
        listaDesarrolladores.add(new Desarrolladores("99887761",R.drawable.emile,"Yitzak Emile","Zamudio","Pacheco","yitzak_zamudio@usmp.pe","926 635 137","MASCULINO","Ingeniería de Computación y Sistemas"));

        ArrayList<String> nombres = new ArrayList<>();
        for(Desarrolladores p:listaDesarrolladores){
            nombres.add(p.getNombreDesarrollador());
        }
        ArrayAdapter<String> adapter = new ArrayAdapter<>(getActivity(),
                android.R.layout.simple_list_item_1,nombres);
        lstDesarrollador.setAdapter(adapter);


        lstDesarrollador.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                ((IDesarrollador)getActivity()).seleccionarDesarrollador(listaDesarrolladores.get(position));
            }
        });
    }
}
