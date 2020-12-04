package com.example.firebase01;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.firebase.ui.database.FirebaseRecyclerOptions;

public class myadapter2 extends FirebaseRecyclerAdapter<model2,myadapter2.myviewholder2> {


    public myadapter2(@NonNull FirebaseRecyclerOptions<model2> options) {
        super(options);
    }

    @Override
    protected void onBindViewHolder(@NonNull myviewholder2 holder, int position, @NonNull final model2 model) {
    holder.detailstext.setText(model.getDetails());
    holder.detailstext.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            AppCompatActivity activity = (AppCompatActivity)v.getContext();
            activity.getSupportFragmentManager().beginTransaction().replace(R.id.wrapper,new infofragment()).addToBackStack(null).commit();
        }
    });
    }

    @NonNull
    @Override
    public myviewholder2 onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.singleroedesign2,parent,false);
        return new myviewholder2(view);
    }

    public class myviewholder2 extends RecyclerView.ViewHolder{

        TextView detailstext;

        public myviewholder2(@NonNull View itemView) {
            super(itemView);

            detailstext=itemView.findViewById(R.id.detailstext);
        }
    }

}
