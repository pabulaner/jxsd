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
import test.XMLSchema.*;
import org.docx4j.dml.*;
import test.drawingml.main.*;
import org.docx4j.dml.chartDrawing.*;
import test.drawingml.chartDrawing.*;
import test.drawingml.chart.CTMultiLvlStrRefModel.*;
import test.officeDocument.relationships.*;

// SEQUENCE CONVERTER
public class CTMultiLvlStrRefConverter
{
	
	private CTMultiLvlStrRefConverter() {
		// empty
	}
	
	public static CTMultiLvlStrRefModel fromDocx4j(CTMultiLvlStrRef value)
	{
		return new CTMultiLvlStrRefModel(
		StringConverter.fromDocx4j(value.getF())
		,
		CTMultiLvlStrDataConverter.fromDocx4j(value.getMultiLvlStrCache())
		,
		CTExtensionListConverter.fromDocx4j(value.getExtLst())
		
		);
	}
}
