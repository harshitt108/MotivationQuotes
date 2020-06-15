package com.example.motivationquotes;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class QuoteAdapter extends RecyclerView.Adapter<QuoteAdapter.QuoteViewHolder> {

    List<String> quotes = null;
    Context context;

    public QuoteAdapter(List <String> quotes , Context context) {
        this.quotes = quotes;
        this.context = context;
    }

    @NonNull
    @Override
    public QuoteViewHolder onCreateViewHolder(@NonNull ViewGroup parent , int viewType) {

        LayoutInflater inflater = LayoutInflater.from(parent.getContext ());
        View view = inflater.inflate ( R.layout.list_item_quote,parent,false );
        return new QuoteViewHolder ( view );

    }

    @Override
    public void onBindViewHolder(@NonNull QuoteViewHolder holder , int position) {
        String quote = quotes.get(position);
        holder.textQuote.setText ( quote);

    }


    @Override
    public int getItemCount() {
        return quotes.size ();
    }

    public class QuoteViewHolder extends RecyclerView.ViewHolder {

        TextView textQuote;
        LinearLayout quoteContainer;


        public QuoteViewHolder(@NonNull View itemView) {
            super ( itemView );

            textQuote = itemView.findViewById ( R.id.textQuote );
            quoteContainer =itemView.findViewById ( R.id.quoteContainer );

        }
    }

}
