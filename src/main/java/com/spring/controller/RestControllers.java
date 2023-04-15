//package com.spring.controller;
// 
//import java.io.IOException;
//
//import javax.servlet.http.HttpServletResponse;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.spring.object.BlogDetails;
//import com.spring.service.CsvExportService;
//
//@RestController
//public class RestControllers {
//
//	@Autowired
//	private CsvExportService csvExportService;
//
//    public void BlogDetails(CsvExportService csvExportService) {
//        this.csvExportService = csvExportService;
//    }
//
//    @RequestMapping(path = "/pdfConvert")
//    public void getAllEmployeesInCsv(HttpServletResponse servletResponse) throws IOException {
//        servletResponse.setContentType("text/csv");
//        servletResponse.addHeader("Content-Disposition","attachment; filename=\"employees.csv\"");
//        csvExportService.writeEmployeesToCsv(servletResponse.getWriter());
//    }
//	
//}
