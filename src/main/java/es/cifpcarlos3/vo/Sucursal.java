package es.cifpcarlos3.vo;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Sucursal {
    private String calle;
    private String ciudad;
    private String provincia;
    private int cp;
}
