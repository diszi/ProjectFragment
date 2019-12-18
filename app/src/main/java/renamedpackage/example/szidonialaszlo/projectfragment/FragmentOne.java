package renamedpackage.example.szidonialaszlo.projectfragment;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;


/**
 * Created by szidonia.laszlo on 2017. 10. 27..
 */

public class FragmentOne extends Fragment {


    EditText editText;
    Button submit_btn;
    OnNameSetListener onNameSetListener;

        @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_one_layout,container,false);
        editText = (EditText) view.findViewById(R.id.nameText);
            submit_btn = (Button) view.findViewById(R.id.submitBtn);
            submit_btn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    String name = editText.getText().toString();
                    onNameSetListener.setName(name);
                }
            });

        return view;
    }

    public interface OnNameSetListener{
        public void setName(String name);
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        onNameSetListener = (OnNameSetListener)activity;


    }
}
