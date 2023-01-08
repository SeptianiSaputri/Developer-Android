package id.ac.poliban.mi.va.septi.homework_042;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private String message = "Toppings: ";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if (getSupportActionBar() != null) getSupportActionBar().setTitle("Checkboxes and etc_028/04.3");
    }

    public void toastMessage(View view) {
        selectToppings((CheckBox) findViewById(R.id.check_syrup), "Chocolate syrup");
        selectToppings((CheckBox) findViewById(R.id.check_sprinkles), getString(R.string.sprinkles));
        selectToppings((CheckBox) findViewById(R.id.check_crushed_nuts), getString(R.string.crushed_nuts));
        selectToppings((CheckBox) findViewById(R.id.check_cherries), getString(R.string.cherries));
        selectToppings((CheckBox) findViewById(R.id.check_oreo), "Oreo cookie crumbles");
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }

    private void selectToppings(CheckBox checkBox, String topping) {
        if (checkBox.isChecked()){
            if (!message.contains(topping)){
                message = message + " " + topping;
            }
        }
        else{
            if (message.contains(topping)){
                message = message.replace(" " + topping, "");
            }
        }
    }
}