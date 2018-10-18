/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package progra.ii;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;
import org.jespxml.JespXML;
import org.jespxml.modelo.*;
/**
 *
 * @author Familia
 */
public class UsingXML {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Tag raiz = new Tag("Biblioteca");
        
        raiz.addAtributo(new Atributo("cantidad", "2"));
        raiz.addAtributo(new Atributo("Ubicación", "Costa Rica"));
        
        Tag libro = new Tag("libro");
        libro.addAtributo(new Atributo("paginas", "100"));
        
        Tag titulo;
        Tag autor;
        
        titulo = new Tag("titulo");
        autor  = new Tag("autor");
        
        titulo.addContenido("Libro acción 1");
        autor.addContenido("Autor ACTION");
        
        raiz.addComentario(new Comentario("Comentario de la biblioteca"));
        
        
        raiz.addTagHijo(libro);
        
        libro.addTagHijo(titulo);
        libro.addTagHijo(autor);
        
        JespXML xml = new JespXML(new File("biblioteca.xml"), Encoding.UTF_8);
        
        try {
            xml.escribirXML(raiz);
        } catch (ParserConfigurationException ex) {
            Logger.getLogger(UsingXML.class.getName()).log(Level.SEVERE, null, ex);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(UsingXML.class.getName()).log(Level.SEVERE, null, ex);
        } catch (TransformerException ex) {
            Logger.getLogger(UsingXML.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
    
}
