package sg.edu.rp.c346.practicalquiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvFormula;
    ArrayList<FormulaItems> alFormula;
    CustomAdapter caFormula;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvFormula = findViewById(R.id.listViewFormula);

        alFormula = new ArrayList<>();

        FormulaItems f1 = new FormulaItems("Area of rectangle", "Length x Length", "Formula type is: Area");
        FormulaItems f2 = new FormulaItems("Area of triangle", "(Length of base x Length)/2", "Formula type is: Area");
        FormulaItems f3 = new FormulaItems("Area of cube", "Length x Length x Length", "Formula type is: Volume");

        alFormula.add(f1);
        alFormula.add(f2);
        alFormula.add(f3);

        caFormula = new CustomAdapter(this, R.layout.formula_items, alFormula);

        lvFormula.setAdapter(caFormula);

    }
}
