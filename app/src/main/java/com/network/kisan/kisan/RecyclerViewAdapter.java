package com.network.kisan.kisan;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder>{

    private static final String TAG = "RecyclerViewAdapter";
    private ArrayList<String> mContactName = new ArrayList<>();
    private Context mContext;

    public RecyclerViewAdapter(ArrayList<String> contactName, Context context){
        mContactName = contactName;
        mContext = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.pseudo_contact, viewGroup, false);
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
        viewHolder.contactName.setText(mContactName.get(i));
    }

    @Override
    public int getItemCount() {
        return mContactName.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        TextView contactName;
        RelativeLayout parentLayout;
        public ViewHolder(View itemView){
            super(itemView);
            contactName = itemView.findViewById(R.id.contact_name);
            parentLayout = itemView.findViewById(R.id.parent_layout);
        }
    }
}
