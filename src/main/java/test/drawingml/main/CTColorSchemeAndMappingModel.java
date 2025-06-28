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
import test.drawingml.main.CTColorSchemeAndMappingModel.*;
import test.drawingml.chart.*;
import test.XMLSchema.*;
import org.docx4j.dml.*;
import test.drawingml.main.*;
import org.docx4j.dml.chartDrawing.*;
import test.drawingml.chartDrawing.*;
import test.officeDocument.relationships.*;

// SEQUENCE MODEL
public class CTColorSchemeAndMappingModel
{
	
	private final CTColorSchemeModel clrScheme;
	private final CTColorMappingModel clrMap;
	
	public CTColorSchemeAndMappingModel(CTColorSchemeModel clrScheme, CTColorMappingModel clrMap) {
		this.clrScheme = clrScheme;
		this.clrMap = clrMap;
	}
	
	public CTColorSchemeModel getClrScheme() {
		return this.clrScheme;
	}
	public CTColorMappingModel getClrMap() {
		return this.clrMap;
	}
}
