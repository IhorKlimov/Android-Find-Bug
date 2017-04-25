package com.myhexaville.findabug;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;
import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.Holder> {
    List<String > images;
    private Context context;

    public Adapter(Context context) {
        this.context = context;
        images = new ArrayList<>();
        images.add("http://www.curbfreewithcorylee.com/wp-content/uploads/2015/03/2-nyc-empire-nina-papiorek.jpg");
        images.add("https://socialmediaweek.org/newyork/files/2017/01/nyc-2.jpg");
        images.add("https://www.limoliner.com/images/site/new-york-city-sunrise.jpg");
        images.add("http://socialventurepartners.s3-us-west-2.amazonaws.com/www.socialventurepartners.org/sites/46/2013/05/Boston-Slider.jpg");
        images.add("https://www.bewisports.com/sites/default/files/images/xboston_expo_0.jpg.pagespeed.ic.6eH43Q_fNK.jpg");
        images.add("http://d56b293rhv8dp.cloudfront.net/locations/9/cover_images/original/shutterstock_95925931.jpg?1470842369");
        images.add("http://www.crewclassic.org/wp-content/uploads/2015/09/san-diego-skyline.jpg");
        images.add("http://media.istockphoto.com/photos/downtown-san-diego-skyline-picture-id615815192?k=6&m=615815192&s=170667a&w=0&h=WQvG7_W3iV5Q3Fk0ETsABxz8C9EWbLiuAuYtYxarQj0=");

    }

    @Override
    public Holder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.list_item, viewGroup, false);
        return new Holder(view);
    }

    @Override
    public void onBindViewHolder(Holder holder, int position) {
        String url = images.get(position);
        Glide.with(context)
                .load(url)
                .into(holder.imageView);
    }

    @Override
    public int getItemCount() {
        return images == null? 0 : images.size();
    }

    public class Holder extends RecyclerView.ViewHolder {
        ImageView imageView;
        public Holder(View itemView) {
            super(itemView);
            imageView = (ImageView) itemView;
        }
    }
}
