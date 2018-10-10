package com.example.jeansfrancisco.pi_iv;


import android.os.Bundle;

import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


/**
 * A simple {@link Fragment} subclass.
 */
public class FragLogin extends Fragment {


    public FragLogin() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_frag_login, container, false);

        Button btnCadastro = (Button) v.findViewById(R.id.btnCadastro);

        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        };

        FragCadastro fc = new FragCadastro();

        getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.moldura,fc).commit();

        return v;
    }

}
