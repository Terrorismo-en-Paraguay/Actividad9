package es.cifpcarlos3;

import es.cifpcarlos3.vo.ListaClientes;
import tools.jackson.databind.SerializationFeature;
import tools.jackson.dataformat.xml.XmlMapper;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Main {
    public static void main(String[] args) {
        var xmlMapper = XmlMapper.builder().enable(SerializationFeature.INDENT_OUTPUT).build();
        Path base = Path.of("src","main","java","es","cifpcarlos3","Actividad9");
        Path json = Path.of("clientes.xml");
        ListaClientes lista = null;
        try(FileInputStream fis = new FileInputStream(json.toFile())) {
            lista = xmlMapper.readValue(fis, ListaClientes.class);
        }catch (Exception ex){
            System.out.println("Error");
        }

        System.out.println(lista.toString());
    }
}