package test.dml;

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
import test.dml.CTColorChangeEffectModel.*;
import test.dml.chartDrawing.*;
import test.XMLSchema.*;
import test.dml.*;
import org.docx4j.dml.*;
import org.docx4j.dml.chartDrawing.*;
import test.officeDocument.relationships.*;

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
