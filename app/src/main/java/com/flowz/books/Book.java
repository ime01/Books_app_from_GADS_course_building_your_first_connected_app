package com.flowz.books;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

import androidx.databinding.BindingAdapter;

public class Book implements Parcelable {

    public String id;
    public String title;
    public String Subtitle;
    public String  authors;
    public String publishers;
    public String publishedDate;
    public String description;
    public String thumbnaill;

    public Book(String id, String title, String subtitle, String[] authors, String publishers, String publishedDate, String description, String thumbnaill) {
        this.id = id;
        this.title = title;
        this.Subtitle = subtitle;
        this.authors = TextUtils.join(", ", authors);
        this.publishers = publishers;
        this.publishedDate = publishedDate;
        this.description = description;
        this.thumbnaill = thumbnaill;
    }

    public Book(Parcel in) {
        id = in.readString();
        title = in.readString();
        Subtitle = in.readString();
        authors = in.readString();
        publishers = in.readString();
        publishedDate = in.readString();
        description = in.readString();
        thumbnaill = in.readString();
    }

    public static final Creator<Book> CREATOR = new Creator<Book>() {
        @Override
        public Book createFromParcel(Parcel in) {
            return new Book(in);
        }

        @Override
        public Book[] newArray(int size) {
            return new Book[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(id);
        parcel.writeString(title);
        parcel.writeString(Subtitle);
        parcel.writeString(authors);
        parcel.writeString(publishers);
        parcel.writeString(publishedDate);
        parcel.writeString(description);
        parcel.writeString(thumbnaill);
    }

    @BindingAdapter({"android:imageUrl"})
    public static void loadImage (ImageView view, String imageUrl){

        if (!imageUrl.isEmpty()) {

            Picasso.with(view.getContext())
                    .load(imageUrl)
                    .placeholder(R.drawable.ic_recent_actors_black_24dp)
                    .into(view);
        }else {
            view.setBackgroundResource(R.drawable.ic_recent_actors_black_24dp);

        }


    }
}
