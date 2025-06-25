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
import test.dml.CTColorSchemeModel.*;
import org.docx4j.dml.chartDrawing.*;
import test.officeDocument.relationships.*;

public class CTColorSchemeModel
{
	
	private final StringModel name;
	private final CTColorModel dk1;
	private final CTColorModel lt1;
	private final CTColorModel dk2;
	private final CTColorModel lt2;
	private final CTColorModel accent1;
	private final CTColorModel accent2;
	private final CTColorModel accent3;
	private final CTColorModel accent4;
	private final CTColorModel accent5;
	private final CTColorModel accent6;
	private final CTColorModel hlink;
	private final CTColorModel folHlink;
	private final CTOfficeArtExtensionListModel extLst;
	
	public CTColorSchemeModel(StringModel name, CTColorModel dk1, CTColorModel lt1, CTColorModel dk2, CTColorModel lt2, CTColorModel accent1, CTColorModel accent2, CTColorModel accent3, CTColorModel accent4, CTColorModel accent5, CTColorModel accent6, CTColorModel hlink, CTColorModel folHlink, CTOfficeArtExtensionListModel extLst) {
		this.name = name;
		this.dk1 = dk1;
		this.lt1 = lt1;
		this.dk2 = dk2;
		this.lt2 = lt2;
		this.accent1 = accent1;
		this.accent2 = accent2;
		this.accent3 = accent3;
		this.accent4 = accent4;
		this.accent5 = accent5;
		this.accent6 = accent6;
		this.hlink = hlink;
		this.folHlink = folHlink;
		this.extLst = extLst;
	}
	
	public StringModel getName() {
		return this.name;
	}
	public CTColorModel getDk1() {
		return this.dk1;
	}
	public CTColorModel getLt1() {
		return this.lt1;
	}
	public CTColorModel getDk2() {
		return this.dk2;
	}
	public CTColorModel getLt2() {
		return this.lt2;
	}
	public CTColorModel getAccent1() {
		return this.accent1;
	}
	public CTColorModel getAccent2() {
		return this.accent2;
	}
	public CTColorModel getAccent3() {
		return this.accent3;
	}
	public CTColorModel getAccent4() {
		return this.accent4;
	}
	public CTColorModel getAccent5() {
		return this.accent5;
	}
	public CTColorModel getAccent6() {
		return this.accent6;
	}
	public CTColorModel getHlink() {
		return this.hlink;
	}
	public CTColorModel getFolHlink() {
		return this.folHlink;
	}
	public CTOfficeArtExtensionListModel getExtLst() {
		return this.extLst;
	}
}
