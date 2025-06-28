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
import test.drawingml.main.CTAlphaInverseEffectModel.*;
import test.drawingml.chart.*;
import test.XMLSchema.*;
import org.docx4j.dml.*;
import test.drawingml.main.*;
import org.docx4j.dml.chartDrawing.*;
import test.drawingml.chartDrawing.*;
import test.officeDocument.relationships.*;

// CHOICE CONVERTER
public class CTAlphaInverseEffectConverter
{
	
	private CTAlphaInverseEffectConverter() {
		// empty
	}
	
	public static CTAlphaInverseEffectModel fromDocx4j(CTAlphaInverseEffect value)
	{
		if (value.getScrgbClr() != null) return CTAlphaInverseEffectModel.createScrgbClr(
		CTScRgbColorConverter.fromDocx4j(value.getScrgbClr())
		);
		if (value.getSrgbClr() != null) return CTAlphaInverseEffectModel.createSrgbClr(
		CTSRgbColorConverter.fromDocx4j(value.getSrgbClr())
		);
		if (value.getHslClr() != null) return CTAlphaInverseEffectModel.createHslClr(
		CTHslColorConverter.fromDocx4j(value.getHslClr())
		);
		if (value.getSysClr() != null) return CTAlphaInverseEffectModel.createSysClr(
		CTSystemColorConverter.fromDocx4j(value.getSysClr())
		);
		if (value.getSchemeClr() != null) return CTAlphaInverseEffectModel.createSchemeClr(
		CTSchemeColorConverter.fromDocx4j(value.getSchemeClr())
		);
		if (value.getPrstClr() != null) return CTAlphaInverseEffectModel.createPrstClr(
		CTPresetColorConverter.fromDocx4j(value.getPrstClr())
		);
		
		return new CTAlphaInverseEffectModel();
	}
}
