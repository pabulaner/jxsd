# Jxsd

A converter from xsd to Java files using models, builders and docx4j converters.

#### TODOS

- _ Implement enums (1 hour)
- _ Implement lists (1 hour)
- _ Implement unions (1 hour)
- _ Implement inner classes (2 - 3 hours)
- _ Implement handling of primitive types in builders (2 - 3 hours)
- _ Implement casting from / to unions / sequences to / from docx4j objects (6 - 9 hours)
- _ Implement file creation with packages (2 - 4 hours)

#### Examples

```
xs:integer
```

```
public class PT_Integer {
    
    private final Integer value;
    
    public PT_Integer(Integer value) {
        this.value = value;
    }
    
    public Integer getValue() {
        return this.value;
    }
}
```

---

```
<xs:simpleType name="ST_Age">
  <xs:restriction base="xs:integer">
    <xs:minInclusive value="0"/>
    <xs:maxInclusive value="120"/>
  </xs:restriction>
</xs:simpleType>
```

```
public class ST_Age extends PT_Integer {
    
    public ST_Age(Integer value) {
        super(value);
        
        if (value < 0) throw new IllegalArgumentException();
        if (value > 120) throw new IllegalArgumentException();
    }
}
```

---

```
<xs:simpleType name="ST_Color">
  <xs:restriction base="xs:string">
    <xs:enumeration value="red"/>
    <xs:enumeration value="green"/>
    <xs:enumeration value="blue"/>
  </xs:restriction>
</xs:simpleType>
```

```
public enum ST_Color {
    
    RED,
    GREEN,
    BLUE,
}
```

---

```
<xs:simpleType name="ST_IntList">
  <xs:list itemType="xs:integer"/>
</xs:simpleType>
```

```
public class ST_IntList extends ArrayList<PT_Integer> {
}
```

---

```
<xs:simpleType name="ST_IntOrStr">
  <xs:union memberTypes="xs:integer xs:string"/>
</xs:simpleType>
```

```
public class ST_IntOrStr {

    private final Object value;
    
    public ST_IntOrStr(Object value) {
        boolean valid = false;
        valid |= value instanceof ST_Integer;
        valid |= value instanceof ST_String;
        
        if (!valid) throw new IllegalArgumentException();
        
        this.value = value;
    }
    
    public Object getRaw() {
        return this.value;
    }
    
    public ST_Integer getInteger() {
        return (ST_Integer) this.value;
    }
    
    public ST_String getInteger() {
        return (ST_Integer) this.value;
    }
}
```
