package sg.edu.rp.c346.practicalquiz;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 16030820 on 16/7/2018.
 */
// Set extend from ArrayAdapter and create constructor matching super -> click second last
public class CustomAdapter extends ArrayAdapter{

    Context parent_context;
    int layout_id;
    ArrayList<FormulaItems> FormulaList;

    public CustomAdapter(@NonNull Context context, int resource, @NonNull ArrayList<FormulaItems> objects) {
        super(context, resource, objects);
        parent_context = context;
        layout_id = resource;
        FormulaList = objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        if(convertView == null) {
            LayoutInflater inflater = (LayoutInflater) parent_context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(layout_id, parent, false);
        }
        TextView tvName = convertView.findViewById(R.id.textViewName);
        TextView tvDesc = convertView.findViewById(R.id.textViewDesc);
        TextView tvType = convertView.findViewById(R.id.textViewType);

        FormulaItems currentItem = FormulaList.get(position);
        String name = currentItem.getName();
        String desc = currentItem.getDesc();
        String type = currentItem.getType();
        tvName.setText(name);
        tvDesc.setText(desc);
        tvType.setText(type);

        return  convertView;
    }
}
