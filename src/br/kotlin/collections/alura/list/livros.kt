package br.kotlin.collections.alura.list

import Livro

val listaDeLivros: MutableList<Livro> = mutableListOf(
    Livro(
        "Vida Organizada",
        "Thais Godinho",
        2016,
        "Gente"
    ),
    Livro(
        "A arte de fazer acontecer",
        "David Allen",
        2016,
        "Sextante"
    ),
    Livro(
        "A Tríade do tempo",
        "Christian Barbosa",
        2018,
        "Buzz"
    ),
    Livro(
        "Transformação Pessoal",
        "Paulo Vieira",
        2015,
        "Gente"
    ),
    Livro(
        "Java como programar",
        "Paul Deitel",
        2016,
        "Moderna"
    ),
    Livro(
        "Do Mil ao Milhão",
        "Thiago Nigro",
        2018,
        "HarperCollins"
    ),
    Livro(
        "O Homem mais rico da Babilônia",
        "George S Clason",
        2017,
        "HarperCollins"
    ),
    Livro(
        "Mais esperto que o diabo",
        "Napoleon Hill",
        2014,
        "Citadel"
    ),
    Livro(
        "Me Poupe!",
        "Nathalia Arcuri",
        2020,
        "Sextante"
    )
)

val listaLivrosComNulos: MutableList<Livro?> = mutableListOf(
    null,
    Livro(
        "Vida Organizada",
        "Thais Godinho",
        2016,
        "Gente"
    ),
    null,
    Livro(
        "A arte de fazer acontecer",
        "David Allen",
        2016,
        "Sextante"
    ),
    Livro(
        "A Tríade do tempo",
        "Christian Barbosa",
        2018,
        "Buzz"
    ),
    Livro(
        "Transformação Pessoal",
        "Paulo Vieira",
        2015,
        "Gente"
    ),
    Livro(
        "Java como programar",
        "Paul Deitel",
        2016,
        "Moderna"
    ),
    null,
    Livro(
        "Do Mil ao Milhão",
        "Thiago Nigro",
        2018,
        "HarperCollins"
    ),
    Livro(
        "O Homem mais rico da Babilônia",
        "George S Clason",
        2017,
        "HarperCollins"
    ),
    Livro(
        "Mais esperto que o diabo",
        "Napoleon Hill",
        2014,
        "Citadel"
    ),
    Livro(
        "Me Poupe!",
        "Nathalia Arcuri",
        2020,
        "Sextante"
    )
)