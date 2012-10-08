/**
 * Autogenerated by Thrift Compiler (0.8.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.iko.thrift;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ShortURL implements org.apache.thrift.TBase<ShortURL, ShortURL._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("ShortURL");

  private static final org.apache.thrift.protocol.TField URL_FIELD_DESC = new org.apache.thrift.protocol.TField("url", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField TINY_URL_FIELD_DESC = new org.apache.thrift.protocol.TField("tiny_url", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField INFO_FIELD_DESC = new org.apache.thrift.protocol.TField("info", org.apache.thrift.protocol.TType.STRING, (short)3);
  private static final org.apache.thrift.protocol.TField ACTUAL_URL_FIELD_DESC = new org.apache.thrift.protocol.TField("actual_url", org.apache.thrift.protocol.TType.STRING, (short)4);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new ShortURLStandardSchemeFactory());
    schemes.put(TupleScheme.class, new ShortURLTupleSchemeFactory());
  }

  public String url; // required
  public String tiny_url; // required
  public String info; // optional
  public String actual_url; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    URL((short)1, "url"),
    TINY_URL((short)2, "tiny_url"),
    INFO((short)3, "info"),
    ACTUAL_URL((short)4, "actual_url");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // URL
          return URL;
        case 2: // TINY_URL
          return TINY_URL;
        case 3: // INFO
          return INFO;
        case 4: // ACTUAL_URL
          return ACTUAL_URL;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private _Fields optionals[] = {_Fields.INFO};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.URL, new org.apache.thrift.meta_data.FieldMetaData("url", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.TINY_URL, new org.apache.thrift.meta_data.FieldMetaData("tiny_url", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.INFO, new org.apache.thrift.meta_data.FieldMetaData("info", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.ACTUAL_URL, new org.apache.thrift.meta_data.FieldMetaData("actual_url", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(ShortURL.class, metaDataMap);
  }

  public ShortURL() {
  }

  public ShortURL(
    String url,
    String tiny_url,
    String actual_url)
  {
    this();
    this.url = url;
    this.tiny_url = tiny_url;
    this.actual_url = actual_url;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public ShortURL(ShortURL other) {
    if (other.isSetUrl()) {
      this.url = other.url;
    }
    if (other.isSetTiny_url()) {
      this.tiny_url = other.tiny_url;
    }
    if (other.isSetInfo()) {
      this.info = other.info;
    }
    if (other.isSetActual_url()) {
      this.actual_url = other.actual_url;
    }
  }

  public ShortURL deepCopy() {
    return new ShortURL(this);
  }

  @Override
  public void clear() {
    this.url = null;
    this.tiny_url = null;
    this.info = null;
    this.actual_url = null;
  }

  public String getUrl() {
    return this.url;
  }

  public ShortURL setUrl(String url) {
    this.url = url;
    return this;
  }

  public void unsetUrl() {
    this.url = null;
  }

  /** Returns true if field url is set (has been assigned a value) and false otherwise */
  public boolean isSetUrl() {
    return this.url != null;
  }

  public void setUrlIsSet(boolean value) {
    if (!value) {
      this.url = null;
    }
  }

  public String getTiny_url() {
    return this.tiny_url;
  }

  public ShortURL setTiny_url(String tiny_url) {
    this.tiny_url = tiny_url;
    return this;
  }

  public void unsetTiny_url() {
    this.tiny_url = null;
  }

  /** Returns true if field tiny_url is set (has been assigned a value) and false otherwise */
  public boolean isSetTiny_url() {
    return this.tiny_url != null;
  }

  public void setTiny_urlIsSet(boolean value) {
    if (!value) {
      this.tiny_url = null;
    }
  }

  public String getInfo() {
    return this.info;
  }

  public ShortURL setInfo(String info) {
    this.info = info;
    return this;
  }

  public void unsetInfo() {
    this.info = null;
  }

  /** Returns true if field info is set (has been assigned a value) and false otherwise */
  public boolean isSetInfo() {
    return this.info != null;
  }

  public void setInfoIsSet(boolean value) {
    if (!value) {
      this.info = null;
    }
  }

  public String getActual_url() {
    return this.actual_url;
  }

  public ShortURL setActual_url(String actual_url) {
    this.actual_url = actual_url;
    return this;
  }

  public void unsetActual_url() {
    this.actual_url = null;
  }

  /** Returns true if field actual_url is set (has been assigned a value) and false otherwise */
  public boolean isSetActual_url() {
    return this.actual_url != null;
  }

  public void setActual_urlIsSet(boolean value) {
    if (!value) {
      this.actual_url = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case URL:
      if (value == null) {
        unsetUrl();
      } else {
        setUrl((String)value);
      }
      break;

    case TINY_URL:
      if (value == null) {
        unsetTiny_url();
      } else {
        setTiny_url((String)value);
      }
      break;

    case INFO:
      if (value == null) {
        unsetInfo();
      } else {
        setInfo((String)value);
      }
      break;

    case ACTUAL_URL:
      if (value == null) {
        unsetActual_url();
      } else {
        setActual_url((String)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case URL:
      return getUrl();

    case TINY_URL:
      return getTiny_url();

    case INFO:
      return getInfo();

    case ACTUAL_URL:
      return getActual_url();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case URL:
      return isSetUrl();
    case TINY_URL:
      return isSetTiny_url();
    case INFO:
      return isSetInfo();
    case ACTUAL_URL:
      return isSetActual_url();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof ShortURL)
      return this.equals((ShortURL)that);
    return false;
  }

  public boolean equals(ShortURL that) {
    if (that == null)
      return false;

    boolean this_present_url = true && this.isSetUrl();
    boolean that_present_url = true && that.isSetUrl();
    if (this_present_url || that_present_url) {
      if (!(this_present_url && that_present_url))
        return false;
      if (!this.url.equals(that.url))
        return false;
    }

    boolean this_present_tiny_url = true && this.isSetTiny_url();
    boolean that_present_tiny_url = true && that.isSetTiny_url();
    if (this_present_tiny_url || that_present_tiny_url) {
      if (!(this_present_tiny_url && that_present_tiny_url))
        return false;
      if (!this.tiny_url.equals(that.tiny_url))
        return false;
    }

    boolean this_present_info = true && this.isSetInfo();
    boolean that_present_info = true && that.isSetInfo();
    if (this_present_info || that_present_info) {
      if (!(this_present_info && that_present_info))
        return false;
      if (!this.info.equals(that.info))
        return false;
    }

    boolean this_present_actual_url = true && this.isSetActual_url();
    boolean that_present_actual_url = true && that.isSetActual_url();
    if (this_present_actual_url || that_present_actual_url) {
      if (!(this_present_actual_url && that_present_actual_url))
        return false;
      if (!this.actual_url.equals(that.actual_url))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  public int compareTo(ShortURL other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    ShortURL typedOther = (ShortURL)other;

    lastComparison = Boolean.valueOf(isSetUrl()).compareTo(typedOther.isSetUrl());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetUrl()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.url, typedOther.url);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetTiny_url()).compareTo(typedOther.isSetTiny_url());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTiny_url()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.tiny_url, typedOther.tiny_url);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetInfo()).compareTo(typedOther.isSetInfo());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetInfo()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.info, typedOther.info);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetActual_url()).compareTo(typedOther.isSetActual_url());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetActual_url()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.actual_url, typedOther.actual_url);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("ShortURL(");
    boolean first = true;

    sb.append("url:");
    if (this.url == null) {
      sb.append("null");
    } else {
      sb.append(this.url);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("tiny_url:");
    if (this.tiny_url == null) {
      sb.append("null");
    } else {
      sb.append(this.tiny_url);
    }
    first = false;
    if (isSetInfo()) {
      if (!first) sb.append(", ");
      sb.append("info:");
      if (this.info == null) {
        sb.append("null");
      } else {
        sb.append(this.info);
      }
      first = false;
    }
    if (!first) sb.append(", ");
    sb.append("actual_url:");
    if (this.actual_url == null) {
      sb.append("null");
    } else {
      sb.append(this.actual_url);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class ShortURLStandardSchemeFactory implements SchemeFactory {
    public ShortURLStandardScheme getScheme() {
      return new ShortURLStandardScheme();
    }
  }

  private static class ShortURLStandardScheme extends StandardScheme<ShortURL> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, ShortURL struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // URL
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.url = iprot.readString();
              struct.setUrlIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // TINY_URL
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.tiny_url = iprot.readString();
              struct.setTiny_urlIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // INFO
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.info = iprot.readString();
              struct.setInfoIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // ACTUAL_URL
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.actual_url = iprot.readString();
              struct.setActual_urlIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, ShortURL struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.url != null) {
        oprot.writeFieldBegin(URL_FIELD_DESC);
        oprot.writeString(struct.url);
        oprot.writeFieldEnd();
      }
      if (struct.tiny_url != null) {
        oprot.writeFieldBegin(TINY_URL_FIELD_DESC);
        oprot.writeString(struct.tiny_url);
        oprot.writeFieldEnd();
      }
      if (struct.info != null) {
        if (struct.isSetInfo()) {
          oprot.writeFieldBegin(INFO_FIELD_DESC);
          oprot.writeString(struct.info);
          oprot.writeFieldEnd();
        }
      }
      if (struct.actual_url != null) {
        oprot.writeFieldBegin(ACTUAL_URL_FIELD_DESC);
        oprot.writeString(struct.actual_url);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class ShortURLTupleSchemeFactory implements SchemeFactory {
    public ShortURLTupleScheme getScheme() {
      return new ShortURLTupleScheme();
    }
  }

  private static class ShortURLTupleScheme extends TupleScheme<ShortURL> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, ShortURL struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetUrl()) {
        optionals.set(0);
      }
      if (struct.isSetTiny_url()) {
        optionals.set(1);
      }
      if (struct.isSetInfo()) {
        optionals.set(2);
      }
      if (struct.isSetActual_url()) {
        optionals.set(3);
      }
      oprot.writeBitSet(optionals, 4);
      if (struct.isSetUrl()) {
        oprot.writeString(struct.url);
      }
      if (struct.isSetTiny_url()) {
        oprot.writeString(struct.tiny_url);
      }
      if (struct.isSetInfo()) {
        oprot.writeString(struct.info);
      }
      if (struct.isSetActual_url()) {
        oprot.writeString(struct.actual_url);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, ShortURL struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(4);
      if (incoming.get(0)) {
        struct.url = iprot.readString();
        struct.setUrlIsSet(true);
      }
      if (incoming.get(1)) {
        struct.tiny_url = iprot.readString();
        struct.setTiny_urlIsSet(true);
      }
      if (incoming.get(2)) {
        struct.info = iprot.readString();
        struct.setInfoIsSet(true);
      }
      if (incoming.get(3)) {
        struct.actual_url = iprot.readString();
        struct.setActual_urlIsSet(true);
      }
    }
  }

}

