package com.SantiagoMartinez.AlgoritmoMutante;

public class Main {

    public static void main(String[] args) {

        AlgoritmoMutante.esMutante("ATGCGA", "CAGTGC","TTATGT", "AGAAGG", "CCCCTA", "TCACTG");
        AlgoritmoMutante.esMutante("ATGCGA", "CAGTGC","TTATTT", "AGACGG", "GCGTCA", "TCACTG");
        AlgoritmoMutante.esMutante("ATGCGA", "CAGTGC","TTATTT", "AGACGG", "GCGTCA", "CCCCTG");
        AlgoritmoMutante.esMutante("AAGCGA", "CAGTGC","TAATTT", "AAACGG", "GCGTCA", "CCCCTG");
        AlgoritmoMutante.esMutante("ACGCGA", "CAGTGC","TAATTT", "GTACGG", "GCGTCA", "ACCCTG");
        AlgoritmoMutante.esMutante("ACGCGA", "CAGTGC","TCATTT", "GTCCGG", "GCGCCA", "ACCCCG");

    }

}

