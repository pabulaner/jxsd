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
import test.drawingml.main.CTColorReplaceEffectModel.*;
import test.drawingml.chartDrawing.*;
import test.officeDocument.relationships.*;

// CHOICE CONVERTER
public class CTColorReplaceEffectConverter
{
	
	private CTColorReplaceEffectConverter() {
		// empty
	}
	
	public static CTColorReplaceEffectModel fromDocx4j(CTColorReplaceEffect value)
	{
		if (value.getScrgbClr() != null) return CTColorReplaceEffectModel.createScrgbClr(
		CTScRgbColorConverter.fromDocx4j(value.getScrgbClr())
		);
		if (value.getSrgbClr() != null) return CTColorReplaceEffectModel.createSrgbClr(
		CTSRgbColorConverter.fromDocx4j(value.getSrgbClr())
		);
		if (value.getHslClr() != null) return CTColorReplaceEffectModel.createHslClr(
		CTHslColorConverter.fromDocx4j(value.getHslClr())
		);
		if (value.getSysClr() != null) return CTColorReplaceEffectModel.createSysClr(
		CTSystemColorConverter.fromDocx4j(value.getSysClr())
		);
		if (value.getSchemeClr() != null) return CTColorReplaceEffectModel.createSchemeClr(
		CTSchemeColorConverter.fromDocx4j(value.getSchemeClr())
		);
		if (value.getPrstClr() != null) return CTColorReplaceEffectModel.createPrstClr(
		CTPresetColorConverter.fromDocx4j(value.getPrstClr())
		);
		
		return new CTColorReplaceEffectModel();
	}
}
