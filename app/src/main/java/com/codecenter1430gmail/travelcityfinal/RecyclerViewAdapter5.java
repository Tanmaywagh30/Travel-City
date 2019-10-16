package com.codecenter1430gmail.travelcityfinal;


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


public class RecyclerViewAdapter5 extends RecyclerView.Adapter<RecyclerViewAdapter5.ViewHolder> {


    private ArrayList<String> mNames = new ArrayList<>();
    private ArrayList<Integer> mImagepath = new ArrayList<>();
    private ArrayList<Bitmap> Transport = new ArrayList<>();
    private Context mcontext;

    public RecyclerViewAdapter5(Context mcontext, ArrayList<String> mNames, ArrayList<Integer> mImagepath,ArrayList<Bitmap> Transport) {
        this.mcontext = mcontext;
        this.mNames = mNames;
        this.mImagepath = mImagepath;
        this.Transport = Transport;
    }

    public RecyclerViewAdapter5()
    {

    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {


        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_listitem_transport,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, final int position) {

        //holder.image.setImageResource(mImagepath.get(position));
        holder.image.setImageBitmap(Transport.get(position));
        holder.txt.setText(mNames.get(position));


        holder.card5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i;
                i = new Intent(mcontext,Main4Activity.class);
                i.putExtra("image",mImagepath.get(position));
                i.putExtra("heading",mNames.get(position));
                i.putExtra("transportimage",mImagepath);
                i.putExtra("transportname",mNames);
                i.putExtra("index",5);
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
        CardView card5;

        public ViewHolder(View itemView) {
            super(itemView);
            image = (ImageView)itemView.findViewById(R.id.imageofplace5);
            txt =(TextView) itemView.findViewById(R.id.nameofplace5);

            card5 = (CardView)itemView.findViewById(R.id.cardview5);
        }
    }

}
