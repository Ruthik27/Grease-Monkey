package com.example.firebase01;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.firebase.ui.database.FirebaseRecyclerOptions;

public class myadapter extends FirebaseRecyclerAdapter<model,myadapter.myviewholder> {


    public myadapter(@NonNull FirebaseRecyclerOptions<model> options) {
        super(options);
    }

    @Override
    protected void onBindViewHolder(@NonNull myviewholder holder, int position, @NonNull final model model) {
        holder.emailtext.setText(model.getEmail());
        holder.nametext.setText(model.getName());
        holder.origintext.setText(model.getOrigin());
        Glide.with(holder.img1.getContext()).load(model.getPurl()).into(holder.img1);

                    holder.img1.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            AppCompatActivity activity = (AppCompatActivity)view.getContext();
                            activity.getSupportFragmentManager().beginTransaction().replace(R.id.wrapper,new dscfragment()).addToBackStack(null).commit();

                        }
                    });

    }

    @NonNull
    @Override
    public myviewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.singlerowdesign,parent,false);
        return new myviewholder(view);
    }

    public class myviewholder extends RecyclerView.ViewHolder {

        ImageView img1;
        TextView emailtext,nametext,origintext;

        public myviewholder(@NonNull View itemView) {
            super(itemView);

            img1=itemView.findViewById(R.id.img1);
            emailtext=itemView.findViewById(R.id.emailtext);
            nametext=itemView.findViewById(R.id.nametext);
            origintext=itemView.findViewById(R.id.origintext);
            emailtext=itemView.findViewById(R.id.emailtext);

        }
    }

}
