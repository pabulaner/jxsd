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
import test.dml.CTColorSchemeAndMappingModel.*;
import test.dml.chartDrawing.*;
import test.XMLSchema.*;
import test.dml.*;
import org.docx4j.dml.*;
import org.docx4j.dml.chartDrawing.*;
import test.officeDocument.relationships.*;

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
