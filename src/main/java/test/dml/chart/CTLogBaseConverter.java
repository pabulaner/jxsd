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
import test.dml.chart.CTLogBaseModel.*;
import org.docx4j.dml.chartDrawing.*;
import test.officeDocument.relationships.*;

public class CTLogBaseConverter
{
	
	private CTLogBaseConverter() {
		// empty
	}
	
	public static CTLogBaseModel fromDocx4j(CTLogBase value)
	{
		return new CTLogBaseModel(
		STLogBaseConverter.fromDocx4j(value.getVal())
		
		);
	}
}
