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
import test.drawingml.chart.*;
import test.drawingml.main.CTTextSpacingModel.*;
import test.XMLSchema.*;
import org.docx4j.dml.*;
import test.drawingml.main.*;
import org.docx4j.dml.chartDrawing.*;
import test.drawingml.chartDrawing.*;
import test.officeDocument.relationships.*;

// CHOICE CONVERTER
public class CTTextSpacingConverter
{
	
	private CTTextSpacingConverter() {
		// empty
	}
	
	public static CTTextSpacingModel fromDocx4j(CTTextSpacing value)
	{
		if (value.getSpcPct() != null) return CTTextSpacingModel.createSpcPct(
		CTTextSpacingPercentConverter.fromDocx4j(value.getSpcPct())
		);
		if (value.getSpcPts() != null) return CTTextSpacingModel.createSpcPts(
		CTTextSpacingPointConverter.fromDocx4j(value.getSpcPts())
		);
		
		return new CTTextSpacingModel();
	}
}
