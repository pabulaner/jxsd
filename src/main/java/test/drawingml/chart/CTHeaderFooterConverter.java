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
import test.drawingml.chart.CTHeaderFooterModel.*;
import test.officeDocument.relationships.*;

// SEQUENCE CONVERTER
public class CTHeaderFooterConverter
{
	
	private CTHeaderFooterConverter() {
		// empty
	}
	
	public static CTHeaderFooterModel fromDocx4j(CTHeaderFooter value)
	{
		return new CTHeaderFooterModel(
		BooleanConverter.fromDocx4j(value.getDifferentOddEven())
		,
		BooleanConverter.fromDocx4j(value.getDifferentFirst())
		,
		BooleanConverter.fromDocx4j(value.getAlignWithMargins())
		,
		STXstringConverter.fromDocx4j(value.getOddHeader())
		,
		STXstringConverter.fromDocx4j(value.getOddFooter())
		,
		STXstringConverter.fromDocx4j(value.getEvenHeader())
		,
		STXstringConverter.fromDocx4j(value.getEvenFooter())
		,
		STXstringConverter.fromDocx4j(value.getFirstHeader())
		,
		STXstringConverter.fromDocx4j(value.getFirstFooter())
		
		);
	}
}
