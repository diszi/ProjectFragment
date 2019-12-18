package renamedpackage.example.szidonialaszlo.projectfragment;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by szidonia.laszlo on 2017. 10. 27..
 */

public class FragmentTwo extends Fragment{

    TextView getName;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_two_layout,container,false);
        getName = (TextView) view.findViewById(R.id.getText);


        return view;
    }

    public  void updateText(String name){
        getName.setText("Hello "+name);


    }
}
