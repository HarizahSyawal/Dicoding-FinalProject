package com.example.dicoding;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    RecyclerView mRecyclerView;
    MyAdapter myAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Toolbar toolbar1 = findViewById(R.id.toolbar);
        toolbar.setOnClickListener(this);

        mRecyclerView = findViewById(R.id.recyclerView);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));

        myAdapter = new MyAdapter(this, getMyList());
        mRecyclerView.setAdapter(myAdapter);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.action_user) {

            Intent moveIntent = new Intent(MainActivity.this, activity_profile.class);
            startActivity(moveIntent);

            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.toolbar:
                break;
        }
    }
    private ArrayList<Model> getMyList(){

        ArrayList<Model> models = new ArrayList<>();

        Model m = new Model();
        m.setTitle("VSCode");
        m.setDescription("Visual Studio Code adalah editor kode sumber yang dikembangkan oleh Microsoft untuk Windows, Linux dan macOS. Ini termasuk dukungan untuk debugging, kontrol Git yang tertanam dan GitHub, penyorotan sintaksis, penyelesaian kode cerdas, cuplikan, dan refactoring kode.");
        m.setImg(R.drawable.a);
        models.add(m);

        m = new Model();
        m.setTitle("Python");
        m.setDescription("Python adalah bahasa pemrograman interpretatif multiguna dengan filosofi perancangan yang berfokus pada tingkat keterbacaan kode.");
        m.setImg(R.drawable.b);
        models.add(m);

        m = new Model();
        m.setTitle("Java");
        m.setDescription("Java adalah bahasa pemrograman yang dapat dijalankan di berbagai komputer termasuk telepon genggam. Bahasa ini awalnya dibuat oleh James Gosling saat masih bergabung di Sun Microsystems saat ini merupakan bagian dari Oracle dan dirilis tahun 1995.");
        m.setImg(R.drawable.c);
        models.add(m);

        m = new Model();
        m.setTitle("C++");
        m.setDescription("C++ adalah bahasa pemrograman komputer yang di buat oleh Bjarne Stroustrup, yang merupakan perkembangan dari bahasa C dikembangkan di Bong Labs (Dennis Ritchie) pada awal tahun 1970-an, Bahasa itu diturunkan dari bahasa sebelumnya, yaitu B, Pada awalnya, bahasa tersebut dirancang sebagai bahasa pemrograman yang dijalankan pada sistem Unix, Pada perkembangannya, versi ANSI (American National Standart Institute) Bahasa pemrograman C menjadi versi dominan, Meskipun versi tersebut sekarang jarang dipakai dalam pengembangan sistem dan jaringan maupun untuk sistem embedded, Bjarne Stroustrup pada Bel labs pertama kali mengembangkan C++ pada awal 1980-an.");
        m.setImg(R.drawable.d);
        models.add(m);

        m = new Model();
        m.setTitle("Golang");
        m.setDescription("Go adalah bahasa pemrograman yang dibuat di Google pada tahun 2009 oleh Robert Griesemer, Rob Pike, dan Ken Thompson. Golang adalah bahasa pemrograman yang dihimpun dan diketik dalam bahasa C, dengan fitur pengumpulan sampah, penulisan terstruktur, keamanan memori, dan pemrograman yang konkuren serta berururtan.");
        m.setImg(R.drawable.e);
        models.add(m);

        m = new Model();
        m.setTitle("GitHub");
        m.setDescription("GitHub adalah layanan penginangan web bersama untuk proyek pengembangan perangkat lunak yang menggunakan sistem pengontrol versi Git dan layanan hosting internet. Hal ini banyak digunakan untuk kode komputer.");
        m.setImg(R.drawable.f);
        models.add(m);

        m = new Model();
        m.setTitle("Oracle");
        m.setDescription("Basis data Oracle adalah basis data relasional yang terdiri dari kumpulan data dalam suatu sistem manajemen basis data RDBMS.");
        m.setImg(R.drawable.g);
        models.add(m);

        m = new Model();
        m.setTitle("Kotlin");
        m.setDescription("Kotlin adalah sebuah bahasa pemrograman dengan pengetikan statis yang berjalan pada Mesin Virtual Java ataupun menggunakan kompiler LLVM yang dapat pula dikompilasikan kedalam bentuk kode sumber JavaScript. Pengembang utamanya berasal dari tim programer dari JetBrains yang bermarkas di Rusia.");
        m.setImg(R.drawable.h);
        models.add(m);

        m = new Model();
        m.setTitle("HTML");
        m.setDescription("Hypertext Markup Language adalah sebuah bahasa markah yang digunakan untuk membuat sebuah halaman web, menampilkan berbagai informasi di dalam sebuah penjelajah web Internet dan pemformatan hiperteks sederhana yang ditulis dalam berkas format ASCII agar dapat menghasilkan tampilan wujud yang terintegerasi.");
        m.setImg(R.drawable.i);
        models.add(m);

        m = new Model();
        m.setTitle("React Js");
        m.setDescription("Bereaksi adalah perpustakaan JavaScript untuk membangun antarmuka pengguna. Itu dikelola oleh Facebook dan komunitas pengembang dan perusahaan individu.");
        m.setImg(R.drawable.j);
        models.add(m);

        return models;
    }
}
