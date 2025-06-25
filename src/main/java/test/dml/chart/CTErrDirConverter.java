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
import test.dml.chart.CTErrDirModel.*;
import test.XMLSchema.*;
import test.dml.*;
import org.docx4j.dml.*;
import org.docx4j.dml.chartDrawing.*;
import test.officeDocument.relationships.*;

public class CTErrDirConverter
{
	
	private CTErrDirConverter() {
		// empty
	}
	
	public static CTErrDirModel fromDocx4j(CTErrDir value)
	{
		return new CTErrDirModel(
		STErrDirConverter.fromDocx4j(value.getVal())
		
		);
	}
}
