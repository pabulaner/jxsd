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
import test.dml.chartDrawing.*;
import test.XMLSchema.*;
import test.dml.*;
import org.docx4j.dml.*;
import org.docx4j.dml.chartDrawing.*;
import test.officeDocument.relationships.*;
import test.dml.CTClipboardStyleSheetModel.*;

public class CTClipboardStyleSheetModel
{
	
	private final CTBaseStylesModel themeElements;
	private final CTColorMappingModel clrMap;
	
	public CTClipboardStyleSheetModel(CTBaseStylesModel themeElements, CTColorMappingModel clrMap) {
		this.themeElements = themeElements;
		this.clrMap = clrMap;
	}
	
	public CTBaseStylesModel getThemeElements() {
		return this.themeElements;
	}
	public CTColorMappingModel getClrMap() {
		return this.clrMap;
	}
}
