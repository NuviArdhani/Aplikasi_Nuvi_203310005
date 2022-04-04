package com.example.aplikasi_nuvi.data

import com.example.aplikasi_nuvi.R
import com.example.aplikasi_nuvi.model.Aplikasi_Nuvi

class Datasource() {

    fun loadAffirmations(): List<Aplikasi_Nuvi> {
        return listOf<Aplikasi_Nuvi>(
            Aplikasi_Nuvi(R.string.affirmation1, R.drawable.image1),
            Aplikasi_Nuvi(R.string.affirmation2, R.drawable.image2),
            Aplikasi_Nuvi(R.string.affirmation3, R.drawable.image3),
            Aplikasi_Nuvi(R.string.affirmation4, R.drawable.image4),
            Aplikasi_Nuvi(R.string.affirmation5, R.drawable.image5),
            Aplikasi_Nuvi(R.string.affirmation6, R.drawable.image6),
            Aplikasi_Nuvi(R.string.affirmation7, R.drawable.image7),
            Aplikasi_Nuvi(R.string.affirmation8, R.drawable.image8),
            Aplikasi_Nuvi(R.string.affirmation9, R.drawable.image9),
            Aplikasi_Nuvi(R.string.affirmation10, R.drawable.image10)
        )
    }
}
