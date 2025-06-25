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
import test.dml.chart.CTSecondPieSizeModel.*;
import test.dml.chartDrawing.*;
import test.XMLSchema.*;
import test.dml.*;
import org.docx4j.dml.*;
import org.docx4j.dml.chartDrawing.*;
import test.officeDocument.relationships.*;

public class CTSecondPieSizeConverter
{
	
	private CTSecondPieSizeConverter() {
		// empty
	}
	
	public static CTSecondPieSizeModel fromDocx4j(CTSecondPieSize value)
	{
		return new CTSecondPieSizeModel(
		STSecondPieSizeConverter.fromDocx4j(value.getVal())
		
		);
	}
}
