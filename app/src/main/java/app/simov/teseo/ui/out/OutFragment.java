package app.simov.teseo.ui.out;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import app.simov.teseo.MainActivity;
import app.simov.teseo.R;
import app.simov.teseo.ui.home.HomeViewModel;

public class OutFragment extends Fragment {

    public OutFragment(){

    }


    private HomeViewModel homeViewModel;
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        //  FirebaseApp.initializeApp(getActivity());
        homeViewModel =
                new ViewModelProvider(this).get(HomeViewModel.class);
        View root = inflater.inflate(R.layout.fragment_out, container, false);




        Intent intentMain = new Intent(getActivity(), MainActivity.class);

        intentMain.putExtra("userOut","");
        intentMain.putExtra("passOut","");

        startActivity(intentMain);
        // Inflate the layout for this fragment
        return root;


    }
}