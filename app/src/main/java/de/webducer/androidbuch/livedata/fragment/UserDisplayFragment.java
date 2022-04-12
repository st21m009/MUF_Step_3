package de.webducer.androidbuch.livedata.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import de.webducer.androidbuch.livedata.R;
import de.webducer.androidbuch.livedata.viewmodel.UserViewModel;

public class UserDisplayFragment extends Fragment {

    private UserViewModel userViewModel;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        userViewModel = new ViewModelProvider(getActivity(), (ViewModelProvider.Factory) ViewModelProvider.AndroidViewModelFactory.getInstance(getActivity().getApplication())).get(UserViewModel.class);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_userdisplay, container, false);
        TextView email = v.findViewById(R.id.email_display);
        TextView name = v.findViewById(R.id.name_display);
        userViewModel.userInsterted().observe(getViewLifecycleOwner(), user -> {
            email.setText(user.getEmail());
            name.setText((user.getName()));
        });
        return v;
    }

}
