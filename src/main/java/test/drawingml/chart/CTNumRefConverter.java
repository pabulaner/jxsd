package test.drawingml.chart;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Duration;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import org.docx4j.dml.chart.*;
import test.drawingml.chart.*;
import test.drawingml.chart.CTNumRefModel.*;
import test.XMLSchema.*;
import org.docx4j.dml.*;
import test.drawingml.main.*;
import org.docx4j.dml.chartDrawing.*;
import test.drawingml.chartDrawing.*;
import test.officeDocument.relationships.*;

// SEQUENCE CONVERTER
public class CTNumRefConverter
{
	
	private CTNumRefConverter() {
		// empty
	}
	
	public static CTNumRefModel fromDocx4j(CTNumRef value)
	{
		return new CTNumRefModel(
		StringConverter.fromDocx4j(value.getF())
		,
		CTNumDataConverter.fromDocx4j(value.getNumCache())
		,
		CTExtensionListConverter.fromDocx4j(value.getExtLst())
		
		);
	}
}
