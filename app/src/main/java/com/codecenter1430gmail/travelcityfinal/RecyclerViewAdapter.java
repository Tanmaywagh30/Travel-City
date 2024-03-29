package com.codecenter1430gmail.travelcityfinal;

import android.widget.ImageView;


        import android.content.Context;
        import android.content.Intent;
        import android.graphics.Bitmap;
        import android.support.v7.widget.CardView;
        import android.support.v7.widget.RecyclerView;
        import android.view.LayoutInflater;
        import android.view.View;
        import android.view.ViewGroup;
        import android.widget.ImageView;
        import android.widget.TextView;
        import android.widget.Toast;

        import java.util.ArrayList;


public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {

    Intent i;

    public ArrayList<String> mNames = new ArrayList<>();
    public ArrayList<Integer> mImagepath = new ArrayList<>();
    public ArrayList<Bitmap> Places = new ArrayList<>();
    private Context mcontext;

    public RecyclerViewAdapter(Context mcontext, ArrayList<String> mNames, ArrayList<Integer> mImagepath, ArrayList<Bitmap> Places) {
        this.mcontext = mcontext;
        this.mNames = mNames;
        this.mImagepath = mImagepath;
        this.Places = Places;
    }
    public RecyclerViewAdapter()
    {

    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {


        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_listitem,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, final int position) {

        holder.image.setImageBitmap(Places.get(position));


        holder.txt.setText(mNames.get(position));

        holder.card.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i = new Intent(mcontext,Main4Activity.class);
                i.putExtra("image",mImagepath.get(position));
                i.putExtra("heading",mNames.get(position));
                i.putExtra("imagelist",mImagepath);
                i.putExtra("namelist",mNames);
                i.putExtra("index",1);
                mcontext.startActivity(i);
            }
        });

    }

    @Override
    public int getItemCount() {
        return mImagepath.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder
    {

        ImageView image;
        TextView txt;
        CardView card;

        public ViewHolder(View itemView) {
            super(itemView);
            image = (ImageView)itemView.findViewById(R.id.imageofplace);
            txt =(TextView) itemView.findViewById(R.id.nameofplace);
            card = (CardView)itemView.findViewById(R.id.cardview);

        }
    }

}
