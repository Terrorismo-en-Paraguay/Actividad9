package es.cifpcarlos3;

import es.cifpcarlos3.vo.ListaClientes;
import tools.jackson.databind.SerializationFeature;
import tools.jackson.dataformat.xml.XmlMapper;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Main {
    public static void main(String[] args) {
        var xmlMapper = XmlMapper.builder().build();
        Path base = Path.of("src","main","java","es","cifpcarlos3");
        //No funciona el base en general
        Path json = base.resolve("clientes.xml");
        ListaClientes lista = null;
        try(var fis = new FileInputStream(json.toFile())) {
            lista = xmlMapper.readValue(fis, ListaClientes.class);
        }catch (Exception ex){//Sale que no tiene constructor
            System.out.println("Error "+ ex.getMessage());
        }

        System.out.println(lista.toString());
    }
}