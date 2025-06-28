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
import test.officeDocument.relationships.*;
import test.drawingml.main.CTNonVisualDrawingPropsModel.*;

// SEQUENCE CONVERTER
public class CTNonVisualDrawingPropsConverter
{
	
	private CTNonVisualDrawingPropsConverter() {
		// empty
	}
	
	public static CTNonVisualDrawingPropsModel fromDocx4j(CTNonVisualDrawingProps value)
	{
		return new CTNonVisualDrawingPropsModel(
		BooleanConverter.fromDocx4j(value.getHidden())
		,
		StringConverter.fromDocx4j(value.getDescr())
		,
		STDrawingElementIdConverter.fromDocx4j(value.getId())
		,
		StringConverter.fromDocx4j(value.getName())
		,
		CTHyperlinkConverter.fromDocx4j(value.getHlinkClick())
		,
		CTHyperlinkConverter.fromDocx4j(value.getHlinkHover())
		,
		CTOfficeArtExtensionListConverter.fromDocx4j(value.getExtLst())
		
		);
	}
}
