package test.dml;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Duration;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import test.dml.CTPath2DLineToModel.*;
import test.dml.chart.*;
import org.docx4j.dml.chart.*;
import test.dml.chartDrawing.*;
import test.XMLSchema.*;
import test.dml.*;
import org.docx4j.dml.*;
import org.docx4j.dml.chartDrawing.*;
import test.officeDocument.relationships.*;

public class CTPath2DLineToConverter
{
	
	private CTPath2DLineToConverter() {
		// empty
	}
	
	public static CTPath2DLineToModel fromDocx4j(CTPath2DLineTo value)
	{
		return new CTPath2DLineToModel(
		CTAdjPoint2DConverter.fromDocx4j(value.getPt())
		
		);
	}
}
