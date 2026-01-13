/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

        
package com.espe.software.principioid;

/**
 *
 * @author labesp
 */
public class PrincipioID {

    public static void main(String[] args) {
        
        GeneradorReportes reporteWord = new GeneradorReportesWord();
        GeneradorReportes reportePDF = new GeneradorReportesPDF();
        GeneradorReportes reporteExcel = new GeneradorReportesExcel();

        
        
        
        GeneradorDeReportes reportes = new GeneradorDeReportes(reporteWord);
        reportes.generarReporte();
        
        
        GeneradorDeReportes reportes1 = new GeneradorDeReportes(reportePDF);
        reportes1.generarReporte();
                
        GeneradorDeReportes reportes2 = new GeneradorDeReportes(reporteExcel);
        reportes2.generarReporte();
    }
}
