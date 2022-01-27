package com.estudio.spring.springExample.persistence.entity;


import lombok.Data;

import javax.persistence.*;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.List;

@Data
@Entity
@Table(name = "Compra")
public class Compra {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_compra")
    private Integer compra;
    @Column(name = "id_cliente")
    private String idCliente;
    private LocalDateTime fecha;
    @Column(name = "medio_pago")
    private String medioPago;
    private String comentario;
    private String estado;

    @ManyToOne
    @JoinColumn(name = "id_cliente", insertable = false, updatable = false)
    private Cliente cliente;

    @OneToMany(mappedBy = "producto")
    private List<ComprasProducto> productos;



}
