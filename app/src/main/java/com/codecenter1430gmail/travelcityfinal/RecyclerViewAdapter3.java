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


public class RecyclerViewAdapter3 extends RecyclerView.Adapter<RecyclerViewAdapter3.ViewHolder> {


    private ArrayList<String> mNames = new ArrayList<>();
    private ArrayList<Integer> mImagepath = new ArrayList<>();
    private ArrayList<Bitmap> Shopping = new ArrayList<>();
    private Context mcontext;

    public RecyclerViewAdapter3(Context mcontext, ArrayList<String> mNames, ArrayList<Integer> mImagepath,ArrayList<Bitmap> Shopping) {
        this.mcontext = mcontext;
        this.mNames = mNames;
        this.mImagepath = mImagepath;
        this.Shopping = Shopping;
    }

    public RecyclerViewAdapter3()
    {

    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {


        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_listitem_shopping,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, final int position) {

        //holder.image.setImageResource(mImagepath.get(position));
        holder.image.setImageBitmap(Shopping.get(position));
        holder.txt.setText(mNames.get(position));


        holder.card3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i;
                i = new Intent(mcontext,Main4Activity.class);
                i.putExtra("image",mImagepath.get(position));
                i.putExtra("heading",mNames.get(position));
                i.putExtra("shopimage",mImagepath);
                i.putExtra("shopname",mNames);
                i.putExtra("index",3);
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
        CardView card3;

        public ViewHolder(View itemView) {
            super(itemView);
            image = (ImageView)itemView.findViewById(R.id.imageofplace3);
            txt =(TextView) itemView.findViewById(R.id.nameofplace3);
            card3 = (CardView)itemView.findViewById(R.id.cardview3);

        }
    }

}
