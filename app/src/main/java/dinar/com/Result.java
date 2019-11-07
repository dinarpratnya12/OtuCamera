package dinar.com;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Result extends AppCompatActivity {

    public static final String EXTRA_RESULT = "extra_image_result";

    ImageView imageResult;
    Button btnKembali;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        imageResult = findViewById(R.id.imageView);
        btnKembali = findViewById(R.id.btnKembali);

        if(getIntent().hasExtra(EXTRA_RESULT)){
            Bitmap bitmap = getIntent().getParcelableExtra(EXTRA_RESULT);
            imageResult.setImageBitmap(bitmap);
        }

        btnKembali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(i);
            }
        });
    }
}
