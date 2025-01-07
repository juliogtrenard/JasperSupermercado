package es.juliogtrenard.jaspersupermercado.controller;

import es.juliogtrenard.jaspersupermercado.db.DBConnect;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;

import java.io.InputStream;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

/**
 * Clase que maneja la ventana principal.
 */
public class SupermercadoController {
    /**
     * Secciones
     */
    @FXML
    private Button btnAgruparSecciones;

    /**
     * Grafico
     */
    @FXML
    private Button btnGraficoProductos;

    /**
     * Listar productos
     */
    @FXML
    private Button btnListarProductos;

    /**
     * Tabla de productos
     */
    @FXML
    private Button btnTablaProductos;

    /**
     * Agrupar secciones.
     *
     * @param event the event
     */
    @FXML
    void AccionAgruparSecciones(ActionEvent event) {
        try {
            DBConnect db=new DBConnect();
            InputStream reportStream =getClass().getResourceAsStream("/reports/AgruparSecciones.jasper");
            if (reportStream == null) {
                System.out.println("Archivo no encontrado");
            }

            JasperReport report = (JasperReport) JRLoader.loadObject(reportStream);
            Map<String, Object> parameters = new HashMap<>();
            parameters.put("IMAGE_PATH", db.getClass().getResource("/img/").toString());
            JasperPrint jprint = JasperFillManager.fillReport(report, parameters, db.getConnection());
            JasperViewer viewer = new JasperViewer(jprint, false);
            viewer.setVisible(true);
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (JRException e) {
            e.printStackTrace();
        }
    }

    /**
     * Gráfico de productos.
     *
     * @param event the event
     */
    @FXML
    void AccionGraficoProductos(ActionEvent event) {
        try {
            DBConnect db=new DBConnect();
            InputStream reportStream =getClass().getResourceAsStream("/reports/GraficoProductos.jasper");
            if (reportStream == null) {
                System.out.println("Archivo no encontrado");
            }
            JasperReport report = (JasperReport) JRLoader.loadObject(reportStream);
            Map<String, Object> parameters = new HashMap<>();
            parameters.put("IMAGE_PATH", db.getClass().getResource("/img/").toString());
            JasperPrint jprint = JasperFillManager.fillReport(report, parameters, db.getConnection());
            JasperViewer viewer = new JasperViewer(jprint, false);
            viewer.setVisible(true);
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (JRException e) {
            e.printStackTrace();
        }
    }

    /**
     * Listar productos.
     *
     * @param event the event
     */
    @FXML
    void AccionListarProductos(ActionEvent event) {
        try {
            DBConnect db=new DBConnect();
            InputStream reportStream =getClass().getResourceAsStream("/reports/ListaProducto.jasper");
            if (reportStream == null) {
                System.out.println("Archivo no encontrado");
            }
            JasperReport report = (JasperReport) JRLoader.loadObject(reportStream);
            Map<String, Object> parameters = new HashMap<>();
            parameters.put("IMAGE_PATH", db.getClass().getResource("/img/").toString());
            JasperPrint jprint = JasperFillManager.fillReport(report, parameters, db.getConnection());
            JasperViewer viewer = new JasperViewer(jprint, false);
            viewer.setVisible(true);
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (JRException e) {
            e.printStackTrace();
        }
    }

    /**
     * Tabla de productos.
     *
     * @param event the event
     */
    @FXML
    void AccionTablaProductos(ActionEvent event) {
        try {
            DBConnect db=new DBConnect();
            InputStream reportStream =getClass().getResourceAsStream("/reports/TablaProducto.jasper");
            if (reportStream == null) {
                System.out.println("Archivo no encontrado");
            }
            JasperReport report = (JasperReport) JRLoader.loadObject(reportStream);
            Map<String, Object> parameters = new HashMap<>();
            parameters.put("IMAGE_PATH", db.getClass().getResource("/img/").toString());
            JasperPrint jprint = JasperFillManager.fillReport(report, parameters, db.getConnection());
            JasperViewer viewer = new JasperViewer(jprint, false);
            viewer.setVisible(true);
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (JRException e) {
            e.printStackTrace();
        }
    }
}
