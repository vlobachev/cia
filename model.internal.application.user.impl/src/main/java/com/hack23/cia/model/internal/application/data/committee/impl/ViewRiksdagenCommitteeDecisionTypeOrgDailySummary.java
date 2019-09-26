//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.02.25 at 12:05:09 AM CET 
//


package com.hack23.cia.model.internal.application.data.committee.impl;



import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import com.hack23.cia.model.common.api.ModelObject;


/**
 * <p>Java class for ViewRiksdagenCommitteeDecisionTypeOrgDailySummary complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ViewRiksdagenCommitteeDecisionTypeOrgDailySummary"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="embeddedId" type="{http://committee.data.application.internal.model.cia.hack23.com/impl}RiksdagenCommitteeDecisionTypeOrgSummaryEmbeddedId"/&gt;
 *         &lt;element name="total" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ViewRiksdagenCommitteeDecisionTypeOrgDailySummary", propOrder = {
    "embeddedId",
    "total"
})
@Entity(name = "ViewRiksdagenCommitteeDecisionTypeOrgDailySummary")
@Table(name = "View_Riksdagen_Committee_Decision_Type_Org_Summary")
@Inheritance(strategy = InheritanceType.JOINED)
public class ViewRiksdagenCommitteeDecisionTypeOrgDailySummary
    implements ModelObject
{

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@XmlElement(required = true)
    protected RiksdagenCommitteeDecisionTypeOrgSummaryEmbeddedId embeddedId;
    protected long total;

    /**
     * Gets the value of the embeddedId property.
     * 
     * @return
     *     possible object is
     *     {@link RiksdagenCommitteeDecisionTypeOrgSummaryEmbeddedId }
     *     
     */
    @EmbeddedId
    @AttributeOverrides({
        @AttributeOverride(name = "decisionDate", column = @Column(name = "EMBEDDED_ID_DECISION_DATE")),
        @AttributeOverride(name = "decisionType", column = @Column(name = "EMBEDDED_ID_DECISION_TYPE")),
        @AttributeOverride(name = "org", column = @Column(name = "EMBEDDED_ID_ORG"))
    })
    public RiksdagenCommitteeDecisionTypeOrgSummaryEmbeddedId getEmbeddedId() {
        return embeddedId;
    }

    /**
     * Sets the value of the embeddedId property.
     * 
     * @param value
     *     allowed object is
     *     {@link RiksdagenCommitteeDecisionTypeOrgSummaryEmbeddedId }
     *     
     */
    public void setEmbeddedId(final RiksdagenCommitteeDecisionTypeOrgSummaryEmbeddedId value) {
        this.embeddedId = value;
    }

    /**
     * Gets the value of the total property.
     * 
     */
    @Basic
    @Column(name = "TOTAL", precision = 20)
    public long getTotal() {
        return total;
    }

    /**
     * Sets the value of the total property.
     * 
     */
    public void setTotal(final long value) {
        this.total = value;
    }

    public ViewRiksdagenCommitteeDecisionTypeOrgDailySummary withEmbeddedId(final RiksdagenCommitteeDecisionTypeOrgSummaryEmbeddedId value) {
        setEmbeddedId(value);
        return this;
    }

    public ViewRiksdagenCommitteeDecisionTypeOrgDailySummary withTotal(final long value) {
        setTotal(value);
        return this;
    }

	@Override
	public final String toString() {
		return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
	}


	@Override
	public final boolean equals(final Object obj) {
		return EqualsBuilder.reflectionEquals(this, obj);
	}

	@Override
	public final int hashCode() {
		return HashCodeBuilder.reflectionHashCode(this);
	}

}