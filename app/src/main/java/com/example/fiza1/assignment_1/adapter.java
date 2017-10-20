package com.example.fiza1.assignment_1;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;




public class adapter extends RecyclerView.Adapter<adapter.ViewHolder>{


    private List<String> values;


    public class ViewHolder extends RecyclerView.ViewHolder {
        // each data item is just a string in this case
        public TextView name;
        public TextView mob_num;
        public View layout;
       public Button call;


        public ViewHolder(View v) {
            super(v);
            layout = v;
            name = (TextView) v.findViewById(R.id.firstLine);
            mob_num = (TextView) v.findViewById(R.id.secondLine);
            call=(Button)v.findViewById(R.id.call);
        }
    }


    public adapter(List<String> myDataset) {
        values = myDataset;
    }

    public void onBindViewHolder(ViewHolder holder, final int position) {


        final String name = values.get(position);

                 holder.name.setText(name);
                 holder.mob_num.setText("mobile number ");

    }

    



        // Create new views (invoked by the layout manager)
    @Override
    public adapter.ViewHolder onCreateViewHolder(ViewGroup parent,
                                                 int viewType) {
        // create a new view
        LayoutInflater inflater = LayoutInflater.from(
                parent.getContext());
        View v =
                inflater.inflate(R.layout.file2, parent, false);

        ViewHolder vh = new ViewHolder(v);
        return vh;
    }




   // Return the size of your dataset (invoked by the layout manager)
    @Override
    public int getItemCount() {
        return values.size();
    }

}
