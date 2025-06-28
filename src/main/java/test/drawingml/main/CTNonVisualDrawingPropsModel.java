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

// SEQUENCE MODEL
public class CTNonVisualDrawingPropsModel
{
	
	private final BooleanModel hidden;
	private final StringModel descr;
	private final STDrawingElementIdModel id;
	private final StringModel name;
	private final CTHyperlinkModel hlinkClick;
	private final CTHyperlinkModel hlinkHover;
	private final CTOfficeArtExtensionListModel extLst;
	
	public CTNonVisualDrawingPropsModel(BooleanModel hidden, StringModel descr, STDrawingElementIdModel id, StringModel name, CTHyperlinkModel hlinkClick, CTHyperlinkModel hlinkHover, CTOfficeArtExtensionListModel extLst) {
		this.hidden = hidden;
		this.descr = descr;
		this.id = id;
		this.name = name;
		this.hlinkClick = hlinkClick;
		this.hlinkHover = hlinkHover;
		this.extLst = extLst;
	}
	
	public BooleanModel getHidden() {
		return this.hidden;
	}
	public StringModel getDescr() {
		return this.descr;
	}
	public STDrawingElementIdModel getId() {
		return this.id;
	}
	public StringModel getName() {
		return this.name;
	}
	public CTHyperlinkModel getHlinkClick() {
		return this.hlinkClick;
	}
	public CTHyperlinkModel getHlinkHover() {
		return this.hlinkHover;
	}
	public CTOfficeArtExtensionListModel getExtLst() {
		return this.extLst;
	}
}
