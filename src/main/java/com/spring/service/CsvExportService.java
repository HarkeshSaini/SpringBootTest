//package com.spring.service;
//
//import java.io.IOException;
//import java.io.Writer;
//import java.lang.System.Logger;
//import java.util.List;
//
//import org.apache.commons.csv.CSVFormat;
//import org.apache.commons.csv.CSVPrinter;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import com.spring.entity.BlogDetail;
//import com.spring.object.BlogDetails;
//import com.spring.repository.BlogDetailRepository;
//
//@Service
//public class CsvExportService {
//
//	private static final Logger log = getLogger(CsvExportService.class);
//
//	@Autowired
//	public BlogDetailRepository blogDetailRepository;
//
//	public CsvExportService(BlogDetailRepository blogDetailRepository) {
//		this.blogDetailRepository = blogDetailRepository;
//	}
//
//	public void writeEmployeesToCsv(Writer writer) {
//
//		List<BlogDetail> details = blogDetailRepository.findAll();
//		try (CSVPrinter csvPrinter = new CSVPrinter(writer, CSVFormat.DEFAULT)) {
//			csvPrinter.printRecord("ID", "First Name", "Last Name", "Email", "Department");
//			for (BlogDetail detail : details) {
//				csvPrinter.printRecord(detail.getId(), detail.getContent(), detail.getDescription(),
//						detail.getHeading(), detail.getKeywords());
//			}
//		} catch (IOException e) {
//			log.error("Error While writing CSV ", e);
//		}
//	}
//}