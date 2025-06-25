package test.dml.chart;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Duration;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import test.dml.chart.*;
import org.docx4j.dml.chart.*;
import test.dml.chartDrawing.*;
import test.XMLSchema.*;
import test.dml.*;
import org.docx4j.dml.*;
import test.dml.chart.CTErrBarTypeModel.*;
import org.docx4j.dml.chartDrawing.*;
import test.officeDocument.relationships.*;

public class CTErrBarTypeConverter
{
	
	private CTErrBarTypeConverter() {
		// empty
	}
	
	public static CTErrBarTypeModel fromDocx4j(CTErrBarType value)
	{
		return new CTErrBarTypeModel(
		STErrBarTypeConverter.fromDocx4j(value.getVal())
		
		);
	}
}
