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
import test.dml.CTColorMappingModel.*;
import test.dml.chartDrawing.*;
import test.XMLSchema.*;
import test.dml.*;
import org.docx4j.dml.*;
import org.docx4j.dml.chartDrawing.*;
import test.officeDocument.relationships.*;

public class CTColorMappingModel
{
	
	private final STColorSchemeIndexModel tx1;
	private final STColorSchemeIndexModel accent3;
	private final STColorSchemeIndexModel accent2;
	private final STColorSchemeIndexModel hlink;
	private final STColorSchemeIndexModel accent1;
	private final STColorSchemeIndexModel folHlink;
	private final STColorSchemeIndexModel accent6;
	private final STColorSchemeIndexModel bg2;
	private final STColorSchemeIndexModel accent5;
	private final STColorSchemeIndexModel bg1;
	private final STColorSchemeIndexModel tx2;
	private final STColorSchemeIndexModel accent4;
	private final CTOfficeArtExtensionListModel extLst;
	
	public CTColorMappingModel(STColorSchemeIndexModel tx1, STColorSchemeIndexModel accent3, STColorSchemeIndexModel accent2, STColorSchemeIndexModel hlink, STColorSchemeIndexModel accent1, STColorSchemeIndexModel folHlink, STColorSchemeIndexModel accent6, STColorSchemeIndexModel bg2, STColorSchemeIndexModel accent5, STColorSchemeIndexModel bg1, STColorSchemeIndexModel tx2, STColorSchemeIndexModel accent4, CTOfficeArtExtensionListModel extLst) {
		this.tx1 = tx1;
		this.accent3 = accent3;
		this.accent2 = accent2;
		this.hlink = hlink;
		this.accent1 = accent1;
		this.folHlink = folHlink;
		this.accent6 = accent6;
		this.bg2 = bg2;
		this.accent5 = accent5;
		this.bg1 = bg1;
		this.tx2 = tx2;
		this.accent4 = accent4;
		this.extLst = extLst;
	}
	
	public STColorSchemeIndexModel getTx1() {
		return this.tx1;
	}
	public STColorSchemeIndexModel getAccent3() {
		return this.accent3;
	}
	public STColorSchemeIndexModel getAccent2() {
		return this.accent2;
	}
	public STColorSchemeIndexModel getHlink() {
		return this.hlink;
	}
	public STColorSchemeIndexModel getAccent1() {
		return this.accent1;
	}
	public STColorSchemeIndexModel getFolHlink() {
		return this.folHlink;
	}
	public STColorSchemeIndexModel getAccent6() {
		return this.accent6;
	}
	public STColorSchemeIndexModel getBg2() {
		return this.bg2;
	}
	public STColorSchemeIndexModel getAccent5() {
		return this.accent5;
	}
	public STColorSchemeIndexModel getBg1() {
		return this.bg1;
	}
	public STColorSchemeIndexModel getTx2() {
		return this.tx2;
	}
	public STColorSchemeIndexModel getAccent4() {
		return this.accent4;
	}
	public CTOfficeArtExtensionListModel getExtLst() {
		return this.extLst;
	}
}
