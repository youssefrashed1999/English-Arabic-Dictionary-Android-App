package com.example.dictionary;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class DictionaryAdapter extends RecyclerView.Adapter<DictionaryAdapter.DictionaryViewHolder> {
    private ArrayList<Dictionary> dictionaryItems;
    public DictionaryAdapter(ArrayList<Dictionary> dictionaryItems)
    {

        this.dictionaryItems=dictionaryItems;
    }

    @NonNull
    @Override
    public DictionaryViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.dictionary_element,parent,false);
        DictionaryViewHolder holder=new DictionaryViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull DictionaryViewHolder holder, int position) {
        Dictionary dictionaryElement=dictionaryItems.get(position);
        holder.englishWord.setText(dictionaryElement.getEnglishWordID());
        holder.arabicWord.setText(dictionaryElement.getArabicWordID());
        if(dictionaryElement.getImageID()!=0)
            holder.imageWord.setImageResource(dictionaryElement.getImageID());
        //holder.constraintLayoutElement.setBackgroundColor(dictionaryElement.getBackgroundColorID());
    }

    @Override
    public int getItemCount() {
        return dictionaryItems.size();
    }

    class DictionaryViewHolder extends RecyclerView.ViewHolder{
        TextView englishWord,arabicWord;
        ImageView imageWord;
        ConstraintLayout constraintLayoutElement;
        public DictionaryViewHolder(@NonNull View itemView) {
            super(itemView);
            englishWord=itemView.findViewById(R.id.text_view_dictionary_element_english);
            arabicWord=itemView.findViewById(R.id.text_view_dictionary_element_arabic);
            imageWord=itemView.findViewById(R.id.image_view_dictionary_element);
            if(dictionaryItems.get(0).getImageID() == 0)
                imageWord.setVisibility(View.GONE);
            else
                imageWord.setVisibility(View.VISIBLE);
            itemView.setBackgroundResource(dictionaryItems.get(0).getBackgroundColorID());
        }
    }
}
