# Jxsd

A converter from xsd to Java files using models, builders and docx4j converters.

```
new PersonBuilder()
    .from(paul)
    .setAddress(builder -> builder
        .setStreet("peter")
        .setNumber(10))
    .build();
```

#### TODOS

- _ Implement enums (1 hour)
- _ Implement lists (1 hour)
- _ Implement unions (1 hour)
- _ Implement inner classes (2 - 3 hours)
- _ Implement handling of primitive types in builders (2 - 3 hours)
- _ Implement casting from / to unions / sequences to / from docx4j objects (6 - 9 hours)
- _ Implement file creation with packages (2 - 4 hours)

#### Examples

### Primitive

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
### Restriction

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
### Enum

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
### List

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
### Union

```
<xs:simpleType name="ST_IntOrStr">
  <xs:union memberTypes="xs:integer xs:string"/>
</xs:simpleType>
```

```
public class ST_IntOrStr {

    private final Object value;
    
    public ST_IntOrStr(Object value) {
        if (ST_Integer.class.isInstance(value) || ST_String.class.isInstance(value)) {
            this.value = value;
        } else {
            throw new IllegalArgumentException();
        }
    }
    
    public Object getRaw() {
        return this.value;
    }
    
    public ST_Integer getInteger() {
        return (ST_Integer) this.value;
    }
    
    public ST_String getString() {
        return (ST_String) this.value;
    }
}
```

---
### Complex

```
<xs:complexType name="CT_User">
    <xs:sequence>
        <xs:choice>
            <xs:element name="man" type="xs:boolean"/>
            <xs:element name="woman" type="xs:int"/>
        </xs:choice>
        <xs:element name="name" type="xs:string"/>
    </xs:sequence>
</xs:complexType>
```

```
public class CT_User {
    
    private final ManOrWoman manOrWoman;
    
    private final String name;
    
    public CT_User(ManOrWoman manOrWoman, String name) {
        this.manOrWoman = manOrWoman;
        this.name = name;
    }
    
    public ManOrWoman getManOrWoman() {
        return this.manOrWoman;
    }
    
    public String getName() {
        return this.name;
    }
    
    public class CT_ManOrWoman {

        private final Object value;
        
        public CT_ManOrWoman(Object value) {
            if (ST_Boolean.class.isInstance(value) || ST_Integer.class.isInstance(value)) {
                this.value = value;
            } else {
                throw new IllegalArgumentException();
            }
        }
        
        public Object getRaw() {
            return this.value;
        }
        
        public ST_String getMan() {
            return (ST_String) this.value;
        }
        
        public ST_Integer getWoman() {
            return (ST_Integer) this.value;
        }
    }
}
```