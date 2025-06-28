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
import test.XMLSchema.*;
import org.docx4j.dml.*;
import test.drawingml.main.*;
import org.docx4j.dml.chartDrawing.*;
import test.drawingml.chartDrawing.*;
import test.drawingml.main.CTColorChangeEffectModel.*;
import test.officeDocument.relationships.*;

// SEQUENCE CONVERTER
public class CTColorChangeEffectConverter
{
	
	private CTColorChangeEffectConverter() {
		// empty
	}
	
	public static CTColorChangeEffectModel fromDocx4j(CTColorChangeEffect value)
	{
		return new CTColorChangeEffectModel(
		BooleanConverter.fromDocx4j(value.getUseA())
		,
		CTColorConverter.fromDocx4j(value.getClrFrom())
		,
		CTColorConverter.fromDocx4j(value.getClrTo())
		
		);
	}
}
