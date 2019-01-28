/**
 * Autogenerated by Thrift Compiler (0.12.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.hadoop.hbase.thrift2.generated;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
/**
 * if no Result is found, row and columnValues will not be set.
 */
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.12.0)", date = "2019-01-28")
public class TResult implements org.apache.thrift.TBase<TResult, TResult._Fields>, java.io.Serializable, Cloneable, Comparable<TResult> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TResult");

  private static final org.apache.thrift.protocol.TField ROW_FIELD_DESC = new org.apache.thrift.protocol.TField("row", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField COLUMN_VALUES_FIELD_DESC = new org.apache.thrift.protocol.TField("columnValues", org.apache.thrift.protocol.TType.LIST, (short)2);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new TResultStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new TResultTupleSchemeFactory();

  public @org.apache.thrift.annotation.Nullable java.nio.ByteBuffer row; // optional
  public @org.apache.thrift.annotation.Nullable java.util.List<TColumnValue> columnValues; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    ROW((short)1, "row"),
    COLUMN_VALUES((short)2, "columnValues");

    private static final java.util.Map<java.lang.String, _Fields> byName = new java.util.HashMap<java.lang.String, _Fields>();

    static {
      for (_Fields field : java.util.EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    @org.apache.thrift.annotation.Nullable
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // ROW
          return ROW;
        case 2: // COLUMN_VALUES
          return COLUMN_VALUES;
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
      if (fields == null) throw new java.lang.IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    @org.apache.thrift.annotation.Nullable
    public static _Fields findByName(java.lang.String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final java.lang.String _fieldName;

    _Fields(short thriftId, java.lang.String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public java.lang.String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final _Fields optionals[] = {_Fields.ROW};
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.ROW, new org.apache.thrift.meta_data.FieldMetaData("row", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING        , true)));
    tmpMap.put(_Fields.COLUMN_VALUES, new org.apache.thrift.meta_data.FieldMetaData("columnValues", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, TColumnValue.class))));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TResult.class, metaDataMap);
  }

  public TResult() {
  }

  public TResult(
    java.util.List<TColumnValue> columnValues)
  {
    this();
    this.columnValues = columnValues;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TResult(TResult other) {
    if (other.isSetRow()) {
      this.row = org.apache.thrift.TBaseHelper.copyBinary(other.row);
    }
    if (other.isSetColumnValues()) {
      java.util.List<TColumnValue> __this__columnValues = new java.util.ArrayList<TColumnValue>(other.columnValues.size());
      for (TColumnValue other_element : other.columnValues) {
        __this__columnValues.add(new TColumnValue(other_element));
      }
      this.columnValues = __this__columnValues;
    }
  }

  public TResult deepCopy() {
    return new TResult(this);
  }

  @Override
  public void clear() {
    this.row = null;
    this.columnValues = null;
  }

  public byte[] getRow() {
    setRow(org.apache.thrift.TBaseHelper.rightSize(row));
    return row == null ? null : row.array();
  }

  public java.nio.ByteBuffer bufferForRow() {
    return org.apache.thrift.TBaseHelper.copyBinary(row);
  }

  public TResult setRow(byte[] row) {
    this.row = row == null ? (java.nio.ByteBuffer)null   : java.nio.ByteBuffer.wrap(row.clone());
    return this;
  }

  public TResult setRow(@org.apache.thrift.annotation.Nullable java.nio.ByteBuffer row) {
    this.row = org.apache.thrift.TBaseHelper.copyBinary(row);
    return this;
  }

  public void unsetRow() {
    this.row = null;
  }

  /** Returns true if field row is set (has been assigned a value) and false otherwise */
  public boolean isSetRow() {
    return this.row != null;
  }

  public void setRowIsSet(boolean value) {
    if (!value) {
      this.row = null;
    }
  }

  public int getColumnValuesSize() {
    return (this.columnValues == null) ? 0 : this.columnValues.size();
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.Iterator<TColumnValue> getColumnValuesIterator() {
    return (this.columnValues == null) ? null : this.columnValues.iterator();
  }

  public void addToColumnValues(TColumnValue elem) {
    if (this.columnValues == null) {
      this.columnValues = new java.util.ArrayList<TColumnValue>();
    }
    this.columnValues.add(elem);
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.List<TColumnValue> getColumnValues() {
    return this.columnValues;
  }

  public TResult setColumnValues(@org.apache.thrift.annotation.Nullable java.util.List<TColumnValue> columnValues) {
    this.columnValues = columnValues;
    return this;
  }

  public void unsetColumnValues() {
    this.columnValues = null;
  }

  /** Returns true if field columnValues is set (has been assigned a value) and false otherwise */
  public boolean isSetColumnValues() {
    return this.columnValues != null;
  }

  public void setColumnValuesIsSet(boolean value) {
    if (!value) {
      this.columnValues = null;
    }
  }

  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case ROW:
      if (value == null) {
        unsetRow();
      } else {
        if (value instanceof byte[]) {
          setRow((byte[])value);
        } else {
          setRow((java.nio.ByteBuffer)value);
        }
      }
      break;

    case COLUMN_VALUES:
      if (value == null) {
        unsetColumnValues();
      } else {
        setColumnValues((java.util.List<TColumnValue>)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case ROW:
      return getRow();

    case COLUMN_VALUES:
      return getColumnValues();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case ROW:
      return isSetRow();
    case COLUMN_VALUES:
      return isSetColumnValues();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof TResult)
      return this.equals((TResult)that);
    return false;
  }

  public boolean equals(TResult that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_row = true && this.isSetRow();
    boolean that_present_row = true && that.isSetRow();
    if (this_present_row || that_present_row) {
      if (!(this_present_row && that_present_row))
        return false;
      if (!this.row.equals(that.row))
        return false;
    }

    boolean this_present_columnValues = true && this.isSetColumnValues();
    boolean that_present_columnValues = true && that.isSetColumnValues();
    if (this_present_columnValues || that_present_columnValues) {
      if (!(this_present_columnValues && that_present_columnValues))
        return false;
      if (!this.columnValues.equals(that.columnValues))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetRow()) ? 131071 : 524287);
    if (isSetRow())
      hashCode = hashCode * 8191 + row.hashCode();

    hashCode = hashCode * 8191 + ((isSetColumnValues()) ? 131071 : 524287);
    if (isSetColumnValues())
      hashCode = hashCode * 8191 + columnValues.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(TResult other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(isSetRow()).compareTo(other.isSetRow());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetRow()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.row, other.row);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetColumnValues()).compareTo(other.isSetColumnValues());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetColumnValues()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.columnValues, other.columnValues);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  @org.apache.thrift.annotation.Nullable
  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    scheme(iprot).read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    scheme(oprot).write(oprot, this);
  }

  @Override
  public java.lang.String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder("TResult(");
    boolean first = true;

    if (isSetRow()) {
      sb.append("row:");
      if (this.row == null) {
        sb.append("null");
      } else {
        org.apache.thrift.TBaseHelper.toString(this.row, sb);
      }
      first = false;
    }
    if (!first) sb.append(", ");
    sb.append("columnValues:");
    if (this.columnValues == null) {
      sb.append("null");
    } else {
      sb.append(this.columnValues);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (columnValues == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'columnValues' was not present! Struct: " + toString());
    }
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, java.lang.ClassNotFoundException {
    try {
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class TResultStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TResultStandardScheme getScheme() {
      return new TResultStandardScheme();
    }
  }

  private static class TResultStandardScheme extends org.apache.thrift.scheme.StandardScheme<TResult> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TResult struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // ROW
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.row = iprot.readBinary();
              struct.setRowIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // COLUMN_VALUES
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list0 = iprot.readListBegin();
                struct.columnValues = new java.util.ArrayList<TColumnValue>(_list0.size);
                @org.apache.thrift.annotation.Nullable TColumnValue _elem1;
                for (int _i2 = 0; _i2 < _list0.size; ++_i2)
                {
                  _elem1 = new TColumnValue();
                  _elem1.read(iprot);
                  struct.columnValues.add(_elem1);
                }
                iprot.readListEnd();
              }
              struct.setColumnValuesIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, TResult struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.row != null) {
        if (struct.isSetRow()) {
          oprot.writeFieldBegin(ROW_FIELD_DESC);
          oprot.writeBinary(struct.row);
          oprot.writeFieldEnd();
        }
      }
      if (struct.columnValues != null) {
        oprot.writeFieldBegin(COLUMN_VALUES_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.columnValues.size()));
          for (TColumnValue _iter3 : struct.columnValues)
          {
            _iter3.write(oprot);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TResultTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TResultTupleScheme getScheme() {
      return new TResultTupleScheme();
    }
  }

  private static class TResultTupleScheme extends org.apache.thrift.scheme.TupleScheme<TResult> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TResult struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      {
        oprot.writeI32(struct.columnValues.size());
        for (TColumnValue _iter4 : struct.columnValues)
        {
          _iter4.write(oprot);
        }
      }
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetRow()) {
        optionals.set(0);
      }
      oprot.writeBitSet(optionals, 1);
      if (struct.isSetRow()) {
        oprot.writeBinary(struct.row);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TResult struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      {
        org.apache.thrift.protocol.TList _list5 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
        struct.columnValues = new java.util.ArrayList<TColumnValue>(_list5.size);
        @org.apache.thrift.annotation.Nullable TColumnValue _elem6;
        for (int _i7 = 0; _i7 < _list5.size; ++_i7)
        {
          _elem6 = new TColumnValue();
          _elem6.read(iprot);
          struct.columnValues.add(_elem6);
        }
      }
      struct.setColumnValuesIsSet(true);
      java.util.BitSet incoming = iprot.readBitSet(1);
      if (incoming.get(0)) {
        struct.row = iprot.readBinary();
        struct.setRowIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

