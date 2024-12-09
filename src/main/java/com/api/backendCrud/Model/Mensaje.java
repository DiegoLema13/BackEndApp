package com.api.backendCrud.Model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "Mensajes")
public class Mensaje {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "TEXTO")
    private String texto;

}
