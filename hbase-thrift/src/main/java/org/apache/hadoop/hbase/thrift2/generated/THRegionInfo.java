/**
 * Autogenerated by Thrift Compiler (0.12.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.hadoop.hbase.thrift2.generated;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.12.0)", date = "2019-01-28")
public class THRegionInfo implements org.apache.thrift.TBase<THRegionInfo, THRegionInfo._Fields>, java.io.Serializable, Cloneable, Comparable<THRegionInfo> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("THRegionInfo");

  private static final org.apache.thrift.protocol.TField REGION_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("regionId", org.apache.thrift.protocol.TType.I64, (short)1);
  private static final org.apache.thrift.protocol.TField TABLE_NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("tableName", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField START_KEY_FIELD_DESC = new org.apache.thrift.protocol.TField("startKey", org.apache.thrift.protocol.TType.STRING, (short)3);
  private static final org.apache.thrift.protocol.TField END_KEY_FIELD_DESC = new org.apache.thrift.protocol.TField("endKey", org.apache.thrift.protocol.TType.STRING, (short)4);
  private static final org.apache.thrift.protocol.TField OFFLINE_FIELD_DESC = new org.apache.thrift.protocol.TField("offline", org.apache.thrift.protocol.TType.BOOL, (short)5);
  private static final org.apache.thrift.protocol.TField SPLIT_FIELD_DESC = new org.apache.thrift.protocol.TField("split", org.apache.thrift.protocol.TType.BOOL, (short)6);
  private static final org.apache.thrift.protocol.TField REPLICA_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("replicaId", org.apache.thrift.protocol.TType.I32, (short)7);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new THRegionInfoStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new THRegionInfoTupleSchemeFactory();

  public long regionId; // required
  public @org.apache.thrift.annotation.Nullable java.nio.ByteBuffer tableName; // required
  public @org.apache.thrift.annotation.Nullable java.nio.ByteBuffer startKey; // optional
  public @org.apache.thrift.annotation.Nullable java.nio.ByteBuffer endKey; // optional
  public boolean offline; // optional
  public boolean split; // optional
  public int replicaId; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    REGION_ID((short)1, "regionId"),
    TABLE_NAME((short)2, "tableName"),
    START_KEY((short)3, "startKey"),
    END_KEY((short)4, "endKey"),
    OFFLINE((short)5, "offline"),
    SPLIT((short)6, "split"),
    REPLICA_ID((short)7, "replicaId");

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
        case 1: // REGION_ID
          return REGION_ID;
        case 2: // TABLE_NAME
          return TABLE_NAME;
        case 3: // START_KEY
          return START_KEY;
        case 4: // END_KEY
          return END_KEY;
        case 5: // OFFLINE
          return OFFLINE;
        case 6: // SPLIT
          return SPLIT;
        case 7: // REPLICA_ID
          return REPLICA_ID;
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
  private static final int __REGIONID_ISSET_ID = 0;
  private static final int __OFFLINE_ISSET_ID = 1;
  private static final int __SPLIT_ISSET_ID = 2;
  private static final int __REPLICAID_ISSET_ID = 3;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.START_KEY,_Fields.END_KEY,_Fields.OFFLINE,_Fields.SPLIT,_Fields.REPLICA_ID};
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.REGION_ID, new org.apache.thrift.meta_data.FieldMetaData("regionId", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.TABLE_NAME, new org.apache.thrift.meta_data.FieldMetaData("tableName", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING        , true)));
    tmpMap.put(_Fields.START_KEY, new org.apache.thrift.meta_data.FieldMetaData("startKey", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING        , true)));
    tmpMap.put(_Fields.END_KEY, new org.apache.thrift.meta_data.FieldMetaData("endKey", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING        , true)));
    tmpMap.put(_Fields.OFFLINE, new org.apache.thrift.meta_data.FieldMetaData("offline", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    tmpMap.put(_Fields.SPLIT, new org.apache.thrift.meta_data.FieldMetaData("split", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    tmpMap.put(_Fields.REPLICA_ID, new org.apache.thrift.meta_data.FieldMetaData("replicaId", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(THRegionInfo.class, metaDataMap);
  }

  public THRegionInfo() {
  }

  public THRegionInfo(
    long regionId,
    java.nio.ByteBuffer tableName)
  {
    this();
    this.regionId = regionId;
    setRegionIdIsSet(true);
    this.tableName = org.apache.thrift.TBaseHelper.copyBinary(tableName);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public THRegionInfo(THRegionInfo other) {
    __isset_bitfield = other.__isset_bitfield;
    this.regionId = other.regionId;
    if (other.isSetTableName()) {
      this.tableName = org.apache.thrift.TBaseHelper.copyBinary(other.tableName);
    }
    if (other.isSetStartKey()) {
      this.startKey = org.apache.thrift.TBaseHelper.copyBinary(other.startKey);
    }
    if (other.isSetEndKey()) {
      this.endKey = org.apache.thrift.TBaseHelper.copyBinary(other.endKey);
    }
    this.offline = other.offline;
    this.split = other.split;
    this.replicaId = other.replicaId;
  }

  public THRegionInfo deepCopy() {
    return new THRegionInfo(this);
  }

  @Override
  public void clear() {
    setRegionIdIsSet(false);
    this.regionId = 0;
    this.tableName = null;
    this.startKey = null;
    this.endKey = null;
    setOfflineIsSet(false);
    this.offline = false;
    setSplitIsSet(false);
    this.split = false;
    setReplicaIdIsSet(false);
    this.replicaId = 0;
  }

  public long getRegionId() {
    return this.regionId;
  }

  public THRegionInfo setRegionId(long regionId) {
    this.regionId = regionId;
    setRegionIdIsSet(true);
    return this;
  }

  public void unsetRegionId() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __REGIONID_ISSET_ID);
  }

  /** Returns true if field regionId is set (has been assigned a value) and false otherwise */
  public boolean isSetRegionId() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __REGIONID_ISSET_ID);
  }

  public void setRegionIdIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __REGIONID_ISSET_ID, value);
  }

  public byte[] getTableName() {
    setTableName(org.apache.thrift.TBaseHelper.rightSize(tableName));
    return tableName == null ? null : tableName.array();
  }

  public java.nio.ByteBuffer bufferForTableName() {
    return org.apache.thrift.TBaseHelper.copyBinary(tableName);
  }

  public THRegionInfo setTableName(byte[] tableName) {
    this.tableName = tableName == null ? (java.nio.ByteBuffer)null   : java.nio.ByteBuffer.wrap(tableName.clone());
    return this;
  }

  public THRegionInfo setTableName(@org.apache.thrift.annotation.Nullable java.nio.ByteBuffer tableName) {
    this.tableName = org.apache.thrift.TBaseHelper.copyBinary(tableName);
    return this;
  }

  public void unsetTableName() {
    this.tableName = null;
  }

  /** Returns true if field tableName is set (has been assigned a value) and false otherwise */
  public boolean isSetTableName() {
    return this.tableName != null;
  }

  public void setTableNameIsSet(boolean value) {
    if (!value) {
      this.tableName = null;
    }
  }

  public byte[] getStartKey() {
    setStartKey(org.apache.thrift.TBaseHelper.rightSize(startKey));
    return startKey == null ? null : startKey.array();
  }

  public java.nio.ByteBuffer bufferForStartKey() {
    return org.apache.thrift.TBaseHelper.copyBinary(startKey);
  }

  public THRegionInfo setStartKey(byte[] startKey) {
    this.startKey = startKey == null ? (java.nio.ByteBuffer)null   : java.nio.ByteBuffer.wrap(startKey.clone());
    return this;
  }

  public THRegionInfo setStartKey(@org.apache.thrift.annotation.Nullable java.nio.ByteBuffer startKey) {
    this.startKey = org.apache.thrift.TBaseHelper.copyBinary(startKey);
    return this;
  }

  public void unsetStartKey() {
    this.startKey = null;
  }

  /** Returns true if field startKey is set (has been assigned a value) and false otherwise */
  public boolean isSetStartKey() {
    return this.startKey != null;
  }

  public void setStartKeyIsSet(boolean value) {
    if (!value) {
      this.startKey = null;
    }
  }

  public byte[] getEndKey() {
    setEndKey(org.apache.thrift.TBaseHelper.rightSize(endKey));
    return endKey == null ? null : endKey.array();
  }

  public java.nio.ByteBuffer bufferForEndKey() {
    return org.apache.thrift.TBaseHelper.copyBinary(endKey);
  }

  public THRegionInfo setEndKey(byte[] endKey) {
    this.endKey = endKey == null ? (java.nio.ByteBuffer)null   : java.nio.ByteBuffer.wrap(endKey.clone());
    return this;
  }

  public THRegionInfo setEndKey(@org.apache.thrift.annotation.Nullable java.nio.ByteBuffer endKey) {
    this.endKey = org.apache.thrift.TBaseHelper.copyBinary(endKey);
    return this;
  }

  public void unsetEndKey() {
    this.endKey = null;
  }

  /** Returns true if field endKey is set (has been assigned a value) and false otherwise */
  public boolean isSetEndKey() {
    return this.endKey != null;
  }

  public void setEndKeyIsSet(boolean value) {
    if (!value) {
      this.endKey = null;
    }
  }

  public boolean isOffline() {
    return this.offline;
  }

  public THRegionInfo setOffline(boolean offline) {
    this.offline = offline;
    setOfflineIsSet(true);
    return this;
  }

  public void unsetOffline() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __OFFLINE_ISSET_ID);
  }

  /** Returns true if field offline is set (has been assigned a value) and false otherwise */
  public boolean isSetOffline() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __OFFLINE_ISSET_ID);
  }

  public void setOfflineIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __OFFLINE_ISSET_ID, value);
  }

  public boolean isSplit() {
    return this.split;
  }

  public THRegionInfo setSplit(boolean split) {
    this.split = split;
    setSplitIsSet(true);
    return this;
  }

  public void unsetSplit() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __SPLIT_ISSET_ID);
  }

  /** Returns true if field split is set (has been assigned a value) and false otherwise */
  public boolean isSetSplit() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __SPLIT_ISSET_ID);
  }

  public void setSplitIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __SPLIT_ISSET_ID, value);
  }

  public int getReplicaId() {
    return this.replicaId;
  }

  public THRegionInfo setReplicaId(int replicaId) {
    this.replicaId = replicaId;
    setReplicaIdIsSet(true);
    return this;
  }

  public void unsetReplicaId() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __REPLICAID_ISSET_ID);
  }

  /** Returns true if field replicaId is set (has been assigned a value) and false otherwise */
  public boolean isSetReplicaId() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __REPLICAID_ISSET_ID);
  }

  public void setReplicaIdIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __REPLICAID_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case REGION_ID:
      if (value == null) {
        unsetRegionId();
      } else {
        setRegionId((java.lang.Long)value);
      }
      break;

    case TABLE_NAME:
      if (value == null) {
        unsetTableName();
      } else {
        if (value instanceof byte[]) {
          setTableName((byte[])value);
        } else {
          setTableName((java.nio.ByteBuffer)value);
        }
      }
      break;

    case START_KEY:
      if (value == null) {
        unsetStartKey();
      } else {
        if (value instanceof byte[]) {
          setStartKey((byte[])value);
        } else {
          setStartKey((java.nio.ByteBuffer)value);
        }
      }
      break;

    case END_KEY:
      if (value == null) {
        unsetEndKey();
      } else {
        if (value instanceof byte[]) {
          setEndKey((byte[])value);
        } else {
          setEndKey((java.nio.ByteBuffer)value);
        }
      }
      break;

    case OFFLINE:
      if (value == null) {
        unsetOffline();
      } else {
        setOffline((java.lang.Boolean)value);
      }
      break;

    case SPLIT:
      if (value == null) {
        unsetSplit();
      } else {
        setSplit((java.lang.Boolean)value);
      }
      break;

    case REPLICA_ID:
      if (value == null) {
        unsetReplicaId();
      } else {
        setReplicaId((java.lang.Integer)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case REGION_ID:
      return getRegionId();

    case TABLE_NAME:
      return getTableName();

    case START_KEY:
      return getStartKey();

    case END_KEY:
      return getEndKey();

    case OFFLINE:
      return isOffline();

    case SPLIT:
      return isSplit();

    case REPLICA_ID:
      return getReplicaId();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case REGION_ID:
      return isSetRegionId();
    case TABLE_NAME:
      return isSetTableName();
    case START_KEY:
      return isSetStartKey();
    case END_KEY:
      return isSetEndKey();
    case OFFLINE:
      return isSetOffline();
    case SPLIT:
      return isSetSplit();
    case REPLICA_ID:
      return isSetReplicaId();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof THRegionInfo)
      return this.equals((THRegionInfo)that);
    return false;
  }

  public boolean equals(THRegionInfo that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_regionId = true;
    boolean that_present_regionId = true;
    if (this_present_regionId || that_present_regionId) {
      if (!(this_present_regionId && that_present_regionId))
        return false;
      if (this.regionId != that.regionId)
        return false;
    }

    boolean this_present_tableName = true && this.isSetTableName();
    boolean that_present_tableName = true && that.isSetTableName();
    if (this_present_tableName || that_present_tableName) {
      if (!(this_present_tableName && that_present_tableName))
        return false;
      if (!this.tableName.equals(that.tableName))
        return false;
    }

    boolean this_present_startKey = true && this.isSetStartKey();
    boolean that_present_startKey = true && that.isSetStartKey();
    if (this_present_startKey || that_present_startKey) {
      if (!(this_present_startKey && that_present_startKey))
        return false;
      if (!this.startKey.equals(that.startKey))
        return false;
    }

    boolean this_present_endKey = true && this.isSetEndKey();
    boolean that_present_endKey = true && that.isSetEndKey();
    if (this_present_endKey || that_present_endKey) {
      if (!(this_present_endKey && that_present_endKey))
        return false;
      if (!this.endKey.equals(that.endKey))
        return false;
    }

    boolean this_present_offline = true && this.isSetOffline();
    boolean that_present_offline = true && that.isSetOffline();
    if (this_present_offline || that_present_offline) {
      if (!(this_present_offline && that_present_offline))
        return false;
      if (this.offline != that.offline)
        return false;
    }

    boolean this_present_split = true && this.isSetSplit();
    boolean that_present_split = true && that.isSetSplit();
    if (this_present_split || that_present_split) {
      if (!(this_present_split && that_present_split))
        return false;
      if (this.split != that.split)
        return false;
    }

    boolean this_present_replicaId = true && this.isSetReplicaId();
    boolean that_present_replicaId = true && that.isSetReplicaId();
    if (this_present_replicaId || that_present_replicaId) {
      if (!(this_present_replicaId && that_present_replicaId))
        return false;
      if (this.replicaId != that.replicaId)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + org.apache.thrift.TBaseHelper.hashCode(regionId);

    hashCode = hashCode * 8191 + ((isSetTableName()) ? 131071 : 524287);
    if (isSetTableName())
      hashCode = hashCode * 8191 + tableName.hashCode();

    hashCode = hashCode * 8191 + ((isSetStartKey()) ? 131071 : 524287);
    if (isSetStartKey())
      hashCode = hashCode * 8191 + startKey.hashCode();

    hashCode = hashCode * 8191 + ((isSetEndKey()) ? 131071 : 524287);
    if (isSetEndKey())
      hashCode = hashCode * 8191 + endKey.hashCode();

    hashCode = hashCode * 8191 + ((isSetOffline()) ? 131071 : 524287);
    if (isSetOffline())
      hashCode = hashCode * 8191 + ((offline) ? 131071 : 524287);

    hashCode = hashCode * 8191 + ((isSetSplit()) ? 131071 : 524287);
    if (isSetSplit())
      hashCode = hashCode * 8191 + ((split) ? 131071 : 524287);

    hashCode = hashCode * 8191 + ((isSetReplicaId()) ? 131071 : 524287);
    if (isSetReplicaId())
      hashCode = hashCode * 8191 + replicaId;

    return hashCode;
  }

  @Override
  public int compareTo(THRegionInfo other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(isSetRegionId()).compareTo(other.isSetRegionId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetRegionId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.regionId, other.regionId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetTableName()).compareTo(other.isSetTableName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTableName()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.tableName, other.tableName);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetStartKey()).compareTo(other.isSetStartKey());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetStartKey()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.startKey, other.startKey);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetEndKey()).compareTo(other.isSetEndKey());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetEndKey()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.endKey, other.endKey);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetOffline()).compareTo(other.isSetOffline());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetOffline()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.offline, other.offline);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetSplit()).compareTo(other.isSetSplit());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSplit()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.split, other.split);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetReplicaId()).compareTo(other.isSetReplicaId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetReplicaId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.replicaId, other.replicaId);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("THRegionInfo(");
    boolean first = true;

    sb.append("regionId:");
    sb.append(this.regionId);
    first = false;
    if (!first) sb.append(", ");
    sb.append("tableName:");
    if (this.tableName == null) {
      sb.append("null");
    } else {
      org.apache.thrift.TBaseHelper.toString(this.tableName, sb);
    }
    first = false;
    if (isSetStartKey()) {
      if (!first) sb.append(", ");
      sb.append("startKey:");
      if (this.startKey == null) {
        sb.append("null");
      } else {
        org.apache.thrift.TBaseHelper.toString(this.startKey, sb);
      }
      first = false;
    }
    if (isSetEndKey()) {
      if (!first) sb.append(", ");
      sb.append("endKey:");
      if (this.endKey == null) {
        sb.append("null");
      } else {
        org.apache.thrift.TBaseHelper.toString(this.endKey, sb);
      }
      first = false;
    }
    if (isSetOffline()) {
      if (!first) sb.append(", ");
      sb.append("offline:");
      sb.append(this.offline);
      first = false;
    }
    if (isSetSplit()) {
      if (!first) sb.append(", ");
      sb.append("split:");
      sb.append(this.split);
      first = false;
    }
    if (isSetReplicaId()) {
      if (!first) sb.append(", ");
      sb.append("replicaId:");
      sb.append(this.replicaId);
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // alas, we cannot check 'regionId' because it's a primitive and you chose the non-beans generator.
    if (tableName == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'tableName' was not present! Struct: " + toString());
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
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class THRegionInfoStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public THRegionInfoStandardScheme getScheme() {
      return new THRegionInfoStandardScheme();
    }
  }

  private static class THRegionInfoStandardScheme extends org.apache.thrift.scheme.StandardScheme<THRegionInfo> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, THRegionInfo struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // REGION_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.regionId = iprot.readI64();
              struct.setRegionIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // TABLE_NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.tableName = iprot.readBinary();
              struct.setTableNameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // START_KEY
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.startKey = iprot.readBinary();
              struct.setStartKeyIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // END_KEY
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.endKey = iprot.readBinary();
              struct.setEndKeyIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // OFFLINE
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.offline = iprot.readBool();
              struct.setOfflineIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 6: // SPLIT
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.split = iprot.readBool();
              struct.setSplitIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 7: // REPLICA_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.replicaId = iprot.readI32();
              struct.setReplicaIdIsSet(true);
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
      if (!struct.isSetRegionId()) {
        throw new org.apache.thrift.protocol.TProtocolException("Required field 'regionId' was not found in serialized data! Struct: " + toString());
      }
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, THRegionInfo struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(REGION_ID_FIELD_DESC);
      oprot.writeI64(struct.regionId);
      oprot.writeFieldEnd();
      if (struct.tableName != null) {
        oprot.writeFieldBegin(TABLE_NAME_FIELD_DESC);
        oprot.writeBinary(struct.tableName);
        oprot.writeFieldEnd();
      }
      if (struct.startKey != null) {
        if (struct.isSetStartKey()) {
          oprot.writeFieldBegin(START_KEY_FIELD_DESC);
          oprot.writeBinary(struct.startKey);
          oprot.writeFieldEnd();
        }
      }
      if (struct.endKey != null) {
        if (struct.isSetEndKey()) {
          oprot.writeFieldBegin(END_KEY_FIELD_DESC);
          oprot.writeBinary(struct.endKey);
          oprot.writeFieldEnd();
        }
      }
      if (struct.isSetOffline()) {
        oprot.writeFieldBegin(OFFLINE_FIELD_DESC);
        oprot.writeBool(struct.offline);
        oprot.writeFieldEnd();
      }
      if (struct.isSetSplit()) {
        oprot.writeFieldBegin(SPLIT_FIELD_DESC);
        oprot.writeBool(struct.split);
        oprot.writeFieldEnd();
      }
      if (struct.isSetReplicaId()) {
        oprot.writeFieldBegin(REPLICA_ID_FIELD_DESC);
        oprot.writeI32(struct.replicaId);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class THRegionInfoTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public THRegionInfoTupleScheme getScheme() {
      return new THRegionInfoTupleScheme();
    }
  }

  private static class THRegionInfoTupleScheme extends org.apache.thrift.scheme.TupleScheme<THRegionInfo> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, THRegionInfo struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      oprot.writeI64(struct.regionId);
      oprot.writeBinary(struct.tableName);
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetStartKey()) {
        optionals.set(0);
      }
      if (struct.isSetEndKey()) {
        optionals.set(1);
      }
      if (struct.isSetOffline()) {
        optionals.set(2);
      }
      if (struct.isSetSplit()) {
        optionals.set(3);
      }
      if (struct.isSetReplicaId()) {
        optionals.set(4);
      }
      oprot.writeBitSet(optionals, 5);
      if (struct.isSetStartKey()) {
        oprot.writeBinary(struct.startKey);
      }
      if (struct.isSetEndKey()) {
        oprot.writeBinary(struct.endKey);
      }
      if (struct.isSetOffline()) {
        oprot.writeBool(struct.offline);
      }
      if (struct.isSetSplit()) {
        oprot.writeBool(struct.split);
      }
      if (struct.isSetReplicaId()) {
        oprot.writeI32(struct.replicaId);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, THRegionInfo struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      struct.regionId = iprot.readI64();
      struct.setRegionIdIsSet(true);
      struct.tableName = iprot.readBinary();
      struct.setTableNameIsSet(true);
      java.util.BitSet incoming = iprot.readBitSet(5);
      if (incoming.get(0)) {
        struct.startKey = iprot.readBinary();
        struct.setStartKeyIsSet(true);
      }
      if (incoming.get(1)) {
        struct.endKey = iprot.readBinary();
        struct.setEndKeyIsSet(true);
      }
      if (incoming.get(2)) {
        struct.offline = iprot.readBool();
        struct.setOfflineIsSet(true);
      }
      if (incoming.get(3)) {
        struct.split = iprot.readBool();
        struct.setSplitIsSet(true);
      }
      if (incoming.get(4)) {
        struct.replicaId = iprot.readI32();
        struct.setReplicaIdIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

