package es.cifpcarlos3.vo;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;
@Data
@AllArgsConstructor
public class ListaClientes {
    List<Cliente> clientes;
}
