package vistas;

import java.io.File;
import java.io.FileOutputStream;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

import com.itextpdf.text.Document;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.Rectangle;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

public class GenerarPdf {
    public static void generarPdf() {
    	JFileChooser fileChooser = new JFileChooser();
    	fileChooser.setDialogTitle("Guardar PDF como...");

    	int opcion = fileChooser.showSaveDialog(null);

    	if (opcion == JFileChooser.APPROVE_OPTION) {
    	    File archivo = fileChooser.getSelectedFile();

    	    if (!archivo.getAbsolutePath().endsWith(".pdf")) {
    	        archivo = new File(archivo + ".pdf");
    	    }

    	    try {
    	        Document document = new Document();
    	        PdfWriter.getInstance(document, new FileOutputStream(archivo));
    	        document.open();

    	        // Imagen del logo
    	        String rutaImagen = "src/img/logo2.png";
    	        Image img = Image.getInstance(rutaImagen);
    	        img.scaleToFit(200, 200);
    	        img.setAlignment(Element.ALIGN_CENTER);
    	        document.add(img);

    	        // Fuentes
    	        Font titulo = FontFactory.getFont(FontFactory.HELVETICA_BOLD, 18);
    	        Font empresa = FontFactory.getFont(FontFactory.HELVETICA, 10);
    	        Font normal = FontFactory.getFont(FontFactory.HELVETICA, 9);
    	        Font negrita = FontFactory.getFont(FontFactory.HELVETICA_BOLD, 9);
    	        Font totalFont = FontFactory.getFont(FontFactory.HELVETICA_BOLD, 10);

    	        // datos del restaurante 
    	        Paragraph p = new Paragraph("PUNTO Y COMIDA", titulo);
    	        p.setAlignment(Element.ALIGN_CENTER);
    	        p.setSpacingAfter(10f);
    	        document.add(p);

    	        Paragraph rfc = new Paragraph("RFC: PCOM887609H7O", empresa);
    	        rfc.setAlignment(Element.ALIGN_CENTER);
    	        document.add(rfc);

    	        Paragraph direccion = new Paragraph("Calle Oro 2648, Col. Diana Laura.", empresa);
    	        direccion.setAlignment(Element.ALIGN_CENTER);
    	        document.add(direccion);

    	        Paragraph ciudad = new Paragraph("La Paz, Baja California Sur.", empresa);
    	        ciudad.setAlignment(Element.ALIGN_CENTER);
    	        document.add(ciudad);

    	        Paragraph telefono = new Paragraph("Tel: 612-130-2456", empresa);
    	        telefono.setAlignment(Element.ALIGN_CENTER);
    	        document.add(telefono);
    	      
    	        Paragraph div = new Paragraph("-------------------------------------------------------------------------------------------------------", negrita);
    	        div.setAlignment(Element.ALIGN_CENTER);
    	        document.add(div);
    	        
    	        // Datos del ticket 
    	        Paragraph fecha = new Paragraph("Fecha: 09/05/2025 - 07:00 pm", normal);
    	        fecha.setAlignment(Element.ALIGN_CENTER);
    	        document.add(fecha);

    	        Paragraph ticket = new Paragraph("Ticket No: 12935", normal);
    	        ticket.setAlignment(Element.ALIGN_CENTER);
    	        document.add(ticket);
    	        

    	        // Tabla con los productos comprados
    	        PdfPTable tabla = new PdfPTable(4);
    	        tabla.setWidthPercentage(90);
    	        tabla.setHorizontalAlignment(Element.ALIGN_CENTER);
    	        tabla.setSpacingBefore(10f);
    	        tabla.setSpacingAfter(10f);

    	        // nombre de las columnas de la tabla de productos comprados 
    	        PdfPCell c1 = new PdfPCell(new Phrase("Cantidad", negrita));
    	        c1.setBorder(Rectangle.NO_BORDER);
    	        tabla.addCell(c1);
    	        
    	        PdfPCell c2 = new PdfPCell(new Phrase("Código", negrita));
    	        c2.setBorder(Rectangle.NO_BORDER);
    	        tabla.addCell(c2);
    	        
    	        PdfPCell c3 = new PdfPCell(new Phrase("Descripción", negrita));
    	        c3.setBorder(Rectangle.NO_BORDER);
    	        tabla.addCell(c3);
    	        
    	        PdfPCell c4 = new PdfPCell(new Phrase("Precio", negrita));
    	        c4.setBorder(Rectangle.NO_BORDER);
    	        tabla.addCell(c4);
 

    	        // Productos solo puse esos fijos  como ejemplos 
    	        tabla.addCell(new PdfPCell(new Phrase("1", normal)));
    	        tabla.addCell(new PdfPCell(new Phrase("SKU09", normal)));
    	        tabla.addCell(new PdfPCell(new Phrase("Hamburguesa clásica", normal)));
    	        tabla.addCell(new PdfPCell(new Phrase("$150", normal)));

    	        tabla.addCell(new PdfPCell(new Phrase("2", normal)));
    	        tabla.addCell(new PdfPCell(new Phrase("SKU10", normal)));
    	        tabla.addCell(new PdfPCell(new Phrase("Papas fritas", normal)));
    	        tabla.addCell(new PdfPCell(new Phrase("$185", normal)));

    	        document.add(tabla);

    	        // subtotal, iva y total
    	        PdfPTable totales = new PdfPTable(2);
    	        totales.setWidthPercentage(90);
    	        totales.setHorizontalAlignment(Element.ALIGN_CENTER);
    	        totales.setSpacingBefore(10f);

    	        PdfPCell subTotalLabel = new PdfPCell(new Phrase("Subtotal", normal));
    	        subTotalLabel.setBorder(Rectangle.NO_BORDER);
    	        subTotalLabel.setHorizontalAlignment(Element.ALIGN_RIGHT);
    	        totales.addCell(subTotalLabel);

    	        PdfPCell subTotal = new PdfPCell(new Phrase("$335", normal));
    	        subTotal.setBorder(Rectangle.NO_BORDER);
    	        subTotal.setHorizontalAlignment(Element.ALIGN_RIGHT);
    	        totales.addCell(subTotal);

    	        PdfPCell ivaLabel = new PdfPCell(new Phrase("IVA", normal));
    	        ivaLabel.setBorder(Rectangle.NO_BORDER);
    	        ivaLabel.setHorizontalAlignment(Element.ALIGN_RIGHT);
    	        totales.addCell(ivaLabel);

    	        PdfPCell iva = new PdfPCell(new Phrase("$26", normal));
    	        iva.setBorder(Rectangle.NO_BORDER);
    	        iva.setHorizontalAlignment(Element.ALIGN_RIGHT);
    	        totales.addCell(iva);

    	        PdfPCell totalLabel = new PdfPCell(new Phrase("Total", totalFont));
    	        totalLabel.setBorder(Rectangle.NO_BORDER);
    	        totalLabel.setHorizontalAlignment(Element.ALIGN_RIGHT);
    	        totales.addCell(totalLabel);

    	        PdfPCell total = new PdfPCell(new Phrase("$361", totalFont));
    	        total.setBorder(Rectangle.NO_BORDER);
    	        total.setHorizontalAlignment(Element.ALIGN_RIGHT);
    	        totales.addCell(total);

    	        document.add(totales);

    	        document.close();

    	        JOptionPane.showMessageDialog(null, "PDF guardado con éxito");

    	    } catch (Exception e) {
    	        e.printStackTrace();
    	        JOptionPane.showMessageDialog(null, "Error al generar el PDF");
    	    }
    	}
    }
}
