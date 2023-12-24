package uz.example.mytestapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;


import com.google.android.material.card.MaterialCardView;
import com.google.android.material.dialog.MaterialAlertDialogBuilder;

public class MainActivity extends AppCompatActivity {

    MaterialCardView easycard,difficultcard,aboutcard;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        easycard = findViewById(R.id.easyCard);
        difficultcard = findViewById(R.id.difficultCard);
        aboutcard = findViewById(R.id.aboutCard);

        easycard.setOnClickListener(view -> {
            startActivity(new Intent(MainActivity.this,BasicQuiz.class));
            finish();
        });

        difficultcard.setOnClickListener(view -> {
            startActivity(new Intent(MainActivity.this,DifficultQuiz.class));
            finish();
        });
        aboutcard.setOnClickListener(view -> {
            startActivity(new Intent(MainActivity.this,AboutActuvity.class));
            finish();
        });
    }
    public void onBackPressed(){
        MaterialAlertDialogBuilder materialAlertDialogBuilder=new MaterialAlertDialogBuilder(MainActivity.this);
        materialAlertDialogBuilder.setTitle(R.string.app_name);
        materialAlertDialogBuilder.setMessage("Are you sure want to exit the app ?");
        materialAlertDialogBuilder.setNegativeButton(android.R.string.no, (dialogInterface, i) -> dialogInterface.dismiss());
        materialAlertDialogBuilder.setPositiveButton(android.R.string.yes, (dialogInterface, i) -> finish());
        materialAlertDialogBuilder.show();
    }
}