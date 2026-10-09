package com.aula.muralfilmes.model;

import com.google.firebase.firestore.DocumentId;
import com.google.firebase.firestore.ServerTimestamp;

import java.util.Date;

public class Filme {
    //ATENÇÃO: liberar comentario apos implementar o firebase

    @DocumentId
    private String id;

    private String titulo;
    private String genero;
    private String indicadoPor;
    private long votos;

    //ATENÇÃO: liberar comentario apos implementar o firebase
    @ServerTimestamp
    private Date criadoEm;


}
