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
import test.dml.CTTextListStyleModel.*;

public class CTTextListStyleModel
{
	
	private final CTTextParagraphPropertiesModel defPPr;
	private final CTTextParagraphPropertiesModel lvl1pPr;
	private final CTTextParagraphPropertiesModel lvl2pPr;
	private final CTTextParagraphPropertiesModel lvl3pPr;
	private final CTTextParagraphPropertiesModel lvl4pPr;
	private final CTTextParagraphPropertiesModel lvl5pPr;
	private final CTTextParagraphPropertiesModel lvl6pPr;
	private final CTTextParagraphPropertiesModel lvl7pPr;
	private final CTTextParagraphPropertiesModel lvl8pPr;
	private final CTTextParagraphPropertiesModel lvl9pPr;
	private final CTOfficeArtExtensionListModel extLst;
	
	public CTTextListStyleModel(CTTextParagraphPropertiesModel defPPr, CTTextParagraphPropertiesModel lvl1pPr, CTTextParagraphPropertiesModel lvl2pPr, CTTextParagraphPropertiesModel lvl3pPr, CTTextParagraphPropertiesModel lvl4pPr, CTTextParagraphPropertiesModel lvl5pPr, CTTextParagraphPropertiesModel lvl6pPr, CTTextParagraphPropertiesModel lvl7pPr, CTTextParagraphPropertiesModel lvl8pPr, CTTextParagraphPropertiesModel lvl9pPr, CTOfficeArtExtensionListModel extLst) {
		this.defPPr = defPPr;
		this.lvl1pPr = lvl1pPr;
		this.lvl2pPr = lvl2pPr;
		this.lvl3pPr = lvl3pPr;
		this.lvl4pPr = lvl4pPr;
		this.lvl5pPr = lvl5pPr;
		this.lvl6pPr = lvl6pPr;
		this.lvl7pPr = lvl7pPr;
		this.lvl8pPr = lvl8pPr;
		this.lvl9pPr = lvl9pPr;
		this.extLst = extLst;
	}
	
	public CTTextParagraphPropertiesModel getDefPPr() {
		return this.defPPr;
	}
	public CTTextParagraphPropertiesModel getLvl1pPr() {
		return this.lvl1pPr;
	}
	public CTTextParagraphPropertiesModel getLvl2pPr() {
		return this.lvl2pPr;
	}
	public CTTextParagraphPropertiesModel getLvl3pPr() {
		return this.lvl3pPr;
	}
	public CTTextParagraphPropertiesModel getLvl4pPr() {
		return this.lvl4pPr;
	}
	public CTTextParagraphPropertiesModel getLvl5pPr() {
		return this.lvl5pPr;
	}
	public CTTextParagraphPropertiesModel getLvl6pPr() {
		return this.lvl6pPr;
	}
	public CTTextParagraphPropertiesModel getLvl7pPr() {
		return this.lvl7pPr;
	}
	public CTTextParagraphPropertiesModel getLvl8pPr() {
		return this.lvl8pPr;
	}
	public CTTextParagraphPropertiesModel getLvl9pPr() {
		return this.lvl9pPr;
	}
	public CTOfficeArtExtensionListModel getExtLst() {
		return this.extLst;
	}
}
