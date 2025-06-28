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
import test.drawingml.chart.CTPrintSettingsModel.*;
import org.docx4j.dml.*;
import test.drawingml.main.*;
import org.docx4j.dml.chartDrawing.*;
import test.drawingml.chartDrawing.*;
import test.officeDocument.relationships.*;

// SEQUENCE MODEL
public class CTPrintSettingsModel
{
	
	private final CTHeaderFooterModel headerFooter;
	private final CTPageMarginsModel pageMargins;
	private final CTPageSetupModel pageSetup;
	private final CTRelIdModel legacyDrawingHF;
	
	public CTPrintSettingsModel(CTHeaderFooterModel headerFooter, CTPageMarginsModel pageMargins, CTPageSetupModel pageSetup, CTRelIdModel legacyDrawingHF) {
		this.headerFooter = headerFooter;
		this.pageMargins = pageMargins;
		this.pageSetup = pageSetup;
		this.legacyDrawingHF = legacyDrawingHF;
	}
	
	public CTHeaderFooterModel getHeaderFooter() {
		return this.headerFooter;
	}
	public CTPageMarginsModel getPageMargins() {
		return this.pageMargins;
	}
	public CTPageSetupModel getPageSetup() {
		return this.pageSetup;
	}
	public CTRelIdModel getLegacyDrawingHF() {
		return this.legacyDrawingHF;
	}
}
