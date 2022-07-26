package com.example.calculate;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.example.calculate.data.Info;
import com.example.calculate.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.confirm.setOnClickListener(v->{
            Intent i = new Intent(this, ResultActivity.class);
            Bundle bundle = new Bundle();
            Info info = new Info();
            info.setTest("123456");
            bundle.putParcelable("info", info);
            i.putExtra("data", bundle);
            startActivity(i);
        });

    }
}