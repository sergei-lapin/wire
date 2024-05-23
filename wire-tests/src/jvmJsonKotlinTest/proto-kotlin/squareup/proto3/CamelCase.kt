// Code generated by Wire protocol buffer compiler, do not edit.
// Source: squareup.proto3.CamelCase in camel_case.proto
@file:Suppress("DEPRECATION")

package squareup.proto3

import com.squareup.wire.FieldEncoding
import com.squareup.wire.Message
import com.squareup.wire.ProtoAdapter
import com.squareup.wire.ProtoReader
import com.squareup.wire.ProtoWriter
import com.squareup.wire.ReverseProtoWriter
import com.squareup.wire.Syntax.PROTO_3
import com.squareup.wire.WireField
import com.squareup.wire.`internal`.JvmField
import com.squareup.wire.`internal`.JvmSynthetic
import com.squareup.wire.`internal`.checkElementsNotNull
import com.squareup.wire.`internal`.immutableCopyOf
import com.squareup.wire.`internal`.sanitize
import kotlin.Any
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.lazy
import okio.ByteString

public class CamelCase(
  @field:WireField(
    tag = 1,
    adapter = "squareup.proto3.CamelCase${'$'}NestedCamelCase#ADAPTER",
    label = WireField.Label.OMIT_IDENTITY,
    jsonName = "nestedMessage",
    schemaIndex = 0,
  )
  @JvmField
  public val nested__message: NestedCamelCase? = null,
  _Rep_int32: List<Int> = emptyList(),
  @field:WireField(
    tag = 3,
    adapter = "com.squareup.wire.ProtoAdapter#STRING",
    label = WireField.Label.OMIT_IDENTITY,
    jsonName = "IDitItMyWAy",
    schemaIndex = 2,
  )
  @JvmField
  public val IDitIt_my_wAy: String = "",
  map_int32_Int32: Map<Int, Int> = emptyMap(),
  unknownFields: ByteString = ByteString.EMPTY,
) : Message<CamelCase, CamelCase.Builder>(ADAPTER, unknownFields) {
  @field:WireField(
    tag = 2,
    adapter = "com.squareup.wire.ProtoAdapter#INT32",
    label = WireField.Label.PACKED,
    jsonName = "RepInt32",
    schemaIndex = 1,
  )
  @JvmField
  public val _Rep_int32: List<Int> = immutableCopyOf("_Rep_int32", _Rep_int32)

  @field:WireField(
    tag = 4,
    keyAdapter = "com.squareup.wire.ProtoAdapter#INT32",
    adapter = "com.squareup.wire.ProtoAdapter#INT32",
    jsonName = "mapInt32Int32",
    schemaIndex = 3,
  )
  @JvmField
  public val map_int32_Int32: Map<Int, Int> = immutableCopyOf("map_int32_Int32", map_int32_Int32)

  override fun newBuilder(): Builder {
    val builder = Builder()
    builder.nested__message = nested__message
    builder._Rep_int32 = _Rep_int32
    builder.IDitIt_my_wAy = IDitIt_my_wAy
    builder.map_int32_Int32 = map_int32_Int32
    builder.addUnknownFields(unknownFields)
    return builder
  }

  override fun equals(other: Any?): Boolean {
    if (other === this) return true
    if (other !is CamelCase) return false
    if (unknownFields != other.unknownFields) return false
    if (nested__message != other.nested__message) return false
    if (_Rep_int32 != other._Rep_int32) return false
    if (IDitIt_my_wAy != other.IDitIt_my_wAy) return false
    if (map_int32_Int32 != other.map_int32_Int32) return false
    return true
  }

  override fun hashCode(): Int {
    var result = super.hashCode
    if (result == 0) {
      result = unknownFields.hashCode()
      result = result * 37 + (nested__message?.hashCode() ?: 0)
      result = result * 37 + _Rep_int32.hashCode()
      result = result * 37 + IDitIt_my_wAy.hashCode()
      result = result * 37 + map_int32_Int32.hashCode()
      super.hashCode = result
    }
    return result
  }

  override fun toString(): String {
    val result = mutableListOf<String>()
    if (nested__message != null) result += """nested__message=$nested__message"""
    if (_Rep_int32.isNotEmpty()) result += """_Rep_int32=$_Rep_int32"""
    result += """IDitIt_my_wAy=${sanitize(IDitIt_my_wAy)}"""
    if (map_int32_Int32.isNotEmpty()) result += """map_int32_Int32=$map_int32_Int32"""
    return result.joinToString(prefix = "CamelCase{", separator = ", ", postfix = "}")
  }

  public fun copy(
    nested__message: NestedCamelCase? = this.nested__message,
    _Rep_int32: List<Int> = this._Rep_int32,
    IDitIt_my_wAy: String = this.IDitIt_my_wAy,
    map_int32_Int32: Map<Int, Int> = this.map_int32_Int32,
    unknownFields: ByteString = this.unknownFields,
  ): CamelCase = CamelCase(nested__message, _Rep_int32, IDitIt_my_wAy, map_int32_Int32,
      unknownFields)

  public class Builder : Message.Builder<CamelCase, Builder>() {
    @JvmField
    public var nested__message: NestedCamelCase? = null

    @JvmField
    public var _Rep_int32: List<Int> = emptyList()

    @JvmField
    public var IDitIt_my_wAy: String = ""

    @JvmField
    public var map_int32_Int32: Map<Int, Int> = emptyMap()

    public fun nested__message(nested__message: NestedCamelCase?): Builder {
      this.nested__message = nested__message
      return this
    }

    public fun _Rep_int32(_Rep_int32: List<Int>): Builder {
      checkElementsNotNull(_Rep_int32)
      this._Rep_int32 = _Rep_int32
      return this
    }

    public fun IDitIt_my_wAy(IDitIt_my_wAy: String): Builder {
      this.IDitIt_my_wAy = IDitIt_my_wAy
      return this
    }

    public fun map_int32_Int32(map_int32_Int32: Map<Int, Int>): Builder {
      this.map_int32_Int32 = map_int32_Int32
      return this
    }

    override fun build(): CamelCase = CamelCase(
      nested__message = nested__message,
      _Rep_int32 = _Rep_int32,
      IDitIt_my_wAy = IDitIt_my_wAy,
      map_int32_Int32 = map_int32_Int32,
      unknownFields = buildUnknownFields()
    )
  }

  public companion object {
    @JvmField
    public val ADAPTER: ProtoAdapter<CamelCase> = object : ProtoAdapter<CamelCase>(
      FieldEncoding.LENGTH_DELIMITED, 
      CamelCase::class, 
      "type.googleapis.com/squareup.proto3.CamelCase", 
      PROTO_3, 
      null, 
      "camel_case.proto"
    ) {
      private val map_int32_Int32Adapter: ProtoAdapter<Map<Int, Int>> by lazy {
          ProtoAdapter.newMapAdapter(ProtoAdapter.INT32, ProtoAdapter.INT32) }

      override fun encodedSize(`value`: CamelCase): Int {
        var size = value.unknownFields.size
        if (value.nested__message != null) {
          size += NestedCamelCase.ADAPTER.encodedSizeWithTag(1, value.nested__message)
        }
        size += ProtoAdapter.INT32.asPacked().encodedSizeWithTag(2, value._Rep_int32)
        if (value.IDitIt_my_wAy != "") {
          size += ProtoAdapter.STRING.encodedSizeWithTag(3, value.IDitIt_my_wAy)
        }
        size += map_int32_Int32Adapter.encodedSizeWithTag(4, value.map_int32_Int32)
        return size
      }

      override fun encode(writer: ProtoWriter, `value`: CamelCase) {
        if (value.nested__message != null) {
          NestedCamelCase.ADAPTER.encodeWithTag(writer, 1, value.nested__message)
        }
        ProtoAdapter.INT32.asPacked().encodeWithTag(writer, 2, value._Rep_int32)
        if (value.IDitIt_my_wAy != "") {
          ProtoAdapter.STRING.encodeWithTag(writer, 3, value.IDitIt_my_wAy)
        }
        map_int32_Int32Adapter.encodeWithTag(writer, 4, value.map_int32_Int32)
        writer.writeBytes(value.unknownFields)
      }

      override fun encode(writer: ReverseProtoWriter, `value`: CamelCase) {
        writer.writeBytes(value.unknownFields)
        map_int32_Int32Adapter.encodeWithTag(writer, 4, value.map_int32_Int32)
        if (value.IDitIt_my_wAy != "") {
          ProtoAdapter.STRING.encodeWithTag(writer, 3, value.IDitIt_my_wAy)
        }
        ProtoAdapter.INT32.asPacked().encodeWithTag(writer, 2, value._Rep_int32)
        if (value.nested__message != null) {
          NestedCamelCase.ADAPTER.encodeWithTag(writer, 1, value.nested__message)
        }
      }

      override fun decode(reader: ProtoReader): CamelCase {
        var nested__message: NestedCamelCase? = null
        var _Rep_int32: MutableList<Int>? = null
        var IDitIt_my_wAy: String = ""
        val map_int32_Int32 = mutableMapOf<Int, Int>()
        val unknownFields = reader.forEachTag { tag ->
          when (tag) {
            1 -> nested__message = NestedCamelCase.ADAPTER.decode(reader)
            2 -> {
              if (_Rep_int32 == null) {
                val minimumByteSize = 1
                val initialCapacity = (reader.nextFieldMinLengthInBytes() / minimumByteSize)
                  .coerceAtMost(Int.MAX_VALUE.toLong())
                  .toInt()
                _Rep_int32 = ArrayList(initialCapacity)
              }
              _Rep_int32!!.add(ProtoAdapter.INT32.decode(reader))
            }
            3 -> IDitIt_my_wAy = ProtoAdapter.STRING.decode(reader)
            4 -> map_int32_Int32.putAll(map_int32_Int32Adapter.decode(reader))
            else -> reader.readUnknownField(tag)
          }
        }
        return CamelCase(
          nested__message = nested__message,
          _Rep_int32 = _Rep_int32 ?: listOf(),
          IDitIt_my_wAy = IDitIt_my_wAy,
          map_int32_Int32 = map_int32_Int32,
          unknownFields = unknownFields
        )
      }

      override fun redact(`value`: CamelCase): CamelCase = value.copy(
        nested__message = value.nested__message?.let(NestedCamelCase.ADAPTER::redact),
        unknownFields = ByteString.EMPTY
      )
    }

    private const val serialVersionUID: Long = 0L

    @JvmSynthetic
    public inline fun build(body: Builder.() -> Unit): CamelCase = Builder().apply(body).build()
  }

  public class NestedCamelCase(
    @field:WireField(
      tag = 1,
      adapter = "com.squareup.wire.ProtoAdapter#INT32",
      label = WireField.Label.OMIT_IDENTITY,
      jsonName = "oneInt32",
      schemaIndex = 0,
    )
    @JvmField
    public val one_int32: Int = 0,
    unknownFields: ByteString = ByteString.EMPTY,
  ) : Message<NestedCamelCase, NestedCamelCase.Builder>(ADAPTER, unknownFields) {
    override fun newBuilder(): Builder {
      val builder = Builder()
      builder.one_int32 = one_int32
      builder.addUnknownFields(unknownFields)
      return builder
    }

    override fun equals(other: Any?): Boolean {
      if (other === this) return true
      if (other !is NestedCamelCase) return false
      if (unknownFields != other.unknownFields) return false
      if (one_int32 != other.one_int32) return false
      return true
    }

    override fun hashCode(): Int {
      var result = super.hashCode
      if (result == 0) {
        result = unknownFields.hashCode()
        result = result * 37 + one_int32.hashCode()
        super.hashCode = result
      }
      return result
    }

    override fun toString(): String {
      val result = mutableListOf<String>()
      result += """one_int32=$one_int32"""
      return result.joinToString(prefix = "NestedCamelCase{", separator = ", ", postfix = "}")
    }

    public fun copy(one_int32: Int = this.one_int32, unknownFields: ByteString =
        this.unknownFields): NestedCamelCase = NestedCamelCase(one_int32, unknownFields)

    public class Builder : Message.Builder<NestedCamelCase, Builder>() {
      @JvmField
      public var one_int32: Int = 0

      public fun one_int32(one_int32: Int): Builder {
        this.one_int32 = one_int32
        return this
      }

      override fun build(): NestedCamelCase = NestedCamelCase(
        one_int32 = one_int32,
        unknownFields = buildUnknownFields()
      )
    }

    public companion object {
      @JvmField
      public val ADAPTER: ProtoAdapter<NestedCamelCase> = object : ProtoAdapter<NestedCamelCase>(
        FieldEncoding.LENGTH_DELIMITED, 
        NestedCamelCase::class, 
        "type.googleapis.com/squareup.proto3.CamelCase.NestedCamelCase", 
        PROTO_3, 
        null, 
        "camel_case.proto"
      ) {
        override fun encodedSize(`value`: NestedCamelCase): Int {
          var size = value.unknownFields.size
          if (value.one_int32 != 0) {
            size += ProtoAdapter.INT32.encodedSizeWithTag(1, value.one_int32)
          }
          return size
        }

        override fun encode(writer: ProtoWriter, `value`: NestedCamelCase) {
          if (value.one_int32 != 0) {
            ProtoAdapter.INT32.encodeWithTag(writer, 1, value.one_int32)
          }
          writer.writeBytes(value.unknownFields)
        }

        override fun encode(writer: ReverseProtoWriter, `value`: NestedCamelCase) {
          writer.writeBytes(value.unknownFields)
          if (value.one_int32 != 0) {
            ProtoAdapter.INT32.encodeWithTag(writer, 1, value.one_int32)
          }
        }

        override fun decode(reader: ProtoReader): NestedCamelCase {
          var one_int32: Int = 0
          val unknownFields = reader.forEachTag { tag ->
            when (tag) {
              1 -> one_int32 = ProtoAdapter.INT32.decode(reader)
              else -> reader.readUnknownField(tag)
            }
          }
          return NestedCamelCase(
            one_int32 = one_int32,
            unknownFields = unknownFields
          )
        }

        override fun redact(`value`: NestedCamelCase): NestedCamelCase = value.copy(
          unknownFields = ByteString.EMPTY
        )
      }

      private const val serialVersionUID: Long = 0L

      @JvmSynthetic
      public inline fun build(body: Builder.() -> Unit): NestedCamelCase =
          Builder().apply(body).build()
    }
  }
}
