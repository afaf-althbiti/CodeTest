package com.example.alroo7.codetest;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Afaf on 2/16/17.
 */

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {

    private List<ListItem> listItems;
    private Context  context;

    public MyAdapter(List<ListItem> listItems, Context context) {
        this.listItems = listItems;
        this.context = context;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v= LayoutInflater.from(parent.getContext())
                .inflate(R.layout.list_item,parent,false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        ListItem listItem=listItems.get(position);

        holder.textViewHead.setText(listItem.getHead());
        holder.textViewCity.setText(listItem.getCitys());
        holder.textViewDesc.setText(listItem.getDesc());
/**
 * حسب الاي دي الموجود وبالترتيب ايضا
 * لصوره استخدم picasso
 */

    }

    @Override
    public int getItemCount() {
        return listItems.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

            public  TextView textViewHead;
            public  TextView textViewCity;
            public TextView textViewDesc;
        /**
         * نضيف حسب الاي دي والترتيب الظاهر .
         */

        public ViewHolder(View itemView) {
            super(itemView);

            textViewHead= (TextView) itemView.findViewById(R.id.textViewHead);
            textViewCity = (TextView) itemView.findViewById(R.id.textViewCity) ;
            textViewDesc= (TextView) itemView.findViewById(R.id.textViewDesc);


        }

    }
}
