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
import test.drawingml.main.CTBlendEffectModel.*;
import test.officeDocument.relationships.*;

// SEQUENCE CONVERTER
public class CTBlendEffectConverter
{
	
	private CTBlendEffectConverter() {
		// empty
	}
	
	public static CTBlendEffectModel fromDocx4j(CTBlendEffect value)
	{
		return new CTBlendEffectModel(
		STBlendModeConverter.fromDocx4j(value.getBlend())
		,
		CTEffectContainerConverter.fromDocx4j(value.getCont())
		
		);
	}
}
