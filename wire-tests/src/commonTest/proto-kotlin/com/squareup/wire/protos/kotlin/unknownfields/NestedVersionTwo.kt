// Code generated by Wire protocol buffer compiler, do not edit.
// Source: squareup.protos.kotlin.unknownfields.NestedVersionTwo in unknown_fields.proto
package com.squareup.wire.protos.kotlin.unknownfields

import com.squareup.wire.FieldEncoding
import com.squareup.wire.Message
import com.squareup.wire.ProtoAdapter
import com.squareup.wire.ProtoReader
import com.squareup.wire.ProtoWriter
import com.squareup.wire.ReverseProtoWriter
import com.squareup.wire.Syntax.PROTO_2
import com.squareup.wire.WireField
import com.squareup.wire.`internal`.JvmField
import com.squareup.wire.`internal`.immutableCopyOf
import com.squareup.wire.`internal`.sanitize
import kotlin.Any
import kotlin.AssertionError
import kotlin.Boolean
import kotlin.Deprecated
import kotlin.DeprecationLevel
import kotlin.Int
import kotlin.Long
import kotlin.Nothing
import kotlin.String
import kotlin.collections.List
import okio.ByteString

public class NestedVersionTwo(
  @field:WireField(
    tag = 1,
    adapter = "com.squareup.wire.ProtoAdapter#INT32",
    schemaIndex = 0,
  )
  public val i: Int? = null,
  @field:WireField(
    tag = 2,
    adapter = "com.squareup.wire.ProtoAdapter#INT32",
    schemaIndex = 1,
  )
  public val v2_i: Int? = null,
  @field:WireField(
    tag = 3,
    adapter = "com.squareup.wire.ProtoAdapter#STRING",
    schemaIndex = 2,
  )
  public val v2_s: String? = null,
  @field:WireField(
    tag = 4,
    adapter = "com.squareup.wire.ProtoAdapter#FIXED32",
    schemaIndex = 3,
  )
  public val v2_f32: Int? = null,
  @field:WireField(
    tag = 5,
    adapter = "com.squareup.wire.ProtoAdapter#FIXED64",
    schemaIndex = 4,
  )
  public val v2_f64: Long? = null,
  v2_rs: List<String> = emptyList(),
  unknownFields: ByteString = ByteString.EMPTY,
) : Message<NestedVersionTwo, Nothing>(ADAPTER, unknownFields) {
  @field:WireField(
    tag = 6,
    adapter = "com.squareup.wire.ProtoAdapter#STRING",
    label = WireField.Label.REPEATED,
    schemaIndex = 5,
  )
  public val v2_rs: List<String> = immutableCopyOf("v2_rs", v2_rs)

  @Deprecated(
    message = "Shouldn't be used in Kotlin",
    level = DeprecationLevel.HIDDEN,
  )
  override fun newBuilder(): Nothing = throw
      AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin")

  override fun equals(other: Any?): Boolean {
    if (other === this) return true
    if (other !is NestedVersionTwo) return false
    if (unknownFields != other.unknownFields) return false
    if (i != other.i) return false
    if (v2_i != other.v2_i) return false
    if (v2_s != other.v2_s) return false
    if (v2_f32 != other.v2_f32) return false
    if (v2_f64 != other.v2_f64) return false
    if (v2_rs != other.v2_rs) return false
    return true
  }

  override fun hashCode(): Int {
    var result = super.hashCode
    if (result == 0) {
      result = unknownFields.hashCode()
      result = result * 37 + (i?.hashCode() ?: 0)
      result = result * 37 + (v2_i?.hashCode() ?: 0)
      result = result * 37 + (v2_s?.hashCode() ?: 0)
      result = result * 37 + (v2_f32?.hashCode() ?: 0)
      result = result * 37 + (v2_f64?.hashCode() ?: 0)
      result = result * 37 + v2_rs.hashCode()
      super.hashCode = result
    }
    return result
  }

  override fun toString(): String {
    val result = mutableListOf<String>()
    if (i != null) result += """i=$i"""
    if (v2_i != null) result += """v2_i=$v2_i"""
    if (v2_s != null) result += """v2_s=${sanitize(v2_s)}"""
    if (v2_f32 != null) result += """v2_f32=$v2_f32"""
    if (v2_f64 != null) result += """v2_f64=$v2_f64"""
    if (v2_rs.isNotEmpty()) result += """v2_rs=${sanitize(v2_rs)}"""
    return result.joinToString(prefix = "NestedVersionTwo{", separator = ", ", postfix = "}")
  }

  public fun copy(
    i: Int? = this.i,
    v2_i: Int? = this.v2_i,
    v2_s: String? = this.v2_s,
    v2_f32: Int? = this.v2_f32,
    v2_f64: Long? = this.v2_f64,
    v2_rs: List<String> = this.v2_rs,
    unknownFields: ByteString = this.unknownFields,
  ): NestedVersionTwo = NestedVersionTwo(i, v2_i, v2_s, v2_f32, v2_f64, v2_rs, unknownFields)

  public companion object {
    @JvmField
    public val ADAPTER: ProtoAdapter<NestedVersionTwo> = object : ProtoAdapter<NestedVersionTwo>(
      FieldEncoding.LENGTH_DELIMITED, 
      NestedVersionTwo::class, 
      "type.googleapis.com/squareup.protos.kotlin.unknownfields.NestedVersionTwo", 
      PROTO_2, 
      null, 
      "unknown_fields.proto"
    ) {
      override fun encodedSize(`value`: NestedVersionTwo): Int {
        var size = value.unknownFields.size
        size += ProtoAdapter.INT32.encodedSizeWithTag(1, value.i)
        size += ProtoAdapter.INT32.encodedSizeWithTag(2, value.v2_i)
        size += ProtoAdapter.STRING.encodedSizeWithTag(3, value.v2_s)
        size += ProtoAdapter.FIXED32.encodedSizeWithTag(4, value.v2_f32)
        size += ProtoAdapter.FIXED64.encodedSizeWithTag(5, value.v2_f64)
        size += ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(6, value.v2_rs)
        return size
      }

      override fun encode(writer: ProtoWriter, `value`: NestedVersionTwo) {
        ProtoAdapter.INT32.encodeWithTag(writer, 1, value.i)
        ProtoAdapter.INT32.encodeWithTag(writer, 2, value.v2_i)
        ProtoAdapter.STRING.encodeWithTag(writer, 3, value.v2_s)
        ProtoAdapter.FIXED32.encodeWithTag(writer, 4, value.v2_f32)
        ProtoAdapter.FIXED64.encodeWithTag(writer, 5, value.v2_f64)
        ProtoAdapter.STRING.asRepeated().encodeWithTag(writer, 6, value.v2_rs)
        writer.writeBytes(value.unknownFields)
      }

      override fun encode(writer: ReverseProtoWriter, `value`: NestedVersionTwo) {
        writer.writeBytes(value.unknownFields)
        ProtoAdapter.STRING.asRepeated().encodeWithTag(writer, 6, value.v2_rs)
        ProtoAdapter.FIXED64.encodeWithTag(writer, 5, value.v2_f64)
        ProtoAdapter.FIXED32.encodeWithTag(writer, 4, value.v2_f32)
        ProtoAdapter.STRING.encodeWithTag(writer, 3, value.v2_s)
        ProtoAdapter.INT32.encodeWithTag(writer, 2, value.v2_i)
        ProtoAdapter.INT32.encodeWithTag(writer, 1, value.i)
      }

      override fun decode(reader: ProtoReader): NestedVersionTwo {
        var i: Int? = null
        var v2_i: Int? = null
        var v2_s: String? = null
        var v2_f32: Int? = null
        var v2_f64: Long? = null
        val v2_rs = mutableListOf<String>()
        val unknownFields = reader.forEachTag { tag ->
          when (tag) {
            1 -> i = ProtoAdapter.INT32.decode(reader)
            2 -> v2_i = ProtoAdapter.INT32.decode(reader)
            3 -> v2_s = ProtoAdapter.STRING.decode(reader)
            4 -> v2_f32 = ProtoAdapter.FIXED32.decode(reader)
            5 -> v2_f64 = ProtoAdapter.FIXED64.decode(reader)
            6 -> v2_rs.add(ProtoAdapter.STRING.decode(reader))
            else -> reader.readUnknownField(tag)
          }
        }
        return NestedVersionTwo(
          i = i,
          v2_i = v2_i,
          v2_s = v2_s,
          v2_f32 = v2_f32,
          v2_f64 = v2_f64,
          v2_rs = v2_rs,
          unknownFields = unknownFields
        )
      }

      override fun redact(`value`: NestedVersionTwo): NestedVersionTwo = value.copy(
        unknownFields = ByteString.EMPTY
      )
    }

    private const val serialVersionUID: Long = 0L
  }
}
