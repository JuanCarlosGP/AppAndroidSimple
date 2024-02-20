package com.example.juancarlos2;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link martes#newInstance} factory method to
 * create an instance of this fragment.
 */
public class martes extends Fragment {

    public martes() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View root = inflater.inflate(R.layout.fragment_blank, container, false);

        // Configurar OnClickListener para el botón "Volver"
        Button buttonvolver = root.findViewById(R.id.buttonvolverm);
        buttonvolver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Navegar al fragmento GalleryFragment
                Navigation.findNavController(v).navigate(R.id.resumen);
            }
        });

        return root;
    }
}
