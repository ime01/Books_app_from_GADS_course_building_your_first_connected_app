package com.flowz.books;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;

import com.flowz.books.databinding.ActivityBookDetailBinding;

public class BookDetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_book_detail);
        Book book = getIntent().getParcelableExtra("Book");

        ActivityBookDetailBinding bookDetailBinding = DataBindingUtil.setContentView(this, R.layout.activity_book_detail);

        bookDetailBinding.setMyBook(book);

//        bookDetailBinding.tvTilte.setText(book.title);
//        bookDetailBinding.tvSubTitle.setText(book.Subtitle);
//        bookDetailBinding.tvAuthor.setText(book.authors);
//        bookDetailBinding.tvPublisher.setText(book.publishers);
//        bookDetailBinding.tvPublishedDate.setText(book.publishedDate);
//        bookDetailBinding.tvDescription.setText(book.description);

    }
}
