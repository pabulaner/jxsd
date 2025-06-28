package test.drawingml.main;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Duration;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import org.docx4j.dml.chart.*;
import test.drawingml.main.CTCustomColorListModel.*;
import test.drawingml.chart.*;
import test.XMLSchema.*;
import org.docx4j.dml.*;
import test.drawingml.main.*;
import org.docx4j.dml.chartDrawing.*;
import test.drawingml.chartDrawing.*;
import test.officeDocument.relationships.*;

// SEQUENCE MODEL
public class CTCustomColorListModel
{
	
	private final List<CTCustomColorModel> custClr;
	
	public CTCustomColorListModel(List<CTCustomColorModel> custClr) {
		this.custClr = custClr;
	}
	
	public List<CTCustomColorModel> getCustClr() {
		return this.custClr;
	}
}
