package com.wildbeeslabs.sensiblemetrics.riderguide;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import org.apache.camel.dataformat.bindy.annotation.CsvRecord;
import org.apache.camel.dataformat.bindy.annotation.DataField;
import org.apache.commons.lang.StringUtils;

@Data
@EqualsAndHashCode
@ToString
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@CsvRecord(separator = ",", skipFirstLine = true)
public class Order implements Serializable {

    @XmlAttribute
    @DataField(pos = 1)
    private String name;

    @XmlAttribute
    @DataField(pos = 2)
    private int amount;

    public Order() {
        this(StringUtils.EMPTY, 0);
    }

    public Order(final String name, int amount) {
        this.name = name;
        this.amount = amount;
    }
}
