package com.abc.lailachavez2;

import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.CardView;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.widget.TextView;
import android.content.Context;
import android.view.View;


public class ZombieRecyclerAdapter
    extends RecyclerView.Adapter<ZombieRecyclerAdapter.ViewHolder> {

        // Item click listener definitions
        private Listener listener;

        public void setListener(Listener listener) {
            this.listener = listener;
        }

        interface Listener {
            void onClick(int position);
        }

        private String[][] movies;

        public static class ViewHolder extends RecyclerView.ViewHolder {
            private CardView layout;

            public ViewHolder(CardView v) {
                super(v);
                layout = v;
            }
        }

    public ZombieRecyclerAdapter(String[][] movies) {
            this.movies = movies;
        }

        @Override
        public int getItemCount() {
            return movies.length;
        }

        @Override
        public ZombieRecyclerAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

            CardView cardView = (CardView) LayoutInflater.from(parent.getContext())
                    .inflate(R.layout.card_recyclerview_item, parent, false);
            return new ViewHolder(cardView);
        }

        @Override
        public void onBindViewHolder(ViewHolder holder, final int position) {

            CardView cardView = holder.layout;
            TextView title = (TextView)cardView.findViewById(R.id.title);
            TextView year = (TextView)cardView.findViewById(R.id.year);

            Context context = cardView.getContext();

            String[] movie = movies[position];
            title.setText(movie[0]);
            // This breaks from example code
            year.setText(movie[1]);

            cardView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (listener != null) {
                        listener.onClick(position);
                    }
                }
            });
        }
    }

