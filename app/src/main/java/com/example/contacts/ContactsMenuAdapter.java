package com.example.contacts;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ContactsMenuAdapter extends  RecyclerView.Adapter<ContactsMenuAdapter.ContactsItemViewHolder> {
    public ContactsMenuAdapter(List<ContanctsItem> contanctsItemsList) {
        this.contanctsItemsList = contanctsItemsList;
    }

    List<ContanctsItem> contanctsItemsList;

    @NonNull
    @Override
    public ContactsItemViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.contact_item_layout,parent, false);
        return new ContactsItemViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ContactsItemViewHolder holder, int position) {

       ContanctsItem item= contanctsItemsList.get(position);
       holder.phoneNumber.setText(item.getPhoneNumber());
        holder.name.setText(item.getName());
    }

    @Override
    public int getItemCount() {
        return contanctsItemsList.size();
    }


    public  class  ContactsItemViewHolder extends  RecyclerView.ViewHolder{

             TextView name;
             TextView phoneNumber;


        public ContactsItemViewHolder(@NonNull View itemView) {
            super(itemView);
            name=itemView.findViewById(R.id.name_id);
            phoneNumber=itemView.findViewById(R.id.phone_id);
        }
    }

}
