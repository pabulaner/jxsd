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
import org.docx4j.dml.chartDrawing.*;
import test.officeDocument.relationships.*;
import test.dml.chart.CTMarkerSizeModel.*;

public class CTMarkerSizeConverter
{
	
	private CTMarkerSizeConverter() {
		// empty
	}
	
	public static CTMarkerSizeModel fromDocx4j(CTMarkerSize value)
	{
		return new CTMarkerSizeModel(
		STMarkerSizeConverter.fromDocx4j(value.getVal())
		
		);
	}
}
