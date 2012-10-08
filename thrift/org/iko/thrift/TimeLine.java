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

public class TimeLine implements org.apache.thrift.TBase<TimeLine, TimeLine._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TimeLine");

  private static final org.apache.thrift.protocol.TField UID_FIELD_DESC = new org.apache.thrift.protocol.TField("uid", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField GROUP_FIELD_DESC = new org.apache.thrift.protocol.TField("group", org.apache.thrift.protocol.TType.I32, (short)2);
  private static final org.apache.thrift.protocol.TField MIDS_FIELD_DESC = new org.apache.thrift.protocol.TField("mids", org.apache.thrift.protocol.TType.LIST, (short)3);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new TimeLineStandardSchemeFactory());
    schemes.put(TupleScheme.class, new TimeLineTupleSchemeFactory());
  }

  public String uid; // required
  /**
   * 
   * @see TimeLineType
   */
  public TimeLineType group; // required
  public List<String> mids; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    UID((short)1, "uid"),
    /**
     * 
     * @see TimeLineType
     */
    GROUP((short)2, "group"),
    MIDS((short)3, "mids");

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
        case 1: // UID
          return UID;
        case 2: // GROUP
          return GROUP;
        case 3: // MIDS
          return MIDS;
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
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.UID, new org.apache.thrift.meta_data.FieldMetaData("uid", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.GROUP, new org.apache.thrift.meta_data.FieldMetaData("group", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, TimeLineType.class)));
    tmpMap.put(_Fields.MIDS, new org.apache.thrift.meta_data.FieldMetaData("mids", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TimeLine.class, metaDataMap);
  }

  public TimeLine() {
  }

  public TimeLine(
    String uid,
    TimeLineType group,
    List<String> mids)
  {
    this();
    this.uid = uid;
    this.group = group;
    this.mids = mids;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TimeLine(TimeLine other) {
    if (other.isSetUid()) {
      this.uid = other.uid;
    }
    if (other.isSetGroup()) {
      this.group = other.group;
    }
    if (other.isSetMids()) {
      List<String> __this__mids = new ArrayList<String>();
      for (String other_element : other.mids) {
        __this__mids.add(other_element);
      }
      this.mids = __this__mids;
    }
  }

  public TimeLine deepCopy() {
    return new TimeLine(this);
  }

  @Override
  public void clear() {
    this.uid = null;
    this.group = null;
    this.mids = null;
  }

  public String getUid() {
    return this.uid;
  }

  public TimeLine setUid(String uid) {
    this.uid = uid;
    return this;
  }

  public void unsetUid() {
    this.uid = null;
  }

  /** Returns true if field uid is set (has been assigned a value) and false otherwise */
  public boolean isSetUid() {
    return this.uid != null;
  }

  public void setUidIsSet(boolean value) {
    if (!value) {
      this.uid = null;
    }
  }

  /**
   * 
   * @see TimeLineType
   */
  public TimeLineType getGroup() {
    return this.group;
  }

  /**
   * 
   * @see TimeLineType
   */
  public TimeLine setGroup(TimeLineType group) {
    this.group = group;
    return this;
  }

  public void unsetGroup() {
    this.group = null;
  }

  /** Returns true if field group is set (has been assigned a value) and false otherwise */
  public boolean isSetGroup() {
    return this.group != null;
  }

  public void setGroupIsSet(boolean value) {
    if (!value) {
      this.group = null;
    }
  }

  public int getMidsSize() {
    return (this.mids == null) ? 0 : this.mids.size();
  }

  public java.util.Iterator<String> getMidsIterator() {
    return (this.mids == null) ? null : this.mids.iterator();
  }

  public void addToMids(String elem) {
    if (this.mids == null) {
      this.mids = new ArrayList<String>();
    }
    this.mids.add(elem);
  }

  public List<String> getMids() {
    return this.mids;
  }

  public TimeLine setMids(List<String> mids) {
    this.mids = mids;
    return this;
  }

  public void unsetMids() {
    this.mids = null;
  }

  /** Returns true if field mids is set (has been assigned a value) and false otherwise */
  public boolean isSetMids() {
    return this.mids != null;
  }

  public void setMidsIsSet(boolean value) {
    if (!value) {
      this.mids = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case UID:
      if (value == null) {
        unsetUid();
      } else {
        setUid((String)value);
      }
      break;

    case GROUP:
      if (value == null) {
        unsetGroup();
      } else {
        setGroup((TimeLineType)value);
      }
      break;

    case MIDS:
      if (value == null) {
        unsetMids();
      } else {
        setMids((List<String>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case UID:
      return getUid();

    case GROUP:
      return getGroup();

    case MIDS:
      return getMids();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case UID:
      return isSetUid();
    case GROUP:
      return isSetGroup();
    case MIDS:
      return isSetMids();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof TimeLine)
      return this.equals((TimeLine)that);
    return false;
  }

  public boolean equals(TimeLine that) {
    if (that == null)
      return false;

    boolean this_present_uid = true && this.isSetUid();
    boolean that_present_uid = true && that.isSetUid();
    if (this_present_uid || that_present_uid) {
      if (!(this_present_uid && that_present_uid))
        return false;
      if (!this.uid.equals(that.uid))
        return false;
    }

    boolean this_present_group = true && this.isSetGroup();
    boolean that_present_group = true && that.isSetGroup();
    if (this_present_group || that_present_group) {
      if (!(this_present_group && that_present_group))
        return false;
      if (!this.group.equals(that.group))
        return false;
    }

    boolean this_present_mids = true && this.isSetMids();
    boolean that_present_mids = true && that.isSetMids();
    if (this_present_mids || that_present_mids) {
      if (!(this_present_mids && that_present_mids))
        return false;
      if (!this.mids.equals(that.mids))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  public int compareTo(TimeLine other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    TimeLine typedOther = (TimeLine)other;

    lastComparison = Boolean.valueOf(isSetUid()).compareTo(typedOther.isSetUid());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetUid()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.uid, typedOther.uid);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetGroup()).compareTo(typedOther.isSetGroup());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetGroup()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.group, typedOther.group);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetMids()).compareTo(typedOther.isSetMids());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetMids()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.mids, typedOther.mids);
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
    StringBuilder sb = new StringBuilder("TimeLine(");
    boolean first = true;

    sb.append("uid:");
    if (this.uid == null) {
      sb.append("null");
    } else {
      sb.append(this.uid);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("group:");
    if (this.group == null) {
      sb.append("null");
    } else {
      sb.append(this.group);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("mids:");
    if (this.mids == null) {
      sb.append("null");
    } else {
      sb.append(this.mids);
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

  private static class TimeLineStandardSchemeFactory implements SchemeFactory {
    public TimeLineStandardScheme getScheme() {
      return new TimeLineStandardScheme();
    }
  }

  private static class TimeLineStandardScheme extends StandardScheme<TimeLine> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TimeLine struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // UID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.uid = iprot.readString();
              struct.setUidIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // GROUP
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.group = TimeLineType.findByValue(iprot.readI32());
              struct.setGroupIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // MIDS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list24 = iprot.readListBegin();
                struct.mids = new ArrayList<String>(_list24.size);
                for (int _i25 = 0; _i25 < _list24.size; ++_i25)
                {
                  String _elem26; // required
                  _elem26 = iprot.readString();
                  struct.mids.add(_elem26);
                }
                iprot.readListEnd();
              }
              struct.setMidsIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, TimeLine struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.uid != null) {
        oprot.writeFieldBegin(UID_FIELD_DESC);
        oprot.writeString(struct.uid);
        oprot.writeFieldEnd();
      }
      if (struct.group != null) {
        oprot.writeFieldBegin(GROUP_FIELD_DESC);
        oprot.writeI32(struct.group.getValue());
        oprot.writeFieldEnd();
      }
      if (struct.mids != null) {
        oprot.writeFieldBegin(MIDS_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, struct.mids.size()));
          for (String _iter27 : struct.mids)
          {
            oprot.writeString(_iter27);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TimeLineTupleSchemeFactory implements SchemeFactory {
    public TimeLineTupleScheme getScheme() {
      return new TimeLineTupleScheme();
    }
  }

  private static class TimeLineTupleScheme extends TupleScheme<TimeLine> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TimeLine struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetUid()) {
        optionals.set(0);
      }
      if (struct.isSetGroup()) {
        optionals.set(1);
      }
      if (struct.isSetMids()) {
        optionals.set(2);
      }
      oprot.writeBitSet(optionals, 3);
      if (struct.isSetUid()) {
        oprot.writeString(struct.uid);
      }
      if (struct.isSetGroup()) {
        oprot.writeI32(struct.group.getValue());
      }
      if (struct.isSetMids()) {
        {
          oprot.writeI32(struct.mids.size());
          for (String _iter28 : struct.mids)
          {
            oprot.writeString(_iter28);
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TimeLine struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(3);
      if (incoming.get(0)) {
        struct.uid = iprot.readString();
        struct.setUidIsSet(true);
      }
      if (incoming.get(1)) {
        struct.group = TimeLineType.findByValue(iprot.readI32());
        struct.setGroupIsSet(true);
      }
      if (incoming.get(2)) {
        {
          org.apache.thrift.protocol.TList _list29 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, iprot.readI32());
          struct.mids = new ArrayList<String>(_list29.size);
          for (int _i30 = 0; _i30 < _list29.size; ++_i30)
          {
            String _elem31; // required
            _elem31 = iprot.readString();
            struct.mids.add(_elem31);
          }
        }
        struct.setMidsIsSet(true);
      }
    }
  }

}
