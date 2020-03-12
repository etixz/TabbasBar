package eb.egonb.tabbasbar.fragments;


import android.content.SharedPreferences;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.preference.PreferenceManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

import eb.egonb.tabbasbar.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class OrderFragment extends Fragment {


    private View.OnClickListener orderListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(getContext());

            String locationKey = getResources().getString(R.string.pref_location);
            selectedLocation = prefs.getString(locationKey,"Dilbeek");
            Toast.makeText(getActivity(), "Order from " + selectedLocation + " confirmed", Toast.LENGTH_LONG).show();


        }
    };
    private String selectedLocation;

    public OrderFragment() {
        // Required empty public constructor
    }

    public static OrderFragment newInstance(){
        return new OrderFragment();
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_order, container, false);

        //extra voor David
        Spinner foodSpinner = rootView.findViewById(R.id.sp_foodstuff);
        String[] foods = {"Patatas Bravas", "Calamares", "Patatas Stoutas"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getContext(), android.R.layout.simple_dropdown_item_1line, foods);
        foodSpinner.setAdapter(adapter);

        Button orderButton  = rootView.findViewById(R.id.btn_order);
        orderButton.setOnClickListener(orderListener);

        return rootView;
    }
}
