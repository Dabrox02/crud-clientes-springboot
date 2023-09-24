package com.training.crudcliente.persistences.documents;

import java.util.Date;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.format.annotation.DateTimeFormat;
import lombok.Data;

@Data
@Document(collection = "clientes")
public class ClienteDocument {
    private String id;
    private String nombre;
    private String apellido;
    private String email;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date createAt;
}