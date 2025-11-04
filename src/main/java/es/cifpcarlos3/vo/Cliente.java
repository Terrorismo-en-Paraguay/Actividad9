package es.cifpcarlos3.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import tools.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import tools.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.List;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Cliente {
    @JacksonXmlProperty(isAttribute = true )
    private long id;
    private String nombre;
    @JacksonXmlElementWrapper(useWrapping = false)
    List<Sucursal> sucursales;
}
